package util;

import model.classes.Rotation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class RotationReader {

    private final String RESOURCES_PATH = "../resources/";

    public RotationReader(){

    }

    public void init(String classe, String spec) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(RESOURCES_PATH + classe + "_" + spec + ".rota");

    }
}
