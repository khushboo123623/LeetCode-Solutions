class Solution {
    public int[] nextGreaterElement(int[]arr) {
       int m=arr.length;
       int ans1[] =new int[m];
       Stack<Integer>st=new Stack<>();
       for(int i=m-1;i>=0;i--){
        while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
            st.pop();
        }
        if(st.isEmpty()){
            ans1[i]=m;
        }else{
            ans1[i]=st.peek();
           
        }
        st.push(i);
       }
    
            
       return ans1;
    }
    public int[] preGreaterElement(int[]arr) {
       int m=arr.length;
       int ans1[] =new int[m];
       Stack<Integer>st=new Stack<>();
       for(int i=0;i<m;i++){
        while(!st.isEmpty() && arr[st.peek()]<arr[i]){
            st.pop();
        }
        if(st.isEmpty()){
            ans1[i]=-1;
        }else{
            ans1[i]=st.peek();
           
        }
        st.push(i);
       }
     return ans1;
    }
     public long sumSubarrayMins(int[] arr) {
        int n = arr.length;

        int[] ple = new int[n]; 
        int[] nle = new int[n]; 
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty())
                ple[i] = -1;
            else
                ple[i] = stack.peek();

            stack.push(i);
        }

        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty())
                nle[i] = n;
            else
                nle[i] = stack.peek();

            stack.push(i);
        }

        long ans = 0;

        
        for (int i = 0; i < n; i++) {
            long left = i - ple[i];
            long right = nle[i] - i;

            ans += 1L* arr[i] * left * right;
        }

        return  ans;
    }
    private long sumSubarrayMaxs( int [] arr) {
        int n = arr.length;
        int[] nge = nextGreaterElement(arr);
        int[] pgee = preGreaterElement(arr);
        
        long sum = 0;
        for (int i = 0; i < n; i++) {
            long left = i - pgee[i];
            long right = nge[i] - i;
           sum += 1L * arr[i] * left * right;
        }
        return sum;
    }
    public long subArrayRanges(int[] nums) {
        return sumSubarrayMaxs(nums) - sumSubarrayMins(nums);
    }
}