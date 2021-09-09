package lyh7712.sorted;

import java.time.LocalDateTime;

public class Shop {

    private String name;
    private int ordersCount;
    private LocalDateTime createTime = LocalDateTime.now();

    public Shop() {
    }

    public Shop(String name, int ordersCount) {
        this.name = name;
        this.ordersCount = ordersCount;
    }

    public Shop(String name, int ordersCount, LocalDateTime createTime) {
        this.name = name;
        this.ordersCount = ordersCount;
        this.createTime = createTime;
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

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", ordersCount=" + ordersCount +
                ", createTime=" + createTime +
                '}';
    }
}
