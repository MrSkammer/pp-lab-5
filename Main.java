import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.interfaces.Messenger;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;


public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];

        final int b =10;
        
        try {
          for (int i = 0; i < people.length; i++) {
            people[i] = new Person("John Doe " + i, 30 + i);
        }

        for (Person person : people) {
            int result = MathUtils.add(person.getAge(), b);

            Messenger messenger = new EmailMessenger();
            messenger.sendMessage("Mr Clone " + person.getName() + " is : " + result);
        }
        } catch (InvalidAgeException e) {
            System.out.println("Too young/old: " + e.getMessage());
        }

        int result = MathUtils.add(10, 15);

        Messenger messenger = new EmailMessenger();
        messenger.sendMessage("The sum is equal: " + result);
    }
}
