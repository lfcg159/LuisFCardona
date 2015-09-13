/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author s204e13
 */
public class PruebaCalculadora extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora SumaHuevos = new Calculadora();
        SumaHuevos.setDefaultCloseOperation(EXIT_ON_CLOSE);
        SumaHuevos.setVisible(true);
        
    }
    
}
