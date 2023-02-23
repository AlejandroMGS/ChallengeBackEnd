package Modelo;

public class Option {
    private String name;
    private OptionType type;

    public Option(String name, OptionType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public OptionType getType() {
        return type;
    }
    
    public String toString() {
        return name;
    }
}
