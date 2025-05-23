package manuel.programacion.tema11;

public class Interfaces {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    //Las interfaces son un contrato que las clases pueden implementar. Permiten definir métodos que deben ser implementados por las clases que implementan la interfaz. Las interfaces son útiles para definir comportamientos comunes entre diferentes clases sin necesidad de herencia.
    //Una interfaz puede contener métodos abstractos (sin implementación) y constantes. Las clases que implementan la interfaz deben proporcionar la implementación de los métodos definidos en la interfaz.
    //Las interfaces son una forma de lograr la programación orientada a interfaces, lo que permite una mayor flexibilidad y reutilización del código.
    // Las interfaces se crean con la palabra clave "interface" y se instancan con la palabra clave "new". Las clases que implementan la interfaz deben usar la palabra clave "implements" y proporcionar la implementación de los métodos definidos en la interfaz.
    //Ejemplo de uso de interfaces con un reproductor.
     public interface Reproductor {
      public void reproducir();
      public void pausar();
      public void detener();
    }
    // Implementación de la interfaz Reproductor en la clase ReproductorMP3

    public class ReproductorMP3 implements Reproductor {
        @Override
        public void reproducir() {
            System.out.println("Reproduciendo MP3");
        }

        @Override
        public void pausar() {
            System.out.println("Pausando MP3");
        }

        @Override
        public void detener() {
            System.out.println("Deteniendo MP3");
        }

    }

    // Implementación de la interfaz Reproductor en la clase ReproductorCD
    public class ReproductorCD implements Reproductor {
        @Override
        public void reproducir() {
            System.out.println("Reproduciendo CD");
        }

        @Override
        public void pausar() {
            System.out.println("Pausando CD");
        }

        @Override
        public void detener() {
            System.out.println("Deteniendo CD");
        }
    }

   // Una interfaz puede extender otras interfaces, lo que permite crear jerarquías de interfaces. Las clases que implementan la interfaz hija deben proporcionar la implementación de todos los métodos de las interfaces padre.
    // Ejemplo de interfaz que extiende otra interfaz
    public interface ReproductorAvanzado extends Reproductor {
        void avanzar();
        void retroceder();
    }
    // Implementación de la interfaz ReproductorAvanzado en la clase ReproductorMP3Avanzado
    public class ReproductorMP3Avanzado extends ReproductorMP3 implements ReproductorAvanzado {
        @Override
        public void avanzar() {
            System.out.println("Avanzado Avanzando MP3");
        }

        @Override
        public void retroceder() {
            System.out.println("Avanzado Retrocediendo MP3");
        }
    }

    // Método principal para probar la interfaz y las implementaciones
    public static void main(String[] args) {
        Reproductor reproductorMP3 = new Interfaces().new ReproductorMP3();
        Reproductor reproductorCD = new Interfaces().new ReproductorCD();

        reproductorMP3.reproducir();
        reproductorMP3.pausar();
        reproductorMP3.detener();

        reproductorCD.reproducir();
        reproductorCD.pausar();
        reproductorCD.detener();

        ReproductorAvanzado reproductorMP3Avanzado = new Interfaces().new ReproductorMP3Avanzado();
        reproductorMP3Avanzado.reproducir();
        reproductorMP3Avanzado.avanzar();
        reproductorMP3Avanzado.retroceder();
        reproductorMP3Avanzado.pausar();
        reproductorMP3Avanzado.detener();

    }
}
