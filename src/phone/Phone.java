package phone;

import java.util.Arrays;

public class Phone {
    int number = 444;
    double weight = 666.6;
    String model = "tester";

    Phone(int numberNew, double weightNew, String modelNew) {
        this(numberNew, modelNew);
        weight = weightNew;
    }

    Phone(int numberNew, String modelNew) {
        number = numberNew;
        model = modelNew;
    }

    Phone() {

    }
    void receiveCall(int callerName) {
        System.out.println("Calling " + callerName);
    }

    void receiveCall(String callerName, int number) {
        System.out.println("Warning! It's " + callerName + '\n' + "Number is " + this.number);
    }

    void sendMessage(String message, int ... numbers) {
        System.out.println("message is: " + message);
        System.out.println(Arrays.toString(Arrays.copyOf(numbers, numbers.length)));
    }
    int getNumber() {
        return number;
    }

}
