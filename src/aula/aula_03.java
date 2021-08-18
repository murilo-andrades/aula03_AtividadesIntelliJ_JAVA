package aula;

import java.util.Scanner;

public class aula_03 {
    //algumas variáveis aqui!
    public static void main(String[] args) {
        //codigo variaves //codigo e variaveis
        // usando a classe scanner para entrada

        Scanner teclado = new Scanner(System.in);
        double preco;
        double porcentagem;
        double desconto;
        double precoComDesconto;

        System.out.println("Digite o valor do produto:");
        preco = teclado.nextFloat();
        System.out.println("Digite a porcentagem do desconto:");
        porcentagem = teclado.nextFloat();
        desconto = preco*porcentagem/100;
        precoComDesconto = preco-desconto;

        System.out.println("Valor do produto: "+ preco);
        System.out.println("Valor do desconto: "+ porcentagem);
        System.out.println("Valor do produto com desconto: "+precoComDesconto);

    }

}
