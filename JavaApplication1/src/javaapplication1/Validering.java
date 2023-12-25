/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author soficarlsson
 */
public class Validering {
    
    public static boolean txtFaltArInteTom(JTextField txtLosenord){
    
    boolean resultat = true;
        
    if(txtLosenord.getText().isEmpty()){
    
    JOptionPane.showMessageDialog(null, " Skriv in något i rutan" );
    resultat = false;               
   
    }
    return resultat;
    }
    
    public static boolean txtFaltAlienArInteTom(JTextField txtLosenordAlien){
    
    boolean resultat = true;
        
    if(txtLosenordAlien.getText().isEmpty()){
    
    JOptionPane.showMessageDialog(null, " Skriv in något i rutan" );
    resultat = false;               
   
    }
    return resultat;
    }
    
}
