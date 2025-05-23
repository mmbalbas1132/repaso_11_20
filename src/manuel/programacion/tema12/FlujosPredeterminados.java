package manuel.programacion.tema12;
import java.io.*;

public class FlujosPredeterminados {
    // Los flujos predeterminados son flujos de entrada y salida que se utilizan comúnmente en Java. Estos flujos son proporcionados por el sistema y están disponibles de forma predeterminada para su uso en la aplicación. Los flujos predeterminados incluyen System.in, System.out y System.err.
    // System.in es el flujo de entrada estándar, que se utiliza para leer datos desde la consola. System.out es el flujo de salida estándar, que se utiliza para escribir datos en la consola. System.err es el flujo de error estándar, que se utiliza para escribir mensajes de error en la consola.
    // Estos flujos son útiles para interactuar con el usuario y mostrar información en la consola.

    //Flujos basados en bytes

    // Los flujos de entrada y salida en Java se pueden clasificar en dos categorías principales: flujos basados en bytes y flujos basados en caracteres. Los flujos basados en bytes se utilizan para leer y escribir datos binarios, como imágenes, archivos de audio o cualquier otro tipo de datos no textuales. Estos flujos operan a nivel de byte y son adecuados para manejar datos que no son texto.


    public static void main(String[] args) {
        // Ejemplo de uso de los flujos predeterminados
        System.out.println("Hola, mundo!"); // Escribe en la consola

        System.err.println("Este es un mensaje de error!"); // Escribe un mensaje de error en la consola

        // Leer datos desde la consola utilizando System.in
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine(); // Lee una línea de texto desde la consola
        System.out.println("Hola, " + nombre + "!"); // Muestra un saludo personalizado
        scanner.close(); // Cierra el escáner para liberar recursos
        // Ejemplo de uso de System.out para imprimir un número
        int numero = 42;
        System.out.println("El número es: " + numero); // Imprime el número en la consola
        // Ejemplo de uso de System.err para imprimir un mensaje de error
        String mensajeError = "Ocurrió un error al procesar la solicitud.";
        System.err.println("Error: " + mensajeError); // Imprime un mensaje de error en la consola

        //Ejemplo de flujos basados en bytes

        // Crear un flujo de salida basado en bytes
        java.io.OutputStream outputStream = System.out; // Flujo de salida estándar
        // Escribir datos en el flujo de salida
        String mensaje = "Hola, mundo desde un flujo de salida basado en bytes!";
        try {
            outputStream.write(mensaje.getBytes()); // Convertir la cadena a bytes y escribir en el flujo
            outputStream.flush(); // Asegurarse de que los datos se envíen al destino
        } catch (java.io.IOException e) {
            System.err.println("Error al escribir en el flujo de salida: " + e.getMessage());
        } finally {
            try {
                outputStream.close(); // Cerrar el flujo de salida
            } catch (java.io.IOException e) {
                System.err.println("Error al cerrar el flujo de salida: " + e.getMessage());
            }
        }
        // Crear un flujo de entrada basado en bytes
        java.io.InputStream inputStream = System.in; // Flujo de entrada estándar
        // Leer datos desde el flujo de entrada
        byte[] buffer = new byte[1024]; // Buffer para almacenar los datos leídos
        try {
            System.out.print("Introduce un mensaje: ");
            int bytesLeidos = inputStream.read(buffer); // Leer datos del flujo de entrada
            String mensajeLeido = new String(buffer, 0, bytesLeidos); // Convertir los bytes leídos a una cadena
            System.out.println("Mensaje leído: " + mensajeLeido); // Mostrar el mensaje leído
        } catch (java.io.IOException e) {
            System.err.println("Error al leer del flujo de entrada: " + e.getMessage());
        } finally {
            try {
                inputStream.close(); // Cerrar el flujo de entrada
            } catch (java.io.IOException e) {
                System.err.println("Error al cerrar el flujo de entrada: " + e.getMessage());
            }
        }

        //Ejemplo de flujo basado en caracteres

        // Crear un flujo de salida basado en caracteres
        Writer writer = new OutputStreamWriter(System.out); // Flujo de salida estándar
        // Escribir datos en el flujo de salida
        String mensajeCaracteres = "Hola, mundo desde un flujo de salida basado en caracteres!";
        try {
            writer.write(mensajeCaracteres); // Escribir la cadena en el flujo
            writer.flush(); // Asegurarse de que los datos se envíen al destino
        } catch (IOException e) {
            System.err.println("Error al escribir en el flujo de salida: " + e.getMessage());
        } finally {
            try {
                writer.close(); // Cerrar el flujo de salida
            } catch (IOException e) {
                System.err.println("Error al cerrar el flujo de salida: " + e.getMessage());
            }
        }

        // Crear un flujo de entrada basado en caracteres
        Reader reader = new InputStreamReader(System.in); // Flujo de entrada estándar
        // Leer datos desde el flujo de entrada
        char[] bufferCaracteres = new char[1024]; // Buffer para almacenar los datos leídos
        try {
            System.out.print("Introduce un mensaje: ");
            int caracteresLeidos = reader.read(bufferCaracteres); // Leer datos del flujo de entrada
            String mensajeLeidoCaracteres = new String(bufferCaracteres, 0, caracteresLeidos); // Convertir los caracteres leídos a una cadena
            System.out.println("Mensaje leído: " + mensajeLeidoCaracteres); // Mostrar el mensaje leído
        } catch (IOException e) {
            System.err.println("Error al leer del flujo de entrada: " + e.getMessage());
        } finally {
            try {
                reader.close(); // Cerrar el flujo de entrada
            } catch (IOException e) {
                System.err.println("Error al cerrar el flujo de entrada: " + e.getMessage());
            }
        }





    }
}
