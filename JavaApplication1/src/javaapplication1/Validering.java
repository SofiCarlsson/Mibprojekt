/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author soficarlsson
 */
public class Validering {
    
    private static InfDB idb;
    
    public Validering(InfDB db){
        idb = db;
    }
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
    
    public static boolean losenordRattLangd(JTextField txtAttKolla){
    String losenord = txtAttKolla.getText();
    boolean resultat = true;
        
        if(losenord.length()<=6){
        resultat = true;
        }else{
        JOptionPane.showMessageDialog(null, " Skriv in ett lösenord som är minst 6 tecken" );               
        txtAttKolla.requestFocus();
        resultat = false;
                }
    
    return resultat;
    }
        }

