package lyh7712.sorted;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Shop shop = new Shop("찬스1", 10);
        Shop shop2 = new Shop("찬스2",20);
        Shop shop3 = new Shop("찬스3",50);
        Shop shop4 = new Shop("찬스4",4);
        Shop shop5 = new Shop("찬스5",1);
        Shop shop6 = new Shop("찬스6",16);
        Shop shop7 = new Shop("찬스7",45);
        Shop shop8 = new Shop("찬스8",85);
        Shop shop9 = new Shop("찬스9",32);
        Shop shop10 = new Shop("찬스10",52);
        Shop shop11 = new Shop("찬스11",15);
        Shop shop12 = new Shop("찬스12",3);
        Shop shop13 = new Shop("찬스13",58);
        Shop shop14 = new Shop("찬스14",34);

        List<Shop> shopList = new ArrayList<>();
        shopList.add(shop);
        shopList.add(shop2);
        shopList.add(shop3);
        shopList.add(shop4);
        shopList.add(shop5);
        shopList.add(shop6);
        shopList.add(shop7);
        shopList.add(shop8);
        shopList.add(shop9);
        shopList.add(shop10);
        shopList.add(shop11);
        shopList.add(shop12);
        shopList.add(shop13);
        shopList.add(shop14);

        for (int i = 0; i < shopList.size(); i++) {
            System.out.println(shopList.get(i));
        }

        System.out.println("---------------------");

        shopList.stream()
                .sorted(Comparator.comparing(Shop::getOrdersCount))
                .forEach(System.out::println);

    }
}
