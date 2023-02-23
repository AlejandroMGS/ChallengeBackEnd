package Vista;

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
                    
                    Object[] oCoins = { new Coin("Pesos a Dolar", 0, CoinType.Dolar),
                                        new Coin("Pesos a Euro", 0, CoinType.Euro),
                                        new Coin("Pesos a Libra", 0, CoinType.Libras),
                                        new Coin("Pesos a Won Coreano", 0, CoinType.Won_Coreano),
                                        new Coin("Pesos a Yen", 0, CoinType.Yen),
                                        new Coin("Pesos a Yuan", 0, CoinType.Yuan),
                                        new Coin("Dolar a Pesos", 0, CoinType.Dolar_R),
                                        new Coin("Euro a Pesos", 0, CoinType.Euro_R),
                                        new Coin("Libra a Pesos", 0, CoinType.Libras_R),
                                        new Coin("Won Coreano a Pesos", 0, CoinType.Won_Coreano_R),
                                        new Coin("Yen a Pesos", 0, CoinType.Yen_R),
                                        new Coin("Yuan a Pesos", 0, CoinType.Yuan_R)};
                    
                    Coin c = (Coin)JOptionPane.showInputDialog(null, "Escoja la moneda a la que desea convertir", "Monedas", JOptionPane.QUESTION_MESSAGE, null, oCoins, oCoins[0]);
                    
                    switch(c.getType()) {
                        
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
