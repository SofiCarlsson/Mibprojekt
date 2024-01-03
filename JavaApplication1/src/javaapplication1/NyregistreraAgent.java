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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sarahill
 */
public class NyregistreraAgent extends javax.swing.JFrame {

    /**
     * Creates new form NyregistreraAgent
     */
    private InfDB idb;
    
    public NyregistreraAgent(InfDB db) {
        idb = db;
        initComponents();
        fyllCbAgentOmrade();
    }

    private void fyllCbAgentOmrade(){
    
    cbValjOmrade.removeAllItems();
    String fragaOmrade = "SELECT Omrades_ID FROM Omrade";
    ArrayList<String> allaOmradesID;
    
    try{
    
        allaOmradesID = idb.fetchColumn(fragaOmrade);
        
            for(String ettOmrade : allaOmradesID){
                
                cbValjOmrade.addItem(ettOmrade);
            
            }
    
    }catch(InfException ettUndantag){
            
              JOptionPane.showMessageDialog(null, " Databasfel! " );
              System.out.println("Internt felmedelande" + ettUndantag.getMessage());     
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

        jLabel1 = new javax.swing.JLabel();
        lblNamn = new javax.swing.JLabel();
        lblAgentID = new javax.swing.JLabel();
        lblTelefon = new javax.swing.JLabel();
        lblAnstallningsdatum = new javax.swing.JLabel();
        lblAdministratorstatus = new javax.swing.JLabel();
        lblEpost = new javax.swing.JLabel();
        lblLosenord = new javax.swing.JLabel();
        lblOmrade = new javax.swing.JLabel();
        txtnyAgentID = new javax.swing.JTextField();
        txtnyAgentNamn = new javax.swing.JTextField();
        txtnyAgentTelefon = new javax.swing.JTextField();
        txtnyAgentAnstallningsDatum = new javax.swing.JTextField();
        txtnyAgentAdminstatus = new javax.swing.JTextField();
        txtNyAgentEpost = new javax.swing.JTextField();
        txtnyAgentLosenord = new javax.swing.JTextField();
        btnnyAgentRegistrera = new javax.swing.JButton();
        cbValjOmrade = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registrera en ny agent genom att fylla i informationen");

        lblNamn.setText("Namn");

        lblAgentID.setText("AgentID");

        lblTelefon.setText("Telefon");

        lblAnstallningsdatum.setText("Anställningsdatum");

        lblAdministratorstatus.setText("Administratörstatus");

        lblEpost.setText("Epost");

        lblLosenord.setText("Lösenord");

        lblOmrade.setText("Område");

        txtnyAgentID.setColumns(7);

        txtnyAgentNamn.setColumns(7);

        txtnyAgentTelefon.setColumns(7);

        txtnyAgentAnstallningsDatum.setColumns(7);

        txtnyAgentAdminstatus.setColumns(7);

        txtNyAgentEpost.setColumns(7);

        txtnyAgentLosenord.setColumns(7);

        btnnyAgentRegistrera.setText("Registrera");
        btnnyAgentRegistrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnyAgentRegistreraActionPerformed(evt);
            }
        });

        cbValjOmrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLosenord)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtnyAgentLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblEpost)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNyAgentEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAgentID)
                                    .addComponent(lblTelefon)
                                    .addComponent(lblNamn))
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtnyAgentID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtnyAgentNamn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtnyAgentTelefon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblAnstallningsdatum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtnyAgentAnstallningsDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAdministratorstatus)
                                    .addComponent(lblOmrade))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbValjOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnyAgentAdminstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(31, 31, 31)
                        .addComponent(btnnyAgentRegistrera)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgentID)
                    .addComponent(txtnyAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamn)
                    .addComponent(txtnyAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefon)
                    .addComponent(txtnyAgentTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnstallningsdatum)
                    .addComponent(txtnyAgentAnstallningsDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdministratorstatus)
                    .addComponent(txtnyAgentAdminstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOmrade)
                    .addComponent(cbValjOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEpost)
                    .addComponent(txtNyAgentEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLosenord)
                    .addComponent(txtnyAgentLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnyAgentRegistrera))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnyAgentRegistreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnyAgentRegistreraActionPerformed

    if(Validering.txtFaltArInteTom(txtnyAgentID) && Validering.isHeltal(txtnyAgentID) && Validering.txtFaltArInteTom(txtnyAgentNamn) && Validering.txtFaltArInteTom(txtnyAgentTelefon)&& Validering.isHeltal(txtnyAgentTelefon) && Validering.txtFaltArInteTom(txtnyAgentAnstallningsDatum) && Validering.txtFaltArInteTom(txtnyAgentAdminstatus)&& Validering.txtFaltArInteTom(txtNyAgentEpost)&& Validering.txtFaltArInteTom(txtnyAgentLosenord)){
         
        try{
            String nyAgentID = txtnyAgentID.getText();
            String nyNamn = txtnyAgentNamn.getText();
            String nyTelefon = txtnyAgentTelefon.getText();
            String nyAnstallningsdatum = txtnyAgentAnstallningsDatum.getText();
            String nyAdminstatus = txtnyAgentAdminstatus.getText();
           // String nyOmrade
            String nyEpost = txtNyAgentEpost.getText();
            String nyLosenord = txtnyAgentLosenord.getText();
            
            
            
            String fraga = "INSERT INTO Alien VALUES ('"+
                 nyAgentID + "' , '" +
                 nyNamn + "' , '" +
                 nyTelefon + "' , '" +
                 nyAnstallningsdatum + "' , '" +
                 nyAdminstatus + "' , '" +
                 //nyOmrade + "' , '" +
                 nyEpost + "' , '" +
                 nyLosenord + "')";
        
                 System.out.println(fraga);
        
                 idb.insert(fraga);
        
                JOptionPane.showMessageDialog(null, "Ny Agent har registrerats!");
                
        } catch(InfException e){
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ett fel inträffade vid registrering av Agent!");
        }

       }
    }//GEN-LAST:event_btnnyAgentRegistreraActionPerformed

    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(NyregistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(NyregistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(NyregistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(NyregistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>

        /* Create and display the form */
        //java.awt.EventQueue.invokeLater(new Runnable() {
           // public void run() {
              //new NyregistreraAgent().setVisible(true);
            //}
        //});
    //}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnnyAgentRegistrera;
    private javax.swing.JComboBox<String> cbValjOmrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAdministratorstatus;
    private javax.swing.JLabel lblAgentID;
    private javax.swing.JLabel lblAnstallningsdatum;
    private javax.swing.JLabel lblEpost;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblOmrade;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JTextField txtNyAgentEpost;
    private javax.swing.JTextField txtnyAgentAdminstatus;
    private javax.swing.JTextField txtnyAgentAnstallningsDatum;
    private javax.swing.JTextField txtnyAgentID;
    private javax.swing.JTextField txtnyAgentLosenord;
    private javax.swing.JTextField txtnyAgentNamn;
    private javax.swing.JTextField txtnyAgentTelefon;
    // End of variables declaration//GEN-END:variables
}
