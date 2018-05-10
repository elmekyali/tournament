package com.nespresso.sofa.recruitement.tournament.warriors.equipments;

public class EquipmentFactory {
    public Equipment getEquipment(String equipmentName) {
        switch (equipmentName) {
            case "buckler":
                return new Buckler();
            case "axe":
                return new Axe();
            case "sword":
                return new Sword();
            case "great sword":
                return new GreatSword();
            case "armor":
                return new Armor();
            case "Vicious":
                return new Vicious();
        }

        return null;
    }
}
