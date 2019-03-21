public class MyDeque<E>{
private E[] data;
private int size, start, end;
@SuppressWarnings("unchecked")
public MyDeque(){
  data = (E[])new Object[10];
  }
public MyDeque(int initialCapacity){
  size = initialCapacity;
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
public void addFirst(E element){ }
public void addLast(E element){ }
public E removeFirst(){ }
public E removeLast(){ }
public E getFirst(){ }
public E getLast(){ }
}
