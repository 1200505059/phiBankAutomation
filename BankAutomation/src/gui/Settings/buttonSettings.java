/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.Settings;

import java.awt.Color;
import javax.swing.JButton;

/* BACKGROUND COLOR SETTINGS*/

public class buttonSettings {
    private static Color originalBgColor;
    
    public static void setBg(JButton button,Color bgColor){
        originalBgColor=button.getBackground();
        button.setBackground(bgColor);
    }
     public static void setOriginalBg(JButton button){
       button.setBackground(originalBgColor);
    }
     
   //  
     
     
}
