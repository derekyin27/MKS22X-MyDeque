import java.util.NoSuchElementException;
public class MyDeque<E>{
private E[] data;
private int size, start, end;
@SuppressWarnings("unchecked")
public MyDeque(){
  data = (E[])new Object[10];
  size=10;
  start = 0;
  end = data.length;
  }
@SuppressWarnings("unchecked")
public MyDeque(int initialCapacity){
  data = (E[])new Object[size];
  size = initialCapacity;
  start = 0;
  end = data.length;
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
     if (data[i] != null) return false;
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
  if (element == null) throw new NullPointerException();
  else if (end < data.length){
    data[end+1] = element;
    end++;
    size++;
  }
  else if (data[data.length-1] != null){
    resize();
    data[end+1] = element;
    end++;
    size++;
  }
 }
public E removeFirst(){
  if (isEmpty()) throw new NoSuchElementException();
  else {E ret = data[start];
  start++;
  size--;
return ret;
}
}
public E removeLast(){
  if (isEmpty()) throw new NoSuchElementException();
  else {E ret = data[end];
  end--;
  size--;
  return ret;
}
}
public E getFirst(){
  if (isEmpty()) throw new NoSuchElementException();
else return data[start];
}
public E getLast(){
  if (isEmpty()) throw new NoSuchElementException();
else return data[end];
}
}
