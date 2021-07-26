class my_created_linked_list
{
    Node head;
    boolean isEmpty()
    {
        return head == null;
    }
    void reverse()
    {
        Node current,prev,next;
        current = head;
        prev=next=null;
        while(current != null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }
    void add(int data)
    {
        Node toAdd=new Node(data);
        if(isEmpty())
        {
            head=toAdd;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=toAdd;
        toAdd=null;
    }
    void addFirst(int data){
        Node toAdd=new Node(data);
        if(isEmpty())
        {
            head=toAdd;
            return;
        }
        else{
            toAdd.next=head;
            head=toAdd;
        }
    }
    void addLast(int data)
    {
        Node toAdd=new Node(data);
        if(isEmpty())
        {
            head=toAdd;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = toAdd;
        toAdd = null;
    }
    void addMiddle(int data,int pos)
    {
        Node toAdd = new Node(data);
        if(pos==1)
        {
            toAdd.next =head;
            head = toAdd;
            return;
        }
        Node temp1,temp2;
        temp1=temp2=head;
        for(int i=1;i<pos;i++)
        {
            temp2=temp1;
            temp1=temp1.next;
        }
        temp2.next =toAdd;
        toAdd.next=temp1;
        return;    
    }
    void removeFirst()
    {
        Node temp=head;
        head=head.next;
        temp.data=0;
        temp=null;
    }
    void removeLast()
    {
        Node temp1,temp2;
        temp1=temp2=head;
        while(temp1.next!=null)
        {
            temp2=temp1;
            temp1=temp1.next;
        }
        temp2.next=null;
        temp1=null;
    }
    void removeMiddle(int pos)
    {
        if(pos==1)
        {
            Node temp=head;
            head=head.next;
            temp.data=0;
            temp=null;
        }
        Node temp1,temp2;
        temp1=temp2=head;
        for(int i=1;i<pos;i++)
        {
            temp2=temp1;
            temp1=temp1.next;
        }
        temp2.next=temp1.next;
        temp1=null;
    }
    int size(){
        Node temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        return size;
    }
    void print()
    {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
}