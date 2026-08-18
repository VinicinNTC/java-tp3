package com.mycompany.exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.print("Insira o primeiro numero: ");
        float n1 = leitor.nextFloat();
        
        System.out.print("Insira o segundo numero: ");
        float n2 = leitor.nextFloat();
        
        float media = (n1 + n2) / 2;
        
        System.out.println("A media dos dois numeros eh: " + media);
        
        leitor.close();
        
}
}