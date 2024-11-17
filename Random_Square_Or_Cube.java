// package for Radnom number 
import java.util.Random;

class Radom_square_or_Cube{
//this is the main function 
  //RandomNumberGenator is a class for randomm number
  //check wether the the number is odd or even ;
  //if it even then number gentrator square or cube it odd.
    public static void main(String args[]){
      RandomNumberGenator randomGen =new RandomNumberGenator();
      randomGen.start();
    }
}
//class for the RandomNumberGenreator 
class RandomNumberGenrator extends Thread{
public void run(){
  //this randomly genrated 10 interger in randomnumber;
  Random random = new Radnom();
  for(int i;i<10;i++){
    int randomnumber=random.nextInt();
    System.out.println("Random number  :" +randomnumber);
  }
  //check statement if it even or not 
    if(Random%2==0){
      //go to the class squareThread
      squareThread squareTread= new squareThread();
      squareThread.start();
  
    } else{
      //go to the class cubeThread
        cubeThread cubeThread =new cubeThread();
        cubeThread.start();
      
    }
 // exit for 100 mil seconds
    try{
      Thread.sleep(100);
    }catch(InterrputedException e){
      e.printstackTrace();
    }
  
}
  


}
//class for squareThread
class SquareThread extends Thread{
  private int number;
  //calling n from the randnomgenrator
  squareThread(int n){
     number =n;
  }
  public void run(){
    System.out.println("square :"+number+":"+number*number);
  }
}
//class for cubeThread
class cubeThread extends Thread{
  //calling n from the randnomgenrator
  private int number;
  cubeThread(int n){
    number=n;
  }
  public void run(){
     System.out.println("square :"+number+":"+number*number*number);
}
