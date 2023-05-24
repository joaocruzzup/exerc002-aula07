package ex05;

import java.util.Scanner;

public class CalculadoraTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------------------------------");
        System.out.println("Boas-vindas à Calculadora de Temperaturas!");
        System.out.println("-------------------------------------------------");

        System.out.println("Digite uma temperatura em Fahrenheit: ");
        double tempF = sc.nextDouble();

        double tempC = (tempF - 32) / 1.8;

        System.out.println("-------------------------------------------------");
        System.out.printf("Resultado: %.3f ºF equivale a %.3f ºC %n", tempF, tempC);

        System.out.println("-------------------------------------------------");
    }
}
