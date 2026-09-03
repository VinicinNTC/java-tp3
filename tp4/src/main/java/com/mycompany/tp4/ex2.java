/*
2) Ler número da conta do cliente, saldo, débito e crédito. Após, calcular e escrever o 
saldo atual (saldo atual = saldo - débito + crédito), através de uma função que retorne 
valor, também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo 
Positivo', senão escrever a mensagem 'Saldo Negativo'.
 */

package com.mycompany.tp4;
import javax.swing.JOptionPane;

public class ex2 {
    
    public static double calcularSaldo(double saldo, double debito, double credito) {
        double saldoatual= (saldo - debito + credito);
        return saldoatual;
    }
    
    public static void main(String[] args){
        
        String id = JOptionPane.showInputDialog("Digite o numero da sua conta: ");
        
        String saldo1 = JOptionPane.showInputDialog("Digite o saldo atual da sua conta: ");
        
        String debito1 = JOptionPane.showInputDialog("Digite o debito q vai pagar/tirar da conta: ");
        
        String credito1 = JOptionPane.showInputDialog("Digite o crédito q vai entrar na conta: ");   

        
        double saldo = Double.parseDouble(saldo1); 
        double debito = Double.parseDouble(debito1);
        double credito = Double.parseDouble(credito1);
        
        String resultado = "";
        
        double total = calcularSaldo(saldo, debito, credito);
        
        if (total < 0) {
            resultado = "Saldo negativo!";
        }
        else{
            resultado = "Saldo Positivo!";
        }
        
        JOptionPane.showMessageDialog(null,
                "Conta: " + id + 
                "\nSaldo Atual: R$ " + String.format("%.2f", total) + 
                "\nResultado: " + resultado, 
                "Extrato da Conta", 
                JOptionPane.INFORMATION_MESSAGE);
        
    }   
}
