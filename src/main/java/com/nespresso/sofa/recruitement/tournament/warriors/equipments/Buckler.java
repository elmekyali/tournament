package com.nespresso.sofa.recruitement.tournament.warriors.equipments;

import java.util.List;

class Buckler implements Equipment {
    private int receivedDamageCounter;
    private int bucklerLive;

    Buckler() {
        this.receivedDamageCounter = 0;
        this.bucklerLive = 3;
    }

    @Override
    public int defensePower(int damage, List<Equipment> equipmentList) {

        if (canCancelReceivedDamage()) {
            if (equipmentList.stream().anyMatch(equipment -> equipment instanceof Axe)) --bucklerLive;
            return 0;
        }
        return damage;
    }

    @Override
    public int attackPower() {
        return 0;
    }

    private boolean canCancelReceivedDamage() {
        return ++receivedDamageCounter % 2 != 0 && canUseBuckler();
    }

    private boolean canUseBuckler() {
        return bucklerLive > 0;
    }
}
