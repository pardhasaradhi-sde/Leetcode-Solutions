class Solution {
    void pre(Node root,ArrayList<Integer> res)
    {
        if(root==null)
        {
            return;
        }
        res.add(root.data);
        pre(root.left,res);
        pre(root.right,res);
    }
    public ArrayList<Integer> preorder(Node root) {
        ArrayList<Integer> res=new ArrayList<>();
        pre(root,res);
        return res;
        
    }
}