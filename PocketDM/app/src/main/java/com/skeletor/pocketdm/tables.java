package com.skeletor.pocketdm;

import android.support.annotation.NonNull;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Andrew on 11/8/2017.
 * This file is for storing the tables translated from C to Java
 */


public class tables {
    int roll;
    String outcome;
}

class critTable extends tables {
    String weapon;

    Map<Integer, String> slashingTable = new HashMap<Integer, String>() {{
        put(1, "2x damage.");
        put(31, "2x damage, chance shield breaks d2.");
        put(41, "3x damage.");
        put(66, "3x damage, chance shield breaks d2.");
        put(70, "Hand slashed open, -1 to combat.");
        put(71, "Lose 1 finger.");
        put(72, "Lose 1d4 fingers, hand incapacitated.");
        put(73, "Foot slashed open, 1/2 move speed.");
        put(74, "Lose 1d2 toes, 1/2 move speed.");
        put(75, "Leg slashed open, 1/2 move speed.");
        put(76, "Leg removed at ankle.");
        put(77, "Leg removed at knee.");
        put(78, "Leg removed just below hip.");
        put(79, "Wrist removed.");
        put(80, "Elbow removed.");
        put(81, "Arm removed just below shoulder.");
        put(82, "Abdomen ripped open, guts hanging out, roll STR or fall.");
        put(83, "Abdomen ripped open, guts hanging out, stunned 1 round.");
        put(84, "Abdomen ripped open, death.");
        put(85, "Lung slashed, -1 to combat.");
        put(86, "Rib broken, stunned 1 round.");
        put(87, "Chest slashed open, death.");
        put(88, "Throat cut, no speech.");
        put(90, "Chest slashed, opponent takes -2 to combat.");
        put(91, "Throat cut, death.");
        put(93, "Eye removed, stunned for 1 round.");
        put(94, "Stabbed through the eye and brain, death.");
        put(95, "Ear removed, stunned for 1 round.");
        put(96, "Ear removed and shoulder cut. Immobilized, with three rounds until blood loss death.");
        put(97, "Nose shattered.");
        put(98, "Teeth shattered.");
        put(99, "Decapitated, death.");
        put(100, "Cut in two, death.");
    }};
}
