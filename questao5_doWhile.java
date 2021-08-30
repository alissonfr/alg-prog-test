import java.util.Scanner;

class questao5_doWhile {
  public static void main() {
    Scanner entrada = new Scanner(System.in);

    int primeiroValor, maiorValor;
    int segundoValor, menorValor;

    System.out.print("\n*********ORGANIZADOR DE NÚMEROS DECRESCENTES - DoWhile********* \n \n");

    System.out.print("Insira o primeiro número: ");
    primeiroValor = entrada.nextInt();

    System.out.print("Insira o segundo número: ");
    segundoValor = entrada.nextInt();

      if (primeiroValor == segundoValor) {
      System.out.print("ERRO! Os números não podem ser iguais");
    } else {
      if (primeiroValor > segundoValor) {
      do {
      System.out.print(primeiroValor);
      System.out.print("\n");
      primeiroValor--;
      } while (primeiroValor >= segundoValor);
      
    } else {
        do {
      System.out.print(segundoValor);
      System.out.print("\n");
      segundoValor--;
        } while (segundoValor >= primeiroValor);
      }
    }
}
}