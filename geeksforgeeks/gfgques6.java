Given two arrays X and Y of positive integers, find number of pairs such that xy > yx (raised to power of) where x is an element from X and y is an element from Y.

Input:
The first line of input contains an integer T, denoting the number of test cases. Then T test cases follow. Each test consists of three lines. The first line of each test case consists of two space separated M and N denoting size of arrays X and Y respectively. The second line of each test case contains M space separated integers denoting the elements of array X. The third line of each test case contains N space separated integers denoting elements of array Y.

Output:
Corresponding to each test case, print in a new line, the number of pairs such that xy > yx.

Constraints:
1 ≤ T ≤ 100
1 ≤ M, N ≤ 105
1 ≤ X[i], Y[i] ≤ 103

Example:
Input
1
3 2
2 1 6
1 5

Output
3


class gfgques6
 {
	public static void main (String[] args) throws IOException
	 {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 int tc = Integer.parseInt(br.readLine());
	 while(tc-->0){
	    String s = br.readLine();
	    String[] str = s.trim().split("\\s+");
	    int n1 = Integer.parseInt(str[0]);
	    int n2 = Integer.parseInt(str[1]);
	    s = br.readLine();
	    String[] str1 = s.trim().split("\\s+");
	    int fx[] = new int[1001];
	    int fy[] = new int[1001];
	    for(int i=0;i<n1;i++){
	        fx[ Integer.parseInt(str1[i])]++;
	    }
	    s = br.readLine();
	    String[] str2 = s.trim().split("\\s+");
	    for(int i=0;i<n2;i++){
	        fy[ Integer.parseInt(str2[i])]++;
	    }
	    long total=0;
	    int count=0;
	    for(int i=2;i<1001;i++){
	        if(fx[i]>0){
	        count=0;
	         for(int j=5;j<1001;j++){
	             if(fy[j]>0){
	           if(j>i){
	              count+=fy[j];   
	           }
	       }
	         }
	         total+=count*fx[i];
	        }
	    }
	    
	    for(int i=1;i<5;i++){
	        if(fx[i]>0){
	            count=0;
	         for(int j=2;j<5;j++){
	             if(fy[j]>0){
	                if(Math.pow(i,j)>Math.pow(j,i)){
	                    count+=fy[j];
	                } 
	                 
	             }
	         }
	         total+=count*fx[i];
	        }
	    }
	    //for 1 power;
	    count=0;
	    for(int i=2;i<1001;i++)
	    {   if(fx[i]>0){
	        count+=fx[i];        
    	    }
	        
	    }
	    total+=count*fy[1];
	    System.out.println(total);
	 
	 }
	 
	 }
}	