/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

//test
public class NyregistreraAgentutrustning extends javax.swing.JFrame {
    
    private InfDB idb;
    /**
     * Creates new form NyregistreraAgent
     */
    public NyregistreraAgentutrustning(InfDB idb) {
        initComponents();
        this.idb = idb;
        fyllcbKategori();
    }
        public NyregistreraAgentutrustning() {
        initComponents();
                this.idb = idb;
        fyllcbKategori();
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

        lblRegNyRubrik = new javax.swing.JLabel();
        lblNyRegUtrustningsID = new javax.swing.JLabel();
        txtNyRegUtrustningsID = new javax.swing.JTextField();
        lblNyRegBenämning = new javax.swing.JLabel();
        txtNyRegBenämning = new javax.swing.JTextField();
        lblNyRegKategori = new javax.swing.JLabel();
        lblKategori = new javax.swing.JLabel();
        txtKategori = new javax.swing.JTextField();
        cbKategori = new javax.swing.JComboBox<>();
        btnRegistreraUtrustning = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRegNyRubrik.setFont(new java.awt.Font("Beirut", 0, 13)); // NOI18N
        lblRegNyRubrik.setText("Här kan du registrera ny Agentutrusning:");

        lblNyRegUtrustningsID.setText("UtrusningsID");

        txtNyRegUtrustningsID.setColumns(4);

        lblNyRegBenämning.setText("Benämning");

        txtNyRegBenämning.setColumns(4);

        lblNyRegKategori.setText("Kategori");

        txtKategori.setColumns(4);

        btnRegistreraUtrustning.setText("Registrera Utrustning");
        btnRegistreraUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraUtrustningActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNyRegUtrustningsID)
                                    .addComponent(lblNyRegBenämning)
                                    .addComponent(lblNyRegKategori))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNyRegUtrustningsID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNyRegBenämning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblKategori)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblRegNyRubrik))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(btnRegistreraUtrustning)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblRegNyRubrik)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNyRegUtrustningsID)
                    .addComponent(txtNyRegUtrustningsID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNyRegBenämning)
                    .addComponent(txtNyRegBenämning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNyRegKategori)
                    .addComponent(cbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKategori)
                    .addComponent(txtKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(btnRegistreraUtrustning)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistreraUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraUtrustningActionPerformed
     if(Validering.txtFaltArInteTom(txtNyRegUtrustningsID) && Validering.txtFaltArInteTom(txtNyRegBenämning)){ 
        try {
            String UtrustningsID = txtNyRegUtrustningsID.getText();
            String kommunikationsBenamning = txtNyRegBenämning.getText();

            String fraga = "INSERT INTO Utrustning VALUES ('"+
            UtrustningsID + "' , '" +
            kommunikationsBenamning + "')";

            idb.insert(fraga);

            JOptionPane.showMessageDialog(null, "Ny Utrustning har registrerats!");
        } catch (InfException e) {
            e.printStackTrace();
            // Meddela användaren om att något gick fel
            JOptionPane.showMessageDialog(null, "Ett fel inträffade vid registrering av Utrustning: " + e.getMessage());
        }
     if(Validering.txtFaltArInteTom(txtNyRegUtrustningsID) && Validering.txtFaltArInteTom(txtKategori)){ 
        try {
            String UtrustningsID = txtNyRegUtrustningsID.getText();
            String kategoriVariabel = txtKategori.getText();
            String valdKategori = cbKategori.getSelectedItem().toString();

            String kategoriFraga = "INSERT INTO " + valdKategori + " VALUES ('" +
            UtrustningsID + "' , '" +
            kategoriVariabel + "')";

            System.out.println (kategoriFraga);

            idb.insert(kategoriFraga);

            JOptionPane.showMessageDialog(null, "Ny Utrustning har registrerats i utrustningstabell!");
        } catch (InfException e) {
            e.printStackTrace();
            // Meddela användaren om att något gick fel
            JOptionPane.showMessageDialog(null, "Ett fel inträffade vid registrering av Utrustningstabell: " + e.getMessage());
        }
     }
     }
    }//GEN-LAST:event_btnRegistreraUtrustningActionPerformed

 private void fyllcbKategori()   {
   cbKategori.removeAllItems();
        // Skapa en lista för raserna
    ArrayList<String> allaKategorier = new ArrayList<>();

    try {
        // Hämta raserna från databasen och lägg till i listan
        allaKategorier.add("Vapen");
        allaKategorier.add("Teknik");
        allaKategorier.add("Kommunikation");

        // Skapa ett ComboBoxModel och fyll det med raserna
        javax.swing.DefaultComboBoxModel<String> model = new javax.swing.DefaultComboBoxModel<>(allaKategorier.toArray(String[]::new));

        // Tilldela ComboBoxModel till ComboBox
        cbKategori.setModel(model);
        
        cbKategori.addActionListener((java.awt.event.ActionEvent evt) -> {
            // Hantera händelsen när användaren väljer en ras
            updateTextInfo();
        });
        
    } catch (Exception e) {
       e.printStackTrace();
        // Hantera eventuella fel här
        
    }
}    
    
private void updateTextInfo() {
    try {
        // Hämta den valda rasen från ComboBox
        String valdKategori = cbKategori.getSelectedItem().toString();
        if (valdKategori.equals("Vapen")) {
            lblKategori.setText("Vapen, fyll i kaliber");
        } else if (valdKategori.equals("Teknik")) {
            lblKategori.setText("Teknik, fyll i kraftkälla");
        } else if (valdKategori.equals("Kommunikation")) {
            lblKategori.setText("Kommunikation, fyll i överföringsteknik");
        } else {
            lblKategori.setText("");
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
            java.util.logging.Logger.getLogger(NyregistreraAgentutrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NyregistreraAgentutrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NyregistreraAgentutrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NyregistreraAgentutrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new Utrustning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistreraUtrustning;
    private javax.swing.JComboBox<String> cbKategori;
    private javax.swing.JLabel lblKategori;
    private javax.swing.JLabel lblNyRegBenämning;
    private javax.swing.JLabel lblNyRegKategori;
    private javax.swing.JLabel lblNyRegUtrustningsID;
    private javax.swing.JLabel lblRegNyRubrik;
    private javax.swing.JTextField txtKategori;
    private javax.swing.JTextField txtNyRegBenämning;
    private javax.swing.JTextField txtNyRegUtrustningsID;
    // End of variables declaration//GEN-END:variables
}
