import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> nobles = new ArrayList<>();
        nobles.add(new Person("Maria", "Lozano Santos", 32));
        nobles.add(new Person("Jorge", "Herrero Monterro Rojas", 40));
        nobles.add(new Person("Joaquin", "Gutiérrez", 55));
        nobles.add(new Person("Catalina", "Ruíz Martínez Peña", 48));
        nobles.add(new Person("Manuel", "Soto Aguilar", 65));
        nobles.add(new Person("Ana", "Soler Ortiz y Flores", 25));

        Collections.sort(nobles, new NoblesComparator(3).reversed());
        System.out.println(nobles);
    }
}