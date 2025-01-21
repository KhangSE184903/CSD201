
public interface QueueADT {
    public void clear();
    public boolean isEmpty();
    public void enqueue(Object obj);
    public Object dequeue() throws Exception ;
    public Object front() throws Exception ;
    public int size();
}