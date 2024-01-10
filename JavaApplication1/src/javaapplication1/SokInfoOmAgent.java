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
public class SokInfoOmAgent extends javax.swing.JFrame {

    /**
     * CKonstruktor för SokInfoOmAgent
     */
    private InfDB idb;
    
    public SokInfoOmAgent(InfDB db) {
        idb = db;
        initComponents();
        fyllCBAgentID();
        fyllCBOmrade();
        fyllOmradesChef();
        fyllKontorsChef();
    }

        //Fyller AgentID-rullmenyn med värden
            private void fyllCBAgentID(){
                cbinfoAgentID.removeAllItems();
        String fraga = "SELECT agent_ID from mibdb.Agent";
        
                ArrayList<String> allaAgentID;
                
        try {
               allaAgentID = idb.fetchColumn(fraga);
               
               for (String ettID : allaAgentID){
                  cbinfoAgentID.addItem(ettID);
                
               }
       
        }catch(InfException ettUndantag){
            
              JOptionPane.showMessageDialog(null, " Databasfel! " );
              System.out.println("Internt felmedelande" + ettUndantag.getMessage());
             
    }
    }
            
            //Fyller Administratörstatus-rullmenyn med värden
            private void fyllCBOmrade(){
                cbinfoAgentOmrade.removeAllItems();
                String fraga = "SELECT Omrades_ID from Omrade";
        
                ArrayList<String> allaOmraden;
                
        try {
               allaOmraden = idb.fetchColumn(fraga);
               for (String adminStatus : allaOmraden)   
               cbinfoAgentOmrade.addItem(adminStatus);     
       
        }catch(InfException ettUndantag){
            
              JOptionPane.showMessageDialog(null, " Databasfel!" );
              System.out.println("Internt felmedelande" + ettUndantag.getMessage());
             
    }
   }
            
        //Fyller Områdeschefs-rullmenyn med värden
        private void fyllOmradesChef(){
            cbOmradesChef.removeAllItems();
            String fraga = "SELECT Omrades_ID FROM Omrade";
            
            ArrayList<String> allaOmradesChef;
            
            try {
                allaOmradesChef = idb.fetchColumn(fraga);
                for (String enOmradesChef : allaOmradesChef)
                cbOmradesChef.addItem(enOmradesChef);
            
            }catch(InfException ettUndantag){
            
              JOptionPane.showMessageDialog(null, " Databasfel!" );
              System.out.println("Internt felmedelande" + ettUndantag.getMessage());
             
    }   
}
        //Fyller Kontorschefs-rullmenyn med värden
        private void fyllKontorsChef(){
            cbKontorsChef.removeAllItems();
            String fraga = "SELECT Kontorsbeteckning FROM Kontorschef";
            
            ArrayList<String> allaKontorsChef;
            
            try {
                allaKontorsChef = idb.fetchColumn(fraga);
                for (String enKontorsChef : allaKontorsChef)
                cbKontorsChef.addItem(enKontorsChef);
            
            }catch(InfException ettUndantag){
            
              JOptionPane.showMessageDialog(null, " Databasfel!" );
              System.out.println("Internt felmedelande" + ettUndantag.getMessage());
             
    }   
}

