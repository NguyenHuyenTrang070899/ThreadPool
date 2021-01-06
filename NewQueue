import java.util.Comparator;
import java.util.PriorityQueue;

public class NewQueue {
    PriorityQueue<String> queue;
    Comparator<String> comparator = new Priority();

    public NewQueue() {
        this.queue = new PriorityQueue<String>(comparator);
    }

    public void push(String row) {
        try {
            synchronized (queue) {
                queue.add(row);
            }
        } catch (Exception e) {

        }
    }

    public int getSize() {
        return queue.size();
    }

    public String getQueue() {
        String row = null;
        try {
            if (queue.size() > 0) {
                synchronized (queue) {
                    row = queue.poll();
                }
            }
        } catch (Exception e) {

        }
        return row;
    }
}
