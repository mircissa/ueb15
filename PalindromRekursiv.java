
/**
 * Beschreiben Sie hier die Klasse PalindromRekursiv.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class PalindromRekursiv
{
    /**
     * Konstruktor für Objekte der Klasse PalindromRekursiv
     */
    public PalindromRekursiv()
    {    
    }
    
    public String palindromrekursiv (String wort)
    {   
        wort.toLowerCase();
        
        if(wort.length() == 0 || wort.length() == 1)
        {
            return wort + " ist ein Palindrom";
        }    
        else if (wort.charAt(0)==(wort.charAt(wort.length()-1)))
            return palindromrekursiv(wort.substring(1, wort.length()-1));
        else 
        {
            return wort + " ist kein Palindrom";  
        }   
    }
}
