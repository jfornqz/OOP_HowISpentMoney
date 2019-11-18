package howispentmoney;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    
    static Frame main_frame = new Frame();
    static CardLayoutDemo demo = new CardLayoutDemo();
    
    @Deprecated
    public static void changePanel(JPanel pn) {
        main_frame.getjPanel1().removeAll();
        main_frame.getjPanel1().setLayout(new BorderLayout());
        main_frame.getjPanel1().add(pn);
    }
    
    public static void main(String[] args) {
//        JFrame frame = new Login();
        main_frame.setVisible(true);
        main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        demo.addComponentToPane(main_frame.getContentPane());
    }
    
}
