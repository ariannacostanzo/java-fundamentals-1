package org.exercises;

import java.util.Scanner;

public class MetGala {

    public static void main(String[] args) {
        //array di ospiti autorizzati
        String[] authorizedGuest = {"Jennifer Lopez", "Zendaya", "Chris Hemsworth", "Bad Bunny", "Cara Delevingne", "Kendall Jenner", "Uma Thurman", "Damiano David", "Luca Guadagnino"};

        //chiedo all'utente come si chiama

        Scanner scanner = new Scanner(System.in);
        System.out.print("Come ti chiami? ");
        String guestName = scanner.nextLine();

        //controllo se l'ospite è autorizzato
        String outcome = "";

        for (int i = 0; i < authorizedGuest.length; i++) {
            if(guestName.equals(authorizedGuest[i])) {
                outcome = "Sei in lista, benvenuto al Met Gala";
                break;
            } else {
                outcome = "Non sei in lista, non puoi entrare!";
            }
        }

        System.out.println(outcome);



        scanner.close();
    }
}
