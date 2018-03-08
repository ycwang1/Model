package com.list.order;

import java.util.LinkedList;  
import java.util.Stack;  
  
class TreeNode  
{  
    String value;  
    TreeNode left;  
    TreeNode right;  
    public TreeNode(String value )   
    {  
        this.value = value;  
    }  
       
}  
public class BinaryTree   
{  
    //2.�������Ĳ������  
    //˼·�����ö���ʵ�ֶ������Ĳ��������  
    public  void cx(TreeNode root)  
    {  
        if(root==null)  
            return;  
        LinkedList<TreeNode> queue=new LinkedList<TreeNode>();  
        queue.addLast(root);  
        while(!queue.isEmpty())  
        {  
            TreeNode cur=queue.removeFirst();  
            System.out.print(cur.value+" ");  
            if(cur.left!=null)   
                queue.addLast(cur.left);              
            if(cur.right!=null)    
                queue.addLast(cur.right);  
                   
        }  
    }  
      
    //3.�������ĸ߶�  --�ݹ�--  
    public  int getHighRec(TreeNode root)  
    {  
        if(root==null)  
            return 0;  
        return Math.max(getHighRec(root.left), getHighRec(root.right))+1;  
    }  
    //3.�������ĸ߶�  --�� �ݹ�--  
    //˼·������������Ե�ǰ�����һ��Ľڵ���������  
    public  int getHigh(TreeNode root)  
    {  
        if(root==null)  
            return 0;  
        LinkedList<TreeNode> queue=new LinkedList<TreeNode>();  
        queue.addLast(root);  
        int high=0;  
        int curLevelNodes=1,nextLevelNodes=0;  
        while(!queue.isEmpty())  
        {  
            TreeNode cur=queue.removeFirst();  
            curLevelNodes--;  
            if(cur.left!=null)  
            {  
                queue.addLast(cur.left);  
                nextLevelNodes++;  
            }  
            if(cur.right!=null)  
            {  
                queue.addLast(cur.right);  
                nextLevelNodes++;  
            }  
            if(curLevelNodes==0)  
            {  
                high++;  
                curLevelNodes=nextLevelNodes;  
                nextLevelNodes=0;  
            }     
        }  
        return high;           
    }  
      
    //�����������͸߶�,������or������Ϊnull�����������С�߶�����һ��null��������С�߶� --�ݹ�--  
    public int getMinHigh(TreeNode root)  
    {  
        if(root==null)  
            return 0;  
        if(root.left==null&&root.right==null)  
            return 1;  
        if(root.left==null)  
            return 1+getMinHigh(root.right);  
        if(root.right==null)  
            return 1+getMinHigh(root.left);  
        return 1+Math.min(getMinHigh(root.right),getMinHigh(root.left)) ;  
    }  
    //4.�������Ľڵ����   --�ݹ�--  
    public  int getNodesNumRec(TreeNode root)  
    {  
        if(root==null)  
            return 0;  
        return getNodesNumRec(root.left)+getNodesNumRec( root.right)+1;  
    }  
    //4.�������Ľڵ����   --�ݹ�--  
    //˼·:���������¼����  
    public  int getNodesNum(TreeNode root)  
    {  
        if(root==null)  
            return 0;  
        LinkedList<TreeNode> queue=new LinkedList<TreeNode>();  
        queue.addLast(root);  
        int num=1;  
        while(!queue.isEmpty())  
        {  
            TreeNode cur=queue.removeFirst();  
            if(cur.left!=null)  
            {  
                queue.addLast(cur.left);  
                num++;  
            }  
            if(cur.right!=null)  
            {  
                queue.addLast(cur.right);  
                num++;  
            }  
        }  
        return num;  
    }  
      
