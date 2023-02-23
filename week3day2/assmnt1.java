import java.util.Scanner;
int no_elements=0;
int arr[] = new arr[100];

public void insertFirst(){
  
    if(no_elements=0){
      arr[0]=num;
      no_elements++;
    }
    else{
      for(int i=no_elements;i>0;i++){
        arr[i]=arr[i-1];
      }
      arr[0]=num;
      no_elements++;
    }
  }
public void display(){
  for(int i=0;i<no_elements;i++){
    System.out.print(arr[i]+" ");
  }
  viewOptions();
}



public void viewOptions() { 
  
System.out.println("1. Insert an element in first index position");
  System.out.println("choose your option");
  
  int option=0;  
  do{   
    option=s.nextInt();  
    switch(option){    
      case 1:     
        {        
          insertFirst(); 
          display();    
        }   
    }   
  }      
    while(option!=0);  
}

public static void main(String args[]){
  Assmnt as = new Assmnt();
  as.viewOption();
  
}