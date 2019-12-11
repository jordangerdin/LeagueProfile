import Classes.Summoner;

import javax.swing.*;
import java.awt.*;

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
    private JList list1;
    private JPanel profilePanel;

    public LeagueProfileGUI(Summoner summoner) {
        setContentPane(profilePanel);
        setPreferredSize(new Dimension(800, 1000));
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        sumName.setText(summoner.getName());
        sumLevel.setText("Lv: " + summoner.getSummonerLevel());

        sumRank.setText("Grandmaster");

        ImageIcon image = new ImageIcon(getClass().getResource(getRankImagePath()));

        sumRankImg.setIcon(new ImageIcon(image.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)));

        champMastery1Points.setText("108,930");
        //champMastery1Img.setIcon();
        champMastery2Points.setText("101,769");
        //champMastery2Img.setIcon();
        champMastery3Points.setText("99,171");
        //champMastery3Img.setIcon();

    }

    public String getRankImagePath() {
        String image = "";
        switch(sumRank.getText()){
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

    public String getChampionIcon(int champId) {
        String image = "ddragon.leagueoflegends.com/cdn/9.24.1/img/champion/";

        return image;
    }
}
