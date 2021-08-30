/* - Elabore um programa que receba um valor e calcule quantas notas de 50, 10 e 1 real são necessárias para pagar este valor. (apenas valores inteiros) */

import java.util.Scanner;

class questao1 {
  public static void main() {
    Scanner entrada = new Scanner(System.in);

    int notas50, notas10, notas1;
    int resto50, resto10, resto1;
    int valorInicial, valorFinal;

    System.out.print("\n *********CONTADOR DE CÉDULAS********* \n \n");

    System.out.print("Insira o valor: ");
    valorInicial = entrada.nextInt();

    notas50 = valorInicial / 50;
    resto50 = valorInicial % 50;

    notas10 = resto50 / 10;
    resto10 = resto50 % 10;

    notas1 = resto10 / 1;
    resto1 = resto10 % 1;

    /*
     * System.out.print("Você vai precisar de: "); System.out.print( notas50 +
     * " notas de R$ 50, " + notas10 + " notas de R$ 10 e " + notas1 +
     * " notas de R$ 1");
     */

    /* Apenas notas de 50 */
    if (notas10 == 0 && notas1 == 0) {
      System.out.print("Você vai precisar de: \n" + notas50 + " notas de R$ 50");
    } else { /* Apenas notas de 10 */
      if (notas50 == 0 && notas1 == 0) {
        System.out.print("Você vai precisar de: \n" + notas10 + " notas de R$ 10");
      } else { /* Apenas notas de 1 */
        if (notas50 == 0 && notas10 == 0) {
          System.out.print("Você vai precisar de: \n" + notas1 + " notas de R$ 1");
        } else { /* Notas de 50 e 10 */
          if (notas1 == 0 && notas10 >= 1 && notas50 >= 1) {
            System.out.print(
              "Você vai precisar de: \n" + 
              notas50 + " notas de R$ 50\n" + 
              notas10 + " notas de R$ 10\n");
          } else { /* Notas de 50 e 1 */
            if (notas1 >= 1 && notas10 == 0 && notas50 >= 1) {
              System.out.print(
                "Você vai precisar de: \n" +
                 notas50 + " notas de R$ 50\n" + 
                 notas1 + " notas de R$ 1\n");
            } else { /* Notas de 10 e 1 */
              if (notas1 >= 1 && notas10 >= 1 && notas50 == 0) {
                System.out.print(
                  "Você vai precisar de: \n" +
                   notas50 + " notas de R$ 50\n" + 
                   notas1 + " notas de R$ 1\n");
              } else { /* Notas de 50, 10 e 1 */
                  System.out.print(
                    "Você vai precisar de: \n" +
                    notas50 + " notas de R$ 50\n" + 
                    notas10 + " notas de R$ 10\n" +
                    notas1 + " notas de R$ 1\n");
              }
            }
          }
        }
      }
    }

  }
}