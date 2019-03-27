public class Calculator{
  public static double eval(String s){
    MyDeque<String> stack = new MyDeque<String>();
    String[] temp = s.split(" ");
    for (int i = 0; i < temp.length; i++){
      double comp = 0.0;
      stack.addLast(temp[i]);
      String next = stack.removeLast();
      if (next.equals("+")){
        double value = Double.parseDouble(stack.removeLast());
        double value2 = Double.parseDouble(stack.removeLast());
        comp = value + value2;
        stack.addLast(comp + "");
      }
      else if (next.equals("-")){
        double value = Double.parseDouble(stack.removeLast());
        double value2 = Double.parseDouble(stack.removeLast());
        comp = value - value2;
        stack.addLast(comp + "");
      }
      else if (next.equals("*")){
        double value = Double.parseDouble(stack.removeLast());
        double value2 = Double.parseDouble(stack.removeLast());
        comp = value * value2;
        stack.addLast(comp + "");
      }
      else if (next.equals("/")){
        double value = Double.parseDouble(stack.removeLast());
        double value2 = Double.parseDouble(stack.removeLast());
        comp = value / value2;
        stack.addLast(comp + "");
      }

    }
  return Double.parseDouble(stack.getLast());

  }
}
