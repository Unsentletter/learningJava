package com.Tristan;

public class EnhancedPlayer {

    private String name;
    private String weapon;
    private int hitPoints;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;

        if (this.hitPoints <= 0) {
            System.out.println("Player ded");
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
