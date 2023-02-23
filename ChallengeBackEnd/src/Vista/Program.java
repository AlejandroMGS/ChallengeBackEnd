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
                    int cant = -1;

                    do{
                        String _cant = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir");
                        
                        try {
                            cant = Integer.parseInt(_cant);
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Ingrese sólo números");
                        }
                    }while(cant == -1);
                    
                    

                    break;

                case C_Temperatura:

                    break;
            }
            
            int opc = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Question", JOptionPane.YES_NO_CANCEL_OPTION);
            
            switch(opc) {
                case JOptionPane.NO_OPTION:
                    cicle = false;
                    break;
                    
                default:
                    break;
            }
            
        }while(cicle);

    }
}
