package howispentmoney;

import static howispentmoney.Main.demo;
import javax.swing.JTextField;

public class Login extends javax.swing.JFrame {
    
    /**
     * Creates new form Dashboard
     */
    public Login() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        username_tf = new javax.swing.JTextField();
        login_bn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(350, 560));
        setResizable(false);
        setSize(new java.awt.Dimension(350, 560));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 180, 80, 30);

        username_tf.setBorder(null);
        getContentPane().add(username_tf);
        username_tf.setBounds(70, 240, 210, 30);

        login_bn.setBackground(new java.awt.Color(0, 204, 204));
        login_bn.setForeground(new java.awt.Color(255, 255, 255));
        login_bn.setText("Login");
        login_bn.setBorder(null);
        login_bn.setBorderPainted(false);
        login_bn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_bnActionPerformed(evt);
            }
        });
        getContentPane().add(login_bn);
        login_bn.setBounds(70, 340, 210, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Username");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 220, 60, 15);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 270, 60, 16);

        password.setBorder(null);
        getContentPane().add(password);
        password.setBounds(70, 290, 210, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("O");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(160, 50, 50, 80);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/howispentmoney/hismloginbg.jpg"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 350, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void login_bnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_bnActionPerformed
//        System.out.println(DatabaseConnection.login_check(username.getText() ,password.getText()));
        String current_user = DatabaseConnection.login_check(username_tf.getText(), password.getText());
        System.out.println(current_user);
        if(current_user != null) {
            Main.demo = new CardLayoutDemo();
            demo.addComponentToPane(Main.main_frame.getContentPane());
            Main.main_frame.setVisible(true);
            this.setVisible(false);
        } else {
            System.out.println("no userfunl");
            return;
        }
//        user = DatabaseConnection.login_check(username.getText() ,password.getText());
    }//GEN-LAST:event_login_bnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton login_bn;
    private javax.swing.JPasswordField password;
    public static javax.swing.JTextField username_tf;
    // End of variables declaration//GEN-END:variables

}
