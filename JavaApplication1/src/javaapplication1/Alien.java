/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *Hit kommer man om man är inloggad som en alien.
 * 
 * @author oliviacleve
 */
public class Alien extends javax.swing.JFrame {

    private InfDB idb;
    private String Alien_ID;
    private String Registreringsdatum;
    private String Epost;
    private String Losenord;
    private String Namn;
    private String Telefon;
    
    
    /**
     * Konstruktor för Alien
     */

    public Alien(InfDB db, String Alien_ID) {
        idb = db;
        this.Alien_ID = Alien_ID;
        
        initComponents();
    }
    
    public String getAlien_ID() {
        return Alien_ID;
    }
    
    public void setAlien_ID(String Alien_ID) {
        this.Alien_ID = Alien_ID;
    }
    
    public String getRegistreringsdatum() {
        return Registreringsdatum;
    }
    
    public void setRegistreringsdatum() {
      this.Registreringsdatum = Registreringsdatum;
    }
    
    public String getEpost() {
        return Epost;
    }
    
    public void setEpost(String Epost) {
        this.Epost = Epost;
    }
    
    public String getLosenord() {
        return Losenord;
    }
    
    public void setLosenord(String Losenord) {
        this.Losenord = Losenord;
    }
    
    public String getNamn() {
        return Namn;
    }
    
    public void setNamn(String Namn) {
        this.Namn = Namn;
    }
    
    public String getTelefon() {
        return Telefon;
    }
    
    public void setTelefon(String Telefon) {
        this.Telefon = Telefon;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblStartsidaAlien = new javax.swing.JLabel();
        btnAndraLosenordAlien = new javax.swing.JButton();
        lblMittOmrade = new javax.swing.JLabel();
        txtMittOmrade = new javax.swing.JTextField();
        lblOmradesChef = new javax.swing.JLabel();
        lblNamn = new javax.swing.JLabel();
        lblTelefonnummer = new javax.swing.JLabel();
        lblMejladress = new javax.swing.JLabel();
        btnHamtaOmradeschef = new javax.swing.JButton();
        btnLoggaUt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblStartsidaAlien.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        lblStartsidaAlien.setText("Startsida ALIEN");

        btnAndraLosenordAlien.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btnAndraLosenordAlien.setText("Ändra Lösenord");
        btnAndraLosenordAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraLosenordAlienActionPerformed(evt);
            }
        });

        lblMittOmrade.setText("Område:");

        txtMittOmrade.setColumns(4);

        lblOmradesChef.setText("Områdeschef");

        lblNamn.setText("Namn");

        lblTelefonnummer.setText("Telefonnummer");

        lblMejladress.setText("Mejladress");

        btnHamtaOmradeschef.setText("Hämta områdeschef");
        btnHamtaOmradeschef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHamtaOmradeschefActionPerformed(evt);
            }
        });

        btnLoggaUt.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13)); // NOI18N
        btnLoggaUt.setText("Logga ut");
        btnLoggaUt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaUtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStartsidaAlien)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblMittOmrade)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMittOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnHamtaOmradeschef))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNamn)
                                    .addComponent(lblOmradesChef)
                                    .addComponent(lblTelefonnummer)
                                    .addComponent(lblMejladress))))
                        .addContainerGap(56, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAndraLosenordAlien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLoggaUt)
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblStartsidaAlien)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMittOmrade)
                    .addComponent(txtMittOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOmradesChef))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNamn)
                    .addComponent(btnHamtaOmradeschef))
                .addGap(18, 18, 18)
                .addComponent(lblTelefonnummer)
                .addGap(18, 18, 18)
                .addComponent(lblMejladress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAndraLosenordAlien)
                    .addComponent(btnLoggaUt))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Denna metoden ändrar lösenordet för Alien när knappen trycks för att ändra lösenord.
    private void btnAndraLosenordAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraLosenordAlienActionPerformed
     try {
        // Skapa en instans av AndraLosenordAlienFrame och gör den synlig
        AndraLosenordAlien losenordFonster = new AndraLosenordAlien();
        losenordFonster.setVisible(true);

    } catch (Exception e) {
        e.printStackTrace();
        System.out.println("Ett fel inträffade vid ändring av lösenordet, vänligen kontrollera dina uppgifter.");
    }   
    }//GEN-LAST:event_btnAndraLosenordAlienActionPerformed

    //Denna metoden har en kontroll för att kolla om det inskrivna områdesID finns och om detta är fallet så skirvs informationen ut om agenten som är områdeschef. Om områdesID inte finns så skirvs felmedelandet ut.
    private void btnHamtaOmradeschefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHamtaOmradeschefActionPerformed
   if(Validering.txtFaltArInteTom(txtMittOmrade) && Validering.isHeltal(txtMittOmrade)){
        
       try {
            Boolean omradeIDfinns = false;
             String fragaOmradeFinns = "SELECT Omrades_ID FROM Omrade";
             ArrayList<String> ettOmrade = idb.fetchColumn(fragaOmradeFinns);
       
             String inskrivetOmrade = txtMittOmrade.getText();
             
             for(String ettOmradeTabellen: ettOmrade){
             
                 if(ettOmradeTabellen.equals(inskrivetOmrade)){
                 
                      omradeIDfinns = true;
                 }
             }
             
             if(omradeIDfinns==true){
             String Omrade = txtMittOmrade.getText();
             String fragaEtt = "SELECT AGENT_ID from OMRADESCHEF where OMRADE =" +Omrade;
             String resultatEtt = idb.fetchSingle(fragaEtt);
             lblOmradesChef.setText(resultatEtt);
   
             String fragaTva = "SELECT NAMN from AGENT where AGENT_ID =" +resultatEtt;
             String resultatTva = idb.fetchSingle(fragaTva);
             lblNamn.setText(resultatTva);
    
             String fragaTre = "SELECT TELEFON from AGENT where AGENT_ID =" +resultatEtt;
             String resultatTre = idb.fetchSingle(fragaTre);
             lblTelefonnummer.setText(resultatTre);
    
             String fragaFyra = "SELECT EPOST from AGENT where AGENT_ID =" +resultatEtt;
             String resultatFyra = idb.fetchSingle(fragaFyra);
            lblMejladress.setText(resultatFyra);
             }
             
             if(omradeIDfinns==false){
             JOptionPane.showMessageDialog(null, "Detta områdesID finns inte. Skirv in ett annat ID");
             txtMittOmrade.requestFocus();
             }
       
       } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel");
            System.out.println("Internt felmeddelande" + e.getMessage());
       } 
             
     }
    }//GEN-LAST:event_btnHamtaOmradeschefActionPerformed
    
    //Denna metoden loggar ut från Alien sidan när man trycker på knappen 'Logga ut'. Då kommer man tillbaka till inloggningsidan.
    private void btnLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaUtActionPerformed

        Inloggning visaInloggning = new Inloggning(idb);
            visaInloggning.setVisible(true);        
    }//GEN-LAST:event_btnLoggaUtActionPerformed

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
            java.util.logging.Logger.getLogger(Alien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               //new Alien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraLosenordAlien;
    private javax.swing.JButton btnHamtaOmradeschef;
    private javax.swing.JButton btnLoggaUt;
    private javax.swing.JLabel lblMejladress;
    private javax.swing.JLabel lblMittOmrade;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblOmradesChef;
    private javax.swing.JLabel lblStartsidaAlien;
    private javax.swing.JLabel lblTelefonnummer;
    private javax.swing.JTextField txtMittOmrade;
    // End of variables declaration//GEN-END:variables
}
