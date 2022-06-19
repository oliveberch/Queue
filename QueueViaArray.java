class Queue{
    int front,rear,size;
    int capacity;
    int arr[];
    public Queue(int capacity){
        this.capacity=capacity;
        front=this.size=0;
        rear=capacity-1;
        arr=new int[this.capacity];
    }

    boolean isFull(){
        return (this.size==this.capacity);
    }

    boolean isEmpty(){
        return (this.size==0);
    }

    int front(){
        if(isEmpty())
            return Integer.MIN_VALUE;
        return this.arr[this.front];
    }

    int rear(){
        if(isEmpty())
            return Integer.MIN_VALUE;
        return this.arr[this.rear];
    }

    void enqueue(int data){
        if(isFull())
            return;
        this.rear=(this.rear+1)%this.capacity;
        this.arr[this.rear]=data;
        this.size=this.size+1;
        System.out.println(data+"enqueued to given queue.");
    }

    int dequeue(){
        if(isEmpty())
            return Integer.MIN_VALUE;
        int item=this.arr[this.front];
        this.front=(this.front+1)%this.capacity;
        this.size=this.size+1;
        return item;
}
}
public class QueueViaArray{
    Queue q;
}