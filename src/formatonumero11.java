import java.text.NumberFormat;
import java.util.Locale;

public class formatonumero11 {
    public static void main(String[] args) {
        /*
        Foramto de Monead
        * */
        Locale locale = Locale.forLanguageTag("en-US");
        NumberFormat formatoNumero = NumberFormat.getCurrencyInstance(locale);
        String resultado = formatoNumero.format(2456.00);
        System.out.println(resultado);

        /*
        * Formato de Porcentaje
        * */
        NumberFormat porcentaje = NumberFormat.getPercentInstance();
        System.out.println(porcentaje.format(0.15));
    }
}
