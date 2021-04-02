public class ArrayCollectionT2
{
    int size; //field
    Object[] elements; //field

    public ArrayCollectionT2(int n) //constructer
    {
        this.size = n;
        elements = new Object[size];
    }

    public int size()
    {
        return size;
    }

}
