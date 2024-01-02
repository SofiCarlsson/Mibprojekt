/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;

/**
 *
 * @author sarahill
 */
public class TaBortAgent extends javax.swing.JFrame {

    /**
     * Creates new form TaBortAgent
     */
    private InfDB idb;
    
    public TaBortAgent(InfDB db) {
        idb = db;
        initComponents();
        fyllCBBytTillAgent();
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
        txtraderaAgent = new javax.swing.JTextField();
        btnraderaAgent = new javax.swing.JButton();
        cbBytTillAgent = new javax.swing.JComboBox<>();
        lblAgentID = new javax.swing.JLabel();
        lblNyAgent = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        jLabel1.setText("Skriv in ett Agent-ID för att radera agenten från systemet. Det går inte att ångra denna åtgärd.");

        txtraderaAgent.setColumns(7);

        btnraderaAgent.setText("Radera");
        btnraderaAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnraderaAgentActionPerformed(evt);
            }
        });

        cbBytTillAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblAgentID.setText("Skriv in det agent-ID du vill radera");

        lblNyAgent.setText("Välj en agent som ska ersätta som ny kontaktperson");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAgentID)
                            .addComponent(txtraderaAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNyAgent)
                            .addComponent(cbBytTillAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnraderaAgent))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgentID)
                    .addComponent(lblNyAgent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtraderaAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbBytTillAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnraderaAgent)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Fyller rullmenyn för att byta agent med värden
            private void fyllCBBytTillAgent(){
                cbBytTillAgent.removeAllItems();
                String fraga = "SELECT agent_ID from mibdb.Agent";
        
                ArrayList<String> allaAgentID;
                
            try {
               allaAgentID = idb.fetchColumn(fraga);
               
               for (String ettID : allaAgentID){
                  cbBytTillAgent.addItem(ettID);
                
               }
       
       }catch(InfException ettUndantag){
            
              JOptionPane.showMessageDialog(null, " Databasfel! " );
              System.out.println("Internt felmedelande" + ettUndantag.getMessage());
             
    }
    }

    private void btnraderaAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnraderaAgentActionPerformed
        // Radera en agent från systemet
        try{
            //Ger variabelnman till värdena från rutorna och boxarna
            String agentID = txtraderaAgent.getText();
            String nyAgentID = cbBytTillAgent.getSelectedItem().toString();
            String raderaFraga = "SELECT agent_ID from mibdb.Agent";
            
            //Hämtar kolumnen enligt sql-frågan och gör en lista
            ArrayList allaAgentID = idb.fetchColumn(raderaFraga);
            
            //Kollar om ID:t finns i listan
            if (allaAgentID.contains(agentID)){
            //Uppdaterar databasen
            String raderaAgentOmradeschef = "DELETE FROM Omradeschef WHERE Agent_ID = " + agentID;
            idb.delete(raderaAgentOmradeschef);
            
            String raderaAgentKontorschef = "DELETE FROM Kontorschef WHERE Agent_ID = " + agentID;
            idb.delete(raderaAgentKontorschef);
            
            String raderaAgentInneharUtrustning = "DELETE FROM Innehar_Utrustning WHERE Agent_ID = " + agentID;
            idb.delete(raderaAgentInneharUtrustning);
            
            String raderaAgentFaltagent = "DELETE FROM Faltagent WHERE Agent_ID = " + agentID;
            idb.delete(raderaAgentFaltagent);
            
            String raderaAgentAlien = "UPDATE mibdb.Alien SET Ansvarig_Agent = " + nyAgentID + " WHERE Ansvarig_Agent =" + agentID;
            idb.update(raderaAgentAlien);
            
            String raderaAgent = "DELETE FROM Agent WHERE Agent_ID = " + agentID;
            idb.delete(raderaAgent);

            //Skriver ut meddelande att agenten är raderad
            JOptionPane.showMessageDialog(null, " Agenten har raderats." );
            }
            else { JOptionPane.showMessageDialog(null, " Agenten hittades inte." );
                
            }
        }
        catch (InfException ettUndantag){
            
              JOptionPane.showMessageDialog(null, " Databasfel" );
              System.out.println("Det gick inte att ta bort agenten" + ettUndantag.getMessage());
              txtraderaAgent.requestFocus();
        }
    } 
private javax.swing.JButton btnraderaAgent;
    private javax.swing.JComboBox<String> cbBytTillAgent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtraderaAgent;
    private javax.swing.JLabel lblAgentID;
    private javax.swing.JLabel lblNyAgent;
    }//GEN-LAST:event_btnraderaAgentActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TaBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TaBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TaBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TaBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                //new TaBortAgent().setVisible(true);
//            }
//        });
//    }
/*
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnraderaAgent;
    private javax.swing.JComboBox<String> cbBytTillAgent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAgentID;
    private javax.swing.JLabel lblNyAgent;
    private javax.swing.JTextField txtraderaAgent;
    // End of variables declaration//GEN-END:variables
}*/
