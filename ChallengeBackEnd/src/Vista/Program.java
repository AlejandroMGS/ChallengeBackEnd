package Vista;

import Modelo.Option;
import Modelo.OptionType;
import javax.swing.JOptionPane;

public class Program {
    
    public static void main(String[] args) {
        
        Boolean cicle = true;
        
        do {
            Object[] opciones = {new Option("Conversor de monedas", OptionType.C_Monedas), new Option("Conversor de temperatura", OptionType.C_Temperatura)};

            Option e = (Option) JOptionPane.showInputDialog(null, "Elija una opción", "input", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            switch (e.getType()) {
                case C_Monedas:
                    int pesos = -1;

                    do{
                        String _pesos = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir");
                        
                        try {
                            pesos = Integer.parseInt(_pesos);
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Ingrese sólo números");
                        }
                    }while(pesos == -1);
                    
                    

                    break;

                case C_Temperatura:

                    break;
            }
            
            
            
            
        }while(cicle);

    }
}
