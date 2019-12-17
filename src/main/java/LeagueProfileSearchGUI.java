import Classes.League;
import Classes.Mastery;
import Classes.MatchHistory;
import Classes.Summoner;
import javafx.css.Match;
import kong.unirest.Unirest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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

        if (LeagueProfileAPI.RIOT_API_KEY.equals("")){
            JOptionPane.showMessageDialog(null, "No API key present", "Empty API Key", JOptionPane.INFORMATION_MESSAGE);
            searchButton.setEnabled(false);
        }

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

                String region = sumRegionList.getSelectedItem().toString();
                String regionCode = APIRequests.getRegionCode(region);
                String summoner = sumNameText.getText();
                summoner = summoner.trim();
                summoner = summoner.replace(" ", "_");

                // Get player ID and associated data
                Summoner player = APIRequests.getPlayerData(regionCode, summoner);
                player.setRegion(regionCode);

                // Get player rank
                League[] playerRank = APIRequests.getPlayerRank(regionCode, player.getId());
                if (playerRank.length == 0) {
                    // Checks that player is ranked
                    JOptionPane.showMessageDialog(null, "No ranked information available for this account", "No Ranked Data", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                // Get player mastery scores
                Mastery[] mastery = APIRequests.getPlayerMasteries(regionCode, player.getId());

                // Get Matchlist by account id
                MatchHistory matchlist = APIRequests.getPlayerMatchlist(regionCode, player.getAccountId());
                MatchHistory.Match[] matches = matchlist.getMatches();

                // Get Match Data
                LeagueProfileGUI gui = new LeagueProfileGUI(player, playerRank, mastery, matches);
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

}
