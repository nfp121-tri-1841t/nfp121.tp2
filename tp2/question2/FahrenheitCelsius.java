package question2;


/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entr�e de cette application, 
      * dont le commentaire est � compl�ter
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
      * la m�thode � compl�ter. 
      *   @param f la valeur en degr� Fahrenheit
      *   @return  la conversion en degr� Celsius
      */
     
     public static float fahrenheitEnCelsius(int f) throws NumberFormatException {
         double resultat=5.0/9*(f-32);
            double r=(int)(resultat*10)/10.0;
		return (float)r;
	// � compl�ter	en rempla�ant la valeur retourn�e par la fonction de conversion
       // ...
     }

}
