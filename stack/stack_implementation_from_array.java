  static int top=-1;
    public static void pop(int stack[]){
     if(top==0)
    {
        System.out.println("Stack is empty");
    }
    else{
        top=top-1;
        System.out.println(stack[top]);
        //return top;
    }
    }
    public static  void push( int stack[],int item)
    {
        if(top==stack.length)
        {
            System.out.println("stack is full");
        }
        {
            
        }
        stack[++top]=item;
         System.out.println("top element"+stack[top]);
        
    }
    public static void main(String args[])        
    {
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the no. of entries");
       int n=sc.nextInt();
       int stack[]=new int[n];
       push(stack,10);
       push(stack,20);
         push(stack,30);
           push(stack,40);
      
       pop( stack);
       pop(stack);
       pop(stack);
       pop(stack);
       pop(stack); 
       push(stack,40);
      
    }
}
