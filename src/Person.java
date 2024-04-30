
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

// Abstract class Person
abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }


    public abstract String getRole();
}


