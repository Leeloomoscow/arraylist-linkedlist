import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        Person person1 = new Person("White");
        Person person2 = new Person("Rabbit");

        list.add(person1);
        list.add(person2);

        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
    }
}