    //5.��������ľ���(ֱ�Ӱ�ԭ����Ϊ�侵���������ƻ�ԭ��)   --�ݹ�--  
    //˼·:��ԭ������������Ϊ���������ľ��񣻰�ԭ������������Ϊ���������ľ���  
    public  TreeNode getJXRec(TreeNode root)  
    {  
        if(root==null)  
            return null;  
        TreeNode tleft=getJXRec(root.right);  
        TreeNode tright=getJXRec(root.left);  
        root.left=tleft;  
        root.right=tright;  
        return root;  
    }  
    //5.��������ľ���(ֱ�Ӱ�ԭ����Ϊ�侵���������ƻ�ԭ��)   --�ǵݹ�--  
    //˼·: ����Stsck,�ýڵ���ӽڵ㻥�ཻ��  
    public  TreeNode getJX(TreeNode root)  
    {  
        if(root==null)  
            return null;  
         Stack<TreeNode> stack=new Stack<TreeNode>();  
         stack.push(root);  
         while(!stack.isEmpty())  
         {  
             TreeNode cur=stack.pop();  
             TreeNode temp=cur.right;  
             cur.right=cur.left;  
             cur.left=temp;  
             if(cur.right!=null)  
                 stack.push(cur.right);  
             if(cur.left!=null)  
                 stack.push(cur.left);  
         }  
        return root;   
    }  
    //5.��������ľ�������һ�������������ı�ԭ���ṹ�� --�ݹ�--  
    public TreeNode newJXRec(TreeNode root)  
    {  
        if(root==null)  
            return null;  
        TreeNode newTree=new TreeNode (root.value);  
        newTree.left=newJXRec(root.right);  
        newTree.right=newJXRec(root.left);  
        return newTree;  
    }  
    //5.��������ľ�������һ�������������ı�ԭ���ṹ�� --�� �ݹ�--  
       
    //6.�ж������������Ƿ�Ϊ������    --�ݹ�--  
    public boolean isJXRec(TreeNode root1,TreeNode root2)  
    {  
        if(root1==null&&root2==null)  
            return true;  
        if(root1==null||root2==null)  
            return false;  
        if(root1.value!=root2.value)  
            return false;  
        return isJXRec( root1.left, root2.right)&&isJXRec( root1.right, root2.left);  
    }  
    //7.�ж�һ�Ŷ����������Ƿ�Ϊ������    --�ݹ�--  
        public boolean isJXRec2(TreeNode root)  
        {  
             if(root==null)  
                 return true;  
             return isJXRec2(root.left)&&isJXRec2(root.right);  
                   
        }  
     //8.�ж����Ŷ������ǲ�����ͬ����  --�ݹ�--  
    public boolean isSameTreeRec(TreeNode root1,TreeNode root2)  
    {  
        if(root1==null&&root2==null)  
            return true;  
        if(root1==null||root2==null)  
            return false;  
        if(root1.value!=root2.value)  
            return false;  
        return isSameTreeRec( root1.left,root2.left)&&isSameTreeRec(root1.right,root2.right);  
    }  
    //8.�ж����Ŷ������ǲ�����ͬ����  --�ǵݹ�--  
    public boolean isSameTree(TreeNode root1,TreeNode root2)  
    {  
        if(root1==null&&root2==null)  
            return true;  
        if(root1==null||root2==null)  
            return false;  
        if(root1.value!=root2.value)  
            return false;  
        Stack<TreeNode> stack1=new Stack<TreeNode>();  
        Stack<TreeNode> stack2=new Stack<TreeNode>();  
        stack1.push(root1);  
        stack2.push(root2);  
        while(!stack1.isEmpty()&&!stack1.isEmpty())  
        {  
            TreeNode cur1=stack1.pop();  
            TreeNode cur2=stack2.pop();  
            if(cur1.value!=cur2.value)  
                return false;  
            else   
            {  
                if(cur1.right!=null&&cur2.right!=null)  
                {  
                    stack1.push(cur1.right);  
                    stack2.push(cur2.right);  
                }  
                if(cur1.left!=null&&cur2.left!=null)  
                {  
                    stack1.push(cur1.left);  
                    stack2.push(cur2.left);  
                }  
                if(cur1.left==null&&cur1.right==null&&cur2.left==null&&cur2.right==null)  
                    return true;  
                else  
                    return false;  
            }             
        }  
        return true;  
    }  
    //9.�ж϶�����1�ǲ��Ƕ�����2���ӽṹ  
      
      
      
