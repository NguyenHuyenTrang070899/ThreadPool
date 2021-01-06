import java.io.BufferedWriter;
import java.io.FileWriter;

public class Threading implements Runnable{
    NewQueue queue = new NewQueue();
    String file;
    Boolean stop = false;

    public Threading(String file) {
        this.file = file;
    }

    public void pushQueue(String row) {
        queue.push(row);
    }

    public void Stop() {
        stop = true;
    }

    public void run() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file), 8 * (int) Math.pow(1024, 2));
            while (!stop) {
                try {
                    if (queue.getSize() == 0) {
                        Thread.sleep(0);
                        continue;
                    }
                    String row = queue.getQueue();
                    bw.write(row + "\n");
                } catch (Exception e) {

                }
            }
            bw.close();
        } catch (Exception e) {

        }
    }
}
