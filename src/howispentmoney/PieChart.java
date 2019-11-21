/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howispentmoney;
import static howispentmoney.Activity.userData;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
/**
 *
 * @author Thitiwut
 */
public class PieChart extends JPanel {

    public PieChart( String title ) {
        
        setContentPane(createDemoPanel( ));
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
    
    private static PieDataset createDataset( ) {
        ArrayList<Userdata> list = Activity.userData();      
        DefaultPieDataset dataset = new DefaultPieDataset( );
        System.out.println("list : " + list.size());
        double income_total=0, food_total=0, travel_total=0, other_total=0, clothes_total=0, utilityBills_total=0, gadget_total=0;
        for (int i=0; i<list.size(); i++){
            switch (list.get(i).getTYPE_DES()) {
                case "Income":
                    income_total += list.get(i).getVALUE();
                    dataset.setValue(list.get(i).getTYPE_DES(), income_total);
                    break;
                case "Clothes":
                    clothes_total += list.get(i).getVALUE();
                    dataset.setValue(list.get(i).getTYPE_DES(), clothes_total);
                    break;
                case "Travel":
                    travel_total += list.get(i).getVALUE();
                    dataset.setValue(list.get(i).getTYPE_DES(), travel_total);
                    break;
                case "Other":
                    other_total += list.get(i).getVALUE();
                    dataset.setValue(list.get(i).getTYPE_DES(), other_total);
                    break;
                case "Food":
                    food_total += list.get(i).getVALUE();
                    dataset.setValue(list.get(i).getTYPE_DES(), food_total);
                    break;
                case "utility":
                    utilityBills_total += list.get(i).getVALUE();
                    dataset.setValue(list.get(i).getTYPE_DES(), utilityBills_total);
                    break;
                case "Gadget":
                    gadget_total += list.get(i).getVALUE();
                    dataset.setValue(list.get(i).getTYPE_DES(), gadget_total);
                    break;
                default:
                    break;
            }
        } 
        return dataset;         
   }
    
    private static JFreeChart createChart( PieDataset dataset ) {
        JFreeChart chart = ChartFactory.createPieChart(      
            "Pie Chart",   // chart title 
            dataset,          // data    
            true,             // include legend   
            true, 
            false);

        return chart;
   }
   
   public static JPanel createDemoPanel( ) {
      JFreeChart chart = createChart(createDataset( ) );  
      return new ChartPanel( chart ); 
   }
}
