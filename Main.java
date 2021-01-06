import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("A.txt");
        WriteA w = new WriteA();
        w.WriteA(file);
        StartThread t = new StartThread();
        t.readFileA(file);
    }
}
