public class Driver {
    
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        System.out.print("In: ");
        bt.traverseInOrder(bt.getRoot());
        System.out.println();
        System.out.print("Pre: ");
        bt.traversePreOrder(bt.getRoot());
        System.out.println();
        System.out.print("Post: ");
        bt.traversePostOrder(bt.getRoot());
        System.out.println();
        System.out.print("Level: ");
        bt.traverseLevelOrder();
        System.out.println();

    }
}
