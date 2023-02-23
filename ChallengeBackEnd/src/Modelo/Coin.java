package Modelo;

public class Coin implements ICoin{
    private String name;
    private int pesosValue;
    private CoinType type;

    public Coin(String name, int pesosValue, CoinType type) {
        this.name = name;
        this.pesosValue = pesosValue;
        this.type = type;
    }

    public CoinType getType() {
        return type;
    }

    @Override
    public float convertToCoinType(int value) {
        return value / pesosValue;
    }

    @Override
    public int convertToPesos(float value) {
        return (int)(pesosValue * value);
    }
    
    
}
