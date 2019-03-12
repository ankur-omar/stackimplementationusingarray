
public class stack{
    int size;
    int top;
    int stackarray[];
    public stack()
    {
        size =10;
        top =-1;
        stackarray = new stackarray[size];
    }
    public void push(int data)
    {
        if(! isFull())
            top++;
        stackarray[top] = data;
    }
    int pop()
    {
        return (stackarray[top--]);
    }
    public boolean isFull()
    {
        return (top == stackarray.length-1);
    }
    public boolean isEmpty()
    {
        return top ==-1;
    }
    public static void main(String[] args)
    {
        stack obj = new stack();
        obj.push(23);
        obj.push(45);
        obj.push(34);
        obj.push(78);
        obj.push(99);
        obj.push(70);
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
    }
}

