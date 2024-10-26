import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static java.lang.String String;

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(101); // Gera um número entre 0 e 100
        int tentativas = 0;
        int maxTentativas = 5;
        boolean userWon = false;
        int contadorDeTentativas = maxTentativas;



        System.out.printf("Olá e Bem Vindo ao Jogo de Adivinhação!");
        System.out.printf(" Digite seu nome: ");
        String name = read.nextLine();
        System.out.println(name+ ", digite sua tentativa de um número entre 0 a 100:");


        while (tentativas < maxTentativas && tentativas < 5) {
            System.out.println("Você ainda tem " +contadorDeTentativas+ " tentativas.");
            int palpite = read.nextInt();

            tentativas++;
            contadorDeTentativas--;

            if (randomNumber == palpite) {
                userWon = true;
                break;
            } else if (palpite < randomNumber/2) {
                System.out.println("Você está longe, o número é mais alto.");
            } else if (palpite >= randomNumber/2 && palpite <= randomNumber) {
                System.out.println("Você está tão perto! Tente um pouquinho mais alto!");
            }else if (palpite > randomNumber && palpite <= randomNumber *2) {
                System.out.println("tão perto! Tente um pouquinho mais baixo!");
            }else if (palpite > randomNumber *2) {
                System.out.println("Você está longe, o número é mais baixo.");
            }
        }
            if (userWon){
                System.out.println("PARABÉNS!!! Você acertou o número!!!");
            } else {
                System.out.println("Seu número de tentativas acabou, tente novamente.");
                System.out.println("O número era: " + randomNumber);
            }
        }

}