package com.mycompany.exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.print("Quanto e o salario minimo?: ");
        double salarioMinimo = leitor.nextDouble();
        
        System.out.print("Quanto voce ganha?: ");
        double userSalario = leitor.nextDouble();
        
        if(salarioMinimo > 0 && userSalario > 0){
        
        double qtSalario = (double) (userSalario / salarioMinimo);
        
       System.out.println("Voce ganha: " + qtSalario + " Salarios minimos!");
       
        }
        else{
            System.out.println("Insira ambos valores maiores que 0!");
        }
        
        leitor.close();
}
}