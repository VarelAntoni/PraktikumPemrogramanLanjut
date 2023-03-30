package PraktikumPemrogramanLanjut3;

import java.util.Scanner;

public class MainBattleHero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Hero Player1 = new Hero();
        Hero Player2 = new Hero("BOSS", 100, 60, 20);

        System.out.println("====Hero Battle!====");
        System.out.println("Make Your Character!");
        System.out.println("Name?");
        Player1.setName(input.nextLine());
        System.out.println("Health Point?");
        Player1.setHP(input.nextInt());
        System.out.println("Attack Power?");
        Player1.setAttack(input.nextDouble());
        System.out.println("Defence Power?");
        Player1.setDefence(input.nextDouble());

        Player2.display();

        int i = 0;
        while (Player1.getHP() > 0 && Player2.getHP() > 0) {
            i++;
            System.out.println("\nWar Round " + (i));
            Player1.Attack(Player2);
            Player1.display();
            Player2.display();
            if (Player2.getHP() <= 0) {
                System.out.println();
                System.out.println(Player2.getName() + " Defeated ");
                System.out.println("YOU WIN");
                break;
            }
            System.out.println("\nWar Round " + (i + 1));
            Player2.Attack(Player1);
            Player1.display();
            Player2.display();
            if (Player1.getHP() <= 0) {
                System.out.println();
                System.out.println(Player1.getName() + " Defeated");
                System.out.println("YOU LOSE");
                break;
            }
            i++;
        }
        System.out.println("END");
        input.close();
    }
}

