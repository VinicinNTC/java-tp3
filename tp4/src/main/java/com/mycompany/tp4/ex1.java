/*

 1) Ler o nome de um produto, o preço e a quantidade comprada. Escreva o nome do 
produto comprado e o valor total a ser pago, considerando que são oferecidos descontos 
pelo número de unidades compradas, segundo a tabela abaixo: 
a) Até 10 unidades: valor total 
b) De 11 a 20 unidades: 10% de desconto 
c) De 21 a 50 unidades: 20% de desconto 
d) Acima de 50 unidades: 25% de desconto 
Calcular o valor total a ser pago através de uma função que retorna valor

 */

package com.mycompany.tp4;
import javax.swing.JOptionPane;

public class ex1 { 
    
public static double calcularTotal(double preco, double quantidade) {
        double subtotal = preco * quantidade;
        double descontoPercentual = 0;
        
        if (quantidade <= 10) {
            descontoPercentual = 0;
        } else if (quantidade >= 11 && quantidade <= 20) {
            descontoPercentual = 0.10; // 10% de desconto
        } else if (quantidade >= 21 && quantidade <= 50) {
            descontoPercentual = 0.20; // 20% de desconto
        } else {
            descontoPercentual = 0.25; // 25% de desconto
        }
        
        // Retorna o valor final com o desconto aplicado
        return subtotal - (subtotal * descontoPercentual);
    }

 public static void main(String[] args) 
 { 
 
 String n = JOptionPane.showInputDialog(null,"Digite o nome do produto: ");
 String p = JOptionPane.showInputDialog(null,"Qual o preco do produto: ");
 String q = JOptionPane.showInputDialog(null,"Quantos unidades vc comprou?: ");  

    double preco = Double.parseDouble(p); 
    double quantidade = Double.parseDouble(q);   
  
    double total = calcularTotal(preco,quantidade);
    
    JOptionPane.showMessageDialog(null,
         "Nome do produto: " + n +
         "\nPreco total a pagar: R$ " + total, "\n Pedido Finalizado.", JOptionPane.INFORMATION_MESSAGE); 
 }
}
   


