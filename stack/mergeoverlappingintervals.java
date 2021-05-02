 
package stackqueues;

/**
 *  6
 *  [[1,8],[5,12],[14,19],[22,28],[25,27],[27,30]]
 * output : 1-12,14-19,22-30
 * @author yash verma
 */
import java.util.*;

public class mergeoverlapping {
public static class Pair implements Comparable<Pair>{
    int st;
    int et;
    Pair(int st,int et){
        this.st=st;
        this.et=et;
    }
    //this>0    +ve
  //  this<0     -ve
    //this=0    0        
    public int compareTo(Pair other){
        if(this.st!=other.st){
            return  this.st-other.st;
        }else{
            return this.et-other.et;
        }
    }
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        mergeoverlappings(arr);
        
    } 
    public static void mergeoverlappings(int arr[][]){
            Pair []pairs=new Pair[arr.length];
            for(int i=0;i<arr.length;i++){
                pairs[i]=new Pair(arr[i][0],arr[i][1]);
            }
            Arrays.sort(pairs);
            Stack<Pair>st=new Stack<>();
            for(int i=0;i<pairs.length;i++){
                if(i==0){
                    st.push(pairs[i]);
                }
                else{
                    Pair top=st.peek();
                        if(pairs[i].st>top.et){
                            st.push(pairs[i]);
                        }
                        else{
                            top.et=top.et>pairs[i].et?top.et:pairs[i].et;
                        }   
                }
            }
            Stack<Pair>rs=new Stack<>();
            while(st.size()>0){
                rs.push(st.pop());
            }
            while(rs.size()>0){
                Pair p=rs.pop();
                System.out.println(p.st+"-"+p.et);
            }
    }
}
