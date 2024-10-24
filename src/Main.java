import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Set<Person> details = new HashSet<>();
            Person p1 = new Person("Mirgisa",29,3.4);
            Person p2 = new Person("Abdela",25,4.0);
            Person p3 = new Person("Jermie",28,3.8);
            details.add(p1);
            details.add(p2);
            details.add(p3);
            System.out.println(details);
        }
}
class Person{
    private String name;
    private int age;
    private double grade;
    public Person(String name, int age, double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}