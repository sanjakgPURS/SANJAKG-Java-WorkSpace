class Person {
    String name;
    int age;
     
    void speak() {
        System.out.println("Moje ime je: " + name);
    }
     
    int calculateYearsToRetirement() {
        int yearsLeft = 70 - age;
         
        return yearsLeft;
    }
     
    int getAge() {
        return age;
    }
     
    String getName() {
        return name;
    }
}
 
 
public class App {
 
    public static void main(String[] args) {
        Person person1 = new Person();
         
        person1.name = "Marko";
        person1.age = 28;
         
        int years = person1.calculateYearsToRetirement();
         
        System.out.println("Godine do penzije: " + years);
        int age = person1.getAge();
        String name = person1.getName();
         
        System.out.println("Ime: " + name);
        System.out.println("Godine: " + age);
    }
 
}