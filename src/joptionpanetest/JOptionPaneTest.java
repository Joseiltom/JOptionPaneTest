/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joptionpanetest;

/**
 *
 * @author danta
 */

    import javax.swing.JOptionPane;

public class JOptionPaneTest {

    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Qual o seu nome?");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));
        if(idade > 17){
            String message = String.format("%s você já pode tirar a CNH", nome);
            JOptionPane.showMessageDialog(null,message);
        }else{
            String message = String.format("%s você ainda não pode tirar a CNH, você tem apenas %d anos.", nome, idade);
            JOptionPane.showMessageDialog(null,message);
        } 
    }
    
}
