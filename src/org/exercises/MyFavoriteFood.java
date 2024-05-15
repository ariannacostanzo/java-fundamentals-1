package org.exercises;


public class MyFavoriteFood {
    public static void main(String[] args) {

        String[] myFavoriteFood = {"Pizza", "Carbonara", "Sushi", "Hamburger", "Polpette"};

        //lunghezza
        System.out.println("La mia classifica è lunga: " + myFavoriteFood.length);
        System.out.println("Il mio cibo preferito è: " + myFavoriteFood[0]);
        System.out.println("Il cibo che meno preferisco è: " + myFavoriteFood[myFavoriteFood.length - 1]);
        System.out.println("Il cibo che mi piace mediamente è: " + myFavoriteFood[myFavoriteFood.length/2]);
    }
}