        private void fyllPaInfo(){
            // Fyller på information om en viss agent
       
            txtinfoAgentNamn.setText("");
    
        ArrayList<HashMap<String, String>> agentIDLista;
        ArrayList<HashMap<String, String>> omradesChefsLista;
        ArrayList<HashMap<String, String>> kontorsChefsLista;
        
        try {
            String valdAgent = cbinfoAgentID.getSelectedItem().toString();
           
            String fraga = "SELECT Agent_ID, namn, telefon, anstallningsdatum, epost, losenord, Omrade, administrator FROM mibdb.Agent";
            agentIDLista = idb.fetchRows(fraga);
            
             String fragaOmradesChef = "SELECT Omrade From Omradeschef WHERE Agent_ID IN (SELECT Agent_ID From Agent)";
            omradesChefsLista = idb.fetchRows(fragaOmradesChef);
            
            String fragaKontorsChef = "SELECT Kontorsbeteckning FROM Kontorschef WHERE Agent_ID IN (SELECT Agent_ID from Agent)";
            kontorsChefsLista = idb.fetchRows(fragaKontorsChef);

            
            
            for (HashMap<String, String> enAgent : agentIDLista) {
                //txtinfoAgentNamn.setText(enAgent.get("Agent_ID") + "\t");
                String agentIDFranLista = enAgent.get("Agent_ID");
                
                if (agentIDFranLista.equals(valdAgent)){
                    //Sätter in namnet för agenten i namnrutan
                 txtinfoAgentNamn.setText(enAgent.get("Namn"));
                
                    //Sätter in telefonnumret för agenten i telefonrutan
                 txtifoAgentTelefon.setText(enAgent.get("Telefon"));

                    //Sätter in anställningsdatum för agenten i anst.dat.rutan
                 txtinfoAgentAnstallningsdatum.setText(enAgent.get("Anstallningsdatum"));

                    //Sätter in adminstatus för agenten i lösenordsrutan
                 txtInfoAgentAdminStatus.setText(enAgent.get("Administrator"));

                    //Sätter in epost för agenten i epostrutan
                 txtinfoAgentEpost.setText(enAgent.get("Epost"));

                    //Sätter in lösenord för agenten i lösenordsrutan
                 txtinfoAgentLosenord.setText(enAgent.get("Losenord"));
                    
                    //Sätter in område för agenten i områdessrutan
                 cbinfoAgentOmrade.setSelectedItem(enAgent.get("Omrade"));
   
            }
            }
            //Sätter in områdeschefsområde för agenten i områdeschefsrullmenyn
            String hamtaOmrade = "SELECT Omrade FROM Omradeschef WHERE Agent_ID =" + valdAgent;
                String omradeVarde = idb.fetchSingle(hamtaOmrade);

                cbOmradesChef.setSelectedItem(omradeVarde);
            
                
            //Sätter in kontorsbeteckning i Kontorschefsrutan
                String hamtaKontor = "SELECT Kontorsbeteckning FROM Kontorschef WHERE Agent_ID =" + valdAgent;
                String kontorVarde = idb.fetchSingle(hamtaKontor);
                
                cbKontorsChef.setSelectedItem(kontorVarde);
                

        } catch (InfException UndantagEn) {
                    JOptionPane.showMessageDialog(null, "Databasfel!");
                    System.out.println("Internt felmeddelande" + UndantagEn.getMessage());
                }
                catch (Exception UndantagEn) {
                    //JOptionPane.showMessageDialog(null, "Ett fel uppstod!");
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

        jLabel1 = new javax.swing.JLabel();
        lblnamn = new javax.swing.JLabel();
        lbltelefon = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblvaljEnAgent = new javax.swing.JLabel();
        lblagentOmradeschef = new javax.swing.JLabel();
        lblagentKontorschef = new javax.swing.JLabel();
        cbinfoAgentOmrade = new javax.swing.JComboBox<>();
        cbOmradesChef = new javax.swing.JComboBox<>();
        cbKontorsChef = new javax.swing.JComboBox<>();
        cbinfoAgentID = new javax.swing.JComboBox<>();
        txtinfoAgentNamn = new javax.swing.JTextField();
        txtifoAgentTelefon = new javax.swing.JTextField();
        txtinfoAgentAnstallningsdatum = new javax.swing.JTextField();
        txtinfoAgentEpost = new javax.swing.JTextField();
        txtinfoAgentLosenord = new javax.swing.JTextField();
        txtInfoAgentAdminStatus = new javax.swing.JTextField();
        btnSokInfoAgent = new javax.swing.JButton();
        btnAndraInfoAgent = new javax.swing.JButton();
        lblJNAdminStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Information om agent");

        lblnamn.setText("Namn");

        lbltelefon.setText("Telefon");

        jLabel4.setText("Anställningsdatum");

        jLabel5.setText("Administartörstatus");

        jLabel6.setText("Epost");

        jLabel7.setText("Lösenord");

        jLabel8.setText("Område");

        lblvaljEnAgent.setText("Välj en agent");

        lblagentOmradeschef.setText("Chefsområde");

        lblagentKontorschef.setText("Kontorschef");

        txtinfoAgentNamn.setColumns(7);

        txtifoAgentTelefon.setColumns(7);

        txtinfoAgentAnstallningsdatum.setColumns(7);

        txtinfoAgentEpost.setColumns(7);

        txtinfoAgentLosenord.setColumns(7);

        txtInfoAgentAdminStatus.setColumns(7);

        btnSokInfoAgent.setText("Sök");
        btnSokInfoAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokInfoAgentActionPerformed(evt);
            }
        });

        btnAndraInfoAgent.setText("Ändra");
        btnAndraInfoAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraInfoAgentActionPerformed(evt);
            }
        });

        lblJNAdminStatus.setText("Vänligen ange J för JA eller N för NEJ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblvaljEnAgent)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cbinfoAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbltelefon)
                                        .addComponent(jLabel4)
                                        .addComponent(lblnamn))
                                    .addGap(24, 24, 24)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtinfoAgentAnstallningsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtifoAgentTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtinfoAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSokInfoAgent)
                            .addComponent(btnAndraInfoAgent))
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtInfoAgentAdminStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblJNAdminStatus))
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblagentKontorschef)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbKontorsChef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblagentOmradeschef)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbOmradesChef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbinfoAgentOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                    .addGap(77, 77, 77)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtinfoAgentLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtinfoAgentEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(74, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblvaljEnAgent)
                    .addComponent(cbinfoAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSokInfoAgent))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnamn)
                    .addComponent(txtinfoAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAndraInfoAgent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltelefon)
                    .addComponent(txtifoAgentTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtinfoAgentAnstallningsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtInfoAgentAdminStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblJNAdminStatus))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtinfoAgentEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtinfoAgentLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbinfoAgentOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblagentOmradeschef)
                    .addComponent(cbOmradesChef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblagentKontorschef)
                    .addComponent(cbKontorsChef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSokInfoAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokInfoAgentActionPerformed
        //Anropar metoden för att fylla på information baserat på en viss agents ID
        fyllPaInfo();
    }//GEN-LAST:event_btnSokInfoAgentActionPerformed

    //När man trycker på denna knappen och skrivit in något nytt i textfälten ändras värdet till det man skrev in. 
    //(Man får inte ändra epost)
    private void btnAndraInfoAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraInfoAgentActionPerformed
        if(Validering.txtFaltArInteTom(txtinfoAgentAnstallningsdatum) && Validering.txtFaltArInteTom(txtinfoAgentNamn) && Validering.txtFaltArInteTom(txtinfoAgentLosenord) && Validering.losenordRattLangd(txtinfoAgentLosenord)&& Validering.txtFaltArInteTom(txtInfoAgentAdminStatus) && Validering.txtFaltArInteTom(txtinfoAgentEpost)&& Validering.txtFaltArInteTom(txtifoAgentTelefon)){
       try{
           String fragaAgent = "SELECT * FROM Agent";

            ArrayList<HashMap<String, String>> Agent = idb.fetchRows(fragaAgent);

           String valdAgent = cbinfoAgentID.getSelectedItem().toString();
           String nyttNamn = txtinfoAgentNamn.getText();
           String nyTelefon = txtifoAgentTelefon.getText();
           String nyttAnstallningsDatum = txtinfoAgentAnstallningsdatum.getText();
           String nyAdminStatus = txtInfoAgentAdminStatus.getText();
           String nyLosenord = txtinfoAgentLosenord.getText();
           String nyttOmrade = cbinfoAgentOmrade.getSelectedItem() != null ? cbinfoAgentOmrade.getSelectedItem().toString() : null;
           String nyOmradesChef = cbOmradesChef.getSelectedItem() != null ? cbOmradesChef.getSelectedItem().toString() : null;
           String nyKontorsChef = cbKontorsChef.getSelectedItem() != null ? cbKontorsChef.getSelectedItem().toString() : null;


           // Ändrar namn
           String uppdateraNamn = "UPDATE Agent SET Namn = '" + nyttNamn + "' WHERE Agent_ID = '" + valdAgent + "'";
           
                 idb.update(uppdateraNamn);
       
            //Ändrar telefon
            String uppdateraTelefon = "UPDATE Agent SET Telefon = '" + nyTelefon + "' WHERE Agent_ID = '" + valdAgent + "'";
           
                 idb.update(uppdateraTelefon);
             
            //Ändrar anställningsdatum    
            String uppdateraAnstallningsDatum = "UPDATE Agent SET Anstallningsdatum = '" + nyttAnstallningsDatum + "' WHERE Agent_ID = '" + valdAgent + "'";
           
                 idb.update(uppdateraAnstallningsDatum);
            
            //Ändrar adminstatus    
            String uppdateraAdminStatus = "UPDATE Agent SET Administrator = '" + nyAdminStatus + "' WHERE Agent_ID = '" + valdAgent + "'";
          
                 idb.update(uppdateraAdminStatus);
             
            //Ändrar lösenord     
            String uppdateraLosenord = "UPDATE Agent SET Losenord = '" + nyLosenord + "' WHERE Agent_ID = '" + valdAgent + "'";
           
                 idb.update(uppdateraLosenord);
            
            //Ändrar område agenten är i
            String uppdateraOmrade = "UPDATE Agent SET Omrade = '" + nyttOmrade + "' WHERE Agent_ID = '" + valdAgent + "'";
           
                 idb.update(uppdateraOmrade);
                 
            //Ändrar/lägger till område agenten är chef för    
            String fragaOmradesChefsOmrade = "SELECT Omradeschef.Omrade FROM mibdb.Omradeschef";
            String fragaAgentID = "SELECT Omradeschef.Agent_ID FROM mibdb.Omradeschef";
            
            ArrayList<String> omradesLista = idb.fetchColumn(fragaOmradesChefsOmrade);
            ArrayList<String> allaAgentID =idb.fetchColumn(fragaAgentID);
            
            if (omradesLista.contains(nyOmradesChef) && allaAgentID.contains(valdAgent)){
        
                 String uppdateraOmradesChef = "UPDATE mibdb.Omradeschef SET Omradeschef.Agent_ID = '" + valdAgent + "' WHERE Omradeschef.Omrade = '" + nyOmradesChef + "'";
                 idb.update(uppdateraOmradesChef);
            }
            
                else {
                        String laggTillAgent = "INSERT INTO mibdb.Omradeschef (Agent_ID) VALUES ('" + valdAgent + "')";
                        idb.update(laggTillAgent);
//                        String laggTillOmrade = "INSERT INTO mibdb.Omradeschef (Omrade) VALUES ('" + nyOmradesChef + "')";
//                         idb.update(laggTillOmrade);
                         String uppdateraOmradesChef = "UPDATE mibdb.Omradeschef SET Omradeschef.Omrade = '" + nyOmradesChef + "' WHERE Omradeschef.Agent_ID = '" + valdAgent + "'";
                         idb.update(uppdateraOmradesChef);
                         }

            //Ändrar/lägger till kontor där agenten är kontorschef     
            String uppdateraKontorsChef = "UPDATE Kontorschef SET Agent_ID = '" + valdAgent + "' WHERE Kontorsbeteckning = '" + nyKontorsChef + "'";
           
                 idb.update(uppdateraKontorsChef);

                 
            JOptionPane.showMessageDialog(null, " Infomrationen har ändrats." );
                 
          }catch(InfException ettUndantag){

            JOptionPane.showMessageDialog(null, " Databasfel!" );
            System.out.println("Internt felmedelande" + ettUndantag.getMessage());    
       
       }
        }
    }//GEN-LAST:event_btnAndraInfoAgentActionPerformed

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
//            java.util.logging.Logger.getLogger(SokInfoOmAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SokInfoOmAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SokInfoOmAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SokInfoOmAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                //new SokInfoOmAgent().setVisible(true);
//            }
//        });}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraInfoAgent;
    private javax.swing.JButton btnSokInfoAgent;
    private javax.swing.JComboBox<String> cbKontorsChef;
    private javax.swing.JComboBox<String> cbOmradesChef;
    private javax.swing.JComboBox<String> cbinfoAgentID;
    private javax.swing.JComboBox<String> cbinfoAgentOmrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblJNAdminStatus;
    private javax.swing.JLabel lblagentKontorschef;
    private javax.swing.JLabel lblagentOmradeschef;
    private javax.swing.JLabel lblnamn;
    private javax.swing.JLabel lbltelefon;
    private javax.swing.JLabel lblvaljEnAgent;
    private javax.swing.JTextField txtInfoAgentAdminStatus;
    private javax.swing.JTextField txtifoAgentTelefon;
    private javax.swing.JTextField txtinfoAgentAnstallningsdatum;
    private javax.swing.JTextField txtinfoAgentEpost;
    private javax.swing.JTextField txtinfoAgentLosenord;
    private javax.swing.JTextField txtinfoAgentNamn;
    // End of variables declaration//GEN-END:variables
}
