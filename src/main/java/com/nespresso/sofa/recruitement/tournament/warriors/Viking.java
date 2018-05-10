package com.nespresso.sofa.recruitement.tournament.warriors;


public class Viking extends Warrior {
    private static final int INITIAL_HEALTH = 120;
    private static final String DEFAULT_WEAPON = "axe";

    public Viking() {
        super(INITIAL_HEALTH);
        this.equip(DEFAULT_WEAPON);
    }

    public Viking equip(String equipmentName) {
        super.addEquipment(equipmentName);
        return this;
    }
}
