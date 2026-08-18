package com.mycompany.exercicios;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Quantos Graus Celsius?: ");
        float grausC = sc.nextFloat();
        
        float grausF = (9 * grausC + 160) / 5;
        
        System.out.println("Graus convertido em fahreinheit fica: " + grausF +"F");
       
        sc.close();
    }
}
