/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizador;

/**
 *
 * @author MARIA
 */
public class MetodoQuickSort {
    public void ordenquicksort(int [] vector2)
    {
        vector2 = quicksort1(vector2);
    }
    
    public int[] quicksort1 (int valores[])
    {
        return quicksort2 (valores,0,valores.length -1);
    }
    
    public int[] quicksort2 (int valores[],int izq, int der)
        {
            if (izq >= der)
                return valores;
            int i=izq,d=der;
            if(izq != der)
                {
                    int pivote;
                    int aux;
                    pivote= izq;
                    while (izq != der)
                        {
                            while (valores [der] >= valores [pivote] && izq < der)
                                der --;
                                while (valores [izq] < valores [pivote] && izq<der)
                                    izq++;
                            if (der != izq)
                            {
                                aux=valores [der];
                                valores[der]= valores [izq];
                                valores[izq]= aux;
                            }
                            
                            if (izq == der)
                            {
                                quicksort2 (valores,1,izq-1);
                                quicksort2 (valores,izq+1,d);
                            }
                        }
                }
                    else 
                    return valores;   
                    return valores;            
        }
}

