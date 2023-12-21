/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author oliviacleve
 */
public class ListaAlienspaplats extends javax.swing.JFrame {

    private InfDB idb;
    /**
     * Creates new form Alienspaplats
     */
    public ListaAlienspaplats(InfDB db) {
        idb = db;
        initComponents();
        fyllCbValjplats();
    }
    
      private void fyllCbValjplats() {
        String fraga = ("SELECT Plats FROM Alien");
                
                ArrayList<String> allaPlatser;
                
                try {
                    allaPlatser = idb.fetchColumn(fraga);
                    
                    for (String Plats : allaPlatser) {
                        CbValjplats.addItem(Plats);
                    }
                } catch (InfException UndantagEtt) {
                    JOptionPane.showMessageDialog(null, "Databasfel!");
                    System.out.println("Internt felmeddelande" + UndantagEtt.getMessage());
                }
                catch (Exception UndantagEtt) {
                    JOptionPane.showMessageDialog(null, "Ett fel uppstod!");
                    System.out.println("Internt felmeddelande" + UndantagEtt.getMessage());
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

        CbValjplats = new javax.swing.JComboBox<>();
        lblListaAliensPåPlatsRubrik = new javax.swing.JLabel();
        lblVäljPlats = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDessaAliensFinns = new javax.swing.JTextArea();
        lblDessaAliensFinns = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CbValjplats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CbValjplats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbValjplatsActionPerformed(evt);
            }
        });

        lblListaAliensPåPlatsRubrik.setFont(new java.awt.Font("Beirut", 0, 13)); // NOI18N
        lblListaAliensPåPlatsRubrik.setText("Här listas alla Aliens som finns på en plats");

        lblVäljPlats.setText("Välj plats");

        txtAreaDessaAliensFinns.setColumns(20);
        txtAreaDessaAliensFinns.setRows(5);
        jScrollPane1.setViewportView(txtAreaDessaAliensFinns);

        lblDessaAliensFinns.setText("Dessa Aliens finns på den angivna platsen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblListaAliensPåPlatsRubrik)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblVäljPlats)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CbValjplats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblDessaAliensFinns))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblListaAliensPåPlatsRubrik)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVäljPlats)
                    .addComponent(CbValjplats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblDessaAliensFinns)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CbValjplatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbValjplatsActionPerformed
        // TODO add your handling code here:
        txtAreaDessaAliensFinns.setText("");
        
        ArrayList<HashMap<String, String>> AliensPlats;
        
        try {
            String valdPlats = CbValjplats.getSelectedItem().toString();
            String fraga = "SELECT Alien_ID, Namn FROM Alien where Alien_ID IN (SELECT Alien_ID FROM Omrade)";
            AliensPlats = idb.fetchRows(fraga);
            
            for (HashMap<String, String> Platser : AliensPlats) {
                txtAreaDessaAliensFinns.append(Platser.get("Agent_I") + "\t");
                txtAreaDessaAliensFinns.append(Platser.get("Namn") + "\n");
            }
        } catch (InfException UndantagEn) {
                    JOptionPane.showMessageDialog(null, "Databasfel!");
                    System.out.println("Internt felmeddelande" + UndantagEn.getMessage());
                }
                catch (Exception UndantagEn) {
                    JOptionPane.showMessageDialog(null, "Ett fel uppstod!");
                    System.out.println("Internt felmeddelande" + UndantagEn.getMessage());
                }
        }
     private javax.swing.JComboBox<String> CbValjplats;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDessaAliensFinns;
    private javax.swing.JLabel lblListaAliensPåPlatsRubrik;
    private javax.swing.JLabel lblVäljPlats;
    private javax.swing.JTextArea txtAreaDessaAliensFinns;      
    }//GEN-LAST:event_CbValjplatsActionPerformed
//
//    /**
//     * @param args the command line arguments
//     */
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
//            java.util.logging.Logger.getLogger(ListaAlienspaplats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ListaAlienspaplats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ListaAlienspaplats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ListaAlienspaplats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
////        //</editor-fold>
////
////        /* Create and display the form */
////        java.awt.EventQueue.invokeLater(new Runnable() {
////            public void run() {
////              // new Alienspaplats().setVisible(true);
////            }
////        });
////    }
//
/*
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbValjplats;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDessaAliensFinns;
    private javax.swing.JLabel lblListaAliensPåPlatsRubrik;
    private javax.swing.JLabel lblVäljPlats;
    private javax.swing.JTextArea txtAreaDessaAliensFinns;
    // End of variables declaration//GEN-END:variables
}*/
