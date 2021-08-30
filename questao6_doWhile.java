import java.util.Scanner;

class questao6_doWhile {
  public static void main() {
    Scanner entrada = new Scanner(System.in);

    int primeiroValor, segundoValor, terceiroValor;

    System.out.print("\n*********CONTADOR DE NÚMEROS/ESTRUTURAS DE REPETIÇÃO - DoWhile********* \n \n");

    System.out.print("Insira o valor inicial: ");
    primeiroValor = entrada.nextInt();

    System.out.print("Insira o valor final: ");
    segundoValor = entrada.nextInt();

    System.out.print("Insira o valor do passo: ");
    terceiroValor = entrada.nextInt();

    do {
      System.out.print(primeiroValor);
      primeiroValor += terceiroValor;
      System.out.print("\n");
      } while (primeiroValor <= segundoValor);

  }
}