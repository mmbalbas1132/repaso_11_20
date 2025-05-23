package manuel.programacion.tema13;

public class Excepciones {
    // Las excepciones son eventos que ocurren durante la ejecución de un programa y que interrumpen su flujo normal. En Java, las excepciones se manejan mediante bloques try-catch-finally. El bloque try contiene el código que puede generar una excepción, el bloque catch maneja la excepción y el bloque finally se ejecuta siempre, independientemente de si se produjo una excepción o no.
    // Existen dos tipos de excepciones: comprobadas (checked) y no comprobadas (unchecked). Las excepciones comprobadas son aquellas que deben ser declaradas en la firma del método o capturadas en un bloque catch. Las excepciones no comprobadas son aquellas que no necesitan ser declaradas ni capturadas.
    // Ejemplo de manejo de excepciones
    public static void main(String[] args) {
        try {
            int resultado = dividir(10, 2);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        } finally {
            System.out.println("Bloque finally siempre se ejecuta.");
        }
    }

    //En el bloque try se intenta realizar una división por cero, lo que genera una ArithmeticException. El bloque catch captura la excepción y muestra un mensaje de error. El bloque finally se ejecuta siempre, independientemente de si se produjo una excepción o no y se utiliza para liberar recursos o realizar tareas de limpieza como cerrar archivos o conexiones de red.

    public static int dividir(int a, int b) {
        return a / b;
    }

    //ejemplo de uso de throw. Se usa para lanzar una excepción de forma manual. En este caso, se lanza una IllegalArgumentException si la edad es negativa.
    public static void validarEdad(int edad) throws IllegalArgumentException {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
    }

