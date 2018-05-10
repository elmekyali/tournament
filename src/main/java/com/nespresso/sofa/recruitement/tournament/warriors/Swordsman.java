package com.nespresso.sofa.recruitement.tournament.warriors;

public class Swordsman extends Warrior {
    private static final int INITIAL_HEALTH = 100;
    private static final String DEFAULT_WEAPON = "sword";

    public Swordsman() {
        super(INITIAL_HEALTH);
        this.equip(DEFAULT_WEAPON);
    }

    public Swordsman(String vicious) {
        super(INITIAL_HEALTH);
        this.equip(vicious);
    }

    public Swordsman equip(String equipmentName) {
        super.addEquipment(equipmentName);
        return this;
    }
}
