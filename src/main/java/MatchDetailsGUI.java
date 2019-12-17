import Classes.MatchStats;

import javax.swing.*;
import java.awt.*;

public class MatchDetailsGUI extends JFrame {
    private JPanel matchPanel;
    private JLabel sum0;
    private JLabel sum1;
    private JLabel sum2;
    private JLabel sum3;
    private JLabel sum4;
    private JLabel sum5;
    private JLabel sum6;
    private JLabel sum7;
    private JLabel sum8;
    private JLabel sum9;
    private JLabel sum0kda;
    private JLabel sum1kda;
    private JLabel sum2kda;
    private JLabel sum3kda;
    private JLabel sum4kda;
    private JLabel sum5kda;
    private JLabel sum6kda;
    private JLabel sum7kda;
    private JLabel sum8kda;
    private JLabel sum9kda;
    private JLabel teamBlue;
    private JLabel teamRed;

    public MatchDetailsGUI(MatchStats matchStats) {
        setContentPane(matchPanel);
        setPreferredSize(new Dimension(500, 350));
        pack();
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setVisible(true);

        MatchStats.Teams[] teams = matchStats.getTeams();
        MatchStats.ParticipantIdentities[] players = matchStats.getParticipantIdentities();
        MatchStats.Participants[] playerStats = matchStats.getParticipants();

        // Flair for winning team
        if(teams[0].getWin().equals("Win")){
            teamBlue.setText("Blue team: Win");
        }
        if(teams[1].getWin().equals("Win")){
            teamRed.setText("Red team: Win");
        }

        // Set player names
        sum0.setText(players[0].getPlayer().getSummonerName());
        sum1.setText(players[1].getPlayer().getSummonerName());
        sum2.setText(players[2].getPlayer().getSummonerName());
        sum3.setText(players[3].getPlayer().getSummonerName());
        sum4.setText(players[4].getPlayer().getSummonerName());
        sum5.setText(players[5].getPlayer().getSummonerName());
        sum6.setText(players[6].getPlayer().getSummonerName());
        sum7.setText(players[7].getPlayer().getSummonerName());
        sum8.setText(players[8].getPlayer().getSummonerName());
        sum9.setText(players[9].getPlayer().getSummonerName());

        // Set player champion images
        ImageIcon champ0Img = new ImageIcon(APIRequests.getChampionIcon(playerStats[0].getChampionId()));
        sum0.setIcon(new ImageIcon(champ0Img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
        ImageIcon champ1Img = new ImageIcon(APIRequests.getChampionIcon(playerStats[1].getChampionId()));
        sum1.setIcon(new ImageIcon(champ1Img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
        ImageIcon champ2Img = new ImageIcon(APIRequests.getChampionIcon(playerStats[2].getChampionId()));
        sum2.setIcon(new ImageIcon(champ2Img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
        ImageIcon champ3Img = new ImageIcon(APIRequests.getChampionIcon(playerStats[3].getChampionId()));
        sum3.setIcon(new ImageIcon(champ3Img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
        ImageIcon champ4Img = new ImageIcon(APIRequests.getChampionIcon(playerStats[4].getChampionId()));
        sum4.setIcon(new ImageIcon(champ4Img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
        ImageIcon champ5Img = new ImageIcon(APIRequests.getChampionIcon(playerStats[5].getChampionId()));
        sum5.setIcon(new ImageIcon(champ5Img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
        ImageIcon champ6Img = new ImageIcon(APIRequests.getChampionIcon(playerStats[6].getChampionId()));
        sum6.setIcon(new ImageIcon(champ6Img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
        ImageIcon champ7Img = new ImageIcon(APIRequests.getChampionIcon(playerStats[7].getChampionId()));
        sum7.setIcon(new ImageIcon(champ7Img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
        ImageIcon champ8Img = new ImageIcon(APIRequests.getChampionIcon(playerStats[8].getChampionId()));
        sum8.setIcon(new ImageIcon(champ8Img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
        ImageIcon champ9Img = new ImageIcon(APIRequests.getChampionIcon(playerStats[9].getChampionId()));
        sum9.setIcon(new ImageIcon(champ9Img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));

        // Set player KDA stats
        sum0kda.setText(String.valueOf(playerStats[0].getStats().getKills() + "/" + playerStats[0].getStats().getDeaths() + "/" + playerStats[0].getStats().getAssists()));
        sum1kda.setText(String.valueOf(playerStats[1].getStats().getKills() + "/" + playerStats[1].getStats().getDeaths() + "/" + playerStats[1].getStats().getAssists()));
        sum2kda.setText(String.valueOf(playerStats[2].getStats().getKills() + "/" + playerStats[2].getStats().getDeaths() + "/" + playerStats[2].getStats().getAssists()));
        sum3kda.setText(String.valueOf(playerStats[3].getStats().getKills() + "/" + playerStats[3].getStats().getDeaths() + "/" + playerStats[3].getStats().getAssists()));
        sum4kda.setText(String.valueOf(playerStats[4].getStats().getKills() + "/" + playerStats[4].getStats().getDeaths() + "/" + playerStats[4].getStats().getAssists()));
        sum5kda.setText(String.valueOf(playerStats[5].getStats().getKills() + "/" + playerStats[5].getStats().getDeaths() + "/" + playerStats[5].getStats().getAssists()));
        sum6kda.setText(String.valueOf(playerStats[6].getStats().getKills() + "/" + playerStats[6].getStats().getDeaths() + "/" + playerStats[6].getStats().getAssists()));
        sum7kda.setText(String.valueOf(playerStats[7].getStats().getKills() + "/" + playerStats[7].getStats().getDeaths() + "/" + playerStats[7].getStats().getAssists()));
        sum8kda.setText(String.valueOf(playerStats[8].getStats().getKills() + "/" + playerStats[8].getStats().getDeaths() + "/" + playerStats[8].getStats().getAssists()));
        sum9kda.setText(String.valueOf(playerStats[9].getStats().getKills() + "/" + playerStats[9].getStats().getDeaths() + "/" + playerStats[9].getStats().getAssists()));


    }

}
