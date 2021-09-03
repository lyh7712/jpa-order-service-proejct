package lyh7712.sorted;

public class Shop {

    private String name;
    private int ordersCount;

    public Shop(String name, int ordersCount) {
        this.name = name;
        this.ordersCount = ordersCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrdersCount() {
        return ordersCount;
    }

    public void setOrdersCount(int ordersCount) {
        this.ordersCount = ordersCount;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", ordersCount=" + ordersCount +
                '}';
    }
}
