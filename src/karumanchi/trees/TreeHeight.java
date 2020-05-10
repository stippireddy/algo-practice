package karumanchi.trees;

public class TreeHeight {

  public static int getHeight(TreeNode head) {
    int height = 0;
    if (head == null || (head.getLeft() == null && head.getRight() == null)) {
      return 0;
    } else {
      height = 1 + Integer.max(getHeight(head.getLeft()), getHeight(head.getRight()));
    }
    return height;
  }

  public static void main(String[] args) {
    TreeNode t15 = new TreeNode(15, null, null);
    TreeNode t14 = new TreeNode(14, null, null);
    TreeNode t13 = new TreeNode(13, null, null);
    TreeNode t12 = new TreeNode(12, null, null);
    TreeNode t11 = new TreeNode(11, null, null);
    TreeNode t10 = new TreeNode(10, null, null);
    TreeNode t9 = new TreeNode(9, null, null);
    TreeNode t8 = new TreeNode(8, null, null);
    TreeNode t7 = new TreeNode(7, t14, t15);
    TreeNode t6 = new TreeNode(6, t12, t13);
    TreeNode t5 = new TreeNode(5, t10, t11);
    TreeNode t4 = new TreeNode(4, t8, t9);
    TreeNode t3 = new TreeNode(3, t6, t7);
    TreeNode t2 = new TreeNode(2, t4, t5);
    TreeNode t1 = new TreeNode(1, t2, t3);
    System.out.println(getHeight(t1));

    t1.setRight(null);
    t2.setRight(null);
    t2.setLeft(t3);
    t3.setRight(null);
    t3.setLeft(t4);
    System.out.println(getHeight(t1));
    t2.setRight(t3);
    t2.setLeft(null);
    System.out.println(getHeight(t1));
    t1 = null;
    System.out.println(getHeight(t15));
  }
}
