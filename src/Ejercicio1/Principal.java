
package Ejercicio1;

import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args){
        Cuadrilatero cl;
        float lado1,lado2;
        
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado-1: "));
       lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado-2: "));
  
    if(lado1 == lado2){
        cl = new Cuadrilatero(lado1);
    }
    else{
        cl = new Cuadrilatero(lado1, lado2);
    }
        System.out.println("El perimetro es: "+cl.getPerimetro());
        System.out.println("El area es: "+cl.getArea());
    }  
}
