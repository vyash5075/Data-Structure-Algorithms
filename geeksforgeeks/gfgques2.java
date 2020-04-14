Given an array of positive integers. Your task is to find the leaders in the array.
Note: An element of array is leader if it is greater than or equal to all the elements to its right side. Also, the rightmost element is always a leader. 

Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N denoting the size of array.
The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

Output:
Print all the leaders.

Constraints:
1 <= T <= 100
1 <= N <= 107
0 <= Ai <= 107

Example:
Input:
3
6
16 17 4 3 5 2
5
1 2 3 4 0
5
7 4 5 7 3
Output:
17 5 2
4 0
7 7 3





class GFG {
	public static void main (String[] args) {
		//code
		
		Scanner in = new Scanner(System.in);
		int noOfInputs = in.nextInt();
		for (int i = 0;i < noOfInputs;i++) {
		    int size = in.nextInt();
		    int a[] = new int[size];
		    for (int j = 0;j < size;j++) {
		        a[j] = in.nextInt();
		        
		    }
		    printLeader(a);
		    System.out.println();
		    
		}
	}
	
	static void printLeader(int a[]) {
	    int max = Integer.MIN_VALUE;
	    Stack<Integer> s = new Stack<Integer>();
	    for(int i = a.length - 1 ; i >=0 ; i--) {
	        
	        if(a[i] > max) {
	            max = a[i];
	            s.push(max);
	            
	        }
	        
	    }
	    while (s.isEmpty() == false){
	        System.out.print(s.pop() + " ");
	    }
	}
	
}




//optimised solution
class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int flag = 0;
		
		for(int i=0;i<n;i++)
		{
		    int x = Integer.parseInt(br.readLine());
		    int[] a = new int[x];
		    StringBuilder sb = new StringBuilder();
		    List<Integer> list = new ArrayList<Integer>();
		    
		    String line = br.readLine(); 
			String[] strs = line.trim().split("\\s+"); 
			
			for (int j = 0; j < strs.length; j++) 
				a[j] = Integer.parseInt(strs[j]);
		    
		    int leader = a[x-1];
		    list.add(leader);
		    for(int j=x-2;j>=0;j--)
		    {
		        if(a[j]>=leader)
		        {
		            list.add(a[j]);
		            leader = a[j];
		        }
		    }
		    
		    for(int j=list.size()-1;j>=0;j--)
		    {
		        sb.append(list.get(j));
		        sb.append(' ');
		    }
		    System.out.print(sb);
		    System.out.println();
		}
	}
}




or//


public class gfgques2 {
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int testcases=sc.nextInt();
                int arr2[]=new int[10000];
		int l=0;
		while(testcases!=0)
		{
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		        
                    }
                     int a=arr[n-1];
		  for(int i=n-1;i>=0;i--)
                  {
                      if(arr[i]>a||arr[i]==a)
                      {
                          arr2[l]=arr[i];
                          l++;
                       a=arr[i];
                      }  
		}
                  for(int k=l-1;k>=0;k--)
                  {
                      System.out.print (arr2[k]+" ");
                  }         
	}
                
                
}
    
}

