package Ejercicio2;

import Ejercicio2.DesbordamientoException;

public class Operacion {
    public static int sumar(int valor1, int valor2) throws DesbordamientoException {
        if((long) valor1+valor2>Integer.MAX_VALUE || (long) valor1+valor2<Integer.MIN_VALUE   ){
            throw new DesbordamientoException("El resultado supera el limite de digitos representables");
        }else{
            return valor1+valor2;
        }
    }
    public static int restar(int valor1, int valor2) throws DesbordamientoException{
        if((long) valor1-valor2>Integer.MAX_VALUE || (long) valor1-valor2<Integer.MIN_VALUE   ){
            throw new DesbordamientoException("El resultado supera el limite de digitos representables");
        }else{
            return valor1-valor2;
        }
    }
    public static int multiplicar(int valor1,int valor2) throws DesbordamientoException{
        if((long) valor1*valor2>Integer.MAX_VALUE || (long) valor1*valor2<Integer.MIN_VALUE   ){
            throw new DesbordamientoException("El resultado supera el limite de digitos representables");
        }else{
            return valor1*valor2;
        }
    }


}
