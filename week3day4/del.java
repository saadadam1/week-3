import java.util.Scanner;
class All{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int arr[]={10,12,7,23,44,10,12,18};
    System.out.println("Enter the value to be delete all the occurance:");
    int value=s.nextInt();
    for(int i=0;i<arr.length;i++){
      if(arr[i]!=value){
        System.out.print(arr[i]+" ");
      }

    }
        for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]);
        }
  }
}