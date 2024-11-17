// package for Radnom number 
import java.util.Random;

class Radom_square_or_Cube{
//this is the main function 
  //RandomNumberGenator is a class for randomm number
  //check wether the the number is odd or even ;
  //if it even then number gentrator square or cube it odd.
    public static void main(String args[]){
      RadomNumberGenator radomGen =new RandomNumberGenator();
      radoomGen.start();
    }
}
//class for the RandomNumberGenreator 
class RadomNumberGenrator extends Thread{
public void run(){
  Random random = new Radnom();
}
  


}
