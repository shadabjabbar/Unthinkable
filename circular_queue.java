public class circular_queue {
    int cq[],f,r,size;
    circular_queue(int size){
        this.size = size;
        cq=new int[size];
        f=r=-1;
    }
    void push(int data){
        if(f==-1&&r==-1){
            f=0;
            r=0;
            cq[r]=data;
        }
        else if((f==0&&r==size-1)||r==f-1)
        {
            System.out.println("Circular Queue Overflows");
        }
        else if(f>0&&r==size-1)
        {
            r=0;
            cq[r] = data;
        }
        else {
            r++;
            cq[r]=data;
        }
    }
    void pop()
    {
        if(f==-1&&r==-1){
            System.out.println("Queue Underflows..");
            return;
        }
        else if(f==size-1&&r<f)
        {
            System.out.println("Deleted Value = " + cq[f]);
            f=0;   
        }
        else if((f==size-1&&r==size-1)||f==r)
        {
            System.out.println("Deleted Value = " + cq[f]);
            f=-1;
            r=-1;
        }
        else{
            System.out.println("Deleted Value = "+cq[f]);
            f++;
        }
    }
    void peek()
    {
        if(f==-1&&r==-1){
            System.out.println("Circular Queue is Empty");
            return;
        }
        System.out.println("Peeked Value is equal to "+cq[f]);
    }
    void print()
    {
        for(int i=f;i<size;i++){
            System.out.print(cq[i]+" ");
        }
        for (int i = r; i < f; i++) {
            System.out.print(cq[i] + " ");
        }
        System.out.println();
    }
    void printPointers(){
        System.out.println("R>>"+r+"F>>"+f);
    }
    
}