    //Propagar excepciones usando throws. Se usa para declarar que un método puede lanzar una excepción. En este caso, el método dividir lanza una ArithmeticException si se intenta dividir por cero.
    public static int dividirConThrows(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("División por cero no permitida.");
        }
        return a / b;
    }
    //Ejemplo de uso de la clase Exception
    public static void manejarExcepcion() {
        try {
            // Código que puede generar una excepción
            int resultado = dividir(10, 0);
        } catch (Exception e) {
            // Manejo de la excepción
            System.out.println("Se produjo una excepción: " + e.getMessage());
        }
    }

    //Ejemplo de documentación de excepciones
    /**
     * Método que divide dos números enteros.
     *
     * @param a el numerador
     * @param b el denominador
     * @return el resultado de la división
     * @throws ArithmeticException si se intenta dividir por cero
     */
    public static int dividirConDocumentacion(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("División por cero no permitida.");
        }
        return a / b;
    }

    //Ejemplos de uso de clases de excepciones.
    //Ejemplo de uso de la clase RuntimeException
    public static void manejarRuntimeException() {
        try {
            // Código que puede generar una excepción de tiempo de ejecución
            int resultado = dividir(10, 0);
        } catch (RuntimeException e) {
            // Manejo de la excepción
            System.out.println("Se produjo una RuntimeException: " + e.getMessage());
        }
    }
    //Ejemplo de uso de la clase IOException
    public static void manejarIOException() {
        try {
            // Código que puede generar una IOException
            java.io.FileReader fileReader = new java.io.FileReader("archivo.txt");
        } catch (java.io.IOException e) {
            // Manejo de la excepción
            System.out.println("Se produjo una IOException: " + e.getMessage());
        }
    }
    //Ejemplo de uso de la clase NullPointerException
    public static void manejarNullPointerException() {
        try {
            // Código que puede generar una NullPointerException
            String texto = null;
            int longitud = texto.length();
        } catch (NullPointerException e) {
            // Manejo de la excepción
            System.out.println("Se produjo una NullPointerException: " + e.getMessage());
        }
    }
    //Ejemplo de uso de la clase ArrayIndexOutOfBoundsException
    public static void manejarArrayIndexOutOfBoundsException() {
        try {
            // Código que puede generar una ArrayIndexOutOfBoundsException
            int[] numeros = {1, 2, 3};
            int numero = numeros[3];
        } catch (ArrayIndexOutOfBoundsException e) {
            // Manejo de la excepción
            System.out.println("Se produjo una ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
    //Ejemplo de uso de la clase ClassNotFoundException
    public static void manejarClassNotFoundException() {
        try {
            // Código que puede generar una ClassNotFoundException
            Class.forName("ClaseInexistente");
        } catch (ClassNotFoundException e) {
            // Manejo de la excepción
            System.out.println("Se produjo una ClassNotFoundException: " + e.getMessage());
        }
    }
    //Ejemplo de uso de la clase NumberFormatException
    public static void manejarNumberFormatException() {
        try {
            // Código que puede generar una NumberFormatException
            String numeroStr = "abc";
            int numero = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e) {
            // Manejo de la excepción
            System.out.println("Se produjo una NumberFormatException: " + e.getMessage());
        }
    }
    //Ejemplo de uso de la clase FileNotFoundException
    public static void manejarFileNotFoundException() {
        try {
            // Código que puede generar una FileNotFoundException
            java.io.FileReader fileReader = new java.io.FileReader("archivoInexistente.txt");
        } catch (java.io.FileNotFoundException e) {
            // Manejo de la excepción
            System.out.println("Se produjo una FileNotFoundException: " + e.getMessage());
        }
    }
    //Ejemplo de uso de la clase SQLException
    public static void manejarSQLException() {
        try {
            // Código que puede generar una SQLException
            java.sql.Connection connection = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/miBaseDeDatos", "usuario", "contraseña");
        } catch (java.sql.SQLException e) {
            // Manejo de la excepción
            System.out.println("Se produjo una SQLException: " + e.getMessage());
        }
    }
    //Ejemplo de uso de la clase ParseException
    public static void manejarParseException() {
        try {
            // Código que puede generar una ParseException
            java.text.SimpleDateFormat formatoFecha = new java.text.SimpleDateFormat("dd/MM/yyyy");
            java.util.Date fecha = formatoFecha.parse("31/02/2023");
        } catch (java.text.ParseException e) {
            // Manejo de la excepción
            System.out.println("Se produjo una ParseException: " + e.getMessage());
        }
    }
    //Ejemplo de uso de la clase IOException
    public static void manejarIOException2() {
        try {
            // Código que puede generar una IOException
            java.io.FileReader fileReader = new java.io.FileReader("archivo.txt");
        } catch (java.io.IOException e) {
            // Manejo de la excepción
            System.out.println("Se produjo una IOException: " + e.getMessage());
        }
    }
    //Ejemplo de uso de la clase ClassCastException
    public static void manejarClassCastException() {
        try {
            // Código que puede generar una ClassCastException
            Object objeto = new String("Hola");
            Integer numero = (Integer) objeto; // Intento de conversión incorrecta
        } catch (ClassCastException e) {
            // Manejo de la excepción
            System.out.println("Se produjo una ClassCastException: " + e.getMessage());
        }
    }
    //Ejemplo de uso de la clase IllegalArgumentException
    public static void manejarIllegalArgumentException() {
        try {
            // Código que puede generar una IllegalArgumentException
            int numero = -5;
            if (numero < 0) {
                throw new IllegalArgumentException("El número no puede ser negativo.");
            }
        } catch (IllegalArgumentException e) {
            // Manejo de la excepción
            System.out.println("Se produjo una IllegalArgumentException: " + e.getMessage());
        }
    }
    //Ejemplo de uso de la clase StackOverflowError
    public static void manejarStackOverflowError() {
        try {
            // Código que puede generar un StackOverflowError
            manejarStackOverflowError(); // Llamada recursiva infinita
        } catch (StackOverflowError e) {
            // Manejo del error
            System.out.println("Se produjo un StackOverflowError: " + e.getMessage());
        }
    }
    //Ejemplo de uso de la clase OutOfMemoryError
    public static void manejarOutOfMemoryError() {
        try {
            // Código que puede generar un OutOfMemoryError
            int[] numeros = new int[Integer.MAX_VALUE]; // Intento de asignar un arreglo muy grande
        } catch (OutOfMemoryError e) {
            // Manejo del error
            System.out.println("Se produjo un OutOfMemoryError: " + e.getMessage());
        }
    }
    //Ejemplo de uso de la clase NoClassDefFoundError
    public static void manejarNoClassDefFoundError() {
        try {
            // Código que puede generar un NoClassDefFoundError
            Class.forName("ClaseInexistente");
        } catch (NoClassDefFoundError | ClassNotFoundException e) {
            // Manejo del error
            System.out.println("Se produjo un NoClassDefFoundError: " + e.getMessage());
        }
    }

}
