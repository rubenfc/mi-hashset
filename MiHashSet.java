import java.util.ArrayList;
/**
 * Write a description of class MiHashSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashSet
{
    private int[] hashSet;
    public MiHashSet()
    {
        hashSet = new int[0];
    }

    public boolean add(int valor)
    {
        int index = 0;
        boolean noExiste = true;
        while(index < hashSet.length && noExiste)
        {
            if(hashSet[index] == valor)
            {
                noExiste = false;
            }
            index++;
        }
        
        if(noExiste)
        {
            int[] nuevoHashSet = new int[hashSet.length + 1];
            for(int cont = 0; cont < hashSet.length; cont++)
            {
                nuevoHashSet[cont] = hashSet[cont];
            }
            nuevoHashSet[hashSet.length] = valor;
            hashSet = nuevoHashSet;
        }
        return noExiste;
    }
}