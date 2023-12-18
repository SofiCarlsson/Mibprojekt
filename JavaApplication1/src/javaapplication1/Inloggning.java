/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
//Varför har vi dessa?
import java.util.logging.Logger;
//VArför har vi denna?
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;

/**
 *
 * @author soficarlsson
 */
public class Inloggning extends javax.swing.JFrame {
    
    private InfDB idb;
    /**
     * Creates new form Inlogg
     */
    public Inloggning(InfDB db) {
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

        lblEpost = new javax.swing.JLabel();
        lblLosenord = new javax.swing.JLabel();
        lblLoggain = new javax.swing.JLabel();
        btnLoggain = new javax.swing.JButton();
        txtEpost = new javax.swing.JTextField();
        txtLosenord = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblEpost.setFont(new java.awt.Font("Beirut", 0, 12)); // NOI18N
        lblEpost.setText("Epost:");

        lblLosenord.setFont(new java.awt.Font("Beirut", 0, 12)); // NOI18N
        lblLosenord.setText("Lösenord:");

        lblLoggain.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        lblLoggain.setText("Logga in");

        btnLoggain.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnLoggain.setText("Logga in");
        btnLoggain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggainActionPerformed(evt);
            }
        });

        txtEpost.setColumns(4);
        txtEpost.setFont(new java.awt.Font("Beirut", 0, 13)); // NOI18N
        txtEpost.setText("ao");

        txtLosenord.setColumns(4);
        txtLosenord.setFont(new java.awt.Font("Beirut", 0, 13)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLoggain)
                    .addComponent(lblLoggain)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEpost)
                            .addComponent(lblLosenord))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblLoggain)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEpost)
                    .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLosenord)
                    .addComponent(txtLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(btnLoggain)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Loggar in på programmet genom att sätta in tabellvärdena i en ArrayLis/HashMap och jämföra med txt fälten som skickas in.
    private void btnLoggainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggainActionPerformed
                                                     
      try{
          String epost = txtEpost.getText();
	  String losenord = txtLosenord.getText(); 
          String epostOchLosenord = epost + losenord;
          String fragaAlien = "SELECT Epost, Losenord FROM Alien";
          String fragaAgent = "SELECT Epost, Losenord, Agent_ID FROM Agent";
                 
          ArrayList<HashMap<String, String>> Alien = idb.fetchRows(fragaAlien);
          ArrayList<HashMap<String, String>> Agent = idb.fetchRows(fragaAgent);
          
          
          //Går igenom alla Alien Losenord med Email och kollar om något mtachar med det som skrevs in i txt fälten. 
          for(int i= 0 ; i<Alien.size() ; i++){
              String output = "";
              
              output += Alien.get(i).get("Epost") + Alien.get(i).get("Losenord");
               
                //Här jämförs om det eposten+lösenordet = det värdena som hämtas.
                if(epostOchLosenord.equals(output)){
                   JOptionPane.showMessageDialog(null, " Rätt lösnenord angivet" );
                   
                }
             }
          
          for(int i= 0 ; i<Agent.size() ; i++){
              String output = "";
              output += Agent.get(i).get("Epost") + Agent.get(i).get("Losenord");
               
                if(epostOchLosenord.equals(output)){
                   JOptionPane.showMessageDialog(null, " Rätt lösnenord angivet" );
                  
                   //Kommer in i Source för Agent.
                   Agent agentFonster = new Agent(idb, Agent.get(i).get("Agent_ID"));
                   agentFonster.setVisible(true);
                }
             }      
         //VARFÖR FUNKAR INTE CATCHEN???
        }catch(InfException ettUndantag){
            
              JOptionPane.showMessageDialog(null, " Fel lösnenord angivet" );
              System.out.println("Internt felmedelande" + ettUndantag.getMessage());
              txtLosenord.requestFocus();
        
        }
    }//GEN-LAST:event_btnLoggainActionPerformed

    
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
            java.util.logging.Logger.getLogger(Inloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new Inloggning(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoggain;
    private javax.swing.JLabel lblEpost;
    private javax.swing.JLabel lblLoggain;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JTextField txtEpost;
    private javax.swing.JTextField txtLosenord;
    // End of variables declaration//GEN-END:variables
}
