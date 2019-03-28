import java.util.*;
public class Calculator{
  public static double eval(String s){
    MyDeque<String> stack = new MyDeque<String>();
    String[] temp = s.split(" ");
    for (int i = 0; i < temp.length; i++){
      stack.addLast(temp[i]);
      try{
        Double.parseDouble(stack.getLast());
      }
      catch (NumberFormatException e){
      double comp = 0.0;
      String next = stack.removeLast();
      if (next.equals("+")){
        double value = Double.parseDouble(stack.removeLast());
        double value2 = Double.parseDouble(stack.removeLast());
        comp = value2 + value;
        stack.addLast(comp + "");
      }
      else if (next.equals("-")){
        double value = Double.parseDouble(stack.removeLast());
        double value2 = Double.parseDouble(stack.removeLast());
        comp = value2 - value;
        stack.addLast(comp + "");
      }
      else if (next.equals("*")){
        double value = Double.parseDouble(stack.removeLast());
        double value2 = Double.parseDouble(stack.removeLast());
        comp = value2 * value;
        stack.addLast(comp + "");
      }
      else if (next.equals("/")){
        double value = Double.parseDouble(stack.removeLast());
        double value2 = Double.parseDouble(stack.removeLast());
        comp = value2 / value;
        stack.addLast(comp + "");
      }
    }

    }
  return Double.parseDouble(stack.getLast());

  }
}
