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
public void addFirst(E element){
  if (data[data.length] != null) resize();
if (start < end && end <data.length){
data[data.length] = element;
}
 }
 int i =0;
public void addLast(E element){
  if (end < data.length) data[end+1] = element;
 }
public E removeFirst(){
  E ret = data[start];
  start++;
  size--;
return ret;
 }
public E removeLast(){
  E ret = data[end];
  end--;
  size--;
  return ret;
 }
public E getFirst(){
return data[start];
}
public E getLast(){
return data[start];
}
}
