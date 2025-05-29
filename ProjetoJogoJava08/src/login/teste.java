/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;
import javax.swing.*;
import niveis.Nivel_1;



/**
 *
 * @author braya
 */
public class teste extends JFrame{
    public teste(){
        setSize(1280,720);
        setVisible(true);
        add(new Nivel_1());
        
    }
    
    
    
    public static void main(String[] args) {
        new teste();
        
        
        
    }
}
