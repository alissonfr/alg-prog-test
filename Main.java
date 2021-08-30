import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    int questoes, questao5, questao6;

    /* Mini interface para escolher as questões */
    
    System.out.print(
    "\n \nATIVIDADE FINAL - ALGORÍTMOS E PROGRAMAÇÃO 2021.1 \n \n" +
    "\nInsira o número correspondente a questão que você deseja ver: \n" +
    "1. Contador de Cédulas\n" +
    "2. Calculadora de Contribuição ao INSS\n" +
    "3. Calculadora de Juros Compostos\n" +
    "4. Verificador de Triângulos\n" +
    "5. Organizador de Números Decrescentes\n" +
    "6. Contador de Números com Passo\n \n");
    questoes = entrada.nextInt();

  if (questoes == 1) {
    questao1.main();
  }if (questoes == 2) {
    questao2.main();
  }if (questoes == 3) {
    questao3.main();
  }if (questoes == 4) {
    questao4.main();
  }if (questoes == 5) {
    System.out.print("\nQuestão 5 - ORGANIZADOR DE NÚMEROS DECRESCENTES\n\n" +
    "Qual estrutura de repetição você deseja ver?\n" +
    "1. While\n" +
    "2. DoWhile\n" +
    "3. For\n"
    ); questao5 = entrada.nextInt();
    if (questao5 == 1) {
      questao5_while.main();
    } if (questao5 == 2) {
      questao5_doWhile.main();
    } if (questao5 == 3) {
      questao5_for.main();
    } else { if (questao5 > 3){
      System.out.print("ERRO! Você deve escolher um número entre 1 e 3");}
    }
  }if (questoes == 6) {
    System.out.print("\nQuestão 6 - CONTADOR DE NÚMEROS/ESTRUTURAS DE REPETIÇÃO\n\n" +
    "Qual estrutura de repetição você deseja ver?\n\n" +
    "1. While\n" +
    "2. DoWhile\n" +
    "3. For\n"
    ); questao6 = entrada.nextInt();
    if (questao6 == 1) {
      questao6_while.main();
    } if (questao6 == 2) {
      questao6_doWhile.main();
    } if (questao6 == 3) {
      questao6_for.main();
    } else { if (questao6 > 3){
      System.out.print("ERRO! Você deve escolher um número entre 1 e 3");}
    }




  }
}
}