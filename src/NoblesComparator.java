import java.util.Comparator;

public class NoblesComparator implements Comparator<Person> {
    private int maxWordsInSurname;

    public NoblesComparator(int maxWordsInSurname) {
        this.maxWordsInSurname = maxWordsInSurname;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSurnameParts().length >= maxWordsInSurname && o2.getSurnameParts().length >= maxWordsInSurname) {
            return Integer.compare(o1.getAge(), o2.getAge());
        } else if (o1.getSurnameParts().length == o2.getSurnameParts().length) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        return Integer.compare(o1.getSurnameParts().length, o2.getSurnameParts().length);
    }
}