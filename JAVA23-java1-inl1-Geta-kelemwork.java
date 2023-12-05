// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code..
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // Scanners and varibles
         Scanner boi = new Scanner(System.in);



        myMethod();
    }
    static void myMethod() {
        Random random = new Random();
        Scanner boi = new Scanner(System.in);
        int Anna = random.nextInt(101);
        int Reiko = 0;
        int Maria = 0;
        do {

            Maria++;
            int Tina = boi.nextInt();
            int Daisy = Tina;
            if (Daisy == Anna) {
                Anna = random.nextInt(101);
                System.out.println("ya did it, it took you " + Maria + " tries");
                Maria = 0;
                System.out.println("guess a number between 0 and 100" +
                        " what is your guess");
            } // if its too low then it says this
            else if (Daisy <= Anna) {
                System.out.println("you were close fool but my Number is bigger");

            } //if its too big it will say this
            else if (Daisy >= Anna) {
                System.out.println("way too far dudes! my number is lower");

            } else if (Reiko == 15) {
                System.out.println("you seem to be struggeling here champ. try and increase or decrease your number more slowly.");
            }
        }
        while (Reiko == 0);
    }
        }
       /* for (int Reiko = 0; Reiko < 100 ; Reiko++) {

        // if its correkt it will say this
        if (Daisy == Anna){
        System.out.println("ya did it it took you "+ Reiko + " tries");
        } // if its too low then it says this
      else if (Daisy <= Anna) {
            System.out.println("you were close fool but my Number is bigger");
        } //if its too big it will say this
        else if (Daisy >= Anna) {
                System.out.println("way too far dudes! my number is lower");
            } else if (Reiko == 15) {
            System.out.println("you seem to be struggeling here champ. try and increase or decrease your number more slowly.");
        }
        }*/


