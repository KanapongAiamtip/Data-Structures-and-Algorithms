public class MyStack
{
  private int size;
  private LinkedNode root;
  private static class LinkedNode
  {
	   Object element;
	   LinkedNode next;
	    public LinkedNode(Object obj, LinkedNode node)
      {
   		 this.element = obj;
   		 this.next = node;
	    }
  }
    public MyStack()
    {
 	    root = null;
 	    size = 0;
    }

    public void push(Object obj)
    {
 	    LinkedNode p = new LinkedNode(obj, null);
 	    p.next = root;
 	    root = p;
      size++;
    }


    public int size ()
    {
        return size;
    }

    public boolean isEmpty()
    {
      LinkedNode p = this.root;
      while(p == null )
      {
        return true;
      }
      return  false;
    }

    public Object peek()
    {
      return root.element;
    }

    public Object pop()
    {
      root = root.next;
      size--;
      return root.element;
    }

    public String toString()
    {
      String ans = "";
      LinkedNode p = this.root;
      while(p != null)
      {
        ans = ans+ p.element + ", ";
        p = p.next;
      }
      return ans;
    }
}
//method peek  another way to do 
/*public Object peek()
{
    
  LinkedNode p = this.root;
  return p.element
}*/
//method peek  another way to do 
/*public Object peek()
{
  if(!isEmpty())
  {
   return root.element;
  }
  else
  {
    System.out.println("Stack is empty");
    return null;
  }
}/*


