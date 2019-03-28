import java.util.*;
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
  if (size ==0)return "{}";
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
   end = counter-1;
 }
 private boolean isEmpty(){
   for (int i = 0; i < data.length; i++){
     if (data[i] != null) return false;//linear check for empty deque
   }
   return true;
 }
public void addFirst(E element){
  if (element == null) throw new NullPointerException();
  if (data[0] == null){
    end = 0;
    data[end] = element;
    start=0;
  }
  else if (start-1 == end){
    resize();
    start = data.length-1;
    data[start] = element;
  }
  else if (start==0){
    start = data.length-1;
    data[start] = element;
  }
  else{
    start--;
    data[start] = element;
  }
  size++;

}

public void addLast(E element){
  if (element == null) throw new NullPointerException();//checks if element is null
  if (data[0] == null){
    end =0;
    data[end] = element;
    start=0;
  }
  else if (end+1 == data.length || end+1 == start){
    resize();
    end++;
    data[end] = element;
  }
  else if (end==0){
    end =1;
    data[end] = element;
 }
 else {
   end++;
   data[end] = element;
 }
 size++;
}
public E removeFirst(){
  if (size==0) throw new NoSuchElementException();
  E ret = data[start++];//removes first element and return that value
  data[start-1]=null;
  if (start == data.length) start=0;
  size--;
return ret;
}
public E removeLast(){
  if (size==0) throw new NoSuchElementException();//remove last element then return that value
  E ret = data[end--];
  data[end+1] = null;
  if (end == -1){
     end = data.length-1;
  }
  size--;
  return ret;
}
public E getFirst(){
  if (size==0) throw new NoSuchElementException();
else return data[start];//only returns first element
}
public E getLast(){
  if (size==0) throw new NoSuchElementException();
else return data[end];//returns last element only
}
}
