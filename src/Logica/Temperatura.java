
package Logica;

import javax.swing.JOptionPane;


public class Temperatura {
    
    public double calcularTemperatura (double valor, String tipo) {
    
        double resultado;
        
        if(tipo.equalsIgnoreCase("Celsius a Fahrenheit")) {
            
            resultado = (valor*1.8) + 32;
            // Mustra solo los primeros decimales de un double
            resultado = (double) Math.round(resultado * 100d)/100;
            return resultado;
        }
        else if (tipo.equalsIgnoreCase("Fahrenheit a Celcius")) {
            
            resultado = (valor - 32) / 1.8;
            resultado = (double) Math.round(resultado * 100d)/100;
            return resultado;
        }
        else {
             JOptionPane.showMessageDialog(null,
                "Error no se ha podido realizar la operación",
                "Error",
                JOptionPane.ERROR_MESSAGE);
             return 0;
        }
    }  
}
