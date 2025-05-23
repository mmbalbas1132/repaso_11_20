package manuel.programacion.tema11;

public class Herencia_Polimorfismo {
    // Utilizar la herencia y el polimorfismo para crear una jerarquía de clases que represente diferentes tipos animales como perros, gatos y pájaros. Se usa instanceof para determinar el tipo de objeto en tiempo de ejecución y se implementa un método que imprime un sonido específico para cada tipo de animal.
    // Se utiliza la herencia para compartir atributos y métodos comunes entre las clases de animales, y se implementa el polimorfismo para permitir que cada clase hija implemente su propio comportamiento específico.

    // Definición de la clase base Animal
    static class Animal {
        String nombre;

        public Animal(String nombre) {
            this.nombre = nombre;
        }

        public void hacerSonido() {
            System.out.println("El animal hace un sonido.");
        }
    }
    // Definición de la clase Perro que hereda de Animal
    static class Perro extends Animal {
        public Perro(String nombre) {
            super(nombre);
        }

        @Override
        public void hacerSonido() {
            System.out.println(nombre + " dice: Guau!");
        }
    }
    // Definición de la clase Gato que hereda de Animal
    static class Gato extends Animal {
        public Gato(String nombre) {
            super(nombre);
        }

        @Override
        public void hacerSonido() {
            System.out.println(nombre + " dice: Miau!");
        }
    }
    // Definición de la clase Pajaro que hereda de Animal
    static class Pajaro extends Animal {
        public Pajaro(String nombre) {
            super(nombre);
        }

        @Override
        public void hacerSonido() {
            System.out.println(nombre + " dice: Pío!");
        }
    }
    // Método principal para probar la jerarquía de clases
    public static void main(String[] args) {
        Animal[] animales = {
            new Perro("Rex"),
            new Gato("Miau"),
            new Pajaro("Tweety")
        };

        for (Animal animal : animales) {
            animal.hacerSonido();
        }

        // Uso de instanceof para determinar el tipo de objeto
        for (Animal animal : animales) {
            if (animal instanceof Perro) {
                System.out.println(animal.nombre + " es un perro.");
            } else if (animal instanceof Gato) {
                System.out.println(animal.nombre + " es un gato.");
            } else if (animal instanceof Pajaro) {
                System.out.println(animal.nombre + " es un pájaro.");
            }
        }
    }

}
