import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Ivan", "Petrov-Vodkin", 47));
        persons.add(new Person("Boris", "Ivanov", 17));
        persons.add(new Person("Petr", "Ivanov-Petrov-Vodkin", 7));
        persons.add(new Person("Oleg", "Ivanov", 27));
        persons.add(new Person("Boris", "Ivanov-Vodkin", 37));

        Collections.sort(persons, (o1, o2) -> {
            int lenght1 = o1.getSurname().split("-").length;
            int lenght2 = o2.getSurname().split("-").length;
            if (lenght1 < lenght2) {
                return -1;
            }
            if (lenght1 > lenght2) {
                ;
                return 1;
            }
            return o1.getAge() - o2.getAge();
        });


        persons.forEach(System.out::println);
    }
}
