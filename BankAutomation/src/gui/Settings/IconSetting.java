/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.Settings;

import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class IconSetting {
    
    private static Icon orijinalIcon;
    
public static void changeIcon(JLabel label, String fileName) {
   
    orijinalIcon = label.getIcon();

    // Dosyanın bulunup bulunmadığını kontrol et
    URL iconURL = IconSetting.class.getResource("/gui/icons/" + fileName + ".png");
    
    if (iconURL != null) {
        // İkonu değiştir
        label.setIcon(new ImageIcon(iconURL));
    } else {
        // Hata durumunda bir uyarı bas
        System.out.println("Icon not found at: /gui/icons/" + fileName + ".png");
    }
}

    
    public static void setOriginalIcon(JLabel label){
        label.setIcon(orijinalIcon);
    }
    
}
