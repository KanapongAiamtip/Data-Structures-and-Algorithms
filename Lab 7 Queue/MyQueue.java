public class MyQueue
{
  private Object[] elementData;
  private int size;
  private int front;
  public MyQueue(int n)
  {
    elementData = new Object[n];
    size = 0;
    front = 0;
  }

  public boolean isEmpty()
  {
    return size == 0;
  }
  public Object dequeue()
  {
    Object obj = elementData[front]; // obj = peek();
    elementData[front] = null;
    front++; size--;
    return obj;
  }
  public void enqueue(Object obj)
  {
    if(size < elementData.length)
    { // not full
      int b = (front + size) % elementData.length;
      elementData[b] = obj;
      size++;
    }
  }

  public String toString()
  {
    String ans = "";
    for(int i =0; i<elementData.length; i++)
    {
      if(elementData[i] != null)
      {
        ans = ans + elementData[i] + ",";
      }
    }
    return ans;

  }


}//MyQueue
