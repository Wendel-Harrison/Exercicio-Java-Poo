package controller;

import java.util.Scanner;

import model.TelefoneCelular;

public class TelefoneCelularController {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a marca do seu celular");
        String marca = entrada.nextLine();

        System.out.println("Digite o modelo do seu celular");
        String modelo = entrada.nextLine();

        System.out.println("Digite a cor do seu celular");
        String cor = entrada.nextLine();

        System.out.println("Digite o ano do seu celular");
        int ano = entrada.nextInt();

        System.out.println("Seu celular está ligado?");
        boolean ligado = entrada.nextBoolean();

        TelefoneCelular celular = new TelefoneCelular(marca, modelo, cor, ano, ligado);

        System.out.println("Marca " + celular.getMarca());
        System.out.println("Modelo " + celular.getModelo());
        System.out.println("Cor " + celular.getCor());
        System.out.println("Ano " + celular.getAno());
        System.out.println("Ligado: " + celular.isLigado());
    }
}
