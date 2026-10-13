/**
 * A linked-list implementation of QueueInterface using LLNode[cite: 12, 16].
 * 
 * @author (your name)
 */
public class LinkedQueue<T> implements QueueInterface<T>
{
    private LLNode<T> front;
    private LLNode<T> rear;
    private int size;

    public LinkedQueue()
    {
        front = null;
        rear = null;
        size = 0;
    }

    public int size()
    {
        return size;
    }

    public boolean empty()
    {
        // TODO: Return true if queue is empty
        return false;
    }

    public T add(T item)
    {
        // TODO: Create a new LLNode with item
        // 1. If queue is empty, set front and rear to newNode
        // 2. Otherwise, rear.setLink(newNode) and rear = newNode
        // 3. Increment size and return item
        return null;
    }

    public T peek()
    {
        // TODO: Return info from front node without removing
        // Throw QueueUnderflowException if empty
        return null;
    }

    public T remove()
    {
        // TODO: Remove front node and return its info
        // 1. Throw QueueUnderflowException if empty
        // 2. Save info from front node
        // 3. Advance front = front.getLink()
        // 4. If front is now null, set rear = null
        // 5. Decrement size and return saved info
        return null;
    }

    public void clear()
    {
        // TODO: Reset front = null, rear = null, size = 0
    }
}