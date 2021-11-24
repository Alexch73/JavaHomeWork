package ConvertJSON;

import java.io.IOException;
import java.io.StringWriter;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MainJson {
    public static void main(String[] args) throws IOException
    {
        Cat cat = new Cat();
        cat.name = "Murka";
        cat.age = 5;

//        Dog dog = new Dog();
//        dog.name = "Killer";
//        dog.age = 8;
//        dog.owner = "Bill Jeferson";

//        ArrayList<Pet> pets = new ArrayList<Pet>();
//        pets.add(cat);
//        pets.add(dog);

        StringWriter writer = new StringWriter();
        ObjectMapper mapper = new ObjectMapper();
       // System.out.println(writer.toString());
        mapper.writeValue(writer, cat.age);
        System.out.println(writer.toString());

    }
    static class Cat {
        public String name;
        public int age;
        //public List<Cat> cats;
    }
}
