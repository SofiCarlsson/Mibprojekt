/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;
import oru.inf.InfDB;
import oru.inf.InfException;

public class Agent extends javax.swing.JFrame {

    private InfDB idb;
    private int Agent_ID;
    private String Namn;
    private int Telefon;
    private String Anstallningsdatum;
    private String Administrator;
    private String Epost;
    private String Losenord;
    //private int (främmande nyckel) Omrade;
    
    
    
    public Agent(InfDB db, int Agent_ID) { 
        
        idb = db;
        this.Namn = Namn;
        this.Telefon = Telefon;
        this.Anstallningsdatum = Anstallningsdatum;
        this.Administrator = Administrator;
        this.Epost = Epost;
        this.Losenord = Losenord;
        
        
        initComponents();
    }
    
    //Get + set för övriga fields in 
    
    public String getEpost() {
        return Epost;
    }
    
    public void setEpost() {
        this.Epost = Epost;
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblStartsidaAgent = new javax.swing.JLabel();
        btbAndraLosenordAgent = new javax.swing.JButton();
        lblOmradeschefAgent = new javax.swing.JLabel();
        txtOmradeschefAgent = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblStartsidaAgent.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        lblStartsidaAgent.setText("Startsida AGENT");

        btbAndraLosenordAgent.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        btbAndraLosenordAgent.setText("Ändra Lösenord");

        lblOmradeschefAgent.setFont(new java.awt.Font("Big Caslon", 0, 13)); // NOI18N
        lblOmradeschefAgent.setText("Områdenschef");

        txtOmradeschefAgent.setColumns(4);
        txtOmradeschefAgent.setFont(new java.awt.Font("Beirut", 0, 13)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btbAndraLosenordAgent))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStartsidaAgent)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblOmradeschefAgent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtOmradeschefAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblStartsidaAgent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblOmradeschefAgent)
                    .addComponent(txtOmradeschefAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addComponent(btbAndraLosenordAgent)
                .addGap(20, 20, 20))
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
                new Agent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbAndraLosenordAgent;
    private javax.swing.JLabel lblOmradeschefAgent;
    private javax.swing.JLabel lblStartsidaAgent;
    private javax.swing.JTextField txtOmradeschefAgent;
    // End of variables declaration//GEN-END:variables
}
