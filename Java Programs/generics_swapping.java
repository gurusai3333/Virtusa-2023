import java.lang.*;
import java.util.*;
import java.io.*;

class Generics_to_swap {

public static void main(String[] args) {

Box<Integer, String> box = new Box<Integer, String>();
box.SWAP(Integer.valueOf(10),"Hello World");
System.out.println("First Value :" + box.getSecond());
System.out.println("Second Value :"+ box.getFirst());

}
}
class Box<T, S>
{
private T t;
private S s;


public void SWAP(T t, S s){

this.t = t;
this.s = s;
}



public T getFirst() {
return t;
}

public S getSecond()
{
return s;

}

}