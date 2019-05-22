package yanghuadong.Enum;

/**
 * @Author yanghuadong
 * @DATE 2019/5/22 20:10
 */
public enum Order {
    CITY("武汉"),
    DISTRICT("洪山"),
    NAME("杨"),
    ID_NO("422123");

    private String desc;

    Order(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }}
