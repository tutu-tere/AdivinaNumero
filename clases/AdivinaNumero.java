package clases;

public class AdivinaNumero {

  public static String compararNumeros(int numUsuario, int numAleatorio) {
    if (numUsuario == numAleatorio) {
      return "¡Has conseguido adivinar el número!";
    } else if (numUsuario < numAleatorio) {
      return "Intenta con un número más grande.";
    } else {
      return "Intenta con un número más pequeño";
    }
  }

}
