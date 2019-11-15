
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tang-pc
 */
public class NewClass extends JFrame{
    private void init() {
        this.setSize(500, 500);
        this.setVisible(true);
        JPanel panel = new JPanel();
        panel.add(new JLabel("www"));
        this.add(panel);
    }
    
    public static void main(String[] args) {
        new NewClass().init();
    }
    
}
