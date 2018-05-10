package com.nespresso.sofa.recruitement.tournament.warriors.equipments;

import java.util.List;

class Sword implements Equipment {
    private static final int DEFAULT_DAMAGE = 5;

    @Override
    public int defensePower(int damage, List<Equipment> equipmentList) {
        return damage;
    }

    @Override
    public int attackPower() {
        return DEFAULT_DAMAGE;
    }
}
