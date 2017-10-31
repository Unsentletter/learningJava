package com.Tristan;

public class Main {

    // THE WRNOG WAY TO DO THINGS

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Trit";
//        player.health = 20;
//        player.weapon = "Pork Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//

//        EnhancedPlayer player = new EnhancedPlayer("Trit", 500, "Pork sword");
//        System.out.println("Initial health is " + player.getHealth());

        Printer printer = new Printer(100, 5, false);
        System.out.println("Initial Toner level is " + printer.checkTonerLevels());
        printer.printPage(5, true);
        System.out.println("Initial Toner level is " + printer.checkTonerLevels());
        printer.fillToner(4);
        System.out.println("Initial Toner level is " + printer.checkTonerLevels());

    }
}