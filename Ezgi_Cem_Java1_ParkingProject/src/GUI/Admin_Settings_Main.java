/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author CemArslan
 */
public class Admin_Settings_Main extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Settings_Main
     */
    public Admin_Settings_Main() {
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnGoToAddNewCar = new javax.swing.JButton();
        btnBackToMainMenu = new javax.swing.JButton();
        btnGoToChangePrice = new javax.swing.JButton();
        btnGoToRemoveCar = new javax.swing.JButton();
        btnGoToAddParkingLot = new javax.swing.JButton();
        btnGoToRemovePrkingLot = new javax.swing.JButton();
        btnDisplayCarInsıde = new javax.swing.JButton();
        btnDisplayALLSubscriptions = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setBackground(new java.awt.Color(153, 255, 255));
        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CentralAutoParkingProject/settings.png"))); // NOI18N
        jLabel1.setText("          ADMIN SETTINGS");
        jInternalFrame1.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 860, 280));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Choose an Admin Action to Implement");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 23, 433, -1));

        btnGoToAddNewCar.setText("ADD NEW CAR");
        jPanel1.add(btnGoToAddNewCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 175, 55));

        btnBackToMainMenu.setText("BACK TO MAIN MENU");
        jPanel1.add(btnBackToMainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 180, 59));

        btnGoToChangePrice.setText("CHANGE PRICES");
        jPanel1.add(btnGoToChangePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 179, 57));

        btnGoToRemoveCar.setText("REMOVE CAR");
        jPanel1.add(btnGoToRemoveCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 175, 59));

        btnGoToAddParkingLot.setText("ADD PARKING LOT");
        jPanel1.add(btnGoToAddParkingLot, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 179, 59));

        btnGoToRemovePrkingLot.setText("REMOVE PARKING LOT");
        btnGoToRemovePrkingLot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToRemovePrkingLotActionPerformed(evt);
            }
        });
        jPanel1.add(btnGoToRemovePrkingLot, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 180, 57));

        btnDisplayCarInsıde.setText("DISPLAY CARS INSIDE");
        jPanel1.add(btnDisplayCarInsıde, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 179, 57));

        btnDisplayALLSubscriptions.setText("DISPLAY SUBSCRIPTIONS");
        jPanel1.add(btnDisplayALLSubscriptions, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 179, 57));

        jInternalFrame1.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 299, 860, 300));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jInternalFrame1.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoToRemovePrkingLotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToRemovePrkingLotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGoToRemovePrkingLotActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Settings_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Settings_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Settings_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Settings_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Settings_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackToMainMenu;
    private javax.swing.JButton btnDisplayALLSubscriptions;
    private javax.swing.JButton btnDisplayCarInsıde;
    private javax.swing.JButton btnGoToAddNewCar;
    private javax.swing.JButton btnGoToAddParkingLot;
    private javax.swing.JButton btnGoToChangePrice;
    private javax.swing.JButton btnGoToRemoveCar;
    private javax.swing.JButton btnGoToRemovePrkingLot;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

