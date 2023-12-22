/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author mallan
 */
public class AndraLosenordAlien extends javax.swing.JFrame {

    private InfDB idb;
    
    /**
     * Creates new form AndraLosenordAlien
     */
    public AndraLosenordAlien() {
        initComponents();
        
        try{
            idb = new InfDB ("mibdb", "3306", "mibdba", "mibkey");
            new Inloggning(idb).setVisible(true);
        } catch (InfException ex){
            java.util.logging.Logger.getLogger(JavaApplication1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGammaltLosenord = new javax.swing.JLabel();
        lblMejladress = new javax.swing.JLabel();
        lblNyttLosenord = new javax.swing.JLabel();
        txtMejladress = new javax.swing.JTextField();
        txtGammaltLosenord = new javax.swing.JTextField();
        txtNyttLosenord = new javax.swing.JTextField();
        btnAndraLosenord = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblGammaltLosenord.setText("Gammalt lösenord");

        lblMejladress.setText("Mejladress");

        lblNyttLosenord.setText("Nytt lösenord");

        txtMejladress.setText("Epost");

        txtGammaltLosenord.setText("Nuvarande");

        txtNyttLosenord.setText("Nytt");

        btnAndraLosenord.setText("Ändra lösenord");
        btnAndraLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraLosenordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMejladress)
                    .addComponent(txtMejladress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(txtGammaltLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNyttLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAndraLosenord)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblGammaltLosenord)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(lblNyttLosenord)))))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGammaltLosenord)
                    .addComponent(lblMejladress)
                    .addComponent(lblNyttLosenord))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMejladress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGammaltLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNyttLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnAndraLosenord)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAndraLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraLosenordActionPerformed
   try{
          String epost = txtMejladress.getText();
	  String gammaltLosenord = txtGammaltLosenord.getText(); 
          String nyttLosenord = txtNyttLosenord.getText();
          String epostOchLosenord = epost + gammaltLosenord;
          
          String fragaAlien = "SELECT Epost, Losenord FROM Alien";
                 
          ArrayList<HashMap<String, String>> Alien = idb.fetchRows(fragaAlien);
          
          
          //Går igenom alla Alien Losenord med Email och kollar om något mtachar med det som skrevs in i txt fälten. 
          for(int i= 0 ; i<Alien.size() ; i++){
              String output = "";
              
              output += Alien.get(i).get("Epost") + Alien.get(i).get("Losenord");
               
                //Här jämförs om det eposten+lösenordet = det värdena som hämtas.
                if(epostOchLosenord.equals(output)){
                 
                  String updateQuery = "UPDATE Alien SET Losenord = '" + nyttLosenord + "' WHERE Epost = '" + epost + "'";
           
                 idb.update(updateQuery);
                    
                    
                    JOptionPane.showMessageDialog(null, " Lösenordet har ändrats." );
                    
                    // Stäng detta fönster om ändringen lyckades
                    this.dispose();
                    
                   //Kommer in Source för Alien
                   Alien alienFonster = new Alien(idb, Alien.get(i).get("Alien_ID"));
                   alienFonster.setVisible(true);
                   
                   break;
                }
               // else {
               // JOptionPane.showMessageDialog(null, "Felaktigt e-post eller lösenord");
        
               // }
             }
          
     
        
        }catch(InfException ettUndantag){
            
              JOptionPane.showMessageDialog(null, " Fel lösnenord angivet" );
              System.out.println("Internt felmedelande" + ettUndantag.getMessage());
              txtGammaltLosenord.requestFocus();
        
        }

    }//GEN-LAST:event_btnAndraLosenordActionPerformed

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
            java.util.logging.Logger.getLogger(AndraLosenordAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraLosenordAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraLosenordAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraLosenordAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AndraLosenordAlien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraLosenord;
    private javax.swing.JLabel lblGammaltLosenord;
    private javax.swing.JLabel lblMejladress;
    private javax.swing.JLabel lblNyttLosenord;
    private javax.swing.JTextField txtGammaltLosenord;
    private javax.swing.JTextField txtMejladress;
    private javax.swing.JTextField txtNyttLosenord;
    // End of variables declaration//GEN-END:variables
}
