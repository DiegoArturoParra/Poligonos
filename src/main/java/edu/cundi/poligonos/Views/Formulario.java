
package edu.cundi.poligonos.Views;
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author diego parra
 */
public class Formulario extends JFrame implements ActionListener {
    
    private final JLabel labelTipo = new JLabel("Escoja Su Figura:");
    private final JLabel labelArea = new JLabel("Area");
    private final JLabel labelPerimetro = new JLabel("Perimetro");
    private final JLabel labelCoordenadax1y1 = new JLabel("Coordenada x1-y1");
    private final JLabel labelCoordenadax2y2 = new JLabel("Coordenada x2-y2");
    private final JLabel labelCoordenadax3y3 = new JLabel("Coordenada x3-y3");
    private final JLabel labelCoordenadax4y4 = new JLabel("Coordenada x4-y4");
    private final JComboBox listaFiguras = new JComboBox();
    private final JButton btnPintar = new JButton("Pintar");
    private final JButton btnLimpiar = new JButton("Limpiar");
    
    
    public Formulario(){
    
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
