import java.util.NoSuchElementException;
public class MyDeque<E>{
private E[] data;
private int size, start, end;
@SuppressWarnings("unchecked")
public MyDeque(){
  data = (E[])new Object[10];
  size=0;//default size of 10 for no parameter constructor
  start = 0;
  end = 0;
  }
@SuppressWarnings("unchecked")
public MyDeque(int initialCapacity){
  data = (E[])new Object[size];
  size = 0;
  start = 0;
  end = 0;
  }
public int size(){
  return size;
 }
public String toString(){
  String str = "{";
  if (size ==0)return "{ }";
  else if (start< end){
  for (int i = 0; i < data.length; i++){
    if (data[i] != null)
    str+= data[i] + " ";
  }
  str+="}";
}
else {
  for (int i = 0; i <= end; i++){
    str+=data[i]+" ";
  }
  for (int i = start; i < data.length; i++){
    str+=data[i]+" ";
  }
  str+=" }";
}
  return str;
 }
 @SuppressWarnings("unchecked")
 private void resize(){
   int counter = 0;
   E[] resized = (E[])new Object[size*2+1];
   for (int i = start; i < data.length; i++){
     resized[counter++] = data[i];
   }
   for (int i = 0; i < start; i++){
     resized[counter++] = data[i];
   }
   data = resized;
   end = count-1;
 }
 private boolean isEmpty(){
   for (int i = 0; i < data.length; i++){
     if (data[i] != null) return false;//linear check for empty deque
   }
   return true;
 }
public void addFirst(E element){
  if (element == null) throw new NullPointerException();
  if (start==0 && size>= data.length-1){
    resize();
 }
 else{
   start = data.length-1;
   data[data.length-1] = element;
   size++;
 }
 if (start !=0 && size!=data.length-1){
   start--;
   data[start] = element;
   size++;
 }

}

public void addLast(E element){
  if (element == null) throw new NullPointerException();//checks if element is null
  if (size >= data.length) resize();
  else if (end < data.length){//simply add the value to the right of last value
    data[end+1] = element;
    end++;
    size++;
  }
  else if (data[data.length-1] != null){//if the deque full, resize then add
    resize();
    data[end+1] = element;
    end++;
    size++;
  }
 }
public E removeFirst(){
  if (isEmpty()) throw new NoSuchElementException();
  else {E ret = data[start];//removes first element and return that value
  start++;
  size--;
return ret;
}
}
public E removeLast(){
  if (isEmpty()) throw new NoSuchElementException();//remove last element then return that value
  else {E ret = data[end];
  end--;
  size--;
  return ret;
}
}
public E getFirst(){
  if (isEmpty()) throw new NoSuchElementException();
else return data[start];//only returns first element
}
public E getLast(){
  if (isEmpty()) throw new NoSuchElementException();
else return data[end];//returns last element only
}
}
