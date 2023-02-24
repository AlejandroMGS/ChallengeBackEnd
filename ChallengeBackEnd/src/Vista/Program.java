package Vista;

import Controlador.Convertidor;
import Modelo.Coin;
import Modelo.CoinType;
import Modelo.Option;
import Modelo.OptionType;
import javax.swing.JOptionPane;

public class Program {
    
    public static void main(String[] args) {
        
        Boolean cicle = true;
        
        do {
            Object[] opciones = { new Option("Conversor de monedas", OptionType.C_Monedas), 
                                new Option("Conversor de temperatura", OptionType.C_Temperatura) };

            Option e = (Option) JOptionPane.showInputDialog(null, "Elija una opción", "Menú", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            
            if(e==null) break;

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
                    
                    Object[] oCoins = { new Coin("Pesos a Dolar", 804.3f, CoinType.Dolar),
                                        new Coin("Pesos a Euro", 852.31f, CoinType.Euro),
                                        new Coin("Pesos a Libra", 966.33f, CoinType.Libras),
                                        new Coin("Pesos a Won Coreano", 0.62f, CoinType.Won_Coreano),
                                        new Coin("Pesos a Yen", 5.97f, CoinType.Yen),
                                        new Coin("Pesos a Yuan", 116.04f, CoinType.Yuan),
                                        new Coin("Dolar a Pesos", 804.3f, CoinType.Dolar_R),
                                        new Coin("Euro a Pesos", 852.31f, CoinType.Euro_R),
                                        new Coin("Libra a Pesos", 966.33f, CoinType.Libras_R),
                                        new Coin("Won Coreano a Pesos", 0.62f, CoinType.Won_Coreano_R),
                                        new Coin("Yen a Pesos", 5.97f, CoinType.Yen_R),
                                        new Coin("Yuan a Pesos", 116.04f, CoinType.Yuan_R)};
                    
                    Coin c = (Coin)JOptionPane.showInputDialog(null, "Escoja la moneda a la que desea convertir", "Monedas", JOptionPane.QUESTION_MESSAGE, null, oCoins, oCoins[0]);
                    
                    switch(c.getType()) {
                        case Dolar:
                            JOptionPane.showMessageDialog(null,  "Tienes " + Convertidor.convertToCoinType(cant, c) + " Dolares", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                            break;
                            
                        case Euro:
                            JOptionPane.showMessageDialog(null,  "Tienes " + Convertidor.convertToCoinType(cant, c) + " Euros", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                            break;
                            
                        case Libras:
                            JOptionPane.showMessageDialog(null,  "Tienes " + Convertidor.convertToCoinType(cant, c) + " Libras", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                            break;
                            
                        case Won_Coreano:
                            JOptionPane.showMessageDialog(null,  "Tienes " + Convertidor.convertToCoinType(cant, c) + " Wones Coreanos", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                            break;
                            
                        case Yen:
                            JOptionPane.showMessageDialog(null,  "Tienes " + Convertidor.convertToCoinType(cant, c) + " Yenes", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                            break;
                            
                        case Yuan:
                            JOptionPane.showMessageDialog(null,  "Tienes " + Convertidor.convertToCoinType(cant, c) + " Yuanes", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                            break;
                            
                        case Dolar_R:
                            JOptionPane.showMessageDialog(null, "Tienes " + Convertidor.convertToPesos(cant, c) + " Pesos", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case Euro_R:
                            JOptionPane.showMessageDialog(null, "Tienes " + Convertidor.convertToPesos(cant, c) + " Pesos", "Mensaje", JOptionPane.INFORMATION_MESSAGE);    
                            break;

                        case Libras_R:
                            JOptionPane.showMessageDialog(null, "Tienes " + Convertidor.convertToPesos(cant, c) + " Pesos", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case Won_Coreano_R:
                            JOptionPane.showMessageDialog(null, "Tienes " + Convertidor.convertToPesos(cant, c) + " Pesos", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case Yen_R:
                            JOptionPane.showMessageDialog(null, "Tienes " + Convertidor.convertToPesos(cant, c) + " Pesos", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case Yuan_R:
                            JOptionPane.showMessageDialog(null, "Tienes " + Convertidor.convertToPesos(cant, c) + " Pesos", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                            break;
                    }

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
