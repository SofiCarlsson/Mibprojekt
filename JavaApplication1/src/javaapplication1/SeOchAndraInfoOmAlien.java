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


public class SeOchAndraInfoOmAlien extends javax.swing.JFrame {

    /**
     * Creates new form SeInfoOmAlien
     */
    private InfDB idb; 
    
    public SeOchAndraInfoOmAlien(InfDB db) {
        idb = db;
        initComponents();
        fyllCBAlienID();
        fyllcbRas();
    }

    //Fyller skrollboxen med AlienID värden som man kan välja mellan.
         private void fyllCBAlienID(){
    
         cbInfoAlienID.removeAllItems();
         String fraga = "SELECT Alien_ID FROM Alien";
         ArrayList<String> allaAlienID;
    
         try{
    
            allaAlienID = idb.fetchColumn(fraga);
            
            for(String ettID : allaAlienID){
            
                cbInfoAlienID.addItem(ettID);
            
            }
            
         }catch(InfException ettUndantag){
            
              JOptionPane.showMessageDialog(null, " Databasfel! " );
              System.out.println("Internt felmedelande" + ettUndantag.getMessage());     
          }
        }
         
          // Skapa en lista för raserna
        
         private void fyllcbRas()   {
            cbRas.removeAllItems();
       
            ArrayList<String> allaRaser = new ArrayList<>();

       try {
        // Hämta raserna från databasen och lägg till i listan
        allaRaser.add("Squid");
        allaRaser.add("Worm");
        allaRaser.add("Boglodite");

        // Skapa ett ComboBoxModel och fyll det med raserna
        
        javax.swing.DefaultComboBoxModel<String> model = new javax.swing.DefaultComboBoxModel<>(allaRaser.toArray(String[]::new));
       // Tilldela ComboBoxModel till ComboBox
        cbRas.setModel(model);
       }
        catch (Exception e) {
       e.printStackTrace();
        // Hantera eventuella fel här
        }
    }
       
         
     //Fyller på infomationen om en viss alien i textfälten.
     private void fyllPaInfoAlien(){
     
     ArrayList<HashMap<String, String>> alienIDLista = new ArrayList<HashMap<String, String>>();
     ArrayList<HashMap<String, String>> alienRasLista = new ArrayList<HashMap<String, String>>();
 
      try{
      
          String valdAlien = cbInfoAlienID.getSelectedItem().toString();
          String fraga = "SELECT Alien_ID, Registreringsdatum, Namn, Telefon, Epost, Losenord, Plats, Ansvarig_Agent FROM Alien";
          alienIDLista = idb.fetchRows(fraga);
          
          for(HashMap<String, String> enAlien : alienIDLista){
        
              String alienIDFranLista = enAlien.get("Alien_ID");
                 
                if (alienIDFranLista.equals(valdAlien)){
                    //Sätter in anställningsdatum för agenten i anst.dat.rutan
                 txtVisaRegDatum.setText(enAlien.get("Registreringsdatum"));
                 }
                 
                 if (alienIDFranLista.equals(valdAlien)){
                    //Sätter in namnet för agenten i namnrutan
                 txtVisaNamn.setText(enAlien.get("Namn"));
                 }
                 
                if (alienIDFranLista.equals(valdAlien)){
                    //Sätter in telefonnumret för agenten i telefonrutan
                 txtVisaTelefon.setText(enAlien.get("Telefon"));
                }
                
                if (alienIDFranLista.equals(valdAlien)){
                    //Sätter in epost för agenten i epostrutan
                 txtVisaEpost.setText(enAlien.get("Epost"));
                }
                
                 if (alienIDFranLista.equals(valdAlien)){
                    //Sätter in lösenord för agenten i lösenordsrutan
                 txtVisaLösenord.setText(enAlien.get("Losenord"));
                 }
                 
                 if (alienIDFranLista.equals(valdAlien)){
                    //Sätter in lösenord för agenten i lösenordsrutan
                 txtVisaPlats.setText(enAlien.get("Plats"));
                 }
                 
                 if (alienIDFranLista.equals(valdAlien)){
                    //Sätter in lösenord för agenten i lösenordsrutan
                 txtVisaAnsvarigAgent.setText(enAlien.get("Ansvarig_Agent"));
                     
                    }
                   }
                 //Skirva ut ras i comboboxen för ras
                String fragaRas = "SELECT 'Boglodite' as tabell from Boglodite where Alien_ID= '" + valdAlien + "' Union all SELECT 'Squid' as tabell from Squid where Alien_ID= '" + valdAlien + "' Union all SELECT 'Worm' as tabell from Worm where Alien_ID= '" + valdAlien + "'";
               String rasHamtad = idb.fetchSingle(fragaRas);
                cbRas.setSelectedItem(rasHamtad);
             
         
                }catch (InfException UndantagEn) {
                    JOptionPane.showMessageDialog(null, "Databasfel!");
                    System.out.println("Internt felmeddelande" + UndantagEn.getMessage());
                    
                }
                catch (Exception UndantagEn) {
                    JOptionPane.showMessageDialog(null, "Ett fel uppstod!");
                    System.out.println("Internt felmeddelande" + UndantagEn.getMessage());
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

        lblHärvisasRubrik = new javax.swing.JLabel();
        btnÄndraInfo = new javax.swing.JButton();
        lblAngeAlienID = new javax.swing.JLabel();
        cbInfoAlienID = new javax.swing.JComboBox<>();
        lblVisaRegDatum = new javax.swing.JLabel();
        txtVisaRegDatum = new javax.swing.JTextField();
        lblVisaNamn = new javax.swing.JLabel();
        txtVisaNamn = new javax.swing.JTextField();
        lblVisaTelefon = new javax.swing.JLabel();
        txtVisaTelefon = new javax.swing.JTextField();
        lblVisaEpost = new javax.swing.JLabel();
        txtVisaEpost = new javax.swing.JTextField();
        lblVisaLösenord = new javax.swing.JLabel();
        txtVisaLösenord = new javax.swing.JTextField();
        lblVisaPlats = new javax.swing.JLabel();
        txtVisaPlats = new javax.swing.JTextField();
        lblVisaAnsvarigAgent = new javax.swing.JLabel();
        txtVisaAnsvarigAgent = new javax.swing.JTextField();
        lblInfoAndraInfo = new javax.swing.JLabel();
        btnSok = new javax.swing.JButton();
        lblInfoSok = new javax.swing.JLabel();
        lblRas = new javax.swing.JLabel();
        cbRas = new javax.swing.JComboBox<>();
        lblEpostinteandra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHärvisasRubrik.setFont(new java.awt.Font("Beirut", 0, 13)); // NOI18N
        lblHärvisasRubrik.setText("Här visas all info om en Alien");

        btnÄndraInfo.setText("Ändra info");
        btnÄndraInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraInfoActionPerformed(evt);
            }
        });

        lblAngeAlienID.setText("Ange AlienID");

        lblVisaRegDatum.setText("Registreringsdatum");

        txtVisaRegDatum.setColumns(8);

        lblVisaNamn.setText("Namn");

        txtVisaNamn.setColumns(8);

        lblVisaTelefon.setText("Telefon");

        txtVisaTelefon.setColumns(8);

        lblVisaEpost.setText("Epost");

        txtVisaEpost.setColumns(8);

        lblVisaLösenord.setText("Lösenord");

        txtVisaLösenord.setColumns(8);

        lblVisaPlats.setText("Plats");

        txtVisaPlats.setColumns(4);

        lblVisaAnsvarigAgent.setText("Ansvarig Agent");

        txtVisaAnsvarigAgent.setColumns(4);

        lblInfoAndraInfo.setText("Tryck på knappen \"Ändra info\" om du vill ändra någon info.");

        btnSok.setText("Sök");
        btnSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokActionPerformed(evt);
            }
        });

        lblInfoSok.setText("Välj ett AlienID och tryck på \"Sök\" för att få upp informationen om den Alien.");

        lblRas.setText("Ras");

        lblEpostinteandra.setText("E-post visas men kan inte ändras");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblInfoSok)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHärvisasRubrik)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblInfoAndraInfo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblAngeAlienID)
                                        .addGap(52, 52, 52)
                                        .addComponent(cbInfoAlienID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 121, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblVisaNamn)
                                .addGap(389, 389, 389)))
                        .addContainerGap(59, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblVisaRegDatum)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblRas)
                                        .addComponent(lblVisaLösenord)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtVisaEpost, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                    .addComponent(txtVisaTelefon)
                                    .addComponent(txtVisaNamn)
                                    .addComponent(txtVisaRegDatum)
                                    .addComponent(txtVisaLösenord)
                                    .addComponent(cbRas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(lblVisaTelefon)
                            .addComponent(lblVisaEpost))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblVisaAnsvarigAgent)
                                            .addComponent(lblVisaPlats))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtVisaPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtVisaAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnSok, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnÄndraInfo)))
                                .addContainerGap(59, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEpostinteandra)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblHärvisasRubrik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInfoSok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInfoAndraInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVisaPlats, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbInfoAlienID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAngeAlienID))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVisaRegDatum)
                            .addComponent(txtVisaRegDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3))
                    .addComponent(txtVisaPlats, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVisaNamn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtVisaNamn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVisaTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVisaTelefon))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVisaEpost)
                            .addComponent(txtVisaEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEpostinteandra))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVisaLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVisaLösenord))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRas)
                            .addComponent(cbRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVisaAnsvarigAgent)
                            .addComponent(txtVisaAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSok)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnÄndraInfo)
                        .addGap(49, 49, 49))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Denna metoden fyller på Info om Alien med det angivna ALienID när man trycker på "Sök".
    private void btnSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokActionPerformed
       fyllPaInfoAlien();
    }//GEN-LAST:event_btnSokActionPerformed

    //När man trycker på denna knappen och skrivit in något nytt i textfälten ändras värdet till det man skrev in.
    //(Man får inte ändra epost)
    
    private void btnÄndraInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraInfoActionPerformed
    if(Validering.txtFaltArInteTom(txtVisaRegDatum) && Validering.txtFaltArInteTom(txtVisaNamn) && Validering.txtFaltArInteTom(txtVisaLösenord)&& Validering.txtFaltArInteTom(txtVisaPlats) && Validering.txtFaltArInteTom(txtVisaAnsvarigAgent)){
          try{
           String fragaAlien = "SELECT * FROM Alien";

            ArrayList<HashMap<String, String>> Alien = idb.fetchRows(fragaAlien);

           String valdAlien = cbInfoAlienID.getSelectedItem().toString();
           String nyttRegDatum = txtVisaRegDatum.getText();
           String nyttNamn = txtVisaNamn.getText();
           String nyTelefon = txtVisaTelefon.getText();
           String nyLosenord = txtVisaLösenord.getText();
           String nyPlats = txtVisaPlats.getText();
           String nyAnsvarigAgent = txtVisaAnsvarigAgent.getText();
           
           
           
           String updateQueryRegDatum = "UPDATE Alien SET Registreringsdatum = '" + nyttRegDatum + "' WHERE Alien_ID = '" + valdAlien + "'";
           
                 idb.update(updateQueryRegDatum);
       
            String updateQueryNamn = "UPDATE Alien SET Namn = '" + nyttNamn + "' WHERE Alien_ID = '" + valdAlien + "'";
           
                 idb.update(updateQueryNamn);
                System.out.println("Här ändras");
                
            String updateQueryTelefon = "UPDATE Alien SET Telefon = '" + nyTelefon + "' WHERE Alien_ID = '" + valdAlien + "'";
           
                 idb.update(updateQueryTelefon);
                 
                 
            String updateQueryLosenord = "UPDATE Alien SET Losenord = '" + nyLosenord + "' WHERE Alien_ID = '" + valdAlien + "'";
          
                 idb.update(updateQueryLosenord);
                 
             String updateQueryPlats = "UPDATE Alien SET Plats = '" + nyPlats + "' WHERE Alien_ID = '" + valdAlien + "'";
           
                 idb.update(updateQueryPlats);
             
              String updateQueryAnsvarigAgent = "UPDATE Alien SET Ansvarig_Agent = '" + nyAnsvarigAgent + "' WHERE Alien_ID = '" + valdAlien + "'";
           
                 idb.update(updateQueryAnsvarigAgent);
                 
            JOptionPane.showMessageDialog(null, " Infomrationen har ändrats." );
                 
          }catch(InfException ettUndantag){

            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmedelande" + ettUndantag.getMessage());    
       
       }
       }        
    }//GEN-LAST:event_btnÄndraInfoActionPerformed

    /**
     * @param args the command line arguments
     */
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
//            java.util.logging.Logger.getLogger(SeOchAndraInfoOmAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SeOchAndraInfoOmAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SeOchAndraInfoOmAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SeOchAndraInfoOmAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//               // new SeOchAndraInfoOmAlien().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSok;
    private javax.swing.JButton btnÄndraInfo;
    private javax.swing.JComboBox<String> cbInfoAlienID;
    private javax.swing.JComboBox<String> cbRas;
    private javax.swing.JLabel lblAngeAlienID;
    private javax.swing.JLabel lblEpostinteandra;
    private javax.swing.JLabel lblHärvisasRubrik;
    private javax.swing.JLabel lblInfoAndraInfo;
    private javax.swing.JLabel lblInfoSok;
    private javax.swing.JLabel lblRas;
    private javax.swing.JLabel lblVisaAnsvarigAgent;
    private javax.swing.JLabel lblVisaEpost;
    private javax.swing.JLabel lblVisaLösenord;
    private javax.swing.JLabel lblVisaNamn;
    private javax.swing.JLabel lblVisaPlats;
    private javax.swing.JLabel lblVisaRegDatum;
    private javax.swing.JLabel lblVisaTelefon;
    private javax.swing.JTextField txtVisaAnsvarigAgent;
    private javax.swing.JTextField txtVisaEpost;
    private javax.swing.JTextField txtVisaLösenord;
    private javax.swing.JTextField txtVisaNamn;
    private javax.swing.JTextField txtVisaPlats;
    private javax.swing.JTextField txtVisaRegDatum;
    private javax.swing.JTextField txtVisaTelefon;
    // End of variables declaration//GEN-END:variables
}
