public class my_created_double_linked_list {
    Node head;
    boolean isEpmty()
    {
        return head==null;
    }
    void addBackword(int data){
        Node toAdd = new Node(data);
        if(isEpmty())
        {
            head=toAdd;
            return;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=toAdd;
            toAdd.prev=temp;
        }
    }
    void addForward(int data){
        Node toAdd = new Node(data);
        if (isEpmty()) {
            head = toAdd;
            return;
        }
        else{
            toAdd.next=head;
            head.prev=toAdd;
            head=toAdd;
            toAdd=null;
        }
    }
    void addMiddle(int data,int pos)
    {
        Node toAdd=new Node(data);
        if(pos==1)
        {
            if(isEpmty())
            {
                head=toAdd;
                return;
            }
            toAdd.next=head;
            head.prev=toAdd;
            head=toAdd;
            toAdd=null;
            return;
        }
        else{
            Node temp1,temp2;
            temp1=temp2=head;
            for(int i=1;i<pos;i++){
                temp2=temp1;
                temp1=temp1.next;
            }
            toAdd.next=temp1;
            toAdd.prev=temp2;
            temp2.next=toAdd;
            if(temp1!=null)
            temp1.prev=toAdd;
            temp1=null;
            temp2=null;
            toAdd=null;
        }
    }
    void printForward(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void printBackward()
    {
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    static class Node{
        Node next,prev;
        int data;
        Node(int data)
        {
            this.data = data;
            next=null;
            prev=null;
        }
    }
}
