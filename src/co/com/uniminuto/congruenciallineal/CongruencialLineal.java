/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.uniminuto.congruenciallineal;

import co.com.uniminuto.Clases.Utilidades;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author RetailAdmin
 */
public class CongruencialLineal {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la semilla"));
        int periodo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el periodo"));
        
        String[][] aleatorios = new String[periodo][2];
        
        for (int i = 0;i<periodo;i++){
            
            Utilidades utilidades = new Utilidades();
            int resultado = utilidades.generaSemilla(numero);     
             numero = resultado;
            aleatorios[i][0] = "" + utilidades.generalAleatorio(numero);
            aleatorios[i][1] = "" + resultado;
           
            
        }
        String[] columnas = {"U",
                       "X"};
        
      
        
       JTable table = new JTable(aleatorios, columnas);
       table.setVisible(true);
       
        JFrame frame = new JFrame("JTable Test Display");

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

      

        JScrollPane tableContainer = new JScrollPane(table);

        panel.add(tableContainer, BorderLayout.CENTER);
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
        
    }
    
}
