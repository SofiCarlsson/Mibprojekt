/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;

/**
 *
 * @author soficarlsson
 */
public class Inloggning extends javax.swing.JFrame {
    
    private InfDB idb;
    private boolean lyckadInloggning;
    /**
     * Skapar ny inloggning
     */
    public Inloggning(InfDB db) {
        idb = db;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEpost = new javax.swing.JLabel();
        lblLosenord = new javax.swing.JLabel();
        lblLoggain = new javax.swing.JLabel();
        btnLoggain = new javax.swing.JButton();
        txtEpost = new javax.swing.JTextField();
        txtLosenord = new javax.swing.JTextField();
        lblLoggaInAlien = new javax.swing.JLabel();
        lblEpostAlien = new javax.swing.JLabel();
        lblLosenordAlien = new javax.swing.JLabel();
        txtEpostAlien = new javax.swing.JTextField();
        txtLosenordAlien = new javax.swing.JTextField();
        btnLoggaInAlien = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblEpost.setFont(new java.awt.Font("Beirut", 0, 12)); // NOI18N
        lblEpost.setText("Epost:");

        lblLosenord.setFont(new java.awt.Font("Beirut", 0, 12)); // NOI18N
        lblLosenord.setText("Lösenord:");

        lblLoggain.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        lblLoggain.setText("Logga in Agent");

        btnLoggain.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnLoggain.setText("Logga in");
        btnLoggain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggainActionPerformed(evt);
            }
        });

        txtEpost.setColumns(4);
        txtEpost.setFont(new java.awt.Font("Beirut", 0, 13)); // NOI18N

        txtLosenord.setColumns(4);
        txtLosenord.setFont(new java.awt.Font("Beirut", 0, 13)); // NOI18N

        lblLoggaInAlien.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        lblLoggaInAlien.setText("Logga in Alien");

        lblEpostAlien.setFont(new java.awt.Font("Beirut", 0, 12)); // NOI18N
        lblEpostAlien.setText("Epost:");

        lblLosenordAlien.setFont(new java.awt.Font("Beirut", 0, 12)); // NOI18N
        lblLosenordAlien.setText("Lösenord:");

        txtEpostAlien.setColumns(4);

        txtLosenordAlien.setColumns(4);

        btnLoggaInAlien.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        btnLoggaInAlien.setText("Logga in");
        btnLoggaInAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaInAlienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLoggain)
                                .addGap(92, 92, 92)
                                .addComponent(lblLoggaInAlien))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEpost)
                                    .addComponent(lblLosenord))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEpostAlien)
                                    .addComponent(lblLosenordAlien))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEpostAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLosenordAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLoggain)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLoggaInAlien)
                        .addGap(65, 65, 65))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLoggain)
                    .addComponent(lblLoggaInAlien))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEpost)
                    .addComponent(txtEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEpostAlien)
                    .addComponent(txtEpostAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLosenord)
                    .addComponent(txtLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLosenordAlien)
                    .addComponent(txtLosenordAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoggain)
                    .addComponent(btnLoggaInAlien))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        //Denna metoden loggar in som Agent. Den kollar om lösenordet och email hör ihopp, om den gör det loggar man in på Agent.
         //Denna metod kontrollerar också att eposten man skrivit in finns registrerad i databasen, annars kommer ett felmeddelande.

    private void btnLoggainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggainActionPerformed

        //Denna if-sats kollar om om fälten inte ät tomma och lösenord är större eller lika med 6 tecken .
     if(Validering.txtFaltArInteTom(txtLosenord) && Validering.losenordRattLangd(txtLosenord) && Validering.txtFaltArInteTom(txtEpost)){  
      try {
            String epost = txtEpost.getText();
            String losenord = txtLosenord.getText(); 
            String epostOchLosenord = epost + losenord;

            String fragaAgent = "SELECT Epost, Losenord, Agent_ID FROM Agent";
                     
            ArrayList<HashMap<String, String>> agentLista = idb.fetchRows(fragaAgent);
         
            boolean lyckadInloggning = false;
            boolean epostHittad = false;

            for (int i = 0; i < agentLista.size(); i++) {
                String output = "";
                output += agentLista.get(i).get("Epost") + agentLista.get(i).get("Losenord");

                if (epostOchLosenord.equals(output)) {
                    JOptionPane.showMessageDialog(null, "Rätt lösenord angivet");

                    // Kommer in i Source för Agent.
                    Agent agentFonster = new Agent(idb, agentLista.get(i).get("Agent_ID"));
                    agentFonster.setVisible(true);

                    lyckadInloggning = true;
                    break;
                    }

                if  (epost.equals(agentLista.get(i).get("Epost"))) {
                    epostHittad = true;
                    break;
                }
            }

            if (!lyckadInloggning) {
                if (!epostHittad) {
                    JOptionPane.showMessageDialog(null, " Denna Eposten finns inte registrerad. Vänligen ange en giltig ");
                    } else {
                     JOptionPane.showMessageDialog(null, "Fel epost eller lösenord angivet, vänligen prova igen");
                     }
                     txtLosenord.requestFocus();
                }

        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            txtLosenord.requestFocus();
        }
    }//GEN-LAST:event_btnLoggainActionPerformed
    }

    //Denna metod loggar in på Alien om txtFalt har värde och lösenord och email hör ihop.
    //Denna metod kontrollerar också att eposten man skrivit in finns registrerad i databasen, annars kommer ett felmeddelande.
    private void btnLoggaInAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaInAlienActionPerformed
        
        //Denna if-sats kollar om om fälten inte ät tomma och lösenord är större eller lika med 6 tecken .
       if(Validering.txtFaltArInteTom(txtLosenordAlien) && Validering.losenordRattLangd(txtLosenordAlien)&& Validering.txtFaltArInteTom (txtEpostAlien)){ 
           try{
       String EpostAlien = txtEpostAlien.getText();
       String losenordAlien = txtLosenordAlien.getText();
       String epostOchLosenord = EpostAlien + losenordAlien;
       
       String fragaAlien = "SELECT Epost, Losenord, Alien_ID FROM Alien";
       
       ArrayList<HashMap<String, String>> Alien = idb.fetchRows(fragaAlien);
      
             boolean lyckadInloggningAlien = false;
             boolean epostHittadAlien = false;
            
           //Går igenom alla Alien Losenord med Email och kollar om något mtachar med det som skrevs in i txt fälten. 
          for(int i= 0 ; i<Alien.size() ; i++){
              String output = "";
              
              output += Alien.get(i).get("Epost") + Alien.get(i).get("Losenord");
               
                //Här jämförs om det eposten+lösenordet = det värdena som hämtas.
                if(epostOchLosenord.equals(output)){
                   JOptionPane.showMessageDialog(null, " Rätt lösnenord angivet" );
                    
                   //Kommer in Source för Alien
                   Alien alienFonster = new Alien(idb, Alien.get(i).get("Alien_ID"));
                   alienFonster.setVisible(true);
                   
                   lyckadInloggningAlien = true;
                   break;
                     }
                
                if (EpostAlien.equals(Alien.get(i).get("Epost"))) {
                    epostHittadAlien = true;
                    break;
                    }
              }
                 
           if (!lyckadInloggningAlien) {
                if (!epostHittadAlien) {
                    JOptionPane.showMessageDialog(null, " Denna Eposten finns inte registrerad. Vänligen ange en giltig ");
                } else {
                    JOptionPane.showMessageDialog(null, "Fel epost eller lösenord angivet, vänligen prova igen");
                        }
                txtLosenordAlien.requestFocus();
            }

        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            txtLosenord.requestFocus();
        }
      }                                          
    }
       
          // Variables declaration - do not modify                     
    private javax.swing.JButton btnLoggaInAlien;
    private javax.swing.JButton btnLoggain;
    private javax.swing.JLabel lblEpost;
    private javax.swing.JLabel lblEpostAlien;
    private javax.swing.JLabel lblLoggaInAlien;
    private javax.swing.JLabel lblLoggain;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JLabel lblLosenordAlien;
    private javax.swing.JTextField txtEpost;
    private javax.swing.JTextField txtEpostAlien;
    private javax.swing.JTextField txtLosenord;
    private javax.swing.JTextField txtLosenordAlien;
    // End of variables declaration                   

    }//GEN-LAST:event_btnLoggaInAlienActionPerformed

    
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
//            java.util.logging.Logger.getLogger(Inloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Inloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Inloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Inloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//               // new Inloggning(idb).setVisible(true);
//            }
//        });
//    }
/*
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoggaInAlien;
    private javax.swing.JButton btnLoggain;
    private javax.swing.JLabel lblEpost;
    private javax.swing.JLabel lblEpostAlien;
    private javax.swing.JLabel lblLoggaInAlien;
    private javax.swing.JLabel lblLoggain;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JLabel lblLosenordAlien;
    private javax.swing.JTextField txtEpost;
    private javax.swing.JTextField txtEpostAlien;
    private javax.swing.JTextField txtLosenord;
    private javax.swing.JTextField txtLosenordAlien;
    // End of variables declaration//GEN-END:variables
*/
