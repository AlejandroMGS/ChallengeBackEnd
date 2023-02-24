package Controlador;

import Modelo.Coin;

public class Convertidor {
    
     public static float convertToCoinType(float value, Coin c) {
        return value / c.getPesosValue();
    }

    public static float convertToPesos(float value, Coin c) {
        return c.getPesosValue() * value;
    }
}
