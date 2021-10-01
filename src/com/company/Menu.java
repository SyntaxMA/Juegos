package com.company;

import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);
    Dadosvs dadosvs;
    JocDaus jocDaus;
    Ajustes ajustes;

    public Menu(Dadosvs dadosvs, Ajustes ajustes) {
        this.dadosvs = dadosvs;
        this.jocDaus = jocdaus;
        this.ajustes = ajustes;
    }

    public void show() {
        menuJuegos();
    }


    private void menuJuegos() {
        int option;
        do {
            System.out.println("****************");
            System.out.println("*   MINIJUEGO  *");
            System.out.println("****************");
            System.out.println("*  1. Dados    *");
            System.out.println("*  2. Dados-VS *");
            System.out.println("*  3. Salir    *");
            System.out.println("****************");

            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    menuDados();
                    break;
                case 2:
                    menuDadosVS();
                    break;
                case 3:
                    System.out.println("¡Vuelve pronto!");
                    break;
                default:
                    System.out.println("Por favor elija solo entre 1,2 o 3");
            }
        }while(option != 3);
    }

    private void menuDados() {
        int option;
        do {
            System.out.println("****************");
            System.out.println("*     DADOS    *");
            System.out.println("****************");
            System.out.println("*  1. Jugar    *");
            System.out.println("*  2. Ajustes  *");
            System.out.println("*  3. Salir    *");
            System.out.println("****************");

            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    jocDaus.play();
                    break;
                case 2:
                    settingsDados();
                    break;
                case 3:
                    //exitSettings();
                    break;
                default:
                    System.out.println("Por favor elija solo entre 1,2 o 3");
            }
        }while(option != 3);
    }

    private void menuDadosVS() {
        int option;
        do {
            System.out.println("****************");
            System.out.println("*   DADOS-VS   *");
            System.out.println("****************");
            System.out.println("*  1. Jugar    *");
            System.out.println("*  2. Ajustes  *");
            System.out.println("*  3. Salir    *");
            System.out.println("****************");

            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    dadosvs.play();
                    break;
                case 2:
                    settingsDadosVS();
                    break;
                case 3:
                    //exitSettings();
                    break;
                default:
                    System.out.println("Por favor elija solo entre 1,2 o 3");
            }
        }while(option != 3);
    }

    private void settingsDadosVS() {
        int option;
        do {
            System.out.println("****************");
            System.out.println("*    AJUSTES   *");
            System.out.println("****************");
            System.out.println("* 1. Jugadores *");
            System.out.println("* 2. Juego     *");
            System.out.println("* 3. Volver    *");
            System.out.println("****************");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    playerSettings();
                    break;
                case 2:
                    ajustesvs();
                    break;
                case 3:
                    //exitSettings();
                    break;
                default:
                    System.out.println("Por favor elija solo entre 1,2 o 3");
            }
        }while(option != 3);
    }

    private void settingsDados() {
        int option;
        do {
            System.out.println("****************");
            System.out.println("*    AJUSTES   *");
            System.out.println("****************");
            System.out.println("* 1. Dicultad  *");
            System.out.println("* 2. Volver    *");
            System.out.println("****************");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    settingsDados();
                    break;
                case 2:
                    //exitSettings();
                    break;
                default:
                    System.out.println("Por favor elija solo entre 1 o 2");
            }
        }while(option != 2);
    }

    private void playerSettings() {
        int njug;
        System.out.print("Numero de jugadores" + "(Màxim " + Dadosvs.MAX_PLAYERS + ")? ");
        njug = sc.nextInt();
        while (njug > Dadosvs.MAX_PLAYERS){
            System.out.println("Numero de jugadores no permitido");
            System.out.println("Numero de jugadores" + "(Màxim "+ Dadosvs.MAX_PLAYERS + ")? ");
            njug = sc.nextInt();
        }
        System.out.println("Jugadores seleccionados: " + njug);
        ajustes.setNumPlayers(njug);
    }

    private void ajustesvs() {
        int level;
        System.out.print("Elige la dificultad (1-5): ");
        level = sc.nextInt();
        while (level > Dadosvs.MAX_DIFFICULT){
            System.out.println("Dificultad no permitida");
            System.out.println("Elige la dificultad (1-" + Dadosvs.MAX_DIFFICULT + "): ");
            level = sc.nextInt();
        }
        ajustes.setLevel(level);
    }

}