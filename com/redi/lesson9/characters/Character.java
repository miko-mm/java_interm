package com.redi.lesson9.characters;

import com.redi.lesson9.weapons.Weapon;

public class Character {
    private int healthPoints;
    private int damagePoints;
    private Weapon weapon; // type name

    public Character (int damagePoints, Weapon weapon){
        this.damagePoints = damagePoints;
        this.weapon = weapon;
        this.healthPoints = 100;
    }

    public Character (int damagePoints){
        this(damagePoints, null);
    }

    public void attack (Character opponent){
        int damageDealt = weapon == null ? damagePoints : damagePoints + weapon.getDamagePoints();
        if(!opponent.defend()) {
            opponent.healthPoints = opponent.healthPoints - damageDealt;
        }
    }

    public boolean defend (){
        return Math.random() < 0.5;
    }
}
