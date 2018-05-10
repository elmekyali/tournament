package com.nespresso.sofa.recruitement.tournament.warriors.equipments;

import java.util.List;

class GreatSword implements Equipment {
    private static final int DEFAULT_DAMAGE = 12;
    private int attackCounter = 0;

    @Override
    public int defensePower(int damage, List<Equipment> equipmentList) {
        return damage;
    }

    @Override
    public int attackPower() {
        if (++attackCounter % 3 == 0) return 0;
        return DEFAULT_DAMAGE;
    }
}
