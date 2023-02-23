package Vista;

import Modelo.Option;
import Modelo.OptionType;
import javax.swing.JOptionPane;

public class Program {
    
    public static void main(String[] args) {
        
        Object[] opciones = {new Option("Conversor de monedas", OptionType.C_Monedas), new Option("Conversor de temperatura", OptionType.C_Temperatura)};

        Option e = (Option) JOptionPane.showInputDialog(null, "Elija una opción", "input", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

    }
}
