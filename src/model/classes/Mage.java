package model.classes;

import model.gear.Equipment;

import java.util.ArrayList;

public class Mage implements Classe {

    private String spec;

    private ArrayList<Equipment> gear;

    private Rotation rotation;

    public Mage (String spec, Rotation rotation, ArrayList<Equipment> equipment){
        this.spec = spec;
        this.rotation = rotation;
        this.gear = equipment;
    }
}
