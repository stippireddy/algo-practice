package leetcode;

public class Leetcode1650 {
    public Node lowestCommonAncestor(Node p, Node q) {
        int depthP = getDepth(p);
        int depthQ = getDepth(q);

        while (depthP > depthQ) {
            p = p.parent;
            depthP--;
        }
        while (depthQ > depthP) {
            q = q.parent;
            depthQ--;
        }
        while (p != null) {
            if (p == q) {
                return p;
            }
            p = p.parent;
            q = q.parent;
        }
        return null;
    }

    private int getDepth(Node q) {
        int depth = 0;
        while (q != null) {
            depth++;
            q = q.parent;
        }
        return depth;
    }

    private static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node parent;
    }
}
