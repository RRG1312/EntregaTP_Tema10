import Ejercicio1.Ejercicio1;
import Ejercicio2.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        //try {
        //    Ejercicio1.calcularRaiz();
        //}catch (Exception e){
         //   System.out.println(e.getMessage());
        //}
        boolean terminar = false;
        while(!terminar) {
            try {
                Ejercicio2.MiniCalculadora();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
