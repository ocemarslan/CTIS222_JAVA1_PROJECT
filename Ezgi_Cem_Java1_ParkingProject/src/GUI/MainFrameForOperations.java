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
public class MainFrameForOperations extends javax.swing.JFrame {

    /**
     * Creates new form MainFrameForOperations
     */
    public MainFrameForOperations() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnGoToAdminSettings = new javax.swing.JButton();
        btnGoToINCOMINGCarCameraRecognizingSystem = new javax.swing.JButton();
        btnCancelWithoutStart = new javax.swing.JButton();
        btnGoToOUTGOINGCarCameraRecognizingSystems = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setBackground(new java.awt.Color(153, 255, 255));
        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 153, 0));
        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CentralAutoParkingProject/download.png"))); // NOI18N
        jLabel1.setText("    WELCOME TO MEL-CEM BROTHERS AUTO PARK");
        jInternalFrame1.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 990, 140));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("CHOOSING ACTION PLATFORM");
        jInternalFrame1.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 330, 80));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Please choose what you want to do:");
        jInternalFrame1.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 300, 90));

        btnGoToAdminSettings.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGoToAdminSettings.setText("GO TO ADMIN SETTINGS");
        jInternalFrame1.getContentPane().add(btnGoToAdminSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 560, 50));

        btnGoToINCOMINGCarCameraRecognizingSystem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGoToINCOMINGCarCameraRecognizingSystem.setText("GO TO INCOMING CAR CAMERA RECORNIZING SYSTEM");
        btnGoToINCOMINGCarCameraRecognizingSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToINCOMINGCarCameraRecognizingSystemActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(btnGoToINCOMINGCarCameraRecognizingSystem, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 560, 50));

        btnCancelWithoutStart.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancelWithoutStart.setText("CANCEL");
        jInternalFrame1.getContentPane().add(btnCancelWithoutStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 560, 50));

        btnGoToOUTGOINGCarCameraRecognizingSystems.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGoToOUTGOINGCarCameraRecognizingSystems.setText("GO TO OUTGOING CAR CAMERA RECOGNIZING SYSTEM");
        btnGoToOUTGOINGCarCameraRecognizingSystems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToOUTGOINGCarCameraRecognizingSystemsActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(btnGoToOUTGOINGCarCameraRecognizingSystems, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 560, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 1036, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        try {
            jInternalFrame1.setIcon(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoToINCOMINGCarCameraRecognizingSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToINCOMINGCarCameraRecognizingSystemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGoToINCOMINGCarCameraRecognizingSystemActionPerformed

    private void btnGoToOUTGOINGCarCameraRecognizingSystemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToOUTGOINGCarCameraRecognizingSystemsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGoToOUTGOINGCarCameraRecognizingSystemsActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelWithoutStart;
    private javax.swing.JButton btnGoToAdminSettings;
    private javax.swing.JButton btnGoToINCOMINGCarCameraRecognizingSystem;
    private javax.swing.JButton btnGoToOUTGOINGCarCameraRecognizingSystems;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

