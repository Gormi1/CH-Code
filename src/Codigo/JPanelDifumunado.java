/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codigo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/**
 *
 * @author Ramon Cheno Ocaño
 */
public class JPanelDifumunado extends JPanel {
    Color color1 = new Color(0,0,0);
    Color color2 = new Color(0,0,0);
    int w, h; 
    public JPanelDifumunado(){}
    
    
    public void tamañoPanel(int w, int h){
        setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        setPreferredSize(new Dimension(w, h));
        final JFrame f = new JFrame();
        f.getContentPane().setLayout(new BorderLayout());
        f.getContentPane().add(this,BorderLayout.CENTER);
        f.pack();
    }
    public void pintarPanel(Color c1, Color c2){
        color1 = c1;
        color2 = c2;
    }
    
    @Override
    public void paint(Graphics g){
        /*super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        
        int w = getWidth();
        int h = getHeight();
        
        GradientPaint gp = new GradientPaint(0,0, color1, w, h, color2);
        
        g2d.setPaint(gp);*/
       
       Graphics2D g2 = (Graphics2D) g.create();
        Rectangle clip = g2.getClipBounds();                        
        g2.setPaint(new GradientPaint(0.0f, 0.0f, color1,0.0f, 
                getHeight(), color2));        
        g2.fillRect(clip.x, clip.y, clip.width, clip.height);
    }
}
