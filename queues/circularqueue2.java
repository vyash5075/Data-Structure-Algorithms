import java.util.*;
public class circularqueue2 {
     public int capacity;
    int queuearr[];
    int front;
    int rear;
    int currentsize=0;
     circularqueue(int sizeofqueue)
     {
    this.capacity=sizeofqueue;
    front=-1;
    rear=-1;
    queuearr=new int[this.capacity];  
    }
     boolean full(){
        if(front == 0 && rear == capacity - 1){
            return true;
        }
        if(front == rear + 1) {
            return true;
        }
        return false;
    }
     public void enQueue(int data)
     {
         if(full())
         {
             System.out.println("queue is full");
         }
         else {
            if(front == -1) front = 0;
            rear = (rear + 1) % capacity;
            queuearr[rear] = data;
            System.out.println("Inserted " +  data);
        }
     }
       boolean empty(){
        if(front == -1) return true;
        else return false;
    }
      public int deQueue()
     {
         int element;
         if(empty())
         {
             System.out.println("queue is empty we cannot delete item");
              return(-1);
         }
         else {
            element = queuearr[front];
            if(front == rear){
                front = -1;
                rear = -1;
            } /* Q has only one element, so we reset the queue after deleting it. */
            else {
                front=(front+1) %capacity;
            }
            return(element);
        }
     }
     
     
      void display()
    {
        /* Function to display status of Circular Queue */
        int i;
        if(empty()) {
            System.out.println("queue is empty");
        }
        else
        {
            System.out.println("Front -> " + front);
            System.out.println( "Items -> ");
            for(i=front; i!=rear;i=(i+1)%capacity)
               System.out.println(queuearr[i]);
        System.out.println(queuearr[i]);
            System.out.println("Rear -> " +rear);
        }
    }
    public static void main(String args[])        
     {
         circularqueue2 q=new circularqueue2(5);
       q.deQueue();
    
    q.enQueue(1);
    q.enQueue(2);
    q.enQueue(3);
    q.enQueue(4);
    q.enQueue(5);
    
    // Fails to enqueue because front == 0 && rear == SIZE - 1
    q.enQueue(6);
    
    
    q.display();
    
    int elem = q.deQueue();
    
    if( elem != -1)
       System.out.append( "Deleted Element is " + elem);
    
    q.display();
    
    q.enQueue(7);
    
    q.display();
    
    // Fails to enqueue because front == rear + 1
    q.enQueue(8);
     }
}
