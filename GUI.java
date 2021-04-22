import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {

    private JButton rollTheDice = new JButton("Würfeln!");

    private JLabel scorePlayer1 = new JLabel("Player 1:     Score: 0");
    private JLabel scorePlayer2 = new JLabel("Player 2:     Score: 0");
    
    private JLabel playerInfo = new JLabel("Spieler 1 ist dran!");

    private Würfel spieler1 = new Würfel();
    private Würfel spieler2 = new Würfel();

    private boolean activePlayer1 = true;
    public void showDialog() {


        setLayout(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);
        setTitle("Würfelspiel Projekt");

        //Objekte Positionieren
        rollTheDice.setBounds(100, 220, 100, 20);
        playerInfo.setBounds(100, 200, 100, 20);
        scorePlayer1.setBounds(20, 50, 200, 50);
        scorePlayer2.setBounds(20, 100, 200, 50);

        //Objekte anzeigen
        add(rollTheDice);
        add(playerInfo);
        add(scorePlayer1);
        add(scorePlayer2);

        rollTheDice.addActionListener(this);
        setVisible(true);
    }
	while (spieler1.getPoints() < 100) {
    public void actionPerformed(ActionEvent e) {

    	if (activePlayer1){
            spieler1.rollTheDice();
            scorePlayer1.setText("Spieler 1:     Punkte: " + spieler1.getPoints());
            activePlayer1 = false;
            playerInfo.setText("Spieler 2 ist dran!");
            System.out.println("Spieler 1 hat gewürfelt!");
        }else {
            spieler2.rollTheDice();
            scorePlayer2.setText("Spieler 2:     Punkte: " + spieler2.getPoints());
            playerInfo.setText("Spieler 1 ist dran!");
            System.out.println("Spieler 2 hat gewürfelt!");
            activePlayer1 = true;
        }
    }
    }