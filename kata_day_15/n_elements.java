public class ZywOo {
  public static int[] take(int[] arr, int n) {
    int[] ans = new int[n];
    
    if(arr.length == 0){
      return arr;
    }
    
    if(arr.length < n){
      return arr;
    }
    else{
      for(int i=0; i<n; i++){
      ans[i] = arr[i];
    }
    }
    
    return ans;//your code;
  }
}