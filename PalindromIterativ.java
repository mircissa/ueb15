
/**
 * Beschreiben Sie hier die Klasse Palindrom.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class PalindromIterativ
{
    /**
     * Konstruktor für Objekte der Klasse Palindrom
     */
    public PalindromIterativ()
    {
    }
    
    public String palindromiterativ (String wort)
    {
        wort.toLowerCase();
        
        int a = 0;
        int b = wort.length();
        
        while (b>a)
        {
            if (wort.charAt(a) != wort.charAt(b))
                return wort + " ist kein Palindrom";  
            
            a++;
            b++;
        }
        
        return wort + " ist ein Palindrom";       
    }
}
