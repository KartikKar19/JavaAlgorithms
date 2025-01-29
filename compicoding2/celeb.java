import java.util.*;
import java.io.*;
class Main{
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[][] rm= new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                rm[i][j]=sc.nextInt();
            }
        }
        int cid=new Solution().findCelebrity(rm,N);
        System.out.println(cid!=-1?"Celebrity id:"+cid+"No Celebrity");
    }
}

class Solution{
    int findCelebrity(int M[][],int n){
        int left=0,right=n-1;
        while(left<right){
            if(M[left][right]==1){
                left++;
            }else{
                right--;
            }
        }
        int candidate=left;
        for(int i=0;i<n;i++){
            if(i!=candidate &&(M[candidate][i]==1||M[i][candidate]==0)){
                return -1;
            }
        }
        return candidate;
    }
}