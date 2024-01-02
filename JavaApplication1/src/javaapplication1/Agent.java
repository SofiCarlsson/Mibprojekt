/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.sql.Statement;


public class Agent extends javax.swing.JFrame {

    //Fälten för klassen Agent
    private InfDB idb;
    private String Agent_ID;
    private String Namn;
    private String Telefon;
    private String Anstallningsdatum;
    private String Administrator;
    private String Epost;
    private String Losenord;
    //private int (främmande nyckel) Omrade;
    
    
    //Konstruktor för Agent klassen
    
    public Agent(InfDB db, String Agent_ID) { 
        
        idb = db;
        this.Agent_ID= Agent_ID;
        
        
        initComponents();
    }
    
    //Get + set för övriga fields in 
    public String getAgen_ID() {
        return Agent_ID;
    }
    
    public void setAgent_ID(String Agent_ID) {
        this.Agent_ID = Agent_ID;
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
    
    public String getAnstallningsdatum() {
        return Anstallningsdatum;
    }
    
    public void setAnstallningsdatum(String Anstallningsdatum) {
        this.Anstallningsdatum = Anstallningsdatum;
    }
    
    public String getAdministrator() {
        return Administrator;
    }
    
    public void setAdministrator(String Administrator) {
        this.Administrator = Administrator;
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
    
    
    //Här ska get + set kanske in om vi ska ha område som fält
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblStartsidaAgent = new javax.swing.JLabel();
        btnNyregistreraAlien = new javax.swing.JButton();
        btnNyregistreraAgentutrustning = new javax.swing.JButton();
        btnSeochändrainfoomAlien = new javax.swing.JButton();
        btnSökOmrådeschef = new javax.swing.JButton();
        btnTopplistaöverAgenter = new javax.swing.JButton();
        btnMinutrustning = new javax.swing.JButton();
        btnAdministratör = new javax.swing.JButton();
        btnListaAliensPaPlats = new javax.swing.JButton();
        btnLoggaUt = new javax.swing.JButton();
        btnSokAliensEfterRas = new javax.swing.JButton();
        btnAndraLosenord = new javax.swing.JButton();
        btnDatumForRegistreringAvAliens = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblStartsidaAgent.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        lblStartsidaAgent.setText("Startsida AGENT");

        btnNyregistreraAlien.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btnNyregistreraAlien.setText("Nyregistrera Alien");
        btnNyregistreraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNyregistreraAlienActionPerformed(evt);
            }
        });

        btnNyregistreraAgentutrustning.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btnNyregistreraAgentutrustning.setText("Nyregistrera Agentutrustning");
        btnNyregistreraAgentutrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNyregistreraAgentutrustningActionPerformed(evt);
            }
        });

        btnSeochändrainfoomAlien.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btnSeochändrainfoomAlien.setText("Se och ändra info om Alien");
        btnSeochändrainfoomAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeochändrainfoomAlienActionPerformed(evt);
            }
        });

        btnSökOmrådeschef.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btnSökOmrådeschef.setText("Sök Områdeschef");
        btnSökOmrådeschef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSökOmrådeschefActionPerformed(evt);
            }
        });

        btnTopplistaöverAgenter.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btnTopplistaöverAgenter.setText("Topplista över Agenter");
        btnTopplistaöverAgenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopplistaöverAgenterActionPerformed(evt);
            }
        });

        btnMinutrustning.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btnMinutrustning.setText("Min utrustning");
        btnMinutrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinutrustningActionPerformed(evt);
            }
        });

        btnAdministratör.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btnAdministratör.setText("Administratör");
        btnAdministratör.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministratörActionPerformed(evt);
            }
        });

        btnListaAliensPaPlats.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btnListaAliensPaPlats.setText("Lista Aliens på plats");
        btnListaAliensPaPlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaAliensPaPlatsActionPerformed(evt);
            }
        });

        btnLoggaUt.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13)); // NOI18N
        btnLoggaUt.setText("Logga ut");
        btnLoggaUt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaUtActionPerformed(evt);
            }
        });

        btnSokAliensEfterRas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btnSokAliensEfterRas.setText("Sök Aliens efter ras");
        btnSokAliensEfterRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokAliensEfterRasActionPerformed(evt);
            }
        });

        btnAndraLosenord.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btnAndraLosenord.setText("Ändra lösenord");
        btnAndraLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraLosenordActionPerformed(evt);
            }
        });

        btnDatumForRegistreringAvAliens.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btnDatumForRegistreringAvAliens.setText("Datum för registrering av Aliens");
        btnDatumForRegistreringAvAliens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatumForRegistreringAvAliensActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNyregistreraAgentutrustning)
                                    .addComponent(btnMinutrustning))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTopplistaöverAgenter)
                                    .addComponent(btnSökOmrådeschef)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnListaAliensPaPlats)
                                    .addComponent(lblStartsidaAgent)
                                    .addComponent(btnSeochändrainfoomAlien)
                                    .addComponent(btnSokAliensEfterRas)
                                    .addComponent(btnDatumForRegistreringAvAliens))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLoggaUt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAndraLosenord, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNyregistreraAlien)
                            .addComponent(btnAdministratör))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblStartsidaAgent)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMinutrustning)
                    .addComponent(btnSökOmrådeschef))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNyregistreraAgentutrustning)
                    .addComponent(btnTopplistaöverAgenter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdministratör)
                .addGap(74, 74, 74)
                .addComponent(btnNyregistreraAlien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSeochändrainfoomAlien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDatumForRegistreringAvAliens)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListaAliensPaPlats)
                    .addComponent(btnAndraLosenord))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSokAliensEfterRas)
                    .addComponent(btnLoggaUt))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNyregistreraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNyregistreraAlienActionPerformed
        // TODO add your handling code here:
        NyregistreraAlien visaNyAlien = new NyregistreraAlien(idb);
        visaNyAlien.setVisible(true);
    }//GEN-LAST:event_btnNyregistreraAlienActionPerformed

    private void btnMinutrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinutrustningActionPerformed
        //Knapp till MinUtrustning
        Minutrustning visaMinUtrustning = new Minutrustning(idb);
        visaMinUtrustning.setVisible(true);
    }//GEN-LAST:event_btnMinutrustningActionPerformed

    private void btnAdministratörActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministratörActionPerformed
        // TODO add your handling code here:
        Administrator adminFonster = new Administrator(idb);
                   adminFonster.setVisible(true);
    }//GEN-LAST:event_btnAdministratörActionPerformed

    private void btnSökOmrådeschefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSökOmrådeschefActionPerformed
           //Knapp till SökOmrådeschef 
           SokOmrådeschef visaChef = new SokOmrådeschef(idb);
           visaChef.setVisible(true);
    }//GEN-LAST:event_btnSökOmrådeschefActionPerformed

    //Knapp som går tillbaka till inloggningen
    private void btnLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaUtActionPerformed
        Inloggning visaInloggning = new Inloggning(idb);
        visaInloggning.setVisible(true);
    }//GEN-LAST:event_btnLoggaUtActionPerformed

    private void btnSokAliensEfterRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokAliensEfterRasActionPerformed
  //Knapp till sök aliens efter ras
        SokAliensEfterRas visaRas = new SokAliensEfterRas(idb);
        visaRas.setVisible(true);
    }//GEN-LAST:event_btnSokAliensEfterRasActionPerformed

    private void btnAndraLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraLosenordActionPerformed
