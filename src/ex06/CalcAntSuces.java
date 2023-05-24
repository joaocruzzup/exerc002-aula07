package ex06;
// Faça um programa que leia um número inteiro e imprima o seu antecessor e seu sucessor.

import java.util.Scanner;

public class CalcAntSuces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("Boas-vindas à Calculadora de Antecessores e Sucessores!");
        System.out.println("-------------------------------------------------");

        System.out.println("Digite um número inteiro: ");
        int numDigitado = sc.nextInt();

        int numAnt = numDigitado - 1;
        int numSuc = numDigitado + 1;

        System.out.printf("O número antecessor é: %d%nO número sucessor é: %d", numAnt, numSuc);

    }
}
