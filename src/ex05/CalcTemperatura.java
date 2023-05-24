package ex05;
// Faça um programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.

import java.util.Scanner;

public class CalcTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------------------------------");
        System.out.println("Boas-vindas à Calculadora de Temperaturas!");
        System.out.println("-------------------------------------------------");

        System.out.println("Digite uma temperatura em Fahrenheit: ");
        double tempF = sc.nextDouble();

        double tempC = (tempF - 32) / 1.8;

        System.out.println("-------------------------------------------------");
        System.out.printf("Resultado: %.3fºF equivale a %.3fºC %n", tempF, tempC);

        System.out.println("-------------------------------------------------");

    }
}
