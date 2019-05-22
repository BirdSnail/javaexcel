package yanghuadong.Enum;

/**
 * @Author yanghuadong
 * @DATE 2019/5/22 20:12
 */
public class TestEnum {

    public static void main(String[] args) {
        Order[] orders = Order.values();
        for (Order order : orders) {
            System.out.println(order);
        }

        System.out.println(Order.CITY.getDesc());
        // select(Order.CITY);
    }

    public static void select(Order order) {
        switch (order) {
            case CITY:
                System.out.println("我是city");
                break;
            case NAME:
                System.out.println("我是name");
                break;
            default:
                System.out.println("我不知道我是谁");
        }
    }
}
