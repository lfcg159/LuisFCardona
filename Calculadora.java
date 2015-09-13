/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.BorderLayout;

/**
 *
 * @author s204e13
 */
public class Calculadora extends JFrame {
    private JPanel PSup;
    private JPanel PInf;
    private JTextField CampoTexto;
    private JButton Num0, Num1, Num2, Num3, Num4, Num5, Num6, Num7, Num8, Num9;
    private JButton Sumar, Restar, Dividir, Multiplicar;
    private JButton Borrar, Limpiar;
    
    public Calculadora(){
        super("SumaHuevos3000");
        setSize(500, 500);
        setResizable(false); // Bloquea el tamaño
        setLocationRelativeTo(null); // Centra el Jframe
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/calculadora.png")).getImage()); // Cambia icono de la app
        JPsup(); JPInf();
        add(PSup,BorderLayout.PAGE_START);
        add(PInf, BorderLayout.CENTER);
        
    }
    
    public JPanel JPsup()
    {
    PSup = new JPanel();
    PSup.setLayout( new BorderLayout());
    CampoTexto = new JTextField();
    PSup.add(CampoTexto);
    return PSup;
    }
    
    public JPanel JPInf()
    {
    PInf = new JPanel();
    PInf.setLayout(new GridLayout(4, 4));
    Sumar = new JButton("+"); PInf.add(Sumar);
    Restar = new JButton("-"); PInf.add(Restar);
    Multiplicar = new JButton("*"); PInf.add(Multiplicar);
    Dividir = new JButton("/"); PInf.add(Dividir);
    Num6 = new JButton("9"); PInf.add(Num6);
    Num7 = new JButton("8"); PInf.add(Num7);
    Num8 = new JButton("7"); PInf.add(Num8);
    Num9 = new JButton("6"); PInf.add(Num9);
    Num2 = new JButton("2"); PInf.add(Num2);
    Num3 = new JButton("3"); PInf.add(Num3);
    Num4 = new JButton("4"); PInf.add(Num4);
    Num5 = new JButton("5"); PInf.add(Num5);
    Num1 = new JButton("1"); PInf.add(Num1);
    Num0 = new JButton("0"); PInf.add(Num0);
    Borrar = new JButton("C"); PInf.add(Borrar);
    Limpiar = new JButton("DEL"); PInf.add(Limpiar);
    
  //  Num1.addActionListener();
    
    return PInf;
    }
    
    private class GestorButt implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           
        }
        
        
    }
 
   
    
}



