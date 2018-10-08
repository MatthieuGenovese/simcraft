package model.classes;

import util.RotationReader;

import java.util.ArrayList;

public class Rotation {

    private ArrayList<Spell> spells;

    public Rotation(Classe classe, String spec){
        RotationReader reader = new RotationReader();
        reader.init(classe.getClass().getName(), spec);
    }
}
