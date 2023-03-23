package Ejercicio1;

import java.util.Map;
import java.util.Scanner;

public class Ejercicio1 {
    static Scanner teclado = new Scanner(System.in);
    public static void calcularRaiz() throws Exception{
        double resultado;
        System.out.println("Dime el numero del que quieres saber su raiz cudrada:");
        resultado=teclado.nextDouble();
        if(resultado<0){
            throw new NegativoException("El numero no puedde ser negativo");
        }else{
            System.out.println(Math.sqrt(resultado));
        }

    }

}
