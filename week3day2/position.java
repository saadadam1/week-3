import java.util.Scanner;

class Pos {
  public static void main(String args[]){
    int arr[]={23,34,56,78,56,24};
    int search = 0;
     Scanner s = new Scanner(System.in);
    System.out.println("the search element");
    search = s.nextInt();
    for (int i=0;i<arr.length;i++){
      if(search==arr[i]){

    System.out.println("element is present in array in "+(i+1)+" position");

    break;
      }
      else {
        System.out.println("element is not present");
        break;
      }
    }
   
    
  }
}