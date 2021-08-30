import java.util.Scanner;

class questao6_for {
  public static void main() {
    Scanner entrada = new Scanner(System.in);

    int primeiroValor, segundoValor, terceiroValor;

    System.out.print("\n*********CONTADOR DE NÚMEROS/ESTRUTURAS DE REPETIÇÃO - FOR********* \n \n");

    System.out.print("Insira o valor inicial: ");
    primeiroValor = entrada.nextInt();

    System.out.print("Insira o valor final: ");
    segundoValor = entrada.nextInt();

    System.out.print("Insira o valor do passo: ");
    terceiroValor = entrada.nextInt();

    for (primeiroValor = primeiroValor; primeiroValor <= segundoValor; primeiroValor += terceiroValor) {
      System.out.print(primeiroValor);
      System.out.print("\n");
    }

  }
}