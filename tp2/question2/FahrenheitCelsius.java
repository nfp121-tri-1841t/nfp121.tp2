package question2;


/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entrée de cette application, 
      * dont le commentaire est à compléter
      *
      *  @param args ...
      */
     public static void main(String[] args){
         for(int i=0;i<args.length;i++){
      if(args.length!=0){

       try{
        System.out.println(args[i]+ "\u00B0F -> " +
       fahrenheitEnCelsius(Integer.parseInt(args[i]))+"\u00B0C" );
      
       }catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
        }
    }else{
       System.out.println("il ya manque des donnee");	   																		// format
		}																			
	}
}

       
     
     
     /** 
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
     
     public static float fahrenheitEnCelsius(int f) throws NumberFormatException {
         double resultat=5.0/9*(f-32);
            double r=(int)(resultat*10)/10.0;
		return (float)r;
	// à compléter	en remplaçant la valeur retournée par la fonction de conversion
       // ...
     }

}
