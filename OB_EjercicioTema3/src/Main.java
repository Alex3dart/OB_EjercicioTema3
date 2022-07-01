//Primera parte:
//Crear una función con tres parámetros que sean números que se suman entre sí.
//Llamar a la función en el main y darle valores.

public class Main {

    public static void main(String[] args) {
        int valor1 = 10;
        int valor2 = 20;
        int valor3 = 40;
        var resultado = suma(valor1,valor2,valor3);

        Coche miCoche = new Coche();
        miCoche.SumarPuertas();

        System.out.println("El resultado es: " + resultado);
        System.out.println("El numero de puertas del coche es: " + miCoche.NumPuertas);
    }

    public static int suma(int a, int b, int c){
        return a+b+c;
    }

    //Segunda parte:
    //Crear una clase coche.
    //Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
    //Una función que incremente el número de puertas que tiene el coche.
    //Crear un objeto miCoche en el main y añadirle una puerta.
    //Mostrar el número de puertas que tiene el objeto.

    static class Coche {
        public int NumPuertas = 0;
        public void SumarPuertas(){
            this.NumPuertas++;
        }
    }
}
