package com.ada.example.segunda.aula.exercicio;

import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class JogoVelha {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String reiniciar = "";

        do {
            try {
                Inicialize();

                System.out.println("Informe o nome do JOGADOR1:");
                String jogador1 = sc.next();
                System.out.println("Informe o nome do JOGADOR2:");
                String jogador2 = sc.next();


                char[][] tabuleiro = {{'1', '2', '3'},
                        {'4', '5', '6'},
                        {'7', '8', '9'}};


                showTabuleiro(tabuleiro);

                boolean verificar = verificaGanhador(tabuleiro, jogador1, jogador2);
                int posicao = 0;
                int n = 0;
                char character;
                String vezDeQuem;


                while ((n <= 9) && verificar == false) {

                    if (n % 2 == 0) {
                        vezDeQuem = jogador1;
                        character = 'X';
                    } else {
                        vezDeQuem = jogador2;
                        character = 'O';
                    }

                    if (n > 8) {
                        System.out.println("AHHHH O JOGO DEU VELHA! EMPATE!!!!");
                        break;
                    }

                    n++;
                    System.out.printf("MOVIMENTO %d: %s ESCOLHA UM NÚMERO correspondente a sua jogada:", n, vezDeQuem);
                    posicao = sc.nextInt();
                    tabComJogada(posicao, tabuleiro, character);
                    verificar = verificaGanhador(tabuleiro, jogador1, jogador2);


                    if (verificar == true) {
                        verificaGanhador(tabuleiro, jogador1, jogador2);
                        System.out.println("Jogo encerrado");
                        break;
                    }

                    while (posicao < 1 || posicao > 9) {
                        System.out.println("Você não escreveu um numero, escreva um número no tabuleiro:");
                        posicao = sc.nextInt();
                        tabComJogada(posicao, tabuleiro, character);
                    }
                }

            } catch (Exception e) {
                System.out.println("Você não digitou um argumento válido\n:( VAMOS ENCERRAR O JOGO :(.");
                System.exit(0);
            }

            System.out.println("Deseja encerrar o jogo? Escreva: SIM para encerrar e NÃO para continuar.");
            reiniciar = sc.next().toUpperCase();
            if (reiniciar.equalsIgnoreCase("SIM")) {
                System.out.println("OK! Jogo encerrado até a próxima");
                System.exit(0);
            }
        } while (reiniciar != "SIM");


    }


    public static void Inicialize() {
        System.out.println("__________________________________________________\n" +
                "|                OKUBARO´S GAMES                 |\n" +
                "|                 JOGO DA VELHA                  |\n" +
                "|________________________________________________|");
        System.out.println("O jogo do dia:" + DateFormat.getDateInstance().format(new Date()) + "\n*PRECISAMOS DE 2 JOGADORES PARA INICIAR O JOGO*");
    }

    public static void showTabuleiro(char[][] tabuleiro) {

        for (char[] row : tabuleiro) {
            for (char collumn : row) {
                System.out.print(collumn + "   ");
            }
            System.out.println();
        }
    }


    public static void tabComJogada(int posicao, char[][] tabuleiro, char character) {

        switch (posicao) {
            case 1:
                tabuleiro[0][0] = character;
                showTabuleiro(tabuleiro);
                break;
            case 2:
                tabuleiro[0][1] = character;
                showTabuleiro(tabuleiro);
                break;
            case 3:
                tabuleiro[0][2] = character;
                showTabuleiro(tabuleiro);
                break;
            case 4:
                tabuleiro[1][0] = character;
                showTabuleiro(tabuleiro);
                break;
            case 5:
                tabuleiro[1][1] = character;
                showTabuleiro(tabuleiro);
                break;
            case 6:
                tabuleiro[1][2] = character;
                showTabuleiro(tabuleiro);
                break;
            case 7:
                tabuleiro[2][0] = character;
                showTabuleiro(tabuleiro);
                break;
            case 8:
                tabuleiro[2][1] = character;
                showTabuleiro(tabuleiro);
                break;
            case 9:
                tabuleiro[2][2] = character;
                showTabuleiro(tabuleiro);
                break;

            default:
                break;
        }
    }

    public static boolean verificaGanhador(char[][] tabuleiro, String jogador1, String jogador2) {

        if (tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X') {
            System.out.println(jogador1 + " VENCEU A PARTIDA!");
            return true;
        } else if (tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X') {
            System.out.println(jogador1 + " VENCEU A PARTIDA!");
            return true;
        } else if (tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X') {
            System.out.println(jogador1 + " VENCEU A PARTIDA!");
            return true;
        } else if (tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X') {
            System.out.println(jogador1 + " VENCEU A PARTIDA!");
            return true;
        } else if (tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X') {
            System.out.println(jogador1 + " VENCEU A PARTIDA!");
            return true;
        } else if (tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X') {
            System.out.println(jogador1 + " VENCEU A PARTIDA!");
            return true;
        } else if (tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X') {
            System.out.println(jogador1 + " VENCEU A PARTIDA!");
            return true;
        } else if (tabuleiro[0][2] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][0] == 'X') {
            System.out.println(jogador1 + " VENCEU A PARTIDA!");
            return true;
        }

        if (tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O') {
            System.out.println(jogador2 + " VENCEU A PARTIDA!");
            return true;
        } else if (tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O') {
            System.out.println(jogador2 + " VENCEU A PARTIDA!");
            return true;
        } else if (tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O') {
            System.out.println(jogador2 + " VENCEU A PARTIDA!");
            return true;
        }

        if (tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O') {
            System.out.println(jogador2 + " VENCEU A PARTIDA!");
            return true;
        } else if (tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O') {
            System.out.println(jogador2 + " VENCEU A PARTIDA!");
            return true;
        } else if (tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O') {
            System.out.println(jogador2 + " VENCEU A PARTIDA!");
            return true;
        }

        if (tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O') {
            System.out.println(jogador2 + " VENCEU A PARTIDA!");
            return true;
        } else if (tabuleiro[0][2] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][0] == 'O') {
            System.out.println(jogador2 + " VENCEU A PARTIDA!");
            return true;
        }

        return false;
    }

}
