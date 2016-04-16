public class Solution {
    public List<TreeNode> generateTrees(int n) {
        if(n==0) return new ArrayList<TreeNode>();
        return generateTrees(1, n);
    }

    private List<TreeNode> generateTrees(int start, int end){
        if(start>end) {
            List<TreeNode> list = new ArrayList<TreeNode>();
            list.add(null);
            return list;
        }
        if(start==end) {
            List<TreeNode> list = new ArrayList<TreeNode>();
            list.add(new TreeNode(start)); return list;
        }
        List<TreeNode> roots = new ArrayList<TreeNode>();
        for(int i=start;i<=end;i++){
            List<TreeNode> leftTrees = generateTrees(start, i-1);
            List<TreeNode> rightTrees = generateTrees(i+1, end);
            for(int j=0;j<leftTrees.size();j++){
                for(int k=0;k<rightTrees.size();k++){
                    TreeNode root = new TreeNode(i);
                    root.left = leftTrees.get(j);
                    root.right = rightTrees.get(k);
                    roots.add(root);
                }
            }

        }
        return roots;
    }
}
