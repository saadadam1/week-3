import java.util.Scanner;
 
class   All {
  public static void main(String args[]) {
 
    int arr[] = { 23, 89, 10, 12, 77, 10, 90,10, 41 };
 int no = 8;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter key value");
    int key = s.nextInt();
    ;// 10
    for (int i = 0; i < no; i++) {
      if (key == arr[i]) {
       int index=i;
       if(index>=0){
        for(int j=index;j<no ;j++){
        arr[j]=arr[j+1];
        }
          no--;
        } //break;
      }
    }
    for (int i = 0; i <= no ; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}



