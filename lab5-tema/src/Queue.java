public class Queue {
    //FIFO
    private int start = 0;
    private int end = 0;
    private Task[] queue;
    private int maxSize = 5;

    public Queue(){
        this.queue = new Task[maxSize];
    }

    public boolean empty () {
        return start == end;
    }

    public boolean full () {
        return (end + 1) % maxSize == start;
    }

    public boolean add (Task t) {
        if (full()) {
            return false;
        }
        queue[end] = t;
        end = (end + 1) % maxSize;
        return true;
    }

    public void extract() {
        if(!empty()) {
            queue[start].DoSomething();
            start = (start + 1) % maxSize;
        }
    }
}
