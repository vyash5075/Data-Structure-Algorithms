import.java.util.*;
public class linear_queue {
   int front=0;
   int rear=-1;
   int capacity;
   int current_size=0;
   int queuearr[];
   
   linear_queue(int sizeofqueue)
   {
       this.capacity=sizeofqueue;
       queuearr=new int[this.capacity];
   }
   public boolean full(){
    if(current_size==capacity)
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
               System.out.println("queue is full");
           }
           else{
               queuearr[rear]=data;
               current_size++;
               System.out.println(data +"is added to queue ");
           }
       }
   }
   public boolean empty(){
       if(current_size==0)
           return true;
       else
           return false;
   }
   public void dequeue()
   {
       if(empty())
       {
           System.out.println("queue is empty now please insert first");
       }
       else{
           front++;
           if(front>capacity-1)
           {
               System.out.println("queue is empty");
           }
           else{
                System.out.println(queuearr[front-1]+" removed from the queue");
                current_size--;
           }
       }
   }
   public static void main(String args[])
   {
    linear_queue q=new linear_queue(5);
    	q.enqueue(4);
     	q.enqueue(6);
      	q.enqueue(8);
        q.enqueue(10);
        q.enqueue(12);
        q.dequeue();
        q.enqueue(2);

   }
}
	