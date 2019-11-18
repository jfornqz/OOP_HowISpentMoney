/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howispentmoney;

import java.awt.*;
import javax.swing.JPanel;

/**
 *
 * @author Thitiwut
 */
public class CardLayoutDemo {
    JPanel cards;
    CardLayout cl;
    public void addComponentToPane(Container pane) {
        cards = new JPanel(new CardLayout());
        cards.add(new Dashboard(), "dash");
        cards.add(new Activity(), "act");
        pane.add(cards, BorderLayout.CENTER);
        cl = (CardLayout)(cards.getLayout());
        cl.show(cards, "dash");
    }
    public void toDash(){
        cl.show(cards, "dash");
    }
    public void toAct(){
        cl.show(cards, "act");
    }
}
