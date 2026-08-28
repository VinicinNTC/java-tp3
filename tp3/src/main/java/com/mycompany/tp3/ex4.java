/*
4) Um programa que calcule a média de uma aluno nos moldes da Fatec MAUÁ.  
p1 * 0.35 + p2 * 0.35 + t * 0.30
 */

package com.mycompany.tp3;
import javax.swing.JOptionPane;


public class ex4 {
    public static void main(String[] args){
      
try {
           
        String e1 = JOptionPane.showInputDialog("Digite a sua nota da P1: ");
        if(e1 == null)return;
            double n1 = Double.parseDouble(e1); 
           if (n1 < 0 || n1 > 10) {
                JOptionPane.showMessageDialog(null, "A nota deve estar entre 0 e 10!", "Nota Inválida", JOptionPane.WARNING_MESSAGE);
                return;
            }
        String e2 = JOptionPane.showInputDialog("Digite a sua nota da P2: ");
        
        if(e2 == null)return;
            double n2 = Double.parseDouble(e2);
            if (n2 < 0 || n2 > 10) {
                    JOptionPane.showMessageDialog(null,
                            "A nota deve estar entre 0 e 10!", "Nota Inválida", JOptionPane.WARNING_MESSAGE);
                    return; 
                }
        String e3 = JOptionPane.showInputDialog("Digite a sua nota dos Trabalhos: ");
        if(e3 == null) return;
            double n3 = Double.parseDouble(e3);
            if (n3 < 0 || n2 > 10) {
                    JOptionPane.showMessageDialog(null,
                            "A nota deve estar entre 0 e 10!", "Nota Inválida", JOptionPane.WARNING_MESSAGE);
                    return;
                }
        
        
        double med = (n1 * 0.35) + (n2 * 0.35) + (n3 * 0.30);
        
       String resultado = String.format("Média final: %.2f\nStatus: %s", med, (med >= 6.0 ? "Aprovado" : "Reprovado"));
       JOptionPane.showMessageDialog(null, resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        
        } catch (NumberFormatException e) {
           
            JOptionPane.showMessageDialog(
                null, 
                "Erro: Digite apenas números válidos (use ponto para decimais)!",
                "Erro de Entrada",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
