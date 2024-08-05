class Solution {
    public boolean search(int[] arr, int target) {
        int start=0,end=arr.length-1;
        boolean ans=false;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                ans=true;
                break;
            }

            else if(arr[mid]==arr[start] && arr[mid]==arr[end]){ 
                start++;
                end--;
            }

            else if(arr[start]<=arr[mid]){ 
                if(arr[start]<=target && arr[mid]>target){
                    end=mid-1;
                }else{
                    start=mid+1;
                }

            }else{ 
                if(arr[mid]<target && arr[end]>=target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }

        return ans;
    }
}