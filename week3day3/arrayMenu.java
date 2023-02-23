import java.util.Scanner;

class Assmnt{

Scanner s= new Scanner(System.in);
  
int no_elements=0;
int arr[] = new int[100];


public void display(){
  for(int i=0;i<no_elements;i++){
    System.out.print(arr[i]+" ");
  }
  System.out.println();
  viewOptions();
}

public void insertFirst(){
  System.out.println("Enter the num to insert at first");
  int num=s.nextInt();
    if(no_elements==0){
      arr[0]=num;
      no_elements++;
    }
    else{
      for(int i=no_elements;i>0;i--){
        arr[i]=arr[i-1];
      }
      arr[0]=num;
      no_elements++;
    }
  }


  public void insertLast(){
  System.out.println("Enter the num to insert at last");
  int num=s.nextInt();
    if(no_elements==0){
      arr[0]=num;
      no_elements++;
    }
    else{
      /*for(int i=no_elements;i>0;i--){
        arr[i]=arr[i+1];
      }*/
      arr[no_elements]=num;
      no_elements++;
    }
  }

  public void insertSpecific(){
    System.out.println("Enter the num to insert at specific location");
  int num=s.nextInt();
    
        
    if(no_elements==0){
      System.out.println("since no value in array, value is assigned to first position");
      arr[0]=num;
      no_elements++;
    }
    
      else{
      System.out.println("Enter the specific location");
int loc=s.nextInt();
      for(int i=no_elements;i>loc;i--){
        arr[i]=arr[i-1];
      }
      arr[loc]=num;
        no_elements++;
    }
    
  }

public void deleteFirst(){

    if(no_elements==0){
      System.out.println("No value in array to delete");
    }
    else{
      for(int i=0;i<no_elements;i++){
        arr[i-1]=arr[i];
      }
      
      no_elements--;
    }
  }

  public void deleteLast(){
 
    if(no_elements==0){
      System.out.println("No value in array to delete");
    }
    else{
     /*for(int i=no_elements;i<0;i++){
        arr[i-1]=arr[i];
      }
      */
      no_elements--;
    }
  }

    public void deleteSpecific(){
      if(no_elements==0){    
        System.out.println("Array is empty");    
      } 
      else{   
        System.out.println("Enter index location to delete"); 
        int index=s.nextInt();
        
     if(index<no_elements)      {     
       for(int i=index;i<no_elements;i++){            
         arr[i]=arr[i+1];       
       }             
       no_elements--;    
     }  
  }
    }

   public void deleteSearch(){  
     System.out.println("Enter search element");  
     int key=s.nextInt();    
     int loc=-1;   
     for(int i=0;i<no_elements;i++){     
       if(key==arr[i]){      
         loc=i;         
         break;     
       }   
     }   
     if(loc>=0){   
       for(int i=loc;i<no_elements;i++){   
         arr[i]=arr[i+1];   
       }   
       no_elements--;  
     }
     else{     
       System.out.println("not found");   
     }
   }

  public void searchElement(){
    System.out.println("Enter search element");  
     int key=s.nextInt();    
     int loc=-1;   
     for(int i=0;i<no_elements;i++){     
       if(key==arr[i]){      
         loc=i;         
         break;     
       }   
  } 
    if(loc>=0){
    System.out.println("The element is present in location "+loc+"of the array");
      }
    else {
      System.out.println("The element is not present");
    }
  }

  public void searchElementFrequency(){
    System.out.println("Enter search element");  
     int key=s.nextInt();    
     int loc=-1,count=0;   
     for(int i=0;i<no_elements;i++){     
       if(key==arr[i]){      
         loc=i;         
         count++;     
       }   
  } 
    if(count>0){
    System.out.println("The frequency of search element is '"+count+"' in the array");
      }
    else {
      System.out.println("The element is not present");
    }
  }

  public void duplicateElement(){
   // System.out.println("Enter search element"); 
    int count=0;
     for(int i = 0; i < no_elements; i++) {  
            for(int j = i + 1; j < no_elements; j++) {  
                if(arr[i] == arr[j]){  
                    System.out.print(arr[j]+" "); 
                  count++;
                  break;
            }
     }

     }
     
    if(count==0){
    System.out.println("No duplicates");
      }
    else
    {
 System.out.println("Are the duplicate elements in the array");

    }
    
  }


  public void uniqueElement(){
   // System.out.println("Enter search element"); 
    int count=0;
     for(int i = 0; i < no_elements; i++) {  
            for(int j = 0; j < no_elements; j++)
              {  
                if(arr[i] == arr[j]){
                
                  break;
                }
                  if(i == j)
                  {
                   System.out.print(arr[i]+" "); 

                  }
            }
     }

     
     
   /* if(count==0){
    System.out.println("No unique");
      }
    else
    {
 System.out.println("Are the unique elements in the array");

    }*/
}

  

  
public void viewOptions() { 
  
System.out.println("1. Insert an element in first index position");
System.out.println("2. Insert an element in last index position");
System.out.println("3. Insert an element in specific index position");

System.out.println("4. delete an element in first index position");
System.out.println("5. delete an element in last index position");
System.out.println("6. delete an element in specific index position");  
System.out.println("7. search and delete an element in specific index position");  
System.out.println("8. search an element in specific index position"); 
System.out.println("9. search an elements frequency");  
System.out.println("10. search for duplicate elements ");
  System.out.println("11. search for unique elements ");  




  System.out.println("choose your option");
  
  int option=0;  
  do{   
    option=s.nextInt();  
    switch(option){
      case 0:
        {
          System.out.println("Array operations Ended. Thankyou");
        }
      case 1:     
        {        
          insertFirst(); 
          display();   
                    break;

        }   
      case 2:
        {
          insertLast();
          display();
                    break;

        }
      case 3:
        {
          insertSpecific();
        
          display();
          break;
        }
        case 4:
        {
          deleteFirst();
        
          display();
                    break;

        }
          case 5:
        {
          deleteLast();
        
          display();
                    break;

        }
          case 6:
        {
          deleteSpecific();
        
          display();
                    break;

        }
        case 7:
        {
          deleteSearch();
        
          display();
                    break;

        }
         case 8:
        {
          searchElement();
        
          display();
                    break;

        }
        case 9:
        {
          searchElementFrequency();
        
          display();
                    break;

        }
        case 10:
        {
          duplicateElement();
        
          display();
                    break;

        }
        case 11:
        {
          uniqueElement();
        
          display();
                    break;

        }
    }   
  }      
    while(option!=0);  
}

public static void main(String args[]){
  Assmnt obj = new Assmnt();
  obj.viewOptions();
  
}
}