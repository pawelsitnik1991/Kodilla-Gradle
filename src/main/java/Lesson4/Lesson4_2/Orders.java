package Lesson4.Lesson4_2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Orders {
    public static void main(String[] args) {
        Set<Order> orderSet = new HashSet<>();

        orderSet.add(new Order("Poduszka"));
        orderSet.add(new Order("Koc"));
        orderSet.add(new Order("Koc"));
        System.out.println(orderSet);
    }


}
class Order{

    private String product;

    public Order(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Order{" +
                "product='" + product + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(product, order.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product);
    }
}
