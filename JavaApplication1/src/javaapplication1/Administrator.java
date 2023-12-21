/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author sarahill
 */
public class Administrator extends javax.swing.JFrame {

    private InfDB idb; 
    /**
     * Creates new form Administrator
     */
    /**
     * Creates new form Inlogg
     */
    public Administrator(InfDB db) {
        idb = db;
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
        btntaBortAlien = new javax.swing.JButton();
        btntaBortUtrustning = new javax.swing.JButton();
        btnregistreraNyAgent = new javax.swing.JButton();
        btnsokInfoOmAgent = new javax.swing.JButton();
        btngeadministratorStatus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Beirut", 0, 13)); // NOI18N
        jLabel1.setText("Du är inloggad som administratör");

        btntaBortAlien.setText("Ta bort en alien");

        btntaBortUtrustning.setText("Ta bort utrustning");

        btnregistreraNyAgent.setText("Registrera ny agent");
        btnregistreraNyAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistreraNyAgentActionPerformed(evt);
            }
        });

        btnsokInfoOmAgent.setText("Se och ändrainformation om en agent");
        btnsokInfoOmAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsokInfoOmAgentActionPerformed(evt);
            }
        });

        btngeadministratorStatus.setText("//Ge administratörstatus till en agent");
        btngeadministratorStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngeadministratorStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnregistreraNyAgent)
                    .addComponent(jLabel1)
                    .addComponent(btnsokInfoOmAgent)
                    .addComponent(btngeadministratorStatus))
                .addContainerGap(139, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btntaBortAlien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btntaBortUtrustning)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnregistreraNyAgent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsokInfoOmAgent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btngeadministratorStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntaBortAlien)
                    .addComponent(btntaBortUtrustning))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsokInfoOmAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsokInfoOmAgentActionPerformed
        //Öppnar ny ruta för att söka information om en agent
        SokInfoOmAgent sokinfoomagentFonster = new SokInfoOmAgent(idb);
                   sokinfoomagentFonster.setVisible(true);
    }//GEN-LAST:event_btnsokInfoOmAgentActionPerformed

    private void btnregistreraNyAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistreraNyAgentActionPerformed
        //Öppnar ny ruta för att registrera en ny agent
        NyregistreraAgent registreraAgentfonster = new NyregistreraAgent(idb);
        registreraAgentfonster.setVisible(true);
    }//GEN-LAST:event_btnregistreraNyAgentActionPerformed

    private void btngeadministratorStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngeadministratorStatusActionPerformed
        // TODO add your handling code here:
        GeAdministratorStatus gorAdminfonster = new GeAdministratorStatus(idb);
        gorAdminfonster.setVisible(true);
    }//GEN-LAST:event_btngeadministratorStatusActionPerformed

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
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run();
//                new Administrator().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngeadministratorStatus;
    private javax.swing.JButton btnregistreraNyAgent;
    private javax.swing.JButton btnsokInfoOmAgent;
    private javax.swing.JButton btntaBortAlien;
    private javax.swing.JButton btntaBortUtrustning;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
