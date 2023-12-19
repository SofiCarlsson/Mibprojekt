/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;
import oru.inf.InfDB;
import oru.inf.InfException;

//test
public class NyregistreraAgentutrustning extends javax.swing.JFrame {
    
    private InfDB idb;
    private String Utrustnings_ID;
    private String Benamning;
    
    
    public NyregistreraAgentutrustning(InfDB db, String Utrustnings_ID, String Benamning) {
        idb = db;
        this.Utrustnings_ID = Utrustnings_ID;

        initComponents();
    }
    
    public String getUtrustnings_ID() {
        return Utrustnings_ID;
    }
    
    public void setUtrustnings_ID(String nyUtrustnings_ID) {
      Utrustnings_ID = nyUtrustnings_ID;
    }
    
    public String getBenamning() {
        return Benamning;
    }
    
    public void setBenamning(String nyBenamning) {
       Benamning = nyBenamning;
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
        txtNyRegKategori = new javax.swing.JTextField();
        lblOmVapen = new javax.swing.JLabel();
        txtOmVapen = new javax.swing.JTextField();
        lblOmTeknik = new javax.swing.JLabel();
        txtOmTeknik = new javax.swing.JTextField();
        lblOmKommunikation = new javax.swing.JLabel();
        txtOmKommunikation = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRegNyRubrik.setText("Här kan du registrera ny Agentutrusning:");

        lblNyRegUtrustningsID.setText("UtrusningsID");

        txtNyRegUtrustningsID.setColumns(4);

        lblNyRegBenämning.setText("Benämning");

        txtNyRegBenämning.setColumns(4);

        lblNyRegKategori.setText("Kategori");

        txtNyRegKategori.setColumns(4);

        lblOmVapen.setText("Om vapen, fyll i kaliber");

        txtOmVapen.setColumns(4);

        lblOmTeknik.setText("Om teknik, fyll i kraftkälla");

        txtOmTeknik.setColumns(4);

        lblOmKommunikation.setText("Om kommunikation, fyll i överföringsteknik");

        txtOmKommunikation.setColumns(4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRegNyRubrik)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNyRegUtrustningsID)
                                    .addComponent(lblNyRegBenämning)
                                    .addComponent(lblNyRegKategori))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNyRegKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNyRegUtrustningsID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNyRegBenämning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOmVapen)
                                    .addComponent(lblOmTeknik))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtOmTeknik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOmVapen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblOmKommunikation)
                                .addGap(18, 18, 18)
                                .addComponent(txtOmKommunikation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(41, Short.MAX_VALUE))
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
                    .addComponent(txtNyRegKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOmVapen)
                    .addComponent(txtOmVapen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOmTeknik)
                    .addComponent(txtOmTeknik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOmKommunikation)
                    .addComponent(txtOmKommunikation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel lblNyRegBenämning;
    private javax.swing.JLabel lblNyRegKategori;
    private javax.swing.JLabel lblNyRegUtrustningsID;
    private javax.swing.JLabel lblOmKommunikation;
    private javax.swing.JLabel lblOmTeknik;
    private javax.swing.JLabel lblOmVapen;
    private javax.swing.JLabel lblRegNyRubrik;
    private javax.swing.JTextField txtNyRegBenämning;
    private javax.swing.JTextField txtNyRegKategori;
    private javax.swing.JTextField txtNyRegUtrustningsID;
    private javax.swing.JTextField txtOmKommunikation;
    private javax.swing.JTextField txtOmTeknik;
    private javax.swing.JTextField txtOmVapen;
    // End of variables declaration//GEN-END:variables
}
