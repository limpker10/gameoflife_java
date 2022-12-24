package epis.unsa;
import java.util.*;
import java.io.*;

public class Points{
  public static List<Point> interpreter(int x, int y, String fn){
    List<Point> l = new ArrayList<>();
    BufferedReader br;
    try {
      br = new BufferedReader(new FileReader(fn));
      String line = br.readLine();
      int row = 0;
      while(line != null){
        int col = 0;
        for(char c: line.toCharArray()){
          if(c == 'X' || c == 'x'){
            Point p = new Point(x + col, y + row);
            l.add(p);
          }
          col++;
        }
        row++;
        line = br.readLine();
      }
      br.close();
    } catch(Exception e){
      System.err.println("Can't find: " + fn);
    }
    return l;
  }
}
