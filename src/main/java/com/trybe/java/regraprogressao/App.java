package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner newScanner = new Scanner(System.in);

    System.out.println("Digite a quantidade de atividades para cadastrar: ");
    int quantAtividades = Integer.parseInt(newScanner.nextLine());

    double calculaNotaSomaTotal = 0;
    double calculaPesoSomaTotal = 0;

    for (int index = 1; index <= quantAtividades; index++) {
      System.out.println("Digite o nome da atividade " + index + ":");
      String nomeAtividade = newScanner.nextLine();

      System.out.println("Digite o peso da atividade " + index + ":");
      int pesoAtividade = Integer.parseInt(newScanner.nextLine());

      System.out.println("Digite a nota obtida para " + nomeAtividade + ":");
      int notaAtividade = Integer.parseInt(newScanner.nextLine());

      calculaNotaSomaTotal += pesoAtividade * notaAtividade;
      calculaPesoSomaTotal += pesoAtividade;
    }
    double calculaMedia = (double) calculaNotaSomaTotal / (double) calculaPesoSomaTotal;

    if (calculaMedia >= 85.0) {
      System.out.println("Parabéns! Você alcançou " + calculaMedia
          + "%! E temos o prazer de informar que "
          + "você obteve aprovação!");
    } else {
      System.out.println("Lamentamos informar que, "
          + "com base na sua pontuação alcançada neste período, "
          + calculaMedia
          + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    }
  }
}
