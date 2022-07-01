//Specifying a class node to hold each node of queue
class Qnode {
    int data;
    Qnode next;

    Qnode(int d) {
        data = d;
        next = null;
    }
}

// Adding all the nodes to add to form a data structure
class Queue {
    Qnode front, rear;
    public Queue() {
        Qnode front, rear;
        front = rear = null;
    }
    // Returns boolean value if list is null
    boolean isEmpty() {
        return (this.front == null);
    }
    // Returns node at the front of queue
    int front() {
        if (isEmpty())
            return Integer.MIN_VALUE;
        return front.data;
    }
    // Returns node at the end of queue
    int rear() {
        if (isEmpty())
            return Integer.MIN_VALUE;
        return rear.data;
    }
    // Adds a given data to the end of queue
    void enqueue(int data) {
        Qnode node = new Qnode(data);
        if (rear == null) {
            front = rear = node;
            return;
        }
        rear.next = node;
        rear = node;
        System.out.println(data + "enqueued to given queue.");
    }
    // Pops out a nodd a from the front node of queue
    int dequeue() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        Qnode item = front;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        System.out.println(item.data+"dequeued from the given queue.");
        return item.data;
    }
    // Displays all the queue elements
    void display() {
        Qnode disp = front;
        while (disp.next != null) {
            System.out.print(disp.data + " ");
            disp = disp.next;
        }
        System.out.print(disp.data);
    }
}
// Driver class to implement Queue DS
public class QueueViaLList {
    public static void main(){
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        System.out.println("Queue Front : " + q.front.data);
        System.out.println("Queue Rear : " + q.rear.data);
    }
}