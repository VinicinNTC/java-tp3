package com.mycompany.tp3;

import javax.swing.JOptionPane;

public class ex1 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
 try{
     
        String entrada = JOptionPane.showInputDialog("Digite a quantidade de numeros pares vc quer: ");
            
        if (entrada != null) {
                int num = Integer.parseInt(entrada);
                
                // Validação para evitar números negativos ou zero
                if (num <= 0) {
                    JOptionPane.showMessageDialog(
                        null, 
                        "Erro: Por favor, digite apenas números maiores que zero!", 
                        "Número Inválido", 
                        JOptionPane.WARNING_MESSAGE
                    );
                    return; // Encerra a execução do programa aqui
                }
        }
        
            int par = 0;
            int num = Integer.parseInt(entrada);
            
            String resultado = "";
            
            for (int i = 1; i <= num; i++){
                par += 2;
                resultado += par + "\n";
                JOptionPane.showMessageDialog(null, par);
              
            }
        }
 catch(NumberFormatException e){
                JOptionPane.showMessageDialog(
                null, 
                "Erro: Você deve digitar apenas números inteiros!", 
                "Erro de Entrada", 
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
}