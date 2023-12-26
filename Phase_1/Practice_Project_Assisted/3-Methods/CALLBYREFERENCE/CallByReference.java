
class IntWrapper {
    private int value;

    public IntWrapper(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
public class CallByReference {
    public static void main(String[] args) {
        IntWrapper x = new IntWrapper(5);

        increment(x);
    }

    public static void increment(IntWrapper n) {
        System.out.println("Inside the method: " + n.getValue());
        n.setValue(n.getValue() + 1);
        System.out.println("After incrementing: " + n.getValue());
    }
}


