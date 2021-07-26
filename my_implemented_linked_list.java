public class my_implemented_linked_list {
    public static void main(String[] args) {
        my_created_linked_list list = new my_created_linked_list();
        list.add(15);
        list.add(78);
        list.add(100);
        list.add(56);
        list.add(200);
        list.print();
        list.reverse();
        list.print();
        System.out.println(list.size());
    }
}
