package com.appsEmpresariales.udea.romanos;
import javax.swing.JOptionPane;  



public class main{  
  
    /** 
     * @param args 
     */
	
	
    public static void main (String[] args) {  
                
        int numeros= Integer.parseInt(JOptionPane.showInputDialog("Ingreso Nº " +  " : ",1 ));
        String Str ="";  
        Romanos numero= new Romanos();
        
        Str=Str + "Numero "  + numero.convertirUnidadesDeMilARomano(numeros)+ numero.convertirCentenasARomano(numeros) + numero.convertirDecenasARomano(numeros)+ numero.convertirUnidadesARomano(numeros);  
        JOptionPane.showMessageDialog(null, Str);  
  
         
    } 
}