    //10.�ж϶������Ƿ���ƽ�������    --�ݹ�--   �������ַ�ʽ��Ȼ��࣬����ÿ���ڵ�ᱻ������Σ�������Ч  
    public boolean isBlanced(TreeNode root)  
    {  
        if(root==null)  
            return true;  
        if(Math.abs(getHighRec(root.left)-getHighRec(root.right))>1)//���ж��������������߶Ȳ�  
            return false;  
        return isBlanced(root.left)&&isBlanced( root.right);  
    }  
    //10.�ж϶������Ƿ���ƽ�������    --�ݹ�--   ���Ӹ�Ч�Ľⷨ��ÿ���ڵ�ֻ������һ��  
    //11.�ڱ����Ĺ�����һ�߱���һ�߼���߶�  
    public boolean isBlanced2(TreeNode root)  
    {  
        int high=0;  
        return isBlanced3(root,high);  
    }     
    public boolean  isBlanced3(TreeNode root,int high)  
    {  
        if(root==null)  
        {  
            high=0;  
            return true;  
        }  
        int lefthigh=0,righthigh=0;  
        if(isBlanced3(root.left,lefthigh)&&isBlanced3(root.right,righthigh))  
        {  
            if(Math.abs(lefthigh-righthigh)<=1)  
            {  
                high=1+Math.max(lefthigh, righthigh);  
                return true;  
            }  
        }  
        return false;  
    }  
      
      
      
