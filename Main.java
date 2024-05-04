import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.interfaces.Messenger;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;


public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Patryk", 7);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.out.println("Too young/old: " + e.getMessage());
        }

        int result = MathUtils.add(10, 15);

        Messenger messenger = new EmailMessenger();
        messenger.sendMessage("The sum is equal: " + result);






    }
}
