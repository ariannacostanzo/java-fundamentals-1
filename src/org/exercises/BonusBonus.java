package org.exercises;

import java.util.Scanner;

public class BonusBonus {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //ricevo gli input dall'utente
        String userString;
        char userChar;

        System.out.print("Inserisci una frase: ");
        userString = scanner.nextLine();
        System.out.print("Inserisci un carattere: ");
        userChar = scanner.nextLine().charAt(0);

        int lenght = 0;
        int index = -1;
        int maxLenght = 0;
        int indexFound = -1;

        //controllo ogni carattere della stringa
        for (int i = 0; i < userString.length(); i++) {
            //se la lettera della stringa è uguale a quella inserita dall'utente aumento la lunghezza corrente
            if(userString.charAt(i) == userChar) {
                //all'inizio della frase rendo index 0
                if(lenght == 0) {
                    index = i;
                }
                lenght++;
                //se la lettera della stringa non è uguale a quella inserita dall'utente
            } else {
                //se ho già trovato la lettera e quindi lunghezza è maggiore di 0
                if (lenght > 0) {
                    //se la lunghezza è maggiore della massima lunghezza trovata oppure è uguale ma con index maggiore quindi che viene dopo
                    if (lenght > maxLenght || (lenght == maxLenght && index > indexFound)) {
                        //la massima lunghezza diventa quella corrente e l'index anche
                        maxLenght = lenght;
                        indexFound = index;
                    }
                    //riazzero lunghezza ed index
                    lenght = 0;
                    index = -1;
                }
            }

        }
        //controllo anche l'ultima sequenza
        //assegno la lunghezza massima alla lunghezza se quest'ultima è maggiore oppure uguale ma con index maggiore quindi se viene dopo
        if (lenght > maxLenght || lenght == maxLenght && index > indexFound) {
            maxLenght = lenght;
            indexFound = index;
        }

        System.out.println("Lunghezza massima: " + maxLenght);
        System.out.println("Indice(partendo da 1): " + (indexFound + 1));



        scanner.close();

    }
}
