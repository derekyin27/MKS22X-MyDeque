import java.util.NoSuchElementException;
public class MyDeque<E>{
private E[] data;
private int size, start, end;
@SuppressWarnings("unchecked")
public MyDeque(){
  data = (E[])new Object[10];
  size=0;//default size of 10 for no parameter constructor
  start = -1;
  end = -1;
  }
@SuppressWarnings("unchecked")
public MyDeque(int initialCapacity){
  data = (E[])new Object[size];
  size = 0;
  start = -1;
  end = -1;
  }
public int size(){
  return size;
 }
public String toString(){
  String str = "{";
  for (int i = 0; i < data.length; i++){
    if (data[i] != null)
    str+= data[i] + " ";
  }
  return str + "}";
 }
 @SuppressWarnings("unchecked")
 private void resize(){
   E[] resized = (E[])new Object[size*2];
   for (int i = 0; i < data.length; i++){
     resized[i] = data[i];
   }
   data = resized;
 }
 private boolean isEmpty(){
   for (int i = 0; i < data.length; i++){
     if (data[i] != null) return false;//linear check for empty deque
   }
   return true;
 }
public void addFirst(E element){
  if (element == null) throw new NullPointerException();
  if (data[data.length] != null){
    resize();
 }
 if (start < end){

 }
}

public void addLast(E element){
  if (element == null) throw new NullPointerException();//checks if element is null
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
