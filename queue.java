public class queue {
    int q[],f,r,size;
    queue(int size)
    {
        this.size = size;
        q=new int[size];
        f=r=-1;
    }
    void push(int data){
        if(r==size-1)
        {
            System.out.println("Queue Overflows");
        }
        else if(r==-1)
        {
            f=r=0;
            q[r++]=data;
        }
        else{
            q[r++]=data;
        }
    }
    void peek()
    {
        if(f==-1&&r==-1)
        {
            System.out.println("Queue is Empty...");
            return;
        }
        System.out.println("Peek Value is equal to = "+q[f]);
    }
    void pop()
    {
        if(f==-1&&r==-1)
        System.out.println("Queue underflows");
        else if(f==r)
        {
            System.out.println("Deleted Value is equal to "+q[f]);
            q[f]='\0';
            f=r=-1;
        }
        else{
            System.out.println("Deleted Value is equal to "+q[f]);
            f++;
        }
    }
}
