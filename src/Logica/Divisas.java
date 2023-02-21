
package Logica;


public class Divisas {
    
 
    public double calcularValor (double valor, String tipo) {
    
        double resultado;
        
        if(tipo.equalsIgnoreCase("Peso ARS - Dolar")) {
        
            resultado = valor/193.19;
            // Mustra solo los primeros decimales de un double
            resultado = (double) Math.round(resultado * 100d)/100;
            return resultado;
            
        }
        else if(tipo.equalsIgnoreCase("Peso ARS - Euro")){
        
            resultado = valor/206.53;
            resultado = (double) Math.round(resultado * 100d)/100;
            return resultado;
          
        }
        else if(tipo.equalsIgnoreCase("Peso ARS - Libra Esterlina")){
        
            resultado = valor/232.62;
            resultado = (double) Math.round(resultado * 100d)/100;
            return resultado;
            
        }   
        else if(tipo.equalsIgnoreCase("Peso ARS - Yen")){
        
            resultado = valor/144;
            resultado = (double) Math.round(resultado * 100d)/100;
            return resultado;
         
        }   
        else if(tipo.equalsIgnoreCase("Peso ARS - Won sul")){
        
            resultado = valor/6.74;
            resultado = (double) Math.round(resultado * 100d)/100;
            return resultado;
            
        } 
        else if(tipo.equalsIgnoreCase("Dolar - Peso ARS")) {
        
            resultado = valor*193.19;
            resultado = (double) Math.round(resultado * 100d)/100;
            return resultado;
            
        }
        else if(tipo.equalsIgnoreCase("Euro - Peso ARS")){
        
            resultado = valor*206.53;
            resultado = (double) Math.round(resultado * 100d)/100;
            return resultado;
            
        }
        else if(tipo.equalsIgnoreCase("Libra Esterlina - Peso ARS")){
        
            resultado = valor*232.62;
            resultado = (double) Math.round(resultado * 100d)/100;
            return resultado;
            
        }   
        else if(tipo.equalsIgnoreCase("Yen - Peso ARS")){
        
            resultado = valor*144;
            resultado = (double) Math.round(resultado * 100d)/100;
            return resultado;
            
        }   
        else if(tipo.equalsIgnoreCase("Won sul - Peso ARS")){
        
            resultado = valor*6.74;
            resultado = (double) Math.round(resultado * 100d)/100;
            return resultado;
            
        } 
        else {
            System.out.println("Error: no se ha podido realizar la operación");
            return 0;
        }
    }  
   
}
