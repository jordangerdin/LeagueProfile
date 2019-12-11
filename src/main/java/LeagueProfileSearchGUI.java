import Classes.League;
import Classes.Mastery;
import Classes.Masteries;
import Classes.Summoner;
import kong.unirest.Unirest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeagueProfileSearchGUI extends JFrame{
    private JTextField sumNameText;
    private JComboBox sumRegionList;
    private JPanel searchPanel;
    private JButton searchButton;
    private JLabel sumName;
    private JLabel sumRegion;

    public LeagueProfileSearchGUI() {
        setContentPane(searchPanel);
        setPreferredSize(new Dimension(400, 200));
        getRootPane().setDefaultButton(searchButton);
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        configureRegionComboBox();

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // generate API requests using region selected and summoner name, load profile GUI

                // Use summoner name to get encrypted account ID using Summoner-v4
                // encrypted Summoner ID (by summoner name + region)
                    // Rank (League-V4,  using encrypted account id)
                    // highest champion mastery (Mastery-V4, using encrypted account id)
                // Matchlist (Match-V4 [Matchlists-By-Account], by encrypted account id)
                    // Match Data for each match (Match-V4 [matches], by match ID)

                String regionCode = getRegionCode();
                String summoner = sumNameText.getText();

                // Get player ID and associated data
                Summoner player = getPlayerData(regionCode, summoner);
                System.out.println(player);

                // Get player rank
                League playerRank = getPlayerRank(regionCode, player.getId());
                System.out.println(playerRank);

                // Get player mastery scores
                Masteries response = getPlayerMasteries(regionCode, player.getId());

                System.out.println(response);
                Mastery[] masteries = response.masteries;

                for (int i = 0; i < 3; i++) {
                    System.out.println("Mastery Score: " + masteries[i].championPoints + "Champion: " + masteries[i].championId);
                }

                // Get player Match History

                // Get Match Data


                LeagueProfileGUI gui = new LeagueProfileGUI(player);
                setVisible(false);
            }
        });

    }

    public void configureRegionComboBox(){
        String[] regions = {"North America", "Europe West", "Europe East & Nordic", "Korea", "Oceania", "LAS", "LAN", "Brazil", "Japan", "Turkey", "Russia"};
        for (String region : regions) {
            sumRegionList.addItem(region);
        }
    }

    public String getRegionCode() {
        String regionCode = "";
        switch(sumRegionList.getSelectedItem().toString()) {
            case ("North America"):
                regionCode = "NA1";
                break;
            case ("Europe West"):
                regionCode = "EUW1";
                break;
            case ("Europe East & Nordic"):
                regionCode = "EUN1";
                break;
            case ("Korea"):
                regionCode = "KR";
                break;
            case ("Oceania"):
                regionCode = "OC1";
                break;
            case ("LAS"):
                regionCode = "LA1";
                break;
            case ("LAN"):
                regionCode = "LA2";
                break;
            case("Brazil"):
                regionCode = "BR1";
                break;
            case ("Japan"):
                regionCode = "JP1";
                break;
            case ("Turkey"):
                regionCode = "TR1";
                break;
            case ("Russia"):
                regionCode = "RU";
                break;
        }
        return regionCode;
    }

    public Summoner getPlayerData(String regionCode, String summoner) {
        String version = "v4";

        String urlSummoner = "https://" + regionCode + ".api.riotgames.com/lol/summoner/" + version +
                "/summoners/by-name/" + summoner + "?api_key=" + LeagueProfileAPI.RIOT_API_KEY;
        Summoner player = Unirest.get(urlSummoner)
                .asObject(Summoner.class)
                .getBody();
        return player;
    }

    public League getPlayerRank(String regionCode, String summonerId){
        String version = "v4";

        String urlLeague = "https://" + regionCode + ".api.riotgames.com/lol/league/" + version +
                "/entries/by-summoner/" + summonerId + "?api_key=" + LeagueProfileAPI.RIOT_API_KEY;
        League league = Unirest.get(urlLeague)
                .asObject(League.class)
                .getBody();

        return league;
    }

    public Masteries getPlayerMasteries(String regionCode, String summonerId){
        String version = "v4";

        String urlMastery = "https://" + regionCode + ".api.riotgames.com/lol/champion-mastery/" + version +
                "/champion-masteries/by-summoner/" + summonerId + "?api_key=" + LeagueProfileAPI.RIOT_API_KEY;
        Masteries response = Unirest.get(urlMastery)
                .asObject(Masteries.class)
                .getBody();

        System.out.println(response);
        return response;
    }
}
