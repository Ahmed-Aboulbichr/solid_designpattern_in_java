package design_pattern.creational.builder;

public class App {
    public static void main(String[] args) {
        Person person = new Person.Builder("Ahmed", "ahmed@gmail.com")
                .setAddress("address number 123")
                .setAge(23)
                .build();

        System.out.println(person.toString());
    }
}
