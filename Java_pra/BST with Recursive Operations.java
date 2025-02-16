class BSTRecursive extends BST {
    public boolean search(int data) {
        return searchRec(root, data);
    }

    private boolean searchRec(Node root, int data) {
        if (root == null) return false;
        if (root.data == data) return true;
        return data < root.data ? searchRec(root.left, data) : searchRec(root.right, data);
    }

    public static void main(String[] args) {
        BSTRecursive tree = new BSTRecursive();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        System.out.println(tree.search(30)); // true
        System.out.println(tree.search(100)); // false
    }
}
