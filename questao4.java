/* Elabore um programa que receba 3 valores A, B e C e informe se estes valores podem formar um triângulo. O ABC é triângulo apenas se A < B + C e B < A + C e C < A + B. */

import java.util.Scanner;

class questao4 {
  public static void main() {
    Scanner entrada = new Scanner(System.in);

    int A, B, C;

    System.out.print("\n*********VERIFICADOR DE TRIANGULOS********* \n \n");

    System.out.print("Insira o valor de A: ");
    A = entrada.nextInt();

    System.out.print("Insira o valor de B: ");
    B = entrada.nextInt();

    System.out.print("Insira o valor de C: ");
    C = entrada.nextInt();

    if (A < B + C && B < A + C && C < A + B) {
      System.out.print("Os valores formam um triângulo!");
    } else {
      System.out.print("Os não valores formam um triângulo!");
    }
  }
}