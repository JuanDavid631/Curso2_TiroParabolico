package udemy.poo.inicio;

import udemy.poo.codigo.Componentes;
import udemy.poo.codigo.TiroParabolico;

import javax.swing.*;

public class Inicio {
  public static void main(String[] args) {
    String dato = JOptionPane.showInputDialog(null, "Dame la velocidad inicial: "),
            datoDos = JOptionPane.showInputDialog(null, "Dame el grado: ");
    float numUno = Float.parseFloat(dato);
    int numDos = Integer.parseInt(datoDos);

    TiroParabolico objetoUno = new TiroParabolico(numUno, numDos);
    JOptionPane.showMessageDialog(null, "La altura maxima es: " + objetoUno.alturaMaxima() + "\nEl alcance es: " +
        objetoUno.alcance(), "Resultado", JOptionPane.INFORMATION_MESSAGE);

    // Calculo de componentes
    String datoTres = JOptionPane.showInputDialog(null, "Dame el tiempo: ");
    int numTres = Integer.parseInt(datoTres);
    String y = null;
    Componentes [] datos = objetoUno.calculoComponentes(numTres);
    for (Componentes objeto : datos) {
      y += objeto.getTiempo() + " ; " + objeto.getX() + " ; " + objeto.getY() + " ;";
    }
    JOptionPane.showMessageDialog(null, y, "Componentes", JOptionPane.INFORMATION_MESSAGE);
  }
}
