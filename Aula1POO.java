package aula1poo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Aula1POO {

    //método principal 
    public static void main(String[] args) {
        //Criar objeto Pessoa;
        Pessoa p = new Pessoa();
        //Criar o objeto Scanner para ler do teclado
        Scanner teclado = new Scanner(System.in);
        int c=0,idade,soma=0,maiorid=0,menorid=Integer.MAX_VALUE,cmaiorid=0,cmenorid=0;
        double media=0,percmn=0,percmr=0;
        String nomeMaior = null;
        String nomeMenor = null;
        //Ler a variável nome
        loop: do {
            System.out.println("Informe o nome: (Digite SAIR para finalizar)");
            p.nome = teclado.next();
            if (p.nome.equalsIgnoreCase("sair")) {
                break loop;
            }

            //Ler a variável data de nascimento
            boolean erro = true;
            do {
                System.out.println("Informe a Data de Nascimento: ");
                String dataTexto = teclado.next();
                //Converter de String para Date
                SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
                formatoData.setLenient(false);
                try {
                    p.dataNascimento = formatoData.parse(dataTexto);
                    Calendar dataNasc = Calendar.getInstance();
                    dataNasc.setTime(p.dataNascimento);
                    Calendar hoje = Calendar.getInstance();
                    hoje.getTime();
                    if (hoje.after(dataNasc)) {
                        erro = false;
                    }

                } catch (ParseException ex) {
                    System.out.println("Data Inválida: " + dataTexto);
                    Logger.getLogger(Aula1POO.class.getName()).log(Level.SEVERE, null, ex);
                }
                c++;
                idade = p.calcularIdade();
                soma+=idade;
                
                 if(idade<18){
                    cmenorid++;
                }
                
                if(idade>=18){
                    cmaiorid++;
                }
                
                if(idade<menorid){
                    menorid=idade;
                    nomeMenor = p.nome;
                }
                if(idade>maiorid){
                    maiorid = idade;
                    nomeMaior = p.nome;
                }   
            } while (erro);
            //Imprimir os dados solicitados
            System.out.println(p.imprimir());
        } while (true);
         media = p.calcularMediaIdade(soma, c);
         percmn = p.percmenorid(cmenorid,c);
         percmr = p.percmaiorid(cmaiorid,c);
         System.out.println("Quantidade de pessoas cadastradas: "+c);
         System.out.println("Soma das idades: "+soma);
         System.out.println("Media das idades: "+media);
         System.out.println(nomeMaior+" tem a maior idade com "+maiorid+ " anos ");
         System.out.println(nomeMenor+" tem a menor idade com "+menorid+ " anos ");
         System.out.println("Percentual de pessoas com idade maior ou igual a 18: "+percmr+"%");
         System.out.println("Percentual de pessoas com idade menor que 18: "+percmn+"%");
    }
}