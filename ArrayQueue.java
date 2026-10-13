/**
 * An expandable array-based implementation of QueueInterface.
 * 
 * @author (your name)
 */
public class ArrayQueue<T> implements QueueInterface<T>
{
    private static final int DEFAULT_CAPACITY = 10;

    private T[] queue;
    private int front;
    private int rear; // Set to -1 when the queue is empty

    @SuppressWarnings("unchecked")
    public ArrayQueue()
    {
        queue = (T[]) new Object[DEFAULT_CAPACITY];
        front = 0;
        rear = -1;
    }

    /**
     * Calculates the logical size of the queue dynamically using front, rear,
     * and the array capacity.
     */
    public int size()
    {
        // TODO: Calculate and return logical size
        // Case 1: Queue is empty (rear == -1) -> size is 0
        // Case 2: Unwrapped (rear >= front)   -> size is (rear - front + 1)
        // Case 3: Wrapped (rear < front)     -> size is (queue.length - front + rear + 1)
        return 0;
    }

    public boolean empty()
    {
        // TODO: Return true if queue is empty
        return false;
    }

    public T add(T item)
    {
        // TODO: Add item to the rear of the queue
        // 1. Call checkSize() to expand array if full (size() == queue.length)
        // 2. If queue is empty (rear == -1), set front = 0 and rear = 0
        // 3. Otherwise, advance rear: rear = (rear + 1) % queue.length
        // 4. Place item at queue[rear] and return item
        return null;
    }

    public T peek()
    {
        // TODO: Return element at front without removing
        // Throw QueueUnderflowException if empty
        return null;
    }

    public T remove()
    {
        // TODO: Remove and return element at front
        // 1. Throw QueueUnderflowException if empty
        // 2. Save queue[front] and set queue[front] = null (prevent memory leaks)
        // 3. If removing the last remaining item (size() == 1), reset front = 0 and rear = -1
        // 4. Otherwise, advance front: front = (front + 1) % queue.length
        // 5. Call checkSize() to handle array shrinking
        // 6. Return saved element
        return null;
    }

    public void clear()
    {
        // TODO: Reset queue to default initial empty state
    }

    @SuppressWarnings("unchecked")
    private void checkSize()
    {
        // TODO: Handle dynamic resizing
        // 1. If full (size() == queue.length), expand capacity (e.g., double length)
        // 2. If sparse (size() < queue.length / 4 && queue.length > DEFAULT_CAPACITY), shrink capacity
        // 3. Re-align remaining elements starting at index 0 of the new array
        // 4. Reset front = 0 and rear = newSize - 1 (or rear = -1 if empty)
    }
}