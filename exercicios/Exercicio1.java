package com.mycompany.exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        //Pede nome do produto pra digitar
        System.out.print("Digite o Nome do produto: ");
        String nome = leitor.nextLine();
        
        //Pede valor do produto
        System.out.print("Digite o valor do produto: ");
        double valor = leitor.nextDouble();
        
        double desconto = valor * 0.09;
        double valordesconto = valor - desconto;
        
        //Output dos dados
        System.out.println("Produto: " + nome);
        System.out.println("Valor normal: " + valor);
        System.out.println("Valor com desconto: " + valordesconto);
        leitor.close();
    }
}
