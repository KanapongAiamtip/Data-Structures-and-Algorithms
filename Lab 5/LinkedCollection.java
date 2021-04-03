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
    LinkedNode p = new LinkedNode(obj , null);
    p.next = first;
    first = p;
    size++;
  }

  public String toString(){
     String ans = "";
     LinkedNode p = this.first;
     while(p != null)
     {
    /*if(length-1) //if you want detele last comma in last element
      {
        ans = ans + p.element;
      }*/
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
    public boolean contains(Object obj)
    {
      LinkedNode p = this.first;
        while(p !=null )
        {
          if(p.element.equals(obj))
          {
             return true;

          }
           p = p.next;
         }
      return  false;
     }


    public void remove(Object obj)
    {
      LinkedNode p = this.first;
      if(p.element.equals(obj))
      {
        first = p.next;
        size--;
      }
      else
      {
          while(p.next != null && !p.next.element.equals(obj))
          {
            p = p.next;
          }
          if(p.next != null)
          {
            p.next = p.next.next;
            size--;
          }
          else
          {
            System.out.println("no such data");
          }
      }
    }
      public boolean isEmpty() //  use in TestArrayList
      {
        if(first == null)
        {
          return true;
        }
        return false;
      }

}
   //method contains  another way to do 
    /*public boolean contains(Object obj)
    {
      LinkedNode p = new this.first;
      for(int i = 0;  i < size; i++)
      {
        if(p.element == obj)
        {
        return true;
        }
       p = p.next;
      }  
      return false;
    }*/
