package ex04;
// Faça um Programa que recebe o quanto você ganha por hora e o número de horas trabalhadas no mês.
// Calcule e mostre o total do seu salário no referido mês.

import java.util.Scanner;

public class CalcSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------------------------------");
        System.out.println("Boas-vindas à Calculadora de Salário!");
        System.out.println("-------------------------------------------------");

        System.out.println("Digite quanto você recebe por hora trabalhada: ");
        double valorSalarioHora = sc.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas neste mês: ");
        double horasTrabalhadas = sc.nextDouble();

        double salario = horasTrabalhadas * valorSalarioHora;

        System.out.println("-------------------------------------------------");
        System.out.printf("Você receberá %.2f neste mês! %n", salario);
        System.out.println("-------------------------------------------------");

    }
}
