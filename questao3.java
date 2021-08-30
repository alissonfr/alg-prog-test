/* Elabore um programa que leia um valor inicial, o número de períodos (normalmente em meses) e a taxa de juros
(normalmente a.m.) e calcule o valor final a ser pago. */

import java.util.Scanner;

class questao3 {
  public static void main() {
    Scanner entrada = new Scanner(System.in);

    double valorInicial, valorFinal;
    int periodo;
    double taxaDeJuros;

    System.out.print("\n*********CALCULADORA DE JUROS********* \n \n");

    System.out.print("Insira o valor inicial: ");
    valorInicial = entrada.nextInt();

    System.out.print("Insira o período da dívida em meses: ");
    periodo = entrada.nextInt();

    System.out.print("Insira a taxa de juros ao mês: ");
    taxaDeJuros = entrada.nextInt();

    valorFinal = Math.pow((1 + (taxaDeJuros / 100)), periodo) * valorInicial;

    System.out.print("O valor final da parcela é: " + valorFinal);

  }
}