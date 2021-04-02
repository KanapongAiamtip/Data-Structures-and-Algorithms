public class ArrayCollectionT3
{
    int size; //field
    Object[] elementData; //field

    public ArrayCollectionT3(int n) //constructer
    {
        this.size = 0;
        elementData = new Object[n];
    }

    public int size()
    {
        return size;
    }

    public void add(Object d)
    {
      elementData[size] = d;
      size++;
    }

}
