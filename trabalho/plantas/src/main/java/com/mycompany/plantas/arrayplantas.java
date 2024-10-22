/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.plantas;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class arrayplantas {
    public static void main(String [] args) {
      Scanner scanner = new Scanner(System.in);
      String[] plantas = new String[10];
      int cont = 0;
      
      while (true) {
        System.out.println("Escolha uma opção");
        System.out.println("1. Adicionar planta");
        System.out.println("2. Listar plantas");
        System.out.println("3. Contar plantas");
        System.out.println("4. Sair");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        
        switch (opcao) {
            case 1:
                if (cont < plantas.length) {
                System.out.print("Digite o nome da planta");
                String planta = scanner.nextLine();
                plantas[cont] = planta;
                cont++;
                System.out.println("Planta adicionada com sucesso!");
               } else {
                System.out.println("O array está cheio! Não é possivel adicionar mais plantas.");
               }
                break;
            case 2:
                System.out.println("Lista de plantas: ");
                for (int i = 0; i < cont; i++) {
                  System.out.println((i + 1) + ". " + plantas[i]);
                }
                break;
            case 3:
                System.out.println("Total de plantas: " + cont);
                break;
            case 4:
                System.out.println("Saindo do sistema...");
                scanner.close();
                return;
            default:
                System.out.println("Opcao invalida! Tente novamente.");
                
              
        }
      }
    }
}
