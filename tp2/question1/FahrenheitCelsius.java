package question1;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius {

    /**
     * La methode main
     */
    public static void main(String[] args) {
        // pour tous les paramètres de la ligne de commande
        for(int i=0;i<args.length;i++)
        {
        int fahrenheit = Integer.parseInt(args[i]);
        float celsius = fahrenheitEnCelsius(fahrenheit);
        System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
        }                                                                // format
                                                                       
    }

    /**
     * la valeur en degré Fahrenheit
     * return la conversion en degré Celsius
     */
    public static float fahrenheitEnCelsius(int f) {
        float c=5.F/9.F*(f-32.F);
        float rf=(c*10);
        float r=(int)rf/10.F;
        return r;
    }

}
