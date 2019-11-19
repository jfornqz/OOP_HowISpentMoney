package howispentmoney;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
    static Frame main_frame = new Frame();
    static CardLayoutDemo demo;
    
    public static void main(String[] args) {
//        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        JFrame frame = new Login();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DatabaseConnection.getMonth();
    }
    
}
