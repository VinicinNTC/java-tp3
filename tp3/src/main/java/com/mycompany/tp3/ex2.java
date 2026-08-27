package com.mycompany.tp3;

import javax.swing.JOptionPane;

public class ex2 {
    public static void main(String[] args) {
        
       
        try {
            String entrada = JOptionPane.showInputDialog("Digite quantas casas de fibonacci vc quer: ");
            
            
            if (entrada != null) {
                
                int n = Integer.parseInt(entrada);
                
                
                if (n <= 0) {
                    JOptionPane.showMessageDialog(null, "Digite valores maiores que zero!", "Número inválido!", JOptionPane.WARNING_MESSAGE);
                    return; 
                }
                
                String resultado = "";
                int anterior = 0;
                int atual = 1;
                
                for (int i = 1; i <= n; i++) {
                    resultado += anterior + "\n";
                    int proximo = anterior + atual; 
                    anterior = atual;               
                    atual = proximo;                
                }
                
                JOptionPane.showMessageDialog(null, "Sequencia de Fibonacci: \n" + resultado);
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