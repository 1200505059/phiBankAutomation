/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.Settings;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class Dialogs {
    public static void spaceError(JFrame frame){
        JOptionPane.showMessageDialog(frame, "All fields must be filled. !!");
    }
    public static void showPrivateMessage(JFrame frame,String message){
        JOptionPane.showMessageDialog(frame, message);
    }
    public static int okMessage(JFrame frame,String message){
        int optionType=JOptionPane.YES_NO_OPTION;
        int selected=JOptionPane.showConfirmDialog(frame, message, "WARNING", optionType);
        if (optionType==selected) {
            return 1;
        }
        return 0;
    }
}
