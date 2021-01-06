import java.util.Comparator;

public class Priority implements Comparator<String> {
    public int compare(String x, String y) {
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        if (a < b) {
            return -1;
        }
        if (a > b) {
            return 1;
        }
        return 0;
    }
}
