package dex.poke;

import java.util.Scanner;

public class PokeDexMain {

    PokeDexMain() {

    }

    public static void main(String[] args) {
        int pokeMon;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the PoKeDex!");
        System.out.println();
        System.out.println("What PoKeMon would you like to learn more about? (enter PoKeDex Number)");
        pokeMon = input.nextInt();

        PokeGenOne call = new PokeGenOne();

        Integer num = pokeMon;

        try {
           System.out.println(call.gen1.get(num));
        }
        catch(NullPointerException e) {
           System.exit(0);
        }
    }
}
