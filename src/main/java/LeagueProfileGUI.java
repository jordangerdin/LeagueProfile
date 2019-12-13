import Classes.League;
import Classes.Mastery;
import Classes.MatchHistory;
import Classes.Summoner;
import kong.unirest.Unirest;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class LeagueProfileGUI extends JFrame {
    private JLabel sumRankImg;
    private JLabel sumName;
    private JLabel sumLevel;
    private JLabel sumRank;
    private JLabel champMastery1Img;
    private JLabel champMastery2Img;
    private JLabel champMastery3Img;
    private JLabel champMastery1Points;
    private JLabel champMastery2Points;
    private JLabel champMastery3Points;
    private JList matchHistory;
    private JPanel profilePanel;

    DefaultListModel<String> listMatchModel;


    public LeagueProfileGUI(Summoner summoner, League[] rank, Mastery[] mastery, MatchHistory.Match[] matches) {
        setContentPane(profilePanel);
        setPreferredSize(new Dimension(800, 1000));
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        // Set player name and level to profile
        sumName.setText(summoner.getName());
        sumLevel.setText("Lv: " + summoner.getSummonerLevel());

        // Set ranked info and images
        String div = rank[0].getTier();
        String division = div.substring(0,1).toUpperCase() + div.substring(1).toLowerCase();

        sumRank.setText(division + " " + rank[0].getRank());


        ImageIcon image = new ImageIcon(getClass().getResource(getRankImagePath(division)));
        sumRankImg.setIcon(new ImageIcon(image.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT)));
        sumRankImg.setText("");

        // Set top 3 champion masteries to profile
        champMastery1Points.setText(String.format("%,d", mastery[0].getChampionPoints()));
        ImageIcon champ1Img = new ImageIcon(APIRequests.getChampionIcon(mastery[0].getChampionId()));
        champMastery1Img.setText("");
        champMastery1Img.setIcon(new ImageIcon(champ1Img.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT)));

        champMastery2Points.setText(String.format("%,d", mastery[1].getChampionPoints()));
        ImageIcon champ2Img = new ImageIcon(APIRequests.getChampionIcon(mastery[1].getChampionId()));
        champMastery2Img.setText("");
        champMastery2Img.setIcon(new ImageIcon(champ2Img.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT)));

        champMastery3Points.setText(String.format("%,d", mastery[2].getChampionPoints()));
        ImageIcon champ3Img = new ImageIcon(APIRequests.getChampionIcon(mastery[2].getChampionId()));
        champMastery3Img.setText("");
        champMastery3Img.setIcon(new ImageIcon(champ3Img.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT)));


        // Update Matchlist with recent match history
        listMatchModel = new DefaultListModel<>();
        for (MatchHistory.Match match : matches){
            listMatchModel.addElement(String.valueOf(match.getGameId()));
        }

        matchHistory.setModel(listMatchModel);
        matchHistory.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    public String getRankImagePath(String division) {
        String image = "";
        switch(division){
            case("Iron"):
                image = "ranked-emblems/Emblem_Iron.png";
                break;
            case("Bronze"):
                image = "ranked-emblems/Emblem_Bronze.png";
                break;
            case("Silver"):
                image = "ranked-emblems/Emblem_Silver.png";
                break;
            case("Gold"):
                image = "ranked-emblems/Emblem_Gold.png";
                break;
            case("Platinum"):
                image = "ranked-emblems/Emblem_Platinum.png";
                break;
            case("Diamond"):
                image = "ranked-emblems/Emblem_Diamond.png";
                break;
            case("Master"):
                image = "ranked-emblems/Emblem_Master.png";
                break;
            case("Grandmaster"):
                image = "ranked-emblems/Emblem_Grandmaster.png";
                break;
            case("Challenger"):
                image = "ranked-emblems/Emblem_Challenger.png";
                break;
        }
        return image;
    }
}
