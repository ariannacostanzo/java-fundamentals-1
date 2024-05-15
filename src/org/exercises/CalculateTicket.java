package org.exercises;

import java.util.Scanner;

public class CalculateTicket {
    public static void main(String[] args) {
        //chiedo all'utente età e quanti chilometri vuole percorrere
        Scanner scanner = new Scanner(System.in);

        //inizializzo le variabili
        int kilometers, age, discountForMinors, discountForElders;
        double priceForKm = 0.21;
        discountForMinors = 20;
        discountForElders = 40;

        System.out.print("Quanti kilometri vuoi percorrere? ");
        kilometers = Integer.parseInt(scanner.nextLine());
        System.out.print("Quanti anni hai? ");
        age = Integer.parseInt(scanner.nextLine());

        //calcolo il biglietto

        double basePrice = priceForKm * kilometers;
        double discount = 0;

        if (age < 18) {
            discount = basePrice * discountForMinors / 100;
            System.out.println("E' stato applicato uno sconto del " + discountForMinors + "%");
        } else if (age > 65) {
            discount = basePrice * discountForElders / 100;
            System.out.println("E' stato applicato uno sconto del " + discountForElders + "%");
        }

        basePrice = basePrice - discount;


        System.out.println("Il prezzo del tuo biglietto è: " + basePrice + "€");

        scanner.close();

    }
}
