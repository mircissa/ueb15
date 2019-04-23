/**
 * Beschreiben Sie hier die Klasse Euklid.
 * 
 * @author Samantha Maaß & Hussein Abbas 
 * @version 22.04.2019
 */
public class Euklid
{
    /**
     * Konstruktor für Objekte der Klasse Euklid
     */
    public Euklid()
    {
    }

    public int berechnen(int a, int b)
    {
        if (b==0)
            return a;
        else     
            return berechnen(b,b%a);
    }
}
