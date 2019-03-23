package question1;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius {

	/**
	 * le point d'entrée de cette application, dont le commentaire est à
	 * compléter
	 * 
	 * @param args
	 *            ...
	 */
	public static void main(String[] args) {
		// pour tous les paramètres de la ligne de commande
		/*int fahrenheit = 0;
		float celsius = 0;
		System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
		*/int fahrenheit = 0;
		float celsius = 0;
      for(int i=0;i<args.length;i++){
      if(args.length!=0){
       System.out.println(args[i]+ "\u00B0F -> " +
       fahrenheitEnCelsius(Integer.parseInt(args[i]))+"\u00B0C" ); // ligne,
 
      }else{
       System.out.println("il ya manque des donnee");	   																		// format
		}																		// imposés																		// imposés
																				
	}}

	/**
	 * la méthode à compléter.
	 * 
	 * @param f
	 *            la valeur en degré Fahrenheit
	 * @return la conversion en degré Celsius
	 */
	public static float fahrenheitEnCelsius(int f) {
         double resultat=5.0/9*(f-32);
           double r=(int)(resultat*10)/10.0;
		return (float)r ;
		//return resultat;//0.F; // à compléter en remplaçant ce return 0.F par la fonction
					// de conversion
	}

}
