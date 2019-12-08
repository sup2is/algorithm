
import java.lang.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws Exception {
    
   	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   	StringBuilder target = new StringBuilder(br.readLine());
    StringBuilder sb = new StringBuilder();
    
    sb.append(target.charAt(0));
    String h = "-";
    
    
    int t = 0;
    while((t = target.indexOf(h)) > 0) {
      sb.append(target.substring(t + 1,t + 2));
      target.deleteCharAt(t);
    }
    
    System.out.println(sb.toString());
 
  }
}

