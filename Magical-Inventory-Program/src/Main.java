
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.SplashScreen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        mainMenu();
    }
    public static void mainMenu() {
        JFrame mainMenu = new JFrame("Magical Inventory Program");
        mainMenu.setLocationRelativeTo(null);
        mainMenu.setSize(800, 600);
         BufferedImage image = null;
        try {
            image = ImageIO.read(
                mainMenu.getClass().getResource("/img/icon.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        mainMenu.setIconImage(image);
        

        mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();

        JMenu menuFile = new JMenu("File");
        JMenuItem jmiOpen = new JMenuItem("Open");
        JMenuItem jmiClose = new JMenuItem("Close");
        JMenuItem jmiSave = new JMenuItem("Save");
        JMenuItem jmiExit = new JMenuItem("Exit");
        menuFile.add(jmiOpen);
        menuFile.add(jmiClose);
        menuFile.add(jmiSave);
        menuFile.addSeparator();
        menuFile.add(jmiExit);
        menuBar.add(menuFile);

        JMenu jmOptions = new JMenu("Options");
        
        
        menuBar.add(jmOptions);
        
        JMenu jmHelp = new JMenu("Help");
        JMenuItem jmiAbout = new JMenuItem("About");
        jmHelp.add(jmiAbout);
        menuBar.add(jmHelp);
        
        jmiAbout.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null, "Magical Inventory Program. (c) 2015 KNPhoenix.", "About", JOptionPane.PLAIN_MESSAGE);
        });
        jmiExit.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        
        mainMenu.setJMenuBar(menuBar);
        mainMenu.setVisible(true);
        }
    
}