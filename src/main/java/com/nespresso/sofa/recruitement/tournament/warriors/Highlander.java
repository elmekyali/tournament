package com.nespresso.sofa.recruitement.tournament.warriors;

import com.nespresso.sofa.recruitement.tournament.warriors.equipments.Equipment;

public class Highlander extends Warrior {
    private static final int INITIAL_HEALTH = 150;
    private static final String DEFAULT_WEAPON = "great sword";
    private static final double PERCENTAGE_TO_DOUBLE_DAMAGE = 0.3;
    private boolean isVeteran = false;

    public Highlander() {
        super(INITIAL_HEALTH);
        this.equip(DEFAULT_WEAPON);
    }

    public Highlander(String veteran) {
        this();
        this.isVeteran = true;
    }

    public Highlander equip(String equipmentName) {
        super.addEquipment(equipmentName);
        return this;
    }

    @Override
    int damage() {
        if(isVeteran && hitPoints() < INITIAL_HEALTH * PERCENTAGE_TO_DOUBLE_DAMAGE)
            return equipments.stream().mapToInt(Equipment::attackPower).sum() * 2;
        return equipments.stream().mapToInt(Equipment::attackPower).sum();
    }


}
