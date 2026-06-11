import java.util.ArrayList;
import java.util.Random;

import clases.AdivinaNumero;

public class Aplicacion {
  public static void main(String[] args) {
    Random random = new Random();
    int numAleatorio = random.nextInt(100) + 1; // Esto genera el numero entre 1 y 100
    ArrayList<Integer> intentos = new ArrayList<>(); // Guarda en un arreglo dinamico los intentos

    boolean adivinado = false;

    // Ciclo principal que mantiene el juego hasta que se adivina el numero
    while (!adivinado) { // la condicion dice mientras no se haya adivinado
      System.out.print("Por favor ingresa un número entre 1 - 100: ");
      String linea = System.console().readLine(); // Lo que el usuario escribe se guarda en la variable
      int numUsuario = Integer.parseInt(linea); // convierte la variable en entero

      intentos.add(numUsuario); // agrega el numero del usuario al arrayList de intentos

      String resultado = AdivinaNumero.compararNumeros(numUsuario, numAleatorio); // llamamos al metodo por medio de la
                                                                                  // variable resultado
      System.out.println(resultado); // devuelve el resultado del metodo

      if (numUsuario == numAleatorio) { // evalua si el juego debe seguir o terminar
        adivinado = true;// cambia la condicion del ciclo while
        System.out.println("Te tomó " + intentos.size() + " intentos adiviane el número. ");
        System.out.println("Tus intentos fueron: " + intentos);
      }
    }

  }
}
