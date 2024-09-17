package gui.Settings;

import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class TextSettings {
    private static String OriginalText;

    public static void chechTheTextFocusGained(JTextField textField, String orginal) {
        OriginalText = orginal;
        if (textField.getText().trim().equals(orginal)) {
            textField.setText("");
        }
    }

    public static void checkTheTextFocusLost(JTextField textField) {
        if (textField.getText().trim().equals("")) {
            textField.setText(OriginalText);
        }
    }

    /* KEY SETTINGS */
    public static void setOnlyNumber(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });
    }

    public static void setOnlyAlphabetic(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isAlphabetic(c)) {
                    e.consume();
                }
            }
        });
    }

    /* LIMITED SETTINGS */
    private static int limit;

    public static void setMaxLimit(JTextField textField, int Limit) {
        limit = Limit;
        textField.setDocument(new PlainDocument() {
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if (str == null) {
                    return;
                }
                if (getLength() + str.length() <= limit) {
                    super.insertString(offs, str, a);
                }
            }
        });
    }
public static boolean lenghtIsEnough(int length,String str){
    return (str.length()<length);
}
    public static int checkTheKeyReleased(JTextField textField, int moneyLimit) {
        String text = textField.getText();
        if (!text.equals("")) {
            int amount = Integer.valueOf(text);
            if (amount > moneyLimit) {
                amount = moneyLimit;
                textField.setText(String.valueOf(amount));
            }
            return amount;
        }
        return 0;
    }
    
    // textarea control
    
    public static boolean textAreaIsEmpty(JPanel panel){
         Component[] components=panel.getComponents();
         for (Component c: components) {
            if(c instanceof JTextField){
                JTextField textField =(JTextField) c;
                if(textField.getText().trim().equals("") && textField.isEnabled()){
                    return false;
                }
            }
        }
         return true;
    }
}
