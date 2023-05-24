package ex03;

import java.util.Scanner;

public class ConversorUnidades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------------------------------");
        System.out.println("Boas-vindas ao Conversor de Unidades!");
        System.out.println("-------------------------------------------------");

        System.out.println("Digite uma medida em metros");
        double metros = sc.nextDouble();

        double resultado = metros * 100;

        System.out.println("-------------------------------------------------");
        System.out.printf("Resultado: %.2f m equivale %.2f cm", metros, resultado);


    }
}
