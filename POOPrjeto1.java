/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooprjeto1;

import java.util.Scanner;



/**
 *
 * @author aluno
 */
public class POOPrjeto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = teclado.next();
        
        System.out.println("Informe a idade: ");
        int idade = teclado.nextInt();
        
        System.out.println("Nome:" + nome + "\nIdade:" + idade);
    }
}
