package manuel.programacion.tema11;

public class Uso_Comparable {
    // La interfaz Comparable se utiliza para definir un orden natural para los objetos de una clase. Permite comparar objetos de la misma clase y determinar su orden relativo. Esto es útil cuando se desea ordenar una colección de objetos, como listas o arreglos.
    // La interfaz Comparable tiene un único método, compareTo, que se utiliza para comparar el objeto actual con otro objeto de la misma clase. El método devuelve un valor entero que indica si el objeto actual es menor, igual o mayor que el objeto pasado como argumento.
    // Si el objeto actual es menor, devuelve un valor negativo; si son iguales, devuelve cero; y si es mayor, devuelve un valor positivo.
    // La implementación de la interfaz Comparable permite que los objetos de la clase se puedan ordenar automáticamente utilizando métodos de ordenación, como Collections.sort() o Arrays.sort(). Esto facilita la manipulación y organización de colecciones de objetos en Java.
    // La interfaz Comparable se utiliza comúnmente en clases que representan entidades que tienen un orden natural, como números, cadenas de texto o fechas. Al implementar la interfaz Comparable, se puede definir cómo se deben comparar los objetos de la clase y cómo se deben ordenar.
    // La interfaz Comparable se utiliza para definir un orden natural para los objetos de una clase. Permite comparar objetos de la misma clase y determinar su orden relativo. Esto es útil cuando se desea ordenar una colección de objetos, como listas o arreglos.


    //Ejemplo de implementación de la interfaz Comparable en una clase Persona

    public class Persona implements Comparable<Persona> {
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }

        @Override
        public int compareTo(Persona otraPersona) {
            return Integer.compare(this.edad, otraPersona.edad);
        }
    }
    // En este ejemplo, la clase Persona implementa la interfaz Comparable y define el método compareTo para comparar personas por su edad. Esto permite ordenar una lista de personas según su edad utilizando métodos de ordenación como Collections.sort() o Arrays.sort().

    public static void main(String[] args) {
        Uso_Comparable instancia = new Uso_Comparable();

        // Crear dos objetos Persona

        Persona persona1 = instancia.new Persona("Juan", 25);
        Persona persona2 = instancia.new Persona("María", 30);

        // Comparar dos personas
        int resultado = persona1.compareTo(persona2);
        if (resultado < 0) {
            System.out.println(persona1.getNombre() + " es menor que " + persona2.getNombre());
        } else if (resultado > 0) {
            System.out.println(persona1.getNombre() + " es mayor que " + persona2.getNombre());
        } else {
            System.out.println(persona1.getNombre() + " es igual a " + persona2.getNombre());
        }
    }
}
