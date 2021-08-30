import java.util.Scanner;

class questao5_while {
  public static void main() {
    Scanner entrada = new Scanner(System.in);

    int primeiroValor, maiorValor;
    int segundoValor, menorValor;

    System.out.print("\n*********ORGANIZADOR DE NÚMEROS DECRESCENTES - WHILE********* \n \n");

    System.out.print("Insira o primeiro número: ");
    primeiroValor = entrada.nextInt();

    System.out.print("Insira o segundo número: ");
    segundoValor = entrada.nextInt();

    if (primeiroValor == segundoValor) {
      System.out.print("ERRO! Os números não podem ser iguais");
    } else {
      if (primeiroValor > segundoValor) {
      while (primeiroValor >= segundoValor) {
      System.out.print(primeiroValor);
      primeiroValor--;
      System.out.print("\n");
    }
      } else {
        while (segundoValor >= primeiroValor) {
      System.out.print(segundoValor);
      segundoValor--;
      System.out.print("\n");
      }
    }
  }
 }
}