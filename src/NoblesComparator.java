import java.util.Comparator;

public class NoblesComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSurnameParts().length == o2.getSurnameParts().length) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        return Integer.compare(o1.getSurnameParts().length, o2.getSurnameParts().length);
    }
}