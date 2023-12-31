/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.HashMap;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author mallan
 */
public class SokAliensEfterRas extends javax.swing.JFrame {

    private InfDB idb;

    /**
     * Creates new form SokAliensEfterRas
     * @param idb
     */
    public SokAliensEfterRas(InfDB idb) {
        initComponents();
        this.idb = idb;
        fyllCbValjRas();
    }
        public SokAliensEfterRas() {
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
private void fyllCbValjRas()   {
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


private void updateTextInfo() {
    try {
        // Hämta den valda rasen från ComboBox
        String valdRas = CbValjRas.getSelectedItem().toString();

        // Skapa en SQL-fråga för att hämta information om Aliens inom den valda rasen
        String fraga = "SELECT * FROM Alien WHERE Alien_ID IN (SELECT Alien_ID from " + valdRas +")";

        // Hämta resultatet från databasen
        ArrayList<HashMap<String, String>> resultat = idb.fetchRows(fraga);

        // Skapa en StringBuilder för att bygga upp texten
        StringBuilder alienInfo = new StringBuilder();

        // Lägg till informationen om varje Alien i StringBuilder
        for (HashMap<String, String> alien : resultat) {
             alienInfo.append("Alien ID: ").append(alien.get("Alien_ID")).append("\n");
            alienInfo.append("Namn: ").append(alien.get("Namn")).append("\n");
            alienInfo.append("Epost: ").append(alien.get("Epost")).append("\n");
            alienInfo.append("Telefon: ").append(alien.get("Telefon")).append("\n");
            alienInfo.append("Plats: ").append(alien.get("Plats")).append("\n");
            alienInfo.append("Ansvarig Agent: ").append(alien.get("Ansvarig_Agent")).append("\n");
        }

        // Uppdatera textrutan med Alien-informationen
        textAlienInfo.setText(alienInfo.toString());
    } catch (Exception e) {
        e.printStackTrace();
        // Hantera eventuella fel här
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

        CbValjRas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAlienInfo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CbValjRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        textAlienInfo.setColumns(20);
        textAlienInfo.setRows(5);
        jScrollPane1.setViewportView(textAlienInfo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(CbValjRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(CbValjRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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
            java.util.logging.Logger.getLogger(SokAliensEfterRas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SokAliensEfterRas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SokAliensEfterRas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SokAliensEfterRas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SokAliensEfterRas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbValjRas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textAlienInfo;
    // End of variables declaration//GEN-END:variables
}
