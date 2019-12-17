import Classes.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
    private JButton newSearch;
    private JLabel sumRegion;

    DefaultListModel<String> listMatchModel;


    public LeagueProfileGUI(Summoner summoner, League[] rank, Mastery[] mastery, MatchHistory.Match[] matches) {
        setContentPane(profilePanel);
        setPreferredSize(new Dimension(800, 600));
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);



        // Set player name and level to profile
        sumName.setText(summoner.getName());
        sumLevel.setText("Lv: " + summoner.getSummonerLevel());
        sumRegion.setText(summoner.getRegion());

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
            String listMatchDetails = String.format("%-15s %-15s %-25s", match.getGameId(), APIRequests.getChampionNameById(match.getChampion()), APIRequests.getGameType(match.getQueue()));
            listMatchModel.addElement(listMatchDetails);
        }

        matchHistory.setModel(listMatchModel);
        matchHistory.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        addListeners();
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

    private void addListeners() {
        JPopupMenu rightClickMenu = new JPopupMenu();
        JMenuItem matchDetails = new JMenuItem("Match Details");
        rightClickMenu.add(matchDetails);

        newSearch.addActionListener(actionEvent -> {
            LeagueProfileSearchGUI gui = new LeagueProfileSearchGUI();
            setVisible(false);
        });

        matchDetails.addActionListener(e -> getMatchDetails());

        matchHistory.setComponentPopupMenu(rightClickMenu);

        matchHistory.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e){
                if (SwingUtilities.isRightMouseButton(e)) {
                    int selection = matchHistory.locationToIndex(e.getPoint());
                    matchHistory.setSelectedIndex(selection);
                }
            }

            // Right clicks are on press for windows, release for macs
            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e) ){
                    int selection = matchHistory.locationToIndex(e.getPoint());
                    matchHistory.setSelectedIndex(selection);
                }
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                    int selection = matchHistory.locationToIndex(e.getPoint());
                    matchHistory.setSelectedIndex(selection);
                }
            }
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        });
    }

    public void getMatchDetails(){
        int selectedIndex = matchHistory.getSelectedIndex();

        // Get gameID from list of matches
        String gameId = listMatchModel.getElementAt(selectedIndex);
        String[] gameIdMod = gameId.split(" ");
        gameId = gameIdMod[0];

        // Get region
        String region = sumRegion.getText();

        // Send API request for match data
        if (selectedIndex == -1) {
        } else {
            // Open up Match Detail GUI for gameID
            MatchStats match = APIRequests.getPlayerMatchData(region, gameId);

            MatchDetailsGUI gui = new MatchDetailsGUI(match);

        }
    }
}
