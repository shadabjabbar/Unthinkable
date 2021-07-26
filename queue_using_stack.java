import java.util.*;
public class queue_using_stack
{
    Stack<Integer> input=new Stack<Integer>();
    Stack<Integer> output = new Stack<Integer>();
    void add(int data){
        input.push(data);
    }
    void remove(){
        if(output.isEmpty())
        {
            while(!input.isEmpty())
            output.push(input.pop());
        }
        if(!output.isEmpty())
        System.out.println(output.pop());
    }
    void print(){
        if(output.isEmpty())
       System.out.println(input);
       else
       System.out.println(output);
    }
    public static void main(String[] args) {
        queue_using_stack ob=new queue_using_stack();
    
        ob.remove();
        ob.print();
    }
}