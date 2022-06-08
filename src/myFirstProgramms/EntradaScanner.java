package myFirstProgramms;

import java.util.Scanner;

public class EntradaScanner {
    public static void main(String[] args) {
        
        //Recuperação de dados feita na Chamada do Programa
        //System.out.println(args[0]);  args[0] (percorre um array e busca a primeira posição - '0')

        //Recuperação de dados através de uma Interação com o Usuário
        Scanner sc = new Scanner(System.in); //cria um objeto 'sc' do tipo Scanner
        System.out.println("Por favor, informe o seu nome");
        String nome = sc.nextLine(); // recupera a informação digitava pelo usuário e guarda em uma variável
        System.out.println("Ola " + nome + " seja bem-vindo!");
    }
}

/*
    ENTRADA DO USUÁRIO

    - Chamada : java.lang (classe visivel no java)
    - Scanner : java.util (classe não visivel no java, necessário a importação)
    - Documentação
 
 */

