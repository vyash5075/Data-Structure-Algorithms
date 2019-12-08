import java.util.*;
public class queue_using_array {
    public int capacity;
    int queuearr[];
    int front;
    int rear;
    int currentsize=0;
     queue_using_array(int sizeofqueue)
     {
    this.capacity=sizeofqueue;
    front=0;
    rear=-1;
    queuearr=new int[this.capacity];
        
    }
     public boolean full()
     {
         if(currentsize==capacity)
             return true;
         else 
             return false;
     }
     public void enqueue(int data)
     {
         if(full())
         {
             System.out.println("queue is full");
         }
         else{
             rear++;
             if(rear>capacity-1)
             {
                 rear=0;
             }
             queuearr[rear]=data;
             currentsize++;
             System.out.println(data+"is added to queue");
         }
     }
     public boolean empty()
     {
 if (currentsize == 0){
 return true;
 }
 return false;
 }
     public void dequeue()
     {
         if(empty())
         {
             System.out.println("queue is empty we cannot delete item");
         }
         else {
             front++;
             if(front==capacity-1)
             {
              System.out.println(queuearr[front-1]+" removed from the queue");
                front = 0;
             }
             else
             {
                System.out.println(queuearr[front-1]+" removed from the queue");
             }
        currentsize--;
         }
     }
     public static void main(String args[])        
     {
         queue_using_array queue=new queue_using_array(5);
        queue.enqueue(6);
 queue.enqueue(3);
 queue.enqueue(99);
 queue.enqueue(56);
  queue.enqueue(43);
 queue.dequeue();
 queue.dequeue();

     }
     
}
