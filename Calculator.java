public class Calculator{
  public static double eval(String s){
    MyDeque<String> stack = new MyDeque<>();
    String[] temp = s.split(" ");
    for (int i = 0; i < temp.length; i++){
      stack.addLast(temp[i]);
    }

  }
}
