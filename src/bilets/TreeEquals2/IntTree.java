package bilets.TreeEquals2;

public class IntTree {
    private IntTreeNode root;

    public boolean equals2(IntTree otherTree) {
        return equalsHelper(this.root, otherTree.root);
    }

    private boolean equalsHelper(IntTreeNode node1, IntTreeNode node2) {
        if(node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        if (node1.data != node2.data) {
            return false;
        }
        return equalsHelper(node1.left, node2.left) && equalsHelper(node1.right, node2.right);
    }

    private static class IntTreeNode {
        int data;
        IntTreeNode left;
        IntTreeNode right;
        public IntTreeNode(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        IntTree tree1 = new IntTree();
        tree1.root = new IntTreeNode(1);
        tree1.root.left = new IntTreeNode(4);
        tree1.root.right = new IntTreeNode(3);
        tree1.root.right.right = new IntTreeNode(5);

        IntTree tree2 = new IntTree();
        tree2.root = new IntTreeNode(1);
        tree2.root.left = new IntTreeNode(4);
        tree2.root.right = new IntTreeNode(3);
        tree2.root.right.right = new IntTreeNode(5);

        boolean isEqual = tree1.equals2(tree2);
        System.out.println(isEqual);
    }
}
