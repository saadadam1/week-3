class Unique {
 public static void main(String args[]) { 
    int arr[] = { 22,22,22,34,34,54,65,65,7,77,77,89,89,90,90,65,65};
 int count = 1;
  for (int i = 0; i < arr.length; i++) {
for (int j = i + 1; j < arr.length; j++) {
 if (arr[i] == arr[j]) {
 count++;
 arr[j] = -1;
}
}
if (arr[i] != -1 && count == 1) 
      { 
        System.out.println(arr[i]);
}
count = 1;}}
}