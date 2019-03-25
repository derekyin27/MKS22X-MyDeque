public class Calculator{
  public static double eval(String s){
    MyDeque<Object> stack = new MyDeque<>();
    for (int i = 0; i < s.length(); i++){
      if (s.charAt(i) != ' '){
      if (s.charAt(i)!='+' && s.charAt(i)!='-' && s.charAt(i)!='*' && s.charAt(i)!='/'){
        stack.addLast(s.charAt(i));
      }
      else{
        
      }
    }

    }
  }
}
