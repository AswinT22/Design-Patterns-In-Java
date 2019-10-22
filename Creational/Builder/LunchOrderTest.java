package Creational.Builder;

public class LunchOrderTest {

    public static void main(String[] args) {

        LunchOrder.Builder builder=new LunchOrder.Builder();

        builder.bread("wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey");

        LunchOrder order=builder.build();

        System.out.println(order.getBread());
        System.out.println(order.getCondiments());
        System.out.println(order.getDressing());
        System.out.println(order.getMeat());
    }
}
