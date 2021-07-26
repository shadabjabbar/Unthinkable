public class implementing_circular_queue {
    public static void main(String[] args) {
        circular_queue q=new circular_queue(3);
        q.push(1);
        q.push(2);
        q.push(3);
        q.pop();
        q.pop();
        q.push(4);
        q.push(5);
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        q.printPointers();
    }
    
}
