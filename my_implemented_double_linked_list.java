public class my_implemented_double_linked_list {
    public static void main(String[] args) {
        my_created_double_linked_list list=new my_created_double_linked_list();
        list.addBackword(100);
        list.addBackword(200);
        list.addBackword(300);
        list.addBackword(500);
        list.printForward();
        list.addMiddle(0, 3);
        list.printForward();
        list.printBackward();
    }
    
}
