
public class Main {
    public static void main(String[] args) {

        Product hammer = new Product("Hammer", 10.99);
        Product phone = new Product("Phone", 499.99);
        Product headphones = new Product("Headphones", 99.99);
        Product charger = new Product("Charger", 29.99);

        Box orderBox = new Box();
        orderBox.add(hammer);
        orderBox.add(phone);

        Box anotherBox = new Box();
        anotherBox.add(headphones);
        anotherBox.add(charger);

        orderBox.add(anotherBox);

        double totalPrice = orderBox.getPrice();
        System.out.println("Total Price of the Complex Order: $" + totalPrice);
    }
}