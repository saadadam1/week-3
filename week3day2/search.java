import java.util.Scanner;

class Search {
  public static void main(String args[]){
    int arr[]={23,34,56,78,56,23};
    int search = 0,count=0;
     Scanner s = new Scanner(System.in);
    System.out.println("the search element");
    search = s.nextInt();
    for (int i=0;i<arr.length;i++){
      if(search==arr[i]){
        count++;
      }
    }
    if(count>0)
    {
          System.out.println("element is present in array "+count+" times");
    }
    else{
         System.out.println("element is not present in the array");

    }
    
  }
}