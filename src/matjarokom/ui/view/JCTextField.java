/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matjarokom.ui.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JTextField;

/**
 *
 * @author horizon
 */
public class JCTextField extends JTextField{
    
     private String placeholder="please add only number ";
     private Color phColor=null;

    public JCTextField() {
        setHorizontalAlignment(JTextField.CENTER);
        
    
    }

    /**
     * @return the placeholder
     */
    public String getPlaceholder() {
        return placeholder;
    }

    /**
     * @param placeholder the placeholder to set
     */
    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    /**
     * @return the phColor
     */
    public Color getPhColor() {
        return phColor;
    }

    /**
     * @param phColor the phColor to set
     */
    public void setPhColor(Color phColor) {
        this.phColor = phColor;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        
        if (super.getText().length()>0 || placeholder==null) {
            return;
        }
        
        Graphics2D g2=(Graphics2D) g;
        
        g2.setFont(new Font("Times New Roman",Font.ITALIC,12));
        g2.setColor(phColor);
        //g2.drawString(placeholder, getInsets().left, g.getFontMetrics().getMaxAscent() + getInsets().bottom);
        g2.drawString(placeholder, CENTER, g.getFontMetrics().getMaxAscent() + getInsets().top);
    }
     
     
    
}
