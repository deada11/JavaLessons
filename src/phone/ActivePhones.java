package phone;

public class ActivePhones {
        public static void main(String[] args) {
            String name = "tester-pester";

            Phone samsung = new Phone(987654321, 144.4, "Tester");

            Phone xiaomi = new Phone(12123123, "Nester");

            Phone iphone = new Phone();

            System.out.println(samsung.model + ' ' + samsung.weight + ' ' + samsung.getNumber());
            System.out.println(xiaomi.model + ' ' + xiaomi.weight + ' ' + xiaomi.getNumber());
            System.out.println(iphone.model + ' ' + iphone.weight + ' ' + iphone.getNumber());

            samsung.receiveCall(samsung.number);
            xiaomi.receiveCall(xiaomi.number);
            iphone.receiveCall(iphone.number);

            iphone.receiveCall(name, xiaomi.getNumber());

            samsung.sendMessage(samsung.model, xiaomi.getNumber(), iphone.number);
    }
}
