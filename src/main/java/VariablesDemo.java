import com.geacademy.visibility.Address;
import com.geacademy.visibility.Person;
import mypackage.First;

public class VariablesDemo {

    private static Person staticPerson;
    private Person instancePerson;

    final long myFinalLong;

    public VariablesDemo() {
        First s;
        System.out.println(Address.pi);
        myFinalLong = -1;
//        abs(myFinalLong);
//        cos(myFinalLong);
//        System.out.println(Math.PI);
    }
    public static void main(String[] args) {
        System.out.println(staticPerson);   // will be null
        staticPerson = new Person("Static", "com.geacademy.visibility.Person");

        System.out.println(Address.pi);

//        System.out.println(instancePerson); //???
        VariablesDemo vd1 = new VariablesDemo();
        VariablesDemo vd2 = new VariablesDemo();

        System.out.println(vd1.instancePerson);
        vd1.instancePerson = new Person("Instant 1", "com.geacademy.visibility.Person");
        vd2.instancePerson = new Person("Instant 2", "com.geacademy.visibility.Person");

        Person localPerson = null;
        System.out.println(localPerson);  //????

        boolean b = false;
        System.out.println(b);

//        doSomething();
//        VariablesDemo.doSomething();
        vd1.doSomething();

        System.out.println("vd1 == vd2 are the references pointing to the same instance? " + (vd1 == vd2));
        System.out.println("vd1 == vd1.getSelfReference() are the references pointing to the same instance? " + (vd1 == vd1.getSelfReference()));

    }

    private int doSomething() {

        int outer = 3;

        for (int i = 0; i < 5; i++) {
            int inner = 10;
            System.out.println(i + ": " + (outer + inner));

        }

//        System.out.println(inner);
        return 1;
    }

    private VariablesDemo getSelfReference() {
        return this;
    }
}
