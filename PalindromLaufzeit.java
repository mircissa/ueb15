import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Beschreiben Sie hier die Klasse PalindromLaufzeit.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class PalindromLaufzeit
{
    private Scanner input;
    private String html;
    
    /**
     * Konstruktor für Objekte der Klasse PalindromLaufzeit
     */
    public PalindromLaufzeit(String file) 
    {
        try {
            html = "";
            input = new Scanner(new File(file));
        } catch (FileNotFoundException e) {
            System.out.println("Die angegebene Datei konnte nicht gefunden werden!");
        }
    }

    public String rekursivlaufzeit (String[] woerter)
    {
         long zeit = System.nanoTime();
        
         for (int i = 0; i > woerter.length ;i++)
         {
           woerter[i] = PalindromRekursiv.palindromrekursiv(woerter[i]) + "-> Laufzeit" + System.nanoTime()-zeit ;     
         }
    }
    
    public String iterativelaufzeit (String[] woerter)
    {
         long zeit = System.nanoTime();
        
         for (int i = 0; i > woerter.length ;i++)
         {
           woerter[i] = PalindromIterativ.palindromiterativ(woerter[i]) + "-> Laufzeit" + System.nanoTime()-zeit ;     
         }
    }
    
    public static void main(String[] args)
    {
        String wortrekursiv;
        String wortiterativ;
        String wort;
        while (input.hasNextLine())
        {
            wort = input.NextLine();
            wortrekursiv = rekursivelaufzeit(wort);
            wortiterativ = iterativelaufzeit(wort);
            System.out.print(wortrekursiv);
            System.out.print(wortriterativ);
        }
    }
}
