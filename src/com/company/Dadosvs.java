package com.company;

import java.util.Scanner;

public class Dadosvs {
    public final static int MAX_PLAYERS = 4;
    public final static int MAX_DIFFICULT = 5;
    private Scanner sc = new Scanner(System.in);

    private Ajustes ajustes;
    private Menu menu;
    private Player[] playersList;

    Player player;
    String nombrejug;
    String nombrejug2;


    private int dado1;
    private int dado2;

    public Dadosvs() {
        playersList = new Player[MAX_PLAYERS];
        ajustes = new Ajustes(playersList);
        menu = new Menu(this, ajustes);
    }

    public void start() {
        menu.show();
    }

    public void play() {
        System.out.println("Nivel de juego: " + ajustes.getLevel());

        // *************** UN JUGADOR *****************************
        if (ajustes.getNumPlayers() == 1){
            System.out.println("Hay " + ajustes.getNumPlayers() + " jugador");
            System.out.println("Cual es tu nombre Jugador 1?");
            nombrejug = sc.nextLine();
            //player.setName(nombrejug);
            System.out.println("Bienvenido " + nombrejug + "!");
            System.out.println("Jugando...");
            System.out.println();

            dado1 = (int)(Math.random() * 6) + 1;
            System.out.println("TIRANDO PRIMER DADO...!");
            System.out.println(nombrejug + " ha sacado un " + dado1 +"!");
            System.out.println();

            dado2 = (int)(Math.random() * 6) + 1;
            System.out.println("TIRANDO SEGUNDO DADO...!");
            System.out.println("La IA ha sacado un " + dado2 +"!");
            System.out.println();


            if (dado1 > dado2){
                System.out.println(nombrejug + " GANA la partida!");
            } else if (dado2 > dado1){
                System.out.println(nombrejug + " PIERDE la partida!");
            } else {
                System.out.println("¡TENEMOS UN EMPATE!");
            }
        // *************** DOS JUGADORES *****************************
        }else if (ajustes.getNumPlayers() == 2) {
            System.out.println("Hay " + ajustes.getNumPlayers() + " jugadores");
            System.out.println("Cual es tu nombre Jugador 1?");
            nombrejug = sc.nextLine();
            System.out.println("Bienvenido " + nombrejug + "!");
            System.out.println("Cual es tu nombre Jugador 2?");
            nombrejug2 = sc.nextLine();
            System.out.println("Bienvenido " + nombrejug2 + "!");

            System.out.println("Jugando...");
            System.out.println();

            dado1 = (int)(Math.random() * 6) + 1;
            System.out.println("TIRANDO PRIMER DADO...!");
            System.out.println(nombrejug + " ha sacado un " + dado1 +"!");
            System.out.println();

            dado2 = (int)(Math.random() * 6) + 1;
            System.out.println("TIRANDO SEGUNDO DADO...!");
            System.out.println(nombrejug2 + " ha sacado un " + dado2 +"!");
            System.out.println();

            if (dado1 > dado2){
                System.out.println(nombrejug + " GANA la partida!");
            } else if (dado2 > dado1){
                System.out.println(nombrejug2 + " GANA la partida!");
            }
            while (dado1 == dado2){
                System.out.println("¡TENEMOS UN EMPATE!");
                System.out.println("¡REPITIENDO TIRADA!");

                dado1 = (int)(Math.random() * 6) + 1;
                System.out.println("TIRANDO PRIMER DADO...!");
                System.out.println(nombrejug + " ha sacado un " + dado1 +"!");
                System.out.println();

                dado2 = (int)(Math.random() * 6) + 1;
                System.out.println("TIRANDO SEGUNDO DADO...!");
                System.out.println(nombrejug2 + " ha sacado un " + dado2 +"!");
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("¡Gracias por jugar!");
        System.out.println();

    }
}

