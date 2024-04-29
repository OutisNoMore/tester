import java.io.*;
import java.util.Calendar;

public class test{
  long a;
  public void test(long startTime){
    this.a = startTime;
    long k = startTime + 5000;
  }

  public static void main(String args[]){
    boolean a = true;
    a = Calendar.getInstance().getTimeInMillis() < 0;
    System.out.println("test");
  }
}
