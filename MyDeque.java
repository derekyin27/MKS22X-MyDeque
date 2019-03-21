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
  String str = "";
  for (int i = 0; i < data.length; i++){
    str+= data[i];
  }
  return str;
 }
public void addFirst(E element){

 }
public void addLast(E element){ }
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
