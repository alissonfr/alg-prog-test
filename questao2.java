/* A contribuição para o INSS é calculada da seguinte forma:
• Salário bruto até 3 salários mínimos – 8%;
• Salário bruto acima de 3 salários mínimos – 10%;
• Para as contribuições que seriam maiores que 1 salário mínimo, a importância é limitada a 1 salário mínimo. ( R$ 1.000,00) */

import java.util.Scanner;

class questao2 {
  public static void main() {
    Scanner entrada = new Scanner(System.in);

    double salarioBruto, salarioLiquido;
    double inssMenorQueTres, inssMaiorQueTres;

    System.out.print("\n*********CALCULADORA DE CONTRIBUIÇÃO AO INSS********* \n \n");

    System.out.print("Insira seu salário: ");
    salarioBruto = entrada.nextInt();

    inssMenorQueTres = salarioBruto * 0.08;
    inssMaiorQueTres = salarioBruto * 0.1;

    if (salarioBruto <= 3000) {
      System.out.print("INSS: " + inssMenorQueTres + "\nSalário Líquido: " + (salarioBruto - inssMenorQueTres));
    }
    if (salarioBruto > 3000) {
      if (inssMaiorQueTres >= 1000) {
        System.out.print("INSS: " + 1000 + "\nSalário Líquido: " + (salarioBruto - 1000));
      } else {
        System.out.print("INSS: " + inssMaiorQueTres + "\nSalário Líquido: " + (salarioBruto - inssMaiorQueTres));
      }
    }

  }
}