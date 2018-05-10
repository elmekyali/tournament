package com.nespresso.sofa.recruitement.tournament.warriors;

import com.nespresso.sofa.recruitement.tournament.warriors.equipments.Equipment;
import com.nespresso.sofa.recruitement.tournament.warriors.equipments.EquipmentFactory;

import java.util.ArrayList;
import java.util.List;

abstract class Warrior {
    protected List<Equipment> equipments;
    private int hitPoints;

    Warrior(int hitPoints) {
        this.equipments = new ArrayList<>();
        this.hitPoints = hitPoints;
    }

    public void engage(Warrior enemy) {
        while (this.isLive() && enemy.isLive()) {
            enemy.obtainAttackFrom(this);
            if (enemy.isLive()) {
                this.obtainAttackFrom(enemy);
            }
        }
    }

    public int hitPoints() {
        return hitPoints;
    }

    private boolean isLive() {
        return hitPoints > 0;
    }

    void addEquipment(String equipmentName) {
        EquipmentFactory equipmentFactory = new EquipmentFactory();
        Equipment equipment = equipmentFactory.getEquipment(equipmentName);
        equipments.add(equipment);
    }

    private void obtainAttackFrom(Warrior enemy) {
        int damage = enemy.damage();
        for (Equipment equipment : equipments) {
            damage = equipment.defensePower(damage, enemy.equipments);
            if (damage <= 0) break;
        }
        hitPoints = hitPoints - damage < 0 ? 0 : hitPoints - damage;
    }

    int damage() {
        return equipments.stream().mapToInt(Equipment::attackPower).sum();
    }
}
