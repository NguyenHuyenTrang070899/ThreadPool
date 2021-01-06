import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteA {
    public void WriteA(File file) throws IOException {
        long start = System.currentTimeMillis();
        BufferedWriter bw = new BufferedWriter(new FileWriter(file), 8 * (int) Math.pow(1024, 2));
        int size = 100000000;
        for (int i = 1; i <= size; i++) {
            bw.write(Integer.toString(i) + "\n");
        }
        bw.close();
        long end = System.currentTimeMillis();
        System.out.println("Time to write file A: " + (end - start)/1000 + "s");
    }
}
