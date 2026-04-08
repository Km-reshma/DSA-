class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        // Base Case - koi bhi element nahi ho
        if (root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();//explore through the node for left and right

        List<Integer> temp = new ArrayList<>(); //temp array list

        q.add(root);
        q.add(null); //means level is finish move to next level like zero level is finish.

        while (!q.isEmpty()) {

            TreeNode curr = q.poll();

            if (curr == null) {

                ans.add(temp);

                if (q.isEmpty()) {
                    return ans;
                }

                q.add(null);
                temp = new ArrayList<>();
            }

            else {

                temp.add(curr.val);

                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }

        return ans;
    }
}