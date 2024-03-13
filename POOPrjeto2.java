/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooprjeto1;

import java.util.Scanner;
import javax.swing.JOptionPane;



/**
 *
 * @author aluno
 */
public class POOPrjeto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome, mensagem = "";
        int idade;
        
        nome = JOptionPane.showInputDialog("Digite o nome: ");
        String resposta = JOptionPane.showInputDialog("Digite a idade ");
        idade = Integer.parseInt(resposta);
        resposta = JOptionPane.showInputDialog("Digite a situa��o: (ativa/inativa) ");

        if (!resposta.equalsIgnoreCase("ativa")) {
            mensagem = "Usu�rio inativo no sistema!";
        } else if (idade < 18) {
            mensagem = "Pessoa menor idade! Precisa de um respons�vel.";
        } else {
           mensagem = "Pessoa maior de idade!";
        }

        JOptionPane.showMessageDialog(null,"Nome: " + nome + "\nIdade: " + idade + "\n" + mensagem);
    }
}