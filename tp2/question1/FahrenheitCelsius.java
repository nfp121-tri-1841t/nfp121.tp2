package question1;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius {

	/**
	 * le point d'entr�e de cette application, dont le commentaire est �
	 * compl�ter
	 * 
	 * @param args
	 *            ...
	 */
	public static void main(String[] args) {
		// pour tous les param�tres de la ligne de commande
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
		}																		// impos�s																		// impos�s
																				
	}}

	/**
	 * la m�thode � compl�ter.
	 * 
	 * @param f
	 *            la valeur en degr� Fahrenheit
	 * @return la conversion en degr� Celsius
	 */
	public static float fahrenheitEnCelsius(int f) {
         double resultat=5.0/9*(f-32);
           double r=(int)(resultat*10)/10.0;
		return (float)r ;
		//return resultat;//0.F; // � compl�ter en rempla�ant ce return 0.F par la fonction
					// de conversion
	}

}
