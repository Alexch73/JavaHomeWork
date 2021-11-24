package HomeCollect;

import java.util.*;

class Person {
    String name, company;
    int age, salary;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                salary == person.salary &&
                Objects.equals(name, person.name) &&
                Objects.equals(company, person.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary, company);
    }


}

class Generator {
    public static List<Person> generator(int num){
        Random random = new Random();
        List<Person> list = new ArrayList<>(num);
        for(int i = 0; i < num; i++){
            Person person = new Person();
            String name = Nameenum.values()[random.nextInt(7)].toString();
            String company = Companyenum.values()[random.nextInt(7)].toString();
            int age = random.nextInt(50)+18;
            int salary = random.nextInt(100000)+20000;
            person.setName(name);
            person.setCompany(company);
            person.setAge(age);
            person.setSalary(salary);
            list.add(person);
        }
        return list;
        }
    }

enum Nameenum {

    Игорь, Денис,Кристина,Ксения,Кира,Татьяна,Максим,Сергей;
    public static Nameenum getName(int z) {
        for (Nameenum name : values())
            if (z == name.ordinal()) return name;
        return Nameenum.getName(0);
    }
    }
enum Companyenum {

    Рога_и_Копыта, Аскон,Газпром,Роснефть,Альфа,Гугл,Яндекс,Кока_кола;
    public static Companyenum getName(int z) {
        for (Companyenum name : values())
            if (z == name.ordinal()) return name;
        return Companyenum.getName(0);
    }
}
class NameSort implements Comparator<Person>{
    @Override
    public int compare(Person nameA, Person nameB) {
        return nameA.getName().compareTo(nameB.getName());
    }
}
class SalarySort implements Comparator<Person>{

    @Override
    public int compare(Person a, Person b) {
        return Integer.compare(a.getSalary(), b.getSalary());
    }
}
class AgeSort implements Comparator<Person>{

    @Override
    public int compare(Person a, Person b) {
        return Integer.compare(a.getAge(), b.getAge());
    }
}
class CompanySort implements Comparator<Person>{

    @Override
    public int compare(Person a, Person b) {
        return a.getCompany().compareTo(b.getCompany());
    }
}
public class PersonTask {

    public static void main(String[] args) {
//        Random random=new Random();
//        System.out.println(Nameenum.getName(random.nextInt(7)));
//        System.out.println(Companyenum.getName(random.nextInt(7)));
        List<Person> personList = Generator.generator(8);

        System.out.println(personList);
        Collections.sort(personList, new NameSort());
        System.out.println(personList);

        Collections.sort(personList, new NameSort().thenComparing(new SalarySort()));
        System.out.println(personList);
        Collections.sort(personList, new NameSort().thenComparing(new SalarySort()).thenComparing(new AgeSort()).thenComparing(new CompanySort()));
        System.out.println(personList);

    }
}
