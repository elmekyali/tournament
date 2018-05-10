package com.nespresso.sofa.recruitement.tournament.warriors.equipments;

import java.util.List;

public interface Equipment {
    int defensePower (int dmg , List<Equipment> equipmentList);
    int attackPower ();
}
