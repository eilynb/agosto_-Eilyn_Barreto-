package Clase3.Metodos_Parte2;

import java.util.Scanner;

public class Ejercicio3_boolean {
    //Crear un método que retorne la suma de los números pares entre 1 y n, siendo n un parámetro

    public static void main (String args[]){
        Scanner input=new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int num= input.nextInt();
        System.out.println("La suma de los numeros pares es "+sumaPar(num));
        }
        public static int sumaPar (int num) {
            int suma=0;
            for (int i=1;i<=num;i++){
                if (i%2==0){
                    suma=suma+i;
                }
            }
        return suma;
        }
}