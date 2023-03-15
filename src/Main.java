import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Comparator<Person> comparator = (o1, o2) -> {
            int maxWordsInSurname = 3;
            if (o1.getSurnameParts().length >= maxWordsInSurname && o2.getSurnameParts().length >= maxWordsInSurname) {
                return Integer.compare(o1.getAge(), o2.getAge());
            } else if (o1.getSurnameParts().length == o2.getSurnameParts().length) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
            return Integer.compare(o1.getSurnameParts().length, o2.getSurnameParts().length);
        };
        Set<Person> nobles = new TreeSet<>(comparator.reversed());
        nobles.add(new Person("Maria", "Lozano Santos", 32));
        nobles.add(new Person("Jorge", "Herrero Monterro Rojas", 17));
        nobles.add(new Person("Joaquin", "Gutiérrez", 80));
        nobles.add(new Person("Catalina", "Ruíz Martínez Peña", 48));
        nobles.add(new Person("Manuel", "Soto Aguilar", 65));
        nobles.add(new Person("Ana", "Soler Ortiz y Flores", 15));

        System.out.println(nobles);
    }
}