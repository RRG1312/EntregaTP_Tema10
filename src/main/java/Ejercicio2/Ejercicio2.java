package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    private static Scanner teclado = new Scanner(System.in);
    public static void MiniCalculadora() throws Exception{
        String linea;
        long valor1=0;
        long valor2=0;
        int aux1=0,aux2=0;
        char operador;

        boolean seguir =true;
        boolean terminar = false;
        while(!terminar){
            while(seguir) {
                System.out.println("Introduce un numero entero:");
                linea = teclado.nextLine();
                try {
                    valor1 = Long.parseLong(linea);
                } catch (NumberFormatException e) {
                    throw new NumberFormatException("Solo puedes introducir numeros enteros");
                }

                if (valor1 > Integer.MAX_VALUE || valor1 < Integer.MIN_VALUE) {
                    throw new DesbordamientoException("El valor introducido supera los limites de digitos");
                }else{
                    seguir=false;
                }
                aux1 = Integer.parseInt(valor1+"");
            }

            seguir =true;

            while(seguir) {
                System.out.println("Introduce otro numero entero:");
                linea = teclado.nextLine();
                try {
                    valor2 = Long.parseLong(linea);
                } catch (NumberFormatException e) {
                    throw new NumberFormatException("Solo puedes introducir numeros enteros");
                }

                if(valor2>Integer.MAX_VALUE || valor2<Integer.MIN_VALUE){
                    throw new DesbordamientoException("El valor introducido supera los limites de digitos");
                }else{
                    seguir=false;
                }
                aux2 = Integer.parseInt(valor2+"");
            }

            seguir=true;


            while(seguir){
                System.out.println("Dime el operador(+,-,*,/,% o s para salir)");
                operador = teclado.nextLine().charAt(0);
                if(operador=='s') {
                    System.out.println("Volviendo al inicio");
                    seguir=false;
                }else if(operador!='+' && operador!='-' && operador!='*' && operador!='/' && operador!='%'){
                    System.out.println("Esa no es una opcion valida");
                }else{
                    switch (operador){
                        case '+':
                            System.out.println(Operacion.sumar(aux1,aux2));
                            break;
                        case '-':
                            System.out.println(Operacion.restar(aux1,aux2));
                            break;
                        case '%':
                            if (aux2==0){
                                System.out.println("No se puede conseguir el resto de la division entre 0");
                            }else{
                                System.out.println(aux1%aux2);
                            }
                            break;
                        case '*':
                            System.out.println(Operacion.multiplicar(aux1,aux2));
                            break;
                        case '/':
                            System.out.println((double) valor1/valor2 );
                            break;
                    }
                }

            }
            seguir=true;
        }







    }


}
