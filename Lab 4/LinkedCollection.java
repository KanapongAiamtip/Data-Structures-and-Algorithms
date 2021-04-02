public class LinkedCollection
{
  private int size;
  private LinkedNode first;
  private static class LinkedNode
  {
    Object element;
    LinkedNode next;
    public LinkedNode(Object obj ,LinkedNode node)
    {
      this.element = obj;
      this.next = node;
    }
  }
  public  LinkedCollection()
  {
      size = 0;
      first = null;
  }

  public int size ()
  {
    return size;
  }

  public void addF(Object obj)
  {
    LinkedNode p = new LinkedNode(obj,null);
    p.next = first;
    first  = p;
    size++;

  }

  public String toString()
  {
     String ans = "";
     LinkedNode p = this.first;
     while(p != null)
     {
       ans = ans+ p.element + ", ";
       p = p.next;
     }
     return ans;
  }

  public void addL(Object obj)
  {
    LinkedNode node = new LinkedNode(obj , null);
      if(first == null)
      {
        first = node;
      }
      else
      {
        LinkedNode p = this.first;
        while(p.next != null)
        {
          p = p.next;
        }
        p.next = node;
      }
      size++;
  }
}
