package Modelo;

public class Coin {
    private String name;
    private float pesosValue;
    private CoinType type;

    public Coin(String name, float pesosValue, CoinType type) {
        this.name = name;
        this.pesosValue = pesosValue;
        this.type = type;
    }

    public CoinType getType() {
        return type;
    }

    public float getPesosValue() {
        return pesosValue;
    }
    
    public String toString() {
        return name;
    }
    
}
