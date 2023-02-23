class Mid {
  public static void main(String args[]){
    int arr[]={23,34,56,78,56,44};
int mid1=0,mid2=0,mid=0;
    for (int i=0;i<arr.length;i++){
      if(arr[i]%2==0){
        mid1 = ((arr.length)/2)-1;
        mid2 = (arr.length)/2;
        System.out.println(arr[mid1] + " and " + arr[mid2]);
break;
      }
    
      if(arr[i]%2!=0){
        mid = (arr.length)/2;
      System.out.println(arr[mid]);

      }
    }
    
  }
}