public class SharedResource <T>
{
    private T value;

    public SharedResource(T value)
    {
        this.value = value;
    }

    public synchronized T getValue()
    {
        return this.value;
    }

    public synchronized void setValue(T value)
    {
        this.value = value;
    }
}
