/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author oliviacleve
 */
public class NyregistreraAlien extends javax.swing.JFrame {

    private InfDB idb;
    /**
     * Creates new form NyregistreraAlien
     */
    public NyregistreraAlien(InfDB idb) {
        initComponents();
        this.idb = idb;
        fyllCbValjRas();
    }
        public NyregistreraAlien() {
        initComponents();
                this.idb = idb;
        fyllCbValjRas();
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

        lblRubrikvidnyregistrering = new javax.swing.JLabel();
        lblNyAlienAlienID = new javax.swing.JLabel();
        lblNyAlienNamn = new javax.swing.JLabel();
        lblNyAlienTelefon = new javax.swing.JLabel();
        lblNyAlienEpost = new javax.swing.JLabel();
        lblNyAlienLösenord = new javax.swing.JLabel();
        lblNyAlienRegistreringsdatum = new javax.swing.JLabel();
        lblNyAlienPlats = new javax.swing.JLabel();
        lblNyAlienAnsvarigAgent = new javax.swing.JLabel();
        txtNyAlienRegistreringsdatum = new javax.swing.JTextField();
        txtNyAlienNamn = new javax.swing.JTextField();
        txtNyAlienTelefon = new javax.swing.JTextField();
        txtNyAlienEpost = new javax.swing.JTextField();
        txtNyAlienLösenord = new javax.swing.JTextField();
        txtNyAlienAnsvarigAgent = new javax.swing.JTextField();
        txtNyAlienPlats = new javax.swing.JTextField();
        btnRegistreraAlien = new javax.swing.JButton();
        CbValjRas = new javax.swing.JComboBox<>();
        txtRasVariabel = new javax.swing.JTextField();
        lblRas = new javax.swing.JLabel();
        lblRasVal = new javax.swing.JLabel();
        lblDatumFormat = new javax.swing.JLabel();
        lblAngeAID = new javax.swing.JLabel();
        lblAngePID = new javax.swing.JLabel();
        lblAlienIdInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRubrikvidnyregistrering.setFont(new java.awt.Font("Beirut", 0, 13)); // NOI18N
        lblRubrikvidnyregistrering.setText("Registrera en ny Alien genom att fylla i informationen nedan:");

        lblNyAlienAlienID.setText("AlienID");

        lblNyAlienNamn.setText("Namn");

        lblNyAlienTelefon.setText("Telefon");

        lblNyAlienEpost.setText("Epost");

        lblNyAlienLösenord.setText("Lösenord");

        lblNyAlienRegistreringsdatum.setText("Registreringsdatum");

        lblNyAlienPlats.setText("Plats");

        lblNyAlienAnsvarigAgent.setText("Ansvarig Agent");

        txtNyAlienRegistreringsdatum.setColumns(4);

        txtNyAlienNamn.setColumns(4);

        txtNyAlienTelefon.setColumns(4);

        txtNyAlienEpost.setColumns(4);

        txtNyAlienLösenord.setColumns(4);

        txtNyAlienAnsvarigAgent.setColumns(4);

        txtNyAlienPlats.setColumns(4);

        btnRegistreraAlien.setText("Registrera Alien");
        btnRegistreraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraAlienActionPerformed(evt);
            }
        });

        lblRas.setText("Ras");

        lblRasVal.setText("Fyll i antal");

        lblDatumFormat.setText("Vänligen ange datum i formatet ÅÅÅÅ-MM-DD");

        lblAngeAID.setText("Vänligen ange Agentens ID");

        lblAngePID.setText("Vänligen ange platsens ID");

        lblAlienIdInfo.setText("ID genereras automatiskt");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRubrikvidnyregistrering)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNyAlienRegistreringsdatum)
                                    .addComponent(lblNyAlienAlienID)
                                    .addComponent(lblNyAlienNamn)
                                    .addComponent(lblNyAlienTelefon)
                                    .addComponent(lblNyAlienLösenord)
                                    .addComponent(lblNyAlienEpost)
                                    .addComponent(lblNyAlienAnsvarigAgent)
                                    .addComponent(lblNyAlienPlats))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNyAlienEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNyAlienRegistreringsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(lblDatumFormat))
                                    .addComponent(txtNyAlienNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNyAlienTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CbValjRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNyAlienLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(81, 81, 81)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblRasVal)
                                            .addComponent(txtRasVariabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNyAlienAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNyAlienPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblAngePID)
                                            .addComponent(lblAngeAID)))
                                    .addComponent(lblAlienIdInfo))))
                        .addGap(0, 61, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRas)
                            .addComponent(btnRegistreraAlien))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblRubrikvidnyregistrering)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNyAlienRegistreringsdatum)
                    .addComponent(txtNyAlienRegistreringsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDatumFormat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNyAlienAlienID)
                    .addComponent(lblAlienIdInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNyAlienNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNyAlienNamn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNyAlienTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNyAlienTelefon))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRasVal)
                    .addComponent(txtNyAlienLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNyAlienLösenord))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbValjRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRas)
                    .addComponent(txtRasVariabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNyAlienEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNyAlienEpost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNyAlienAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNyAlienAnsvarigAgent)
                    .addComponent(lblAngeAID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNyAlienPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNyAlienPlats)
                    .addComponent(lblAngePID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btnRegistreraAlien)
                .addGap(115, 115, 115))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void fyllCbValjRas()   {
   CbValjRas.removeAllItems();
        // Skapa en lista för raserna
    ArrayList<String> allaRaser = new ArrayList<>();

    try {
        // Hämta raserna från databasen och lägg till i listan
        allaRaser.add("Squid");
        allaRaser.add("Worm");
        allaRaser.add("Boglodite");

        // Skapa ett ComboBoxModel och fyll det med raserna
        javax.swing.DefaultComboBoxModel<String> model = new javax.swing.DefaultComboBoxModel<>(allaRaser.toArray(String[]::new));

        // Tilldela ComboBoxModel till ComboBox
        CbValjRas.setModel(model);
        
        CbValjRas.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        // Hantera händelsen när användaren väljer en ras
        updateTextInfo();
        }
        });
        
    } catch (Exception e) {
       e.printStackTrace();
        // Hantera eventuella fel här
        
    }
}
 
 //Denna metod nyregistrera en Alien
    private void btnRegistreraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraAlienActionPerformed
        try {
            String alienID = idb.getAutoIncrement("Alien","Alien_ID");
            if(Validering.txtFaltArInteTom(txtNyAlienRegistreringsdatum) && Validering.datumRattLangd(txtNyAlienRegistreringsdatum) && Validering.txtFaltArInteTom(txtNyAlienNamn)&& Validering.isHeltal(txtNyAlienTelefon) && Validering.txtFaltArInteTom(txtNyAlienTelefon) && Validering.txtFaltArInteTom(txtNyAlienEpost)&& Validering.txtFaltArInteTom(txtNyAlienLösenord) && Validering.losenordRattLangd(txtNyAlienLösenord) && Validering.txtFaltArInteTom(txtNyAlienAnsvarigAgent)&& Validering.txtFaltArInteTom(txtNyAlienPlats)){
                try {
                    String registreringsdatum = txtNyAlienRegistreringsdatum.getText();
                    // String alienID = idb.getAutoIncrement("Alien","Alien_ID");
                    String namn = txtNyAlienNamn.getText();
                    String telefon = txtNyAlienTelefon.getText();
                    String epost = txtNyAlienEpost.getText();
                    String losenord = txtNyAlienLösenord.getText();
                    String ansvarigAgent = txtNyAlienAnsvarigAgent.getText();
                    String plats = txtNyAlienPlats.getText();
                    
                    String fraga = "INSERT INTO Alien VALUES ('"+
                            alienID + "' , '" +
                            registreringsdatum + "' , '" +
                            epost + "' , '" +
                            losenord + "' , '" +
                            namn + "' , '" +
                            telefon + "' , '" +
                            plats + "' , '" +
                            ansvarigAgent + "')";
                    
                    
                    idb.insert(fraga);
                    
                    JOptionPane.showMessageDialog(null, "Ny Alien har registrerats!");
                } catch (InfException e) {
                    e.printStackTrace();
                    // Meddela användaren om att något gick fel
                    JOptionPane.showMessageDialog(null, "Ett fel inträffade vid registrering av Alien: " + e.getMessage());
                }
                
                //Denna kod hämtar vad för slags rasVariable som ska fyllas i när en specifik ras har valts.
                if(Validering.txtFaltArInteTom(txtRasVariabel)){
                    try {
                        //  String alienID = idb.getAutoIncrement("Alien","Alien_ID");
                        String rasVariabel = txtRasVariabel.getText();
                        String valdRas = CbValjRas.getSelectedItem().toString();
                        
                        String rasFraga = "INSERT INTO " + valdRas + " VALUES ('" +
                                alienID + "' , '" +
                                rasVariabel + "')";
                        
                        System.out.println (rasFraga);
                        
                        idb.insert(rasFraga);
                        
                        JOptionPane.showMessageDialog(null, "Ny Alien har registrerats i rastabell!");
                    } catch (InfException e) {
                        e.printStackTrace();
                        // Meddela användaren om att något gick fel
                        JOptionPane.showMessageDialog(null, "Ett fel inträffade vid registrering av Alien: " + e.getMessage());
                    }
                }
            }       } catch (InfException ex) {
            Logger.getLogger(NyregistreraAlien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegistreraAlienActionPerformed

    //Denna metoden hämtar vad som ska skirvas in när en specifik ras har valts.
private void updateTextInfo() {
    try {
        // Hämta den valda rasen från ComboBox
        String valdRas = CbValjRas.getSelectedItem().toString();
        if (valdRas.equals("Boglodite")) {
            lblRasVal.setText("Antal Boogies");
        } else if (valdRas.equals("Squid")) {
            lblRasVal.setText("Antal Armar");
        } else if (valdRas.equals("Worm")) {
            lblRasVal.setText("Längd");
        } else {
            lblRasVal.setText("");
        }
    } catch (Exception e) {
        e.printStackTrace();
        // Hantera eventuella fel här
    }
}
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
            java.util.logging.Logger.getLogger(NyregistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NyregistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NyregistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NyregistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new NyregistreraAlien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbValjRas;
    private javax.swing.JButton btnRegistreraAlien;
    private javax.swing.JLabel lblAlienIdInfo;
    private javax.swing.JLabel lblAngeAID;
    private javax.swing.JLabel lblAngePID;
    private javax.swing.JLabel lblDatumFormat;
    private javax.swing.JLabel lblNyAlienAlienID;
    private javax.swing.JLabel lblNyAlienAnsvarigAgent;
    private javax.swing.JLabel lblNyAlienEpost;
    private javax.swing.JLabel lblNyAlienLösenord;
    private javax.swing.JLabel lblNyAlienNamn;
    private javax.swing.JLabel lblNyAlienPlats;
    private javax.swing.JLabel lblNyAlienRegistreringsdatum;
    private javax.swing.JLabel lblNyAlienTelefon;
    private javax.swing.JLabel lblRas;
    private javax.swing.JLabel lblRasVal;
    private javax.swing.JLabel lblRubrikvidnyregistrering;
    private javax.swing.JTextField txtNyAlienAnsvarigAgent;
    private javax.swing.JTextField txtNyAlienEpost;
    private javax.swing.JTextField txtNyAlienLösenord;
    private javax.swing.JTextField txtNyAlienNamn;
    private javax.swing.JTextField txtNyAlienPlats;
    private javax.swing.JTextField txtNyAlienRegistreringsdatum;
    private javax.swing.JTextField txtNyAlienTelefon;
    private javax.swing.JTextField txtRasVariabel;
    // End of variables declaration//GEN-END:variables
}
