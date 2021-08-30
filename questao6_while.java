import java.util.Scanner;

class questao6_while {
  public static void main() {
    Scanner entrada = new Scanner(System.in);

    int primeiroValor, segundoValor, terceiroValor;

    System.out.print("\n*********CONTADOR DE NÚMEROS/ESTRUTURAS DE REPETIÇÃO - WHILE********* \n \n");

    System.out.print("Insira o valor inicial: ");
    primeiroValor = entrada.nextInt();

    System.out.print("Insira o valor final: ");
    segundoValor = entrada.nextInt();

    System.out.print("Insira o valor do passo: ");
    terceiroValor = entrada.nextInt();

    while (primeiroValor <= segundoValor) {
      System.out.print(primeiroValor);
      primeiroValor += terceiroValor;
      System.out.print("\n");
      }

  }
}