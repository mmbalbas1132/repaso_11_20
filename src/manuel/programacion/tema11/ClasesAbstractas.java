package manuel.programacion.tema11;

public class ClasesAbstractas {
  abstract class Mamifero {
    private final String nombre;
    private int edad;

    public Mamifero(String nombre, int edad) {
      this.nombre = nombre;
      this.edad = edad;
    }

      //se pueden implementar métodos abstractos que se pueden usar en las clases hijas y se pueden sobreescribir y se pueden usar en las clases hijas desarrollando el método.

    public abstract void hacerSonido();

    public String getNombre() {
      return nombre;
    }

    public int getEdad() {
      return edad;
    }
  }

  class Perro extends Mamifero {
    public Perro(String nombre, int edad) {
      super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
      System.out.println("Guau!");
    }
  }

  class Gato extends Mamifero {
    public Gato(String nombre, int edad) {
      super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
      System.out.println("Miau!");
    }


  }

  public static void main(String[] args) {
    ClasesAbstractas instancia = new ClasesAbstractas();

    Mamifero perro = instancia.new Perro("Rex", 5);
    Mamifero gato = instancia.new Gato("Miau", 3);

    System.out.println(perro.getNombre() + " hace: ");
    perro.hacerSonido();

    System.out.println(gato.getNombre() + " hace: ");
    gato.hacerSonido();
  }
}