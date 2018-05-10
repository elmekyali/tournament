package com.nespresso.sofa.recruitement.tournament.warriors.equipments;

import java.util.List;

class Armor implements Equipment {
    @Override
    public int defensePower(int damage, List<Equipment> equipmentList) {
        return damage > 0 ? damage - 3 : damage;
    }

    @Override
    public int attackPower() {
        return - 1;
    }
}
