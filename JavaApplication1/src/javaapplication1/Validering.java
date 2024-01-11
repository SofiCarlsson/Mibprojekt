/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author soficarlsson
 */
public class Validering {
    
    private static InfDB idb;
    
    public Validering(InfDB db){
        idb = db;
    }
    
    /*******
     * 
     */
    
    //Denna metoden kollar så att rutan inte är tom
    public static boolean txtFaltArInteTom(JTextField txtAttKolla){
    
    boolean resultat = true;
        
    if(txtAttKolla.getText().isEmpty()){
    
    JOptionPane.showMessageDialog(null, " Skriv in något i rutan" );
    resultat = false;               
    txtAttKolla.requestFocus();
    }
    return resultat;
 
    }
    
    //Denna metoden kollar om txtAttKolla är av typen int
    public static boolean isHeltal(JTextField txtAttKolla){
     
     boolean resultat = true;
    
        try{
            String inStrang = txtAttKolla.getText();
            Integer.parseInt(inStrang);
            txtAttKolla.requestFocus();
        }
        catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "Var god ange ett heltal!");
         resultat = false;
        }
     
       return resultat;
    }
    
    //Denna meroden kollar så att lösenordet består av 6 eller mindre tecken.
    public static boolean losenordRattLangd(JTextField txtAttKolla){
    String losenord = txtAttKolla.getText();
    boolean resultat = false;
        
        if(losenord.length()<=6){
        resultat = true;
        }
        
        else{
        JOptionPane.showMessageDialog(null, " Skriv in ett lösenord som är mindre eller 6 tecken" ); 
        txtAttKolla.requestFocus();
        resultat = false;
         }
    
    return resultat;
    }
   
    
    //Denna metoden kollar så att datumet är inskrivet i rätt format  v.
   public static boolean datumRattLangd(JTextField txtAttKolla){
    
    boolean resultat = true;

        String datumText = txtAttKolla.getText();

        //Denna koden skirver in att vi vill ha datumet i formatet datumRattLangd.
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);

        try {
            // Denna metdoen kollar så att. Försök konvertera texten till ett datum
            Date parsedDate = dateFormat.parse(datumText);

            // Kontrollera om det konverterade datumet är samma som ursprungstexten
            if (!dateFormat.format(parsedDate).equals(datumText)) {
                resultat = false;
            }

        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, " Skriv in datumet i formatet yyyy-mm-dd");
            resultat = false;
        }
    return resultat;
   }
   
   
}

