package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner escaner = new Scanner (System.in);

        System.out.println("Introduce el primer número");
        int numero1 = escaner.nextInt();
        System.out.println("Introduce el segundo número");
        int numero2 = escaner.nextInt();
        System.out.println("Introduce el tercer número");
        int numero3 = escaner.nextInt();


        // Al tener 3 numeros podrian darse estas opciones;
        // Primera opcion - numero1 numero2 numero3
        // Segunda opcion - numero1 numero3 numero2
        // Tercera opcion - numero2 numero1 numero3
        // Cuarta opcion - numero2 numero3 numero1
        // Quinta opcion - numero3 numero1 numero2
        // Sexta opcion - numero3 numero2 numero1
        //

        // Por tanto hacemos esas combinaciones con if

        // Primera opcion. Si el numero1 es mayor que el numero 2 y el numero 2 es mayor que el numero 3, nos imprimer este orden: numero1 - numero2 - numero3
        if(numero1>numero2&&numero2>numero3)
            System.out.println(numero1 + " - " + numero2 + " - " + numero3);

        // Segunda  opcion
        if(numero1>numero3&&numero3>numero2)
            System.out.println(numero1 + " - " + numero3 +" - "+ numero2);

        // Tercera  opcion
        if(numero2>numero1&&numero1>numero3)
            System.out.println(numero2 + " - " + numero1 + " - " + numero3);

        // Cuarta  opcion
        if(numero2>numero3&&numero3>numero1)
            System.out.println(numero2 + " - " + numero3 + " - "+ numero1);

        // Quinta  opcion
        if(numero3>numero1&&numero1>numero2)
            System.out.println(numero3 + " - "+ numero1 + " - " + numero2);

        // Sexta  opcion
        if(numero3>numero2&&numero2>numero1)
            System.out.println(numero3 + " - " + numero2 + " - " + numero1);





    }


}

