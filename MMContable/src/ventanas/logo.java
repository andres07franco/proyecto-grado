/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VistaBienvenido.java
 *
 * Created on 8/01/2011, 03:17:07 AM
 */
package ventanas;

import db.Model;
import java.awt.AWTException;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Usuario
 */
public class logo extends javax.swing.JFrame {

    /** Creates new form VistaBienvenido */
    private int ancho = 1280;
    private int alto = 1024;

    public logo() {
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/icono.png")).getImage());
        this.setUndecorated(true);
        this.initComponents();
        this.ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        this.alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setLocation(ancho / 2 - 344 / 2, alto / 2 - 233 / 2);
        setVisible(true);

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 386, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void paint(Graphics g) {

        try {
            BufferedImage pantalla = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            g.drawImage(pantalla, -1 * (ancho / 2 - 344 / 2), -1 * (alto / 2 - 233 / 2), this);
            g.drawImage(new ImageIcon(getClass().getResource("/img/logo.png")).getImage(), 0, 0, this);

        } catch (AWTException ex) {
            Logger.getLogger(logo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        try {
            // Set cross-platform Java L&F (also called "Metal")
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException e) {
            // handle exception
        } catch (ClassNotFoundException e) {
            // handle exception
        } catch (InstantiationException e) {
            // handle exception
        } catch (IllegalAccessException e) {
            // handle exception
        }
        logo vb = new logo();
        try {
            Thread.sleep(2000);
            Integer cantidadEmpresas = (Integer) Model.getInstance().obtenerRegistro("existeEmpresaRegistrada");
            if (cantidadEmpresas.intValue() > 0) {
                java.awt.EventQueue.invokeLater(new Runnable() {

                    public void run() {
                        new InicioSesion().setVisible(true);
                    }
                });
            } else {
                new ventanas.pasosiniciales.VistaPasosIniciales().setVisible(true);
            }
            vb.dispose();
        } catch (Exception er) {
            er.printStackTrace();
        }


    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
