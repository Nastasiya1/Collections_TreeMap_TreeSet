import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Person> nobles = new TreeSet<>(new NoblesComparator(3).reversed());
        nobles.add(new Person("Maria", "Lozano Santos", 32));
        nobles.add(new Person("Jorge", "Herrero Monterro Rojas", 40));
        nobles.add(new Person("Joaquin", "Gutiérrez", 55));
        nobles.add(new Person("Catalina", "Ruíz Martínez Peña", 48));
        nobles.add(new Person("Manuel", "Soto Aguilar", 65));
        nobles.add(new Person("Ana", "Soler Ortiz y Flores", 25));

        System.out.println(nobles);
    }
}