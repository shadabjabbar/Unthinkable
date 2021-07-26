public class stack {
    int st[],sp=-1,size;
    stack(int size) {
      this.size=size;
      st=new int[size];
    }
    void push(int data) {
        if(sp==(size-1)) {
            System.out.println("Stack overflows");
        }
        else
        {
            sp++;
            st[sp]=data;
        }
    }
    void pop()
    {
        if(sp==-1)
        System.out.println("Stack underflows");
        else{
            System.out.println("Deleted Value = "+st[sp]);
            st[sp]='\0';
            sp--;
        }
    }
    void peek()
    {
        if(sp==-1)
        System.out.println("Stack is Empty");
        else
        System.out.println("Peek is at = "+st[sp]);
    }
}
