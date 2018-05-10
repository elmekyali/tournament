package com.nespresso.sofa.recruitement.tournament.warriors.equipments;

import java.util.List;

class Vicious implements Equipment {
    private int attackCounter = 0;

    @Override
    public int defensePower(int dmg, List<Equipment> equipmentList) {
        return dmg;
    }

    @Override
    public int attackPower() {
        if (attackCounter++ < 2)
            return 20;
        return 0;
    }
}