    //11.���������k��Ľڵ����  --�ݹ�--  
    public int getNodesInKRec(TreeNode root,int k)  
    {  
        if(root==null||k<1)  
            return 0;  
        if( k==1)  
            return 1;  
        return  getNodesInKRec(root.left,k-1)+getNodesInKRec(root.right,k-1);  
    }  
    //11.���������k��Ľڵ����  --�� �ݹ�--  
    //˼·:��������������ڷǵݹ���߶�  
    public int getNodesInK(TreeNode root,int k)  
    {  
        if(root==null||k<1)  
            return 0;  
        if(k==1)  
            return 1;  
        LinkedList<TreeNode> queue=new LinkedList<TreeNode>();  
        queue.addLast(root);  
        int curLevelNodes=1;  
        int nextLevelNodes=0;  
        int high=1;  
        while(!queue.isEmpty()&&high<k)  
        {  
            TreeNode cur=queue.removeFirst();  
            curLevelNodes--;  
            if(cur.left!=null)  
            {  
                queue.addLast(root.left);  
                nextLevelNodes++;  
            }  
            if(cur.right!=null)  
            {  
                queue.addLast(root.right);  
                nextLevelNodes++;  
            }  
            if(curLevelNodes==0)      
            {  
                high++;  
                curLevelNodes=nextLevelNodes;  
                nextLevelNodes=0;  
            }  
        }  
        return curLevelNodes;  
    }  
    //12.���������Ҷ�ӽڵ���   --�ݹ�--  
    public int getYeNodesRec(TreeNode root)  
    {  
        if(root==null)  
            return 0;  
        if(root.left==null&&root.right==null)  
            return 1;  
        return getYeNodesRec(root.left)+getYeNodesRec( root.right);  
    }  
    //12.���������Ҷ�ӽڵ���   --�ǵݹ�--  
    public int getYeNodes(TreeNode root)  
    {  
        if(root==null)  
            return 0;  
        if(root.left==null&&root.right==null)  
            return 1;  
        Stack<TreeNode> stack=new Stack<TreeNode>();  
        stack.push(root);  
        int num=0;  
        while(!stack.isEmpty())  
        {  
            TreeNode cur=stack.pop();  
            if(cur.right!=null)  
            {  
                stack.push(cur.right);  
            }  
            if(cur.left!=null)  
            {  
                stack.push(cur.left);  
            }  
            if(cur.right==null&&cur.left==null)  
                num++;  
        }  
        return num;  
    }  
    //13.��ǰ���������������ع�������  --�ݹ�--  
    //���ҵ����ڵ㣬�ڷֱ��ҵ�����������ǰ������򣬵ݹ�  
    public TreeNode buildTreeRec(String pre,String mid)  
    {  
        if(pre==null||mid==null)  
            return null;  
        if(pre.length()==0||mid.length()==0)  
            return null;  
        if(pre.length()!=mid.length())  
            return null;  
        int len=pre.length();  
        TreeNode root=new TreeNode(pre.charAt(0)+"");//���ҵ����ڵ㣬ǰ������ĵ�һ���Ǹ��ڵ�  
        int i=0;  
        while(mid.charAt(i)!=pre.charAt(0))//�ҵ���������и��ڵ��λ�ã���ô��ǰ��ļ��������������������   
            i++;  
           
        root.left=  buildTreeRec(pre.substring(1, 1+i) ,mid.substring(0, i) );//��������ǰ��ͺ�����������  
        root.right= buildTreeRec(pre.substring(i+1, len) ,mid.substring(i+1, len) );//��������ǰ��ͺ������µ�����  
        return root;      
    }  
    //14.����������ͺ�������ع������� --�ݹ�--  
    //���ҵ����ڵ㣬�ڷֱ��ҵ���������������ͺ��򣬵ݹ�  
    public TreeNode buildTreeRec2(String mid,String pro)  
    {  
        if(mid==null||pro==null)  
            return null;  
        if(mid.length()==0||pro.length()==0)  
            return null;  
        if(mid.length()!=pro.length())  
            return null;  
        int len=mid.length();  
        TreeNode root=new TreeNode(pro.charAt(len-1)+"");//��������һ���Ǹ��ڵ�  
        int i=0;  
        while(mid.charAt(i)!=pro.charAt(len-1))//�ҵ���������и��ڵ��λ�ã���ô��ǰ��ļ��������������������  
            i++;  
        root.left=buildTreeRec2( mid.substring(0, i),pro.substring(0, i) );  
        root.right=buildTreeRec2( mid.substring(i+1, len),pro.substring(i, len-1) );  
        return root;  
    }  
    //15.�����������ڵ��������  
    /** 
     * ����һ�������������������������:  
          
            ���A: ·������������������ڵ㣬ͨ�����ڵ㣬�ٵ�������������ڵ㡣  
            ���B: ·�����������ڵ㣬��������������������������·����ȡ����ߡ�  
            ֻ��Ҫ���������������·�����룬��ȡ����ߣ����Ǹö�������������  
  
     */  
        public static Result getMaxDistanceRec(TreeNode root)  
        {    
            if(root == null)  
            {    
                Result empty = new Result(0, -1);       // Ŀ�����õ��÷� +1 �󣬰ѵ�ǰ�Ĳ����ڵ� (NULL) ��������������Ϊ 0    
                return empty;    
            }    
                
            // ��������������ֱ�������    
            Result lmd = getMaxDistanceRec(root.left);    
            Result rmd = getMaxDistanceRec(root.right);    
                
            Result res = new Result();    
            res.maxDepth = Math.max(lmd.maxDepth, rmd.maxDepth) + 1;        // ��ǰ������    
            // ȡ���A�����B�нϴ�ֵ    
            res.maxDistance = Math.max( lmd.maxDepth+rmd.maxDepth, Math.max(lmd.maxDistance, rmd.maxDistance) );    
            return res;    
        }    
            
