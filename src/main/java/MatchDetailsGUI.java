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

    public MatchDetailsGUI(MatchStats matchStats) {
        setContentPane(matchPanel);
        setPreferredSize(new Dimension(400, 200));
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        System.out.println(matchStats.getGameVersion());
    }

}
