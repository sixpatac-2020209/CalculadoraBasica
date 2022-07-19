package org.sduardixpatac.system;
import javax.swing.JOptionPane;
import org.sduardixpatac.bean.Suma;
import org.sduardixpatac.bean.Resta;
import org.sduardixpatac.bean.Multiplicacion;
import org.sduardixpatac.bean.Division;
import org.sduardixpatac.bean.Salir;

/**
 *  Nombre del Programador: Sduard Alejandro Ixpatac Sipaque
 * Codigo Tecnico: IN5AV
 * Carné: 2020209
 * Fecha de Creación:
		11-04-2021 
 */
public class Principal {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Programador:\n" + "Sduard Ixpatac", "Mensaje de inicio", JOptionPane.INFORMATION_MESSAGE);
        Suma suma = new Suma (0,0); 
        Resta resta = new Resta (0,0);
        Multiplicacion mult = new Multiplicacion (0,0);
        Division div = new Division (0,0);
        Salir salir = new Salir();
        int op;
        do{
        
        op = Integer.parseInt(JOptionPane.showInputDialog(null, "________Menú________\n"+
                                            "1-----> Suma\n"+
                                            "2-----> Resta\n"+
                                            "3-----> Multiplicación\n"+
                                            "4-----> División\n"+
                                            "5-----> Salir\n"+
                                            "Ingrese una opción\n","Calculadora",JOptionPane.INFORMATION_MESSAGE));
        switch (op){
            case 1:
                suma.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el primer valor")));
                suma.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el segundo valor")));
                JOptionPane.showMessageDialog(null,"La suma es: " + String.valueOf(suma.adicion(suma.getNum1(),suma.getNum2())));
            break;
            
            case 2:
                resta.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el primer valor")));
                resta.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el segundo valor")));
                JOptionPane.showMessageDialog(null, "La resta es: "+ String.valueOf(resta.sustraccion(resta.getNum1(),resta.getNum2())));
            break;
            
            case 3:
                mult.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer valor")));
                mult.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el segundo valor")));
                JOptionPane.showMessageDialog(null, "La multiplicacion es: " + String.valueOf(mult.multiplicar(mult.getNum1(), mult.getNum2())));
                break;
                
            case 4:
                div.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer valor")));
                div.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo valor")));
                JOptionPane.showMessageDialog(null, "La división es: " + String.valueOf(div.dividir(div.getNum1(),div.getNum2())));
                break;
                
            case 5:
                salir.Salir();
                break;
                
            default:
                JOptionPane.showMessageDialog(null,"Opción Invalida", "Mensaje de Alerta", JOptionPane.WARNING_MESSAGE);
            break;
            
        }

        }while(op != 5);
         
    }
}