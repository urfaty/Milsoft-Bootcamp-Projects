package console;

public class WrapperTest {
    public static void main(String[] args) {
        long l = 1234;
        String s = Long.toString(l);
        Long lw = Long.valueOf(l);
        Long lw2 = l;
        long l2 = lw;
    }

}
