import java.security.Key;

class KeyBoard
{
    int keys;
    String color;
   static  String brand;


public void pressed(){
    System.out.println("Signal senr");
}

public void throwIt(){
    System.out.println("got hit");
}



}

public class Demo {
    public static void main(String[] args) {
        // System.out.println("Hello world");


         int Num =9 ;

    KeyBoard obj = new KeyBoard();

    obj.pressed();
    obj.throwIt();


    System.out.println(KeyBoard.brand);
        


        
    }
    
}
