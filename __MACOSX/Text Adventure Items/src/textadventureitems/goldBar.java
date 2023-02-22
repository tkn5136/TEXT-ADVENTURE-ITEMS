package textadventureitems;

public class goldBar extends Item {
    private int value;

    public goldBar(int value) {
        super("goldBar", 1);
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
