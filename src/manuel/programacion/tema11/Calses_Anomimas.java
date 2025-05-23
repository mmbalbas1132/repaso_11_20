package manuel.programacion.tema11;

public class Calses_Anomimas {
    // Clases anónimas son clases que no tienen un nombre y se utilizan para crear instancias de clases de forma rápida y sencilla. Se utilizan comúnmente en situaciones donde se necesita una implementación rápida de una interfaz o clase abstracta sin la necesidad de crear una clase separada. En resumens, son para usar y tirar.

    // Se crean utilizando la palabra clave "new" seguida de la interfaz o clase abstracta que se desea implementar. Luego, se proporciona la implementación de los métodos de la interfaz o clase abstracta dentro de llaves. Esto permite crear instancias de clases sin necesidad de definir una clase separada.

    // Ejemplo de una clase anónima calculadora
    public interface Calculadora {
        int sumar(int a, int b);
        int restar(int a, int b);
    }

    public static void main(String[] args) {
        // Crear una instancia de la interfaz Calculadora utilizando una clase anónima
        Calculadora calculadora = new Calculadora() {
            @Override
            public int sumar(int a, int b) {
                return a + b;
            }

            @Override
            public int restar(int a, int b) {
                return a - b;
            }
        };

        // Usar la instancia de la clase anónima.
        // Solo se puede usar dentro del método main porque no se puede instanciar fuera de este al ser una clase anónima.
        // Se puede usar en el mismo método donde se crea la instancia.

        System.out.println("Suma: " + calculadora.sumar(5, 3));
        System.out.println("Resta: " + calculadora.restar(5, 3));
    }

}
