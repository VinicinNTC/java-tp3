package com.mycompany.exercicios;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Digite a altura da lata de oleo: ");
        double altura = sc.nextDouble();
        
        System.out.print("Digite o raio da lata de oleo: ");
        double raio = sc.nextDouble();
        
        double volume = 3.14159 * (raio * raio) * altura;
        
        System.out.println("Volume da lata de óleo: " + volume);
  
        sc.close();
    }
}
