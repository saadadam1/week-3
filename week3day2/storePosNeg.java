//1. WAP to read values from array-1 and store +ve values in array-2 and -ve values in array-3 
class PosNeg{  public static void main(String args[]){    
  int arr[]={23,78,-4,-220,-43,34,23,-56,33};         
  int pos[]=new int[arr.length];    
  int neg[]=new int[arr.length];     
  int posIndex=-1,negIndex=-1;   
  for(int i=0;i<arr.length;i++){   
    if(arr[i]>=0){        
      pos[++posIndex]=arr[i];   
    }   
    else{    
      neg[++negIndex]=arr[i];       
    }     
  }   
  System.out.println("Positive values are: ");
  for(int i=0;i<=posIndex;i++){   
    System.out.print(pos[i]+" ");   
  }        
  System.out.println("\nOdd values are: ");  
  for(int i=0;i<=negIndex;i++){    
    System.out.print(neg[i]+" ");    
  }          
}
  }