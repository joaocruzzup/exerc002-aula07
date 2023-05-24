
package ex02;
// Faça um programa que receba 4 notas bimestrais e mostre a média aritmética.

import java.util.Scanner;
public class CalcMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------------------------------");
        System.out.println("Boas-vindas à Calculadora de Médias Aritméticas!");
        System.out.println("-------------------------------------------------");

        System.out.println("Digite sua 1ª nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite sua 2ª nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite sua 3ª nota: ");
        double nota3 = sc.nextDouble();
        System.out.println("Digite sua 4ª nota: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("-------------------------------------------------");
        System.out.printf("Sua média é: %.2f %n", media);
        System.out.println("-------------------------------------------------");


        System.out.println("Você gostaria de saber se foi aprovado? \nDigite 'Y' para SIM ou 'N' para NÃO");
        String resposta = sc.next().toUpperCase();

        if (resposta.equals("Y")) {
            System.out.println("Digite a média de corte na sua instituição:");
            double mediaCorte = sc.nextDouble();
            if (media >= mediaCorte){
                System.out.printf("Parabéns! Como sua média foi %.2f Você foi aprovado! %n", media, mediaCorte);
                System.out.println("Programa finalizado.");
            } else {
                System.out.println("Infelizmente com essas notas você está reprovado :/");
                System.out.println("Programa finalizado.");
            }
        }
        else {
            System.out.println("Tudo bem!");
            System.out.println("Programa finalizado.");
        }
    }
}
