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
    
    public void clear()
    {
        int[] nuevoHashSet = new int[0];
        hashSet = nuevoHashSet;
    }
    
    public boolean contains(int elemento)
    {
        boolean existe = false;
        int cont = 0;
        while(cont < hashSet.length && !existe)
        {
            if(hashSet[cont] == elemento)
            {
                existe = true;
            }
            cont++;
        }
        return existe;
    }
    
    public boolean isEmpty()
    {
        boolean empty = false;
        if(hashSet.length == 0)
        {
            empty = true;
        }
        return empty;
    }
    
    public boolean remove(int elemento)
    {
        boolean existe = false;
        int cont = 0;
        int indiceValor = 0;
        while(cont < hashSet.length && !existe)
        {
            if(hashSet[cont] == elemento)
            {
                indiceValor = cont;
                existe = true;
            }
            cont++;
        }
        
        if(existe)
        {
            int[] nuevoHash = new int[hashSet.length - 1];
            int indice = 0;
            for(int i = 0; i < hashSet.length; i++)
            {
                if(i != indiceValor)
                {
                    nuevoHash[indice] = hashSet[i];
                    cont++;
                }
            }
            hashSet = nuevoHash;
        }
        return existe;
    }
}
