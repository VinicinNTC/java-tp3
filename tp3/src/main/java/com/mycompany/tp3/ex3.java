package com.mycompany.tp3;

import javax.swing.JOptionPane;

public class ex3 {
    public static void main(String[] args) {
        
       
        try {
            String entrada = JOptionPane.showInputDialog("Digite quantos casas de numeros primos vc quer ver: ");
            
            if (entrada != null) {
                
                int n = Integer.parseInt(entrada);
                if (n <= 0) {
                    JOptionPane.showMessageDialog(null,
                            "Digite valores maiores que zero!", "Número inválido!", JOptionPane.WARNING_MESSAGE);
                    return; 
                }
                
                String resultado = "";
                int qtPrimo = 0;
                int atual = 2;
                int i;
                
       while(qtPrimo < n){
            boolean ehprimo = true;
            
            for(i = 2; i < atual; i++){
                if(atual % i == 0){
                    ehprimo = false;
                    break;
                }
            }
            
            if(ehprimo){
                resultado += atual + "\n";
                qtPrimo++;
            }
            
            atual++;
        }        
            
        JOptionPane.showMessageDialog(null, "Sequência de números primos:\n" + resultado);
        
            }  
        } catch (NumberFormatException e) {
           
            JOptionPane.showMessageDialog(
                null, 
                "Erro: Você deve digitar apenas números inteiros!", 
                "Erro de Entrada", 
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
}