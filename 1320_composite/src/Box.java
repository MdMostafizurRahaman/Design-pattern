import java.util.ArrayList;
import java.util.List;
class Box implements OrderComponent {
    private List<OrderComponent> items = new ArrayList<>();

    public void add(OrderComponent item) {
        items.add(item);
    }

    public void remove(OrderComponent item) {
        items.remove(item);
    }

    public double getPrice() {
        double totalPrice = 0;
        for (OrderComponent item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}
