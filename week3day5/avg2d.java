class AvgFourth{
    public static void main(String[] args){
        int arr[][]={{4,6,2,5},
                     {7,9,4,8},
                     {6,9,3,7}};
        int sum=0;
        float avrage;

 

        for(int i=0;i<arr.length;i++){
            // for(int j=3;j<arr[i].length;j++){
                sum=sum + arr[i][3];
            // }
        }
        avrage=(float)sum/(arr.length);
        System.out.println("Average is "+avrage);
    }
}

/*
class Try{
public static void main(String[] args) {
   
int arr[][] = { {4,6,2,5}, {7,9,4,8},{6,9,3,7} };
  int sum=0;
   float avg;
   for(int i = 0; i < arr.length; i++) {  
    
            //for(int j = 0; j <= arr[i].length; j++){
              sum = sum  + arr[i][3];
              
            }
avg=(float)sum/(arr.length);
  System.out.println("The avg of 4th film is:"+avg);

   
}
}*/