        private static class Result  
        {    
            int maxDistance;    
            int maxDepth;    
            public Result()   
            {    
            }       
            public Result(int maxDistance, int maxDepth)  
            {    
                this.maxDistance = maxDistance;    
                this.maxDepth = maxDepth;    
            }    
        }    
      
      
      
      
    //16.��͹������Ƚڵ�  
    public TreeNode getLastCommonParentRec(TreeNode root, TreeNode n1, TreeNode n2)   
    {    
        if(root == null)     
            return null;               
        // �����һ��match����˵����ǰnode����Ҫ�ҵ���͹�������  ע��ݹ���������������  
        if(root.equals(n1) || root.equals(n2))    
            return root;      
        TreeNode commonInLeft = getLastCommonParentRec(root.left, n1, n2);    
        TreeNode commonInRight = getLastCommonParentRec(root.right, n1, n2);     
        // ���һ���������ҵ���һ�����������ҵ�����˵��root��Ψһ���ܵ���͹�������    
        if(commonInLeft!=null && commonInRight!=null)     
            return root;    
        // ���������Ҫ��Ȼ��������Ҫ��Ȼ��������    
        if(commonInLeft != null)    
            return commonInLeft;     
        return commonInRight;    
    }    
      
      
    /*  
                                 A   
                               /   \   
                             B      C   
                            / \        \   
                          D    E        F   
                                 
                                
  */    
    public static void main(String[] args)  
    {  
        TreeNode n1=new TreeNode("A");  
        TreeNode n2=new TreeNode("B");  
        TreeNode n3=new TreeNode("C");  
        TreeNode n4=new TreeNode("D");  
        TreeNode n5=new TreeNode("E");  
        TreeNode n6=new TreeNode("F");  
        n1.left=n2;  
        n1.right=n3;  
        n2.left=n4;  
        n2.right=n5;  
        n3.right=n6;  
        TreeNode root=n1;  
        BinaryTree bt=new BinaryTree();  
        System.out.print("�������---->" );  
        bt.cx(root);  
        System.out.print("\n");  
        System.out.println("�ݹ�߶�---->"+bt.getHighRec(root));  
        System.out.println("�ǵݹ�߶�---->"+bt.getHigh(root));  
        System.out.println("�ݹ�ڵ����---->"+bt.getNodesNumRec(root));  
        System.out.println("�ǵݹ�ڵ����---->"+bt.getNodesNum(root));  
           
//       bt.getJXRec(root);  
//       bt.cx(root);  
//       System.out.print("\n");  
//      System.out.print("������Ϊ����ľ�������������---->" );  
//       bt.getJX(root);  
//       bt.cx(root);  
        System.out.println("�Ƿ���ƽ�������---->"+bt.isBlanced(root));  
        System.out.println("�Ƿ���ƽ�������,ÿ���ڵ�ֻ����һ�εķ���---->"+bt.isBlanced2(root));  
        System.out.println("�ݹ�� k��ڵ����---->"+bt.getNodesInKRec(root, 3));  
        System.out.println("�ǵݹ�� k��ڵ����---->"+bt.getNodesInK(root, 3));  
        System.out.println("�ݹ�Ҷ�ڵ����---->"+bt.getYeNodesRec(root));  
        System.out.println("�ǵݹ�Ҷ�ڵ����---->"+bt.getYeNodes(root));  
        System.out.print("��ǰ�����������������������  �������---->" );  
        bt.cx(bt.buildTreeRec("ABDECF", "DBEACF"));  
        System.out.print("\n" );  
        System.out.print("����������ͺ���������������  �������---->" );  
        bt.cx(bt.buildTreeRec2("DBEACF", "DEBFCA"));  
        System.out.print("\n" );  
        System.out.println("��͹�������---->"+bt.getLastCommonParentRec(root,n4,n3).value);  
    }  
}  