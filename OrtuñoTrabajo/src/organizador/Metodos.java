/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizador;

import java.util.Arrays;

/**
 *
 * @author MARIA
 */
public class Metodos {
    public static void main(String[] args){
        
        int arreglo[] = {25,8,10,99,26,70,3,69,14};
        System.out.print("El vector es: "+Arrays.toString(arreglo) +"\n");
        
        System.out.println("Burbuja");        
        MetodoBurbuja burbuja = new MetodoBurbuja();
        burbuja.orden(arreglo);
        
        System.out.println("\n\n QuickSort");
        MetodoQuickSort quick = new MetodoQuickSort();
        quick.ordenquicksort(arreglo);        
        for(int i=0; i<arreglo.length; i++)
        {
             System.out.println(arreglo[i]);
        }
        
        System.out.println("\n\n Shell Sort");
        MetodoShellSort shell = new MetodoShellSort();
        shell.orden(arreglo);
    }
}

