package ex07;
// Faça um Programa que receba o quanto você ganha por hora e o número de horas trabalhadas no mês.
// Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda,
// 8% para o INSS e 5% para o sindicato, faça um programa que nos dê respectivamente:
// Salário bruto. | Quanto pagou ao INSS. | Quanto pagou ao sindicato. |Qual o salário líquido do funcionário.
import java.util.Scanner;

public class CalcSalarioPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double taxaIr = 0.11;
        double taxaInss = 0.08;
        double taxaSind = 0.05;


        System.out.println("-------------------------------------------------");
        System.out.println("Boas-vindas à Calculadora de Salário PLUS!");
        System.out.println("-------------------------------------------------");
        System.out.println("Informações sobre os descontos atuais: \nIR = 11% \nINSS = 8% \nSindicato = 5%");
        System.out.println("-------------------------------------------------");


        System.out.println("Digite quanto você recebe por hora trabalhada: ");
        double valorSalarioHora = sc.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas neste mês: ");
        double horasTrabalhadas = sc.nextDouble();

        double salarioBruto = horasTrabalhadas * valorSalarioHora;
        double pagInss = salarioBruto * taxaInss;
        double pagSind = salarioBruto * taxaSind;
        double pagIr = salarioBruto * taxaIr;
        double salarioLiquido = salarioBruto - pagInss - pagSind - pagIr;

        System.out.println("------------------Resultado--------------------");
        System.out.printf("Seu salário bruto é: %.2f %n", salarioBruto);
        System.out.printf("Será descontado pelo INSS: R$ %.2f %n", pagInss);
        System.out.printf("Será descontado pelo Sindicato: R$ %.2f %n", pagSind);
        System.out.printf("Será descontado pelo Imposto de Renda: R$ %.2f %n", pagIr);
        System.out.printf("Seu salário líquido é: R$ %.2f %n", salarioLiquido);

    }
}