// Knapp till ändra lösenord för agenter
     try {
        // Skapa en instans av AndraLosenordAlienFrame och gör den synlig
        AndraLosenordAgent losenordFonsterAgent = new AndraLosenordAgent();
        losenordFonsterAgent.setVisible(true);

    } catch (Exception e) {
        e.printStackTrace();
        System.out.println("Ett fel inträffade vid ändring av lösenordet.");
    }  
    }//GEN-LAST:event_btnAndraLosenordActionPerformed

    private void btnSeochändrainfoomAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeochändrainfoomAlienActionPerformed
        SeOchAndraInfoOmAlien visaInfoOmAlien = new SeOchAndraInfoOmAlien(idb);
        visaInfoOmAlien.setVisible(true);    }//GEN-LAST:event_btnSeochändrainfoomAlienActionPerformed

    private void btnNyregistreraAgentutrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNyregistreraAgentutrustningActionPerformed
        //Knapp till NyregistreraAgentUtrustning
        new NyregistreraAgentutrustning(idb).setVisible(true);
    }//GEN-LAST:event_btnNyregistreraAgentutrustningActionPerformed

    private void btnTopplistaöverAgenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopplistaöverAgenterActionPerformed
        //Knapp till TopplistaÖverAgenter
        new TopplistaOverAgenter(idb).setVisible(true);
    }//GEN-LAST:event_btnTopplistaöverAgenterActionPerformed

    private void btnListaAliensPaPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaAliensPaPlatsActionPerformed
        //Knapp till ListaAliensPaPlats
        new ListaAlienspaplats(idb).setVisible(true);
    }//GEN-LAST:event_btnListaAliensPaPlatsActionPerformed

    private void btnDatumForRegistreringAvAliensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatumForRegistreringAvAliensActionPerformed
        //Knapp till DatumFörRegistreringAvAliens
        new DatumForRegistreringAvAliens(idb).setVisible(true);
    }//GEN-LAST:event_btnDatumForRegistreringAvAliensActionPerformed

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
            java.util.logging.Logger.getLogger(Agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Agent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministratör;
    private javax.swing.JButton btnAndraLosenord;
    private javax.swing.JButton btnDatumForRegistreringAvAliens;
    private javax.swing.JButton btnListaAliensPaPlats;
    private javax.swing.JButton btnLoggaUt;
    private javax.swing.JButton btnMinutrustning;
    private javax.swing.JButton btnNyregistreraAgentutrustning;
    private javax.swing.JButton btnNyregistreraAlien;
    private javax.swing.JButton btnSeochändrainfoomAlien;
    private javax.swing.JButton btnSokAliensEfterRas;
    private javax.swing.JButton btnSökOmrådeschef;
    private javax.swing.JButton btnTopplistaöverAgenter;
    private javax.swing.JLabel lblStartsidaAgent;
    // End of variables declaration//GEN-END:variables
}
