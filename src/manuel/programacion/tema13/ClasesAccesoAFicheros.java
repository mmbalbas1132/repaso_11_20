package manuel.programacion.tema13;

public class ClasesAccesoAFicheros {
    // Clases de acceso a ficheros en Java
    // En Java, se pueden utilizar varias clases para acceder y manipular ficheros. Algunas de las clases más comunes son:
    // File: Representa un fichero o directorio en el sistema de archivos.
    // FileReader: Permite leer el contenido de un fichero de texto.
    // FileWriter: Permite escribir contenido en un fichero de texto.
    // BufferedReader: Proporciona una forma eficiente de leer texto desde un flujo de entrada.
    // BufferedWriter: Proporciona una forma eficiente de escribir texto en un flujo de salida.
    // PrintWriter: Permite escribir texto formateado en un fichero.
    // FileInputStream: Permite leer datos binarios desde un fichero.
    // FileOutputStream: Permite escribir datos binarios en un fichero.
    // BufferedInputStream: Proporciona una forma eficiente de leer datos binarios desde un flujo de entrada.
    // BufferedOutputStream: Proporciona una forma eficiente de escribir datos binarios en un flujo de salida.

    public static void main(String[] args) {
        // Ejemplo de uso de File para crear un fichero
        java.io.File fichero = new java.io.File("ejemplo.txt");
        try {
            if (fichero.createNewFile()) {
                System.out.println("Fichero creado: " + fichero.getName());
            } else {
                System.out.println("El fichero ya existe.");
            }
        } catch (java.io.IOException e) {
            System.err.println("Error al crear el fichero: " + e.getMessage());
        }

        // Ejemplo de uso de FileWriter para escribir en un fichero
        try (java.io.FileWriter writer = new java.io.FileWriter(fichero)) {
            writer.write("Hola, mundo desde un fichero!");
            System.out.println("Datos escritos en el fichero.");
        } catch (java.io.IOException e) {
            System.err.println("Error al escribir en el fichero: " + e.getMessage());
        }
        // Ejemplo de uso de FileReader para leer desde un fichero
        try (java.io.FileReader reader = new java.io.FileReader(fichero);
             java.io.BufferedReader bufferedReader = new java.io.BufferedReader(reader)) {
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println("Línea leída: " + linea);
            }
        } catch (java.io.IOException e) {
            System.err.println("Error al leer el fichero: " + e.getMessage());
        }
        // Ejemplo de uso de PrintWriter para escribir texto formateado en un fichero
        try (java.io.PrintWriter printWriter = new java.io.PrintWriter(new java.io.FileWriter(fichero, true))) {
            printWriter.println("Este es un mensaje adicional.");
            System.out.println("Mensaje adicional escrito en el fichero.");
        } catch (java.io.IOException e) {
            System.err.println("Error al escribir en el fichero: " + e.getMessage());
        }
        // Ejemplo de uso de FileInputStream para leer datos binarios desde un fichero
        try (java.io.FileInputStream inputStream = new java.io.FileInputStream(fichero)) {
            byte[] buffer = new byte[1024];
            int bytesLeidos = inputStream.read(buffer);
            String mensajeLeido = new String(buffer, 0, bytesLeidos);
            System.out.println("Mensaje leído desde el fichero: " + mensajeLeido);
        } catch (java.io.IOException e) {
            System.err.println("Error al leer el fichero: " + e.getMessage());
        }
        // Ejemplo de uso de FileOutputStream para escribir datos binarios en un fichero
        try (java.io.FileOutputStream outputStream = new java.io.FileOutputStream(fichero, true)) {
            String mensaje = "Este es un mensaje binario.";
            outputStream.write(mensaje.getBytes());
            System.out.println("Mensaje binario escrito en el fichero.");
        } catch (java.io.IOException e) {
            System.err.println("Error al escribir en el fichero: " + e.getMessage());
        }
        // Ejemplo de uso de BufferedInputStream para leer datos binarios desde un flujo de entrada
        try (java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(fichero))) {
            byte[] buffer = new byte[1024];
            int bytesLeidos = bufferedInputStream.read(buffer);
            String mensajeLeido = new String(buffer, 0, bytesLeidos);
            System.out.println("Mensaje leído desde el flujo de entrada: " + mensajeLeido);
        } catch (java.io.IOException e) {
            System.err.println("Error al leer el flujo de entrada: " + e.getMessage());
        }
        // Ejemplo de uso de BufferedOutputStream para escribir datos binarios en un flujo de salida
        try (java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(fichero, true))) {
            String mensaje = "Este es un mensaje binario adicional.";
            bufferedOutputStream.write(mensaje.getBytes());
            System.out.println("Mensaje binario adicional escrito en el flujo de salida.");
        } catch (java.io.IOException e) {
            System.err.println("Error al escribir en el flujo de salida: " + e.getMessage());
        }
        // Ejemplo de uso de BufferedReader para leer texto desde un flujo de entrada
        try (java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(fichero))) {
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println("Línea leída desde el flujo de entrada: " + linea);
            }
        } catch (java.io.IOException e) {
            System.err.println("Error al leer el flujo de entrada: " + e.getMessage());
        }
        // Ejemplo de uso de BufferedWriter para escribir texto en un flujo de salida
        try (java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.FileWriter(fichero, true))) {
            bufferedWriter.write("Este es un mensaje adicional desde BufferedWriter.");
            System.out.println("Mensaje adicional escrito en el flujo de salida.");
        } catch (java.io.IOException e) {
            System.err.println("Error al escribir en el flujo de salida: " + e.getMessage());
        }
        // Ejemplo de uso de PrintWriter para escribir texto formateado en un flujo de salida
        try (java.io.PrintWriter printWriter = new java.io.PrintWriter(new java.io.FileWriter(fichero, true))) {
            printWriter.printf("Este es un mensaje formateado: %s%n", "Hola, mundo!");
            System.out.println("Mensaje formateado escrito en el flujo de salida.");
        } catch (java.io.IOException e) {
            System.err.println("Error al escribir en el flujo de salida: " + e.getMessage());
        }
        // Ejemplo de uso de PrintWriter para escribir texto formateado en un flujo de salida
        try (java.io.PrintWriter printWriter = new java.io.PrintWriter(new java.io.FileWriter(fichero, true))) {
            printWriter.printf("Este es un mensaje formateado: %s%n", "Hola, mundo!");
            System.out.println("Mensaje formateado escrito en el flujo de salida.");
        } catch (java.io.IOException e) {
            System.err.println("Error al escribir en el flujo de salida: " + e.getMessage());
        }

    }
}
