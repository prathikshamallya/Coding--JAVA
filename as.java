import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


class as {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int N = Integer.parseInt(element[0]);
		    int arr [] = new int[N];
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<N;i++){
	            arr[i] = Integer.parseInt(elements[i]);    
	        }
		    
		    int M = Integer.parseInt(br.readLine());
		    
		    Complete obj = new Complete();
		    arr = obj.sortExceptK(arr, N, M);
        	for (int i = 0; i < N; i++)
        	{
        	    System.out.print(arr[i] + " ");
        	}
        	System.out.println();
		}
	}
}



// } Driver Code Ends


//User function Template for Java

class Complete{
    
   
    // Function for finding maximum and value pair
    public static int[] sortExceptK (int arr[], int n, int k) {
        //Complete the function
        if (k >= n) {
            return arr;
        }
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<n;i++){
            ar.add(arr[i]);
        }
        int rem=ar.remove(k);
        Collections.sort(ar);
        int ins=0;
        while(ins<ar.size()&&ar.get(ins)<rem){
            ins++;;
        }
        ar.add(ins,rem);
        for(int i=0;i<n;i++){
            arr[i]=ar.get(i);
        }
        return arr;
    }
    
    
}