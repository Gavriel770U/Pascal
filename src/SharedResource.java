public class SharedResource
{
    private int value;

    public synchronized int getValue()
    {
        return this.value;
    }

    public synchronized void setValue(int value)
    {
        this.value = value;
    }
}
