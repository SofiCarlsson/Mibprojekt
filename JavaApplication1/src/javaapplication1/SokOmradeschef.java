/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
/**
 *
 * Denna metoden söker upp Omradeschefen för ett angivet Område
 */
public class SokOmradeschef extends javax.swing.JFrame {
    
    private InfDB idb;
    /**
     * Creates new form SökOmrådeschef
     */
    public SokOmradeschef(InfDB db) {
        initComponents();
        idb = db;
        fyllCbValjOmrade();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSökOmrådeschef = new javax.swing.JLabel();
        lblVäljOmråde = new javax.swing.JLabel();
        cbVäljområde = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaÄrOmrådeschef = new javax.swing.JTextArea();
        lblAgentID = new javax.swing.JLabel();
        lblNamn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSökOmrådeschef.setFont(new java.awt.Font("Beirut", 0, 13)); // NOI18N
        lblSökOmrådeschef.setText("Sök efter Områdeschef");

        lblVäljOmråde.setText("Välj område");

        cbVäljområde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVäljområdeActionPerformed(evt);
            }
        });

        txtAreaÄrOmrådeschef.setColumns(20);
        txtAreaÄrOmrådeschef.setRows(5);
        jScrollPane1.setViewportView(txtAreaÄrOmrådeschef);

        lblAgentID.setText("Agent ID");

        lblNamn.setText("Namn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSökOmrådeschef)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblVäljOmråde)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAgentID)
                                .addGap(75, 75, 75)
                                .addComponent(lblNamn))
                            .addComponent(cbVäljområde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblSökOmrådeschef)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVäljOmråde)
                    .addComponent(cbVäljområde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgentID)
                    .addComponent(lblNamn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Denna metoden fyller TextArea med informationen om vem som är Områdeschef fför den valda benämningen av området.
    private void cbVäljområdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVäljområdeActionPerformed
        txtAreaÄrOmrådeschef.setText("");
        
        ArrayList<HashMap<String, String>> soktOmradeschef = new ArrayList<HashMap<String, String>>();
        String valdBenamning = cbVäljområde.getSelectedItem().toString();
         if(valdBenamning!=""){
        try {
        
               
                String fraga = "SELECT Namn, Agent_ID FROM Agent where Agent.Agent_ID in (Select Omradeschef.Agent_ID from Omradeschef where Omradeschef.Omrade in (Select Omrade.Omrades_ID from Omrade where Benamning  = '" + valdBenamning + "'))";
                
                    soktOmradeschef.add(idb.fetchRow(fraga));
                  
                for(HashMap<String, String> omradesChef : soktOmradeschef){
                
                txtAreaÄrOmrådeschef.append(omradesChef.get("Agent_ID") + "\t");
                txtAreaÄrOmrådeschef.append("" + omradesChef.get("Namn") + "\t");
            
                }
                    
              
        }catch(InfException ettUndantag){
            JOptionPane.showMessageDialog(null, "Databasfel!");
         }
        }
    }//GEN-LAST:event_cbVäljområdeActionPerformed

    //Denna metoden fyller skrollboxen med de benämningar som det finns för Området.
    private void fyllCbValjOmrade(){
        
        String fraga = ("SELECT Benamning FROM Omrade;");
        
        ArrayList<String> allaOmraden;
        
        try{
        
        allaOmraden = idb.fetchColumn(fraga);
        
            for(String benamning : allaOmraden){
            
                    cbVäljområde.addItem(benamning);
            }
        } catch (InfException ettUndantag){
        
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        catch (Exception ettUndantag){
        
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
           
        }
       
    }
   
    /**
     * @param args the command line arguments
     */
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
//            java.util.logging.Logger.getLogger(SokOmradeschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SokOmradeschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SokOmradeschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SokOmradeschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//               //new SokOmradeschef().setVisible(true);
//            }
//        });
//    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbVäljområde;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgentID;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblSökOmrådeschef;
    private javax.swing.JLabel lblVäljOmråde;
    private javax.swing.JTextArea txtAreaÄrOmrådeschef;
    // End of variables declaration//GEN-END:variables
}