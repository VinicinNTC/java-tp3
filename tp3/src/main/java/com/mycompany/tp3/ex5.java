/*
Criar um programa que leia um número que será o limite superior de um intervalo e 
o incremento. Exibir todos os números naturais no intervalo de 0 até esse número.  
Suponha que os dois números lidos são maiores que zero. Exemplo: 
Limite superior: 20 
Incremento: 5 
Saída: 0  5  10  15  20 
 */
package com.mycompany.tp3;
import javax.swing.JOptionPane;

public class ex5 {
    public static void main(String[] args){
        
    try{
        
        String entrada = JOptionPane.showInputDialog("Digite um numero limite superior: ");
            
        if (entrada == null)return;
                int limite = Integer.parseInt(entrada);
                
                // Validação para evitar números negativos ou zero
                if (limite <= 0) {
                    JOptionPane.showMessageDialog(
                        null, 
                        "Erro: Por favor, digite apenas números maiores que zero!", 
                        "Número Inválido", 
                        JOptionPane.WARNING_MESSAGE
                    );
                    return; // Encerra a execução do programa aqui
                }
        
        String e2 = JOptionPane.showInputDialog("Digite um numero para incrementar ate o limite: ");
        
        if(e2 == null)return;
        
         int inc = Integer.parseInt(e2);
        
        if(inc <= 0){
            JOptionPane.showMessageDialog(
                        null, 
                        "Erro: Por favor, digite apenas números maiores que zero!", 
                        "Número Inválido", 
                        JOptionPane.WARNING_MESSAGE
                    );
                    return; // Encerra a execução do programa aqui
        }
        
        String resultado = "";
        int i;     
        
        for(i = 0; i <= limite; i+=inc){
            resultado += i + " ";
        }
        
        JOptionPane.showMessageDialog(null,
                "Sequencia: \n" +
                resultado);
        
} catch(NumberFormatException e){
        JOptionPane.showMessageDialog(
                        null, 
                        "Erro: Por favor digite apenas numeros inteiros !", 
                        "Número Inválido", 
                        JOptionPane.WARNING_MESSAGE
                    );
        } 
    }
}
