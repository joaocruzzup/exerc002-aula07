package ex04;

import java.util.Scanner;

public class CalculadoraSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------------------------------");
        System.out.println("Boas-vindas à Calculadora de Salário!");
        System.out.println("-------------------------------------------------");

        System.out.println("Digite a quantidade de horas trabalhadas neste mês: ");
        double horasTrabalhadas = sc.nextDouble();
        System.out.println("Digite quanto você recebe por hora trabalhada: ");
        double valorSalarioHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorSalarioHora;

        System.out.println("-------------------------------------------------");
        System.out.printf("Você receberá %.2f neste mês! %n", salario);
        System.out.println("-------------------------------------------------");



    }
}