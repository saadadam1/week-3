class Ex2 {
  public static void main(String args[]){
    int arr[]={23,34,56,78,56,44,87};

    for (int i=0;i<arr.length;i++){
      if(arr[i]%2==0){
        arr[i]=arr[i]+5;
      }
      else{
                arr[i]=arr[i]-5;

      }
      System.out.println(arr[i]);
    }
  }
}