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
        lblOmradeschefAgent = new javax.swing.JLabel();
        lblKontorschefAgent = new javax.swing.JLabel();
        lblOmrådeschefRuta = new javax.swing.JLabel();
        lblKontorschefRuta = new javax.swing.JLabel();
        btnNyregistreraAlien = new javax.swing.JButton();
        btnÄndrainfoomAlien = new javax.swing.JButton();
        btnNyregistreraAgentutrustning = new javax.swing.JButton();
        btnSeinfoomAlien = new javax.swing.JButton();
        btnSökOmrådeschef = new javax.swing.JButton();
        btnTopplistaöverAgenter = new javax.swing.JButton();
        btnMinutrustning = new javax.swing.JButton();
        btnAdministratör = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblStartsidaAgent.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        lblStartsidaAgent.setText("Startsida AGENT");

        lblOmradeschefAgent.setFont(new java.awt.Font("Big Caslon", 0, 13)); // NOI18N
        lblOmradeschefAgent.setText("Områdenschef");

        lblKontorschefAgent.setFont(new java.awt.Font("Big Caslon", 0, 13)); // NOI18N
        lblKontorschefAgent.setText("Kontorschef");

        lblOmrådeschefRuta.setText("ID in här");

        lblKontorschefRuta.setText("ID in här också");

        btnNyregistreraAlien.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btnNyregistreraAlien.setText("Nyregistrera Alien");
        btnNyregistreraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNyregistreraAlienActionPerformed(evt);
            }
        });

        btnÄndrainfoomAlien.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btnÄndrainfoomAlien.setText("Ändra info om Alien");

        btnNyregistreraAgentutrustning.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btnNyregistreraAgentutrustning.setText("Nyregistrera Agentutrustning");

        btnSeinfoomAlien.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btnSeinfoomAlien.setText("Se info om Alien");

        btnSökOmrådeschef.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btnSökOmrådeschef.setText("Sök Områdeschef");

        btnTopplistaöverAgenter.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btnTopplistaöverAgenter.setText("Topplista över Agenter");

        btnMinutrustning.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btnMinutrustning.setText("Min utrustning");

        btnAdministratör.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btnAdministratör.setText("Administratör");
        btnAdministratör.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministratörActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSeinfoomAlien)
                            .addComponent(btnNyregistreraAlien))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSökOmrådeschef)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblKontorschefAgent)
                                .addGap(18, 18, 18)
                                .addComponent(lblKontorschefRuta))
                            .addComponent(lblStartsidaAgent)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblOmradeschefAgent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblOmrådeschefRuta)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnÄndrainfoomAlien)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNyregistreraAgentutrustning)
                            .addComponent(btnMinutrustning)
                            .addComponent(btnTopplistaöverAgenter))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addComponent(btnAdministratör)
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblStartsidaAgent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOmradeschefAgent)
                            .addComponent(lblOmrådeschefRuta))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblKontorschefAgent)
                            .addComponent(lblKontorschefRuta)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnNyregistreraAlien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSeinfoomAlien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnÄndrainfoomAlien)))
                .addGap(26, 26, 26)
                .addComponent(btnMinutrustning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNyregistreraAgentutrustning)
                .addGap(38, 38, 38)
                .addComponent(btnSökOmrådeschef)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTopplistaöverAgenter)
                    .addComponent(btnAdministratör))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNyregistreraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNyregistreraAlienActionPerformed
        // TODO add your handling code here:
        NyregistreraAlien visaNyAlien = new NyregistreraAlien(idb);
        visaNyAlien.setVisible(true);
    }//GEN-LAST:event_btnNyregistreraAlienActionPerformed

    private void btnAdministratörActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministratörActionPerformed
        // TODO add your handling code here:
        Administrator visaAdministrator = new Administrator(idb);
        visaAdministrator.setVisible(true);
    }//GEN-LAST:event_btnAdministratörActionPerformed

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
    private javax.swing.JButton btnMinutrustning;
    private javax.swing.JButton btnNyregistreraAgentutrustning;
    private javax.swing.JButton btnNyregistreraAlien;
    private javax.swing.JButton btnSeinfoomAlien;
    private javax.swing.JButton btnSökOmrådeschef;
    private javax.swing.JButton btnTopplistaöverAgenter;
    private javax.swing.JButton btnÄndrainfoomAlien;
    private javax.swing.JLabel lblKontorschefAgent;
    private javax.swing.JLabel lblKontorschefRuta;
    private javax.swing.JLabel lblOmradeschefAgent;
    private javax.swing.JLabel lblOmrådeschefRuta;
    private javax.swing.JLabel lblStartsidaAgent;
    // End of variables declaration//GEN-END:variables
}
