import java.util.Scanner;

class questao5_for {
  public static void main() {
    Scanner entrada = new Scanner(System.in);

    int primeiroValor, maiorValor;
    int segundoValor, menorValor;

    System.out.print("\n*********ORGANIZADOR DE NÚMEROS DECRESCENTES - FOR********* \n \n");

    System.out.print("Insira o primeiro número: ");
    primeiroValor = entrada.nextInt();

    System.out.print("Insira o segundo número: ");
    segundoValor = entrada.nextInt();


    if (primeiroValor == segundoValor) {
      System.out.print("ERRO! Os números não podem ser iguais");
    } else {
      if (primeiroValor > segundoValor) {
      for(primeiroValor = primeiroValor; primeiroValor >= segundoValor; primeiroValor--) {
      System.out.print(primeiroValor);
      System.out.print("\n");
    }
      } else {
      for(segundoValor = segundoValor; segundoValor >= primeiroValor; segundoValor--) {
      System.out.print(segundoValor);
      System.out.print("\n");
      }
    }
  }
 }
}