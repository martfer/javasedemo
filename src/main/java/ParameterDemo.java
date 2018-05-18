import com.geacademy.visibility.Person;

public class ParameterDemo {
    public static void main(String[] args) {

        long param = 123L;
        doSomething(param);
        System.out.println(param);

        Person person = new Person("Kiss", "Jenő");
//        System.out.println(person);
        doWithReference(person);
        System.out.println(person);

    }

    public static void doSomething(long l) {
        l = l + 2;
    }

    public static void doWithReference(Person p) {
        p.setFirstName("Nagy");
//        p = new com.geacademy.visibility.Person("Nagy", "Gerzson");

    }
}
