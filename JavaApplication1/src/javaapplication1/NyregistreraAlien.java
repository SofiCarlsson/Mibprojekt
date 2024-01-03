/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;
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
    public NyregistreraAlien(InfDB db) {
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
        txtNyAlienAlienID = new javax.swing.JTextField();
        txtNyAlienNamn = new javax.swing.JTextField();
        txtNyAlienTelefon = new javax.swing.JTextField();
        txtNyAlienEpost = new javax.swing.JTextField();
        txtNyAlienLösenord = new javax.swing.JTextField();
        txtNyAlienAnsvarigAgent = new javax.swing.JTextField();
        txtNyAlienPlats = new javax.swing.JTextField();
        btnRegistreraAlien = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRubrikvidnyregistrering.setFont(new java.awt.Font("Beirut", 0, 13)); // NOI18N
        lblRubrikvidnyregistrering.setText("Registrera en ny Alien genom att fylla i informationene nedan:");

        lblNyAlienAlienID.setText("AlienID");

        lblNyAlienNamn.setText("Namn");

        lblNyAlienTelefon.setText("Telefon");

        lblNyAlienEpost.setText("Epost");

        lblNyAlienLösenord.setText("Lösenord");

        lblNyAlienRegistreringsdatum.setText("Registreringsdatum");

        lblNyAlienPlats.setText("Plats");

        lblNyAlienAnsvarigAgent.setText("Ansvarig Agent");

        txtNyAlienRegistreringsdatum.setColumns(4);

        txtNyAlienAlienID.setColumns(4);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNyAlienRegistreringsdatum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNyAlienRegistreringsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNyAlienAlienID)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNyAlienAlienID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblNyAlienNamn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNyAlienNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblNyAlienTelefon)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNyAlienTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblNyAlienEpost)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNyAlienLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblNyAlienLösenord)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNyAlienEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblNyAlienPlats)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtNyAlienPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblNyAlienAnsvarigAgent)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtNyAlienAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRegistreraAlien))))
                        .addComponent(lblRubrikvidnyregistrering)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblRubrikvidnyregistrering)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNyAlienRegistreringsdatum)
                    .addComponent(txtNyAlienRegistreringsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNyAlienAlienID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNyAlienAlienID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNyAlienNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNyAlienNamn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNyAlienTelefon)
                    .addComponent(txtNyAlienTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNyAlienEpost)
                    .addComponent(txtNyAlienLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNyAlienLösenord)
                    .addComponent(txtNyAlienEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNyAlienAnsvarigAgent)
                            .addComponent(txtNyAlienAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNyAlienPlats)
                            .addComponent(txtNyAlienPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegistreraAlien)
                        .addGap(31, 31, 31))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistreraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraAlienActionPerformed
try {
    String registreringsdatum = txtNyAlienRegistreringsdatum.getText();
    String alienID = txtNyAlienAlienID.getText();
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

System.out.println (fraga);
    
    idb.insert(fraga);
    
   JOptionPane.showMessageDialog(null, "Ny Alien har registrerats!");
       } catch (InfException e) {
         e.printStackTrace();
        // Meddela användaren om att något gick fel
        JOptionPane.showMessageDialog(null, "Ett fel inträffade vid registrering av Alien: " + e.getMessage());
    }
    }//GEN-LAST:event_btnRegistreraAlienActionPerformed

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
    private javax.swing.JButton btnRegistreraAlien;
    private javax.swing.JLabel lblNyAlienAlienID;
    private javax.swing.JLabel lblNyAlienAnsvarigAgent;
    private javax.swing.JLabel lblNyAlienEpost;
    private javax.swing.JLabel lblNyAlienLösenord;
    private javax.swing.JLabel lblNyAlienNamn;
    private javax.swing.JLabel lblNyAlienPlats;
    private javax.swing.JLabel lblNyAlienRegistreringsdatum;
    private javax.swing.JLabel lblNyAlienTelefon;
    private javax.swing.JLabel lblRubrikvidnyregistrering;
    private javax.swing.JTextField txtNyAlienAlienID;
    private javax.swing.JTextField txtNyAlienAnsvarigAgent;
    private javax.swing.JTextField txtNyAlienEpost;
    private javax.swing.JTextField txtNyAlienLösenord;
    private javax.swing.JTextField txtNyAlienNamn;
    private javax.swing.JTextField txtNyAlienPlats;
    private javax.swing.JTextField txtNyAlienRegistreringsdatum;
    private javax.swing.JTextField txtNyAlienTelefon;
    // End of variables declaration//GEN-END:variables
}
