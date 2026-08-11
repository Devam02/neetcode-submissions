/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> ans=new ArrayList<>();

        if(root==null)
        {
            return ans;

        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty())
        {
            int size=q.size(); // At level 1 we have only 1 element right ?
            List<Integer> level=new ArrayList<>();

            for(int i=0;i<size;i++)
            {
                TreeNode frontElement=q.poll();
                level.add(frontElement.val);

                if(frontElement.left!=null)
                {
                    q.offer(frontElement.left);
                }
                if(frontElement.right!=null)
                {
                    q.offer(frontElement.right);
                }

            }

            ans.add(level);



        }

        return ans;

    }
}
