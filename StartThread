import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class StartThread {
    public void readFileA(File file) {
        Threading t1 = new Threading("B.txt");
        Threading t2 = new Threading("C.txt");
        Thread td1 = new Thread(t1);
        Thread td2 = new Thread(t2);
        td1.start();
        td2.start();

        try {
            final BufferedReader br = new BufferedReader(new FileReader(file), 8 * (int) Math.pow(1024, 2));
            String line;
            long start = System.currentTimeMillis();
            while ((line = br.readLine()) != null) {
                if (Integer.parseInt(line) % 2 == 0) {
                    t1.pushQueue(line);
                } else {
                    t2.pushQueue(line);
                }
            }
            t1.Stop();
            t2.Stop();
            br.close();
            long end = System.currentTimeMillis();
            System.out.println("Time to Write file B and C: " + (end - start)/1000 + "s");
        } catch (Exception e) {

        }
    }
}
