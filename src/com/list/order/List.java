package com.list.order;  
  
import java.util.Stack;  
  
/** 
 * 1.������ 
 * 2.�õ���������k���ڵ��ֵ 
 * 3.ɾ������ĵ�����k���ڵ� 
 * 4.��������м�ڵ� 
 * 5.�ж������Ƿ��л� 
 * 6.�ҳ��л�����Ļ������ 
 * 7.�ж������������Ƿ��ཻ 
 * 8.�ҳ������ཻ����ĵ�һ������ 
 * 9.��β��ͷ��ӡ������ 
 * 10.���õ����� 
* 11.�ϲ�������������ʹ�ϲ����������Ȼ���� 
* 12.��o(1)��ʱ�临�Ӷ�ɾ����������ָ����ĳһ�ڵ� 
 *13.��ָ���ڵ�ǰ����һ���ڵ� 
*14.������������ 
*15.������β�������� 
 * @author sheepmu 
 */  
class ListNode  
{   int value;  
    ListNode next;  
    public ListNode(int value)  
    {  
        this.value=value;  
        this.next=null;  
    }  
}  
  
public class List  
{  
    public static void main(String[] args)  
    {  
        ListNode n1=new ListNode(1);  
        ListNode n2=new ListNode(2);  
        ListNode n3=new ListNode(3);  
        ListNode n4=new ListNode(4);  
        ListNode n5=new ListNode(5);  
        ListNode n6=new ListNode(6);  
        n1.next=n2;  
        n2.next=n3;  
        n3.next=n4;  
        n4.next=n5;  
        n5.next=n6;  
        System.out.println("������---->"+getLenRec(n1));  
        System.out.println("�������������ڵ��ֵ---->"+getLastK(n1,3));  
        System.out.println("ɾ����������3���ڵ�---->"+moveLastK(n1,3));//��ʱ�����Ѿ��� 1,2,3,5,6   
        System.out.println("ɾ��������k�����������---->"+getLenRec(n1));  
        System.out.println("�����м�ڵ��ֵ---->"+getMid(n1));  
        System.out.println("�����Ƿ��л�---->"+isHaveC(n1));  
        System.out.println("���������---->"+getFirstC(n1));  
        System.out.println("��β��ͷ��ӡ������---->");  
        reversePrintListStack(n1);  
        System.out.println("���õ�������ͷ�ڵ�--->"+reverseList(n1).value);  
           
    }  
    //1.������  
    public static int getLen(ListNode head)  
    {  
        if(head==null)   
            return 0;  
        int len=1;  
        while(head.next!=null)  
        {  
            len++;  
            head=head.next;  
        }  
        return len;  
    }  
    //1.������                -----�ݹ�------  
    public static int getLenRec(ListNode head)  
    {  
        if(head==null)   
            return 0;  
         return getLenRec(head.next)+1;  
    }  
      
   //2.�õ���������k���ڵ��ֵ  
    /** 
     * ˼·����Ϊ������k�������һ�����k-1���ڵ㣬�ʲ���ǰ��ָ�룬��һ������k-1�������ߵ���k����������ϰ�ߴ�1��ʼ���㣬 
                 Ȼ������ָ����ͬʱ�ߣ���ǰָ��p�ߵ�ĩβʱ����ָ��q��λ�øպ��ǵ�����k���ڵ㡣   
     */  
    public static int getLastK(ListNode head,int k)  
    {  
        if(head==null||k<=0)  
            return -1;  
        ListNode p=head;  
        ListNode q=head;  
        while(--k>0)//��p����k-1������p�ߵ���k���ڵ㣬��1��ʼ������~  
        {  
            p=p.next;  
            if(p.next==null)  
                break;  //��ֹ����ĵ���kֵ�ر����쳣���  
        }  
        if(p.next==null)//˵�������k���������ȷ�Χor���������ȣ���ɾ����һ����һ��Ҫ�ر�ע����Щ�ر�����������³����~~  
        {  
            return head.value;  
        }  
        else  
        {  
            while(p.next!=null)  
            {  
                p=p.next;  
                q=q.next;  
            }  
            return q.value;  
        }  
          
    }  
      
    //3.ɾ������ĵ�����k���ڵ�  
    /** 
     * ˼·����������Ⱦ���Ҫɾ��������k������ô����Ҫ��¼��ָ���ǰһ�ڵ㣬��Ϊɾ������ı��ʾ�������ǰһ�ڵ�ָ�����ĺ�һ�ڵ� 
     */  
    public static ListNode moveLastK(ListNode head,int k)  
    {  
        if(head==null||k<=0)  
            return null;  
        ListNode p=head;  
        ListNode q=head;  
        while(--k>0)//��p����k-1������p�ߵ���k���ڵ㣬��1��ʼ������~  
        {  
            p=p.next;  
            if(p.next==null)  
                break;  //��ֹ����ĵ���kֵ�ر����쳣���  
        }  
        if(p.next==null)//˵�������k���������ȷ�Χor���������ȣ���ɾ����һ����  
        {  
            return head.next;  
        }  
        else  
        {  
            ListNode pre=q;//���ڼ�¼ɾ���ڵ��ǰһ�ڵ�  
            while(p.next!=null)  
            {  
                pre=q;  
                p=p.next;  
                q=q.next;  
            }  
            pre.next=q.next;  
            return head;  
        }     
    }  
      
    //4.��������м�ڵ�  
    /** 
     *  ǰ��ָ�룬һ��ÿ����2��һ��ÿ����1������������Ϊ���������м�ֵ��Ϊż�������м�2�ߵ�ǰһ�� 
     */  
    public static int getMid(ListNode head)  
    {  
        if(head==null||head.next==null)//0���ڵ��1���ڵ�ʱ  
            return -1;  
        if(head.next.next==null)//�����ڵ�ʱ  
            return head.value;  
        ListNode p=head;  
        ListNode q=head;  
        while(p.next!=null&&p.next.next!=null)//��ֻ�� һ���ڵ� �� �����ڵ� ʱwhile����������  
        {  
            p=p.next.next;  
            q=q.next;  
        }  
        return q.value;  
    }  
      
    //5.�ж������Ƿ��л�  
     /** 
      * ˼·��ǰ��ָ�룬һ��ÿ��������һ��ÿ����һ��������ָ����������˵�������л� 
      */  
    public static boolean isHaveC(ListNode head)  
    {  
        if(head==null||head.next==null||head.next.next==null) //ֻ�������ڵ�ʱҲ�޻��ɣ�  
            return false;  
        ListNode p=head;  
        ListNode q=head;  
        while(p.next!=null&&p.next.next!=null)  
        {  
            p=p.next.next;  
            q=q.next;  
            if(p==q)  
                return true;                      
        }  
        return false;  
    }  
      
    //6.�ҳ��л�����Ļ������  
     /** 
      *  ˼·�����л��϶����ڻ���������һ��������λ�õ�����ʼ��λ�õľ��루�����ķ�����ͷ�ڵ㵽���Ŀ�ʼ�ľ�����ȡ� 
          �ʵ�����ʱ���ýڵ�q����ͷ�ڵ㣬�ú������ڵ�ͬʱ�ߣ��ٴ����������ǻ���ʼ��λ�á� 
      */  
    public static ListNode getFirstC(ListNode head)  
    {  
        if(head==null||head.next==null||head.next.next==null)  
            return null;  
        ListNode p=head;  
        ListNode q=head;  
        while(p.next!=null&&p.next.next!=null)  
        {  
            p=p.next.next;  
            q=q.next;  
            if(p==q)  
                break;  //pq������break                  
        }  
        if(p.next==null||p.next.next==null)//�޻�  
            return null;  
                    q=head;//��q����ͷ�ڵ�  
        while(p!=q)  
        {  
                p=p.next;  
                q=q.next;  
        }  
        return q;   
    }  
      
    //7.�ж������������Ƿ��ཻ  
    /** 
     *  ˼·�����������ཻ�����������β�ڵ�϶���ͬһ�ڵ� 
     */  
    public boolean isXJ(ListNode head1,ListNode head2)  
    {  
        if(head1==null||head2==null)  
            return false;  
           
        ListNode tail1=head1;  
        while(tail1.next!=null)//������ֻ��һ���ڵ����� ,����������Ҫ����ֻ��һ���ڵ����������Ǵ�ʱ��ֻ��һ���ڵ㶼��������while,��returnʱ�ȽϾͿ�����   
        {  
            tail1=tail1.next;//�õ�head1��β��  
        }  
        ListNode tail2=head2;  
        while(tail2.next!=null)     
        {  
            tail2=tail2.next;  
        }  
        return tail1==tail2;  
    }  
      
     //8.�ҳ������ཻ����ĵ�һ������  
     /** 
      *  ˼·:���ó��������ָ�����߳��Ȳ�ľ��룬Ȼ������ָ��һ���ߣ������ĵط����ǽ���Ŀ�ʼ���� 
      */  
    public static ListNode getFirstJD(ListNode head1,ListNode head2)  
    {  
        if(head1==null||head2==null)  
            return null;  
               
        ListNode tail1=head1;  
        int len1=1;  
        while(tail1.next!=null)   
        {  
            len1++;  
            tail1=tail1.next;  
        }  
        ListNode tail2=head2;  
        int len2=1;  
        while(tail2.next!=null)   
        {  
            len2++;  
            tail2=tail2.next;  
        }  
        ListNode n1=head1;  
        ListNode n2=head2;  
        if(len1>len2)  
        {  
            int k=len1-len2;  
            while(k-->0)//����д������~~~~  
                   n1=n1.next;   
        }  
        else  
        {  
            int k=len2-len1;  
            while(k-->0)  
                   n2=n2.next;  
        }  
        while(n1!=n2)  
        {  
            n1=n1.next;  
            n2=n2.next;  
        }  
        return n1;  
    }  
      
    //9.��β��ͷ��ӡ������  
    /** 
     * ˼·����������������뵽ջ���Ƚ������Ҫô��Stack��Ҫô��ϵͳʹ��ջ�����ݹ�~~ 
     */  
    public static void reversePrintListStack(ListNode head)   
    {    
        if(head==null)  
            return;  
        Stack<ListNode> stack = new Stack<ListNode>();    
        ListNode cur = head;    
        while (cur != null)   
        {    
            stack.push(cur);    
            cur = cur.next;    
        }    
        while (!stack.empty())   
        {    
            ListNode pop= stack.pop();    
            System.out.print(pop.value + " ");    
        }    
        System.out.println();    
    }     
    //9.��β��ͷ��ӡ������                    -----�ݹ�------  
    public static void reversePrintListRec(ListNode head)   
    {    
        if (head == null)    
            return;     
        reversePrintListRec(head.next);  //Ĭ���Ѿ������������ˣ����Ѿ������6-->5-->3-->2,����ֻ��Ҫ�����ͷ�ڵ��ֵ   
        System.out.print(head.value + " ");  //�������᷽�����Ǻܿ�д���ݹ飬���ǻ���Ҫ֪���ݹ�������ʵ�ֹ���~  
    }    
      
    //10.���õ�����  
        /** 
         * ˼·����ÿ�α������Ķ��ŵ��������β�͵�ǰһ�� 
         */  
    public static ListNode reverseList(ListNode head)   
    {    
        // �������Ϊ�ջ�ֻ��һ���ڵ㣬���跴ת��ֱ�ӷ���ԭ�����ͷ    
        if (head == null || head.next == null)    
            return head;      
        ListNode newTail = null;  //�������β��  
        ListNode cur = head;    
    
        while (cur != null)  
        {    
            ListNode pre = cur;   //������β�͵�ǰһ��    
            cur = cur.next;    // cur���µ���һ���ڵ�    
            pre.next = newTail ;      
            newTail = pre;   // ��β�͵�ǰһ����Ϊ�µ�β��    
        }    
    
        return newTail;    
    }    
    //10.���õ�����                          ----�ݹ�-----  
    public static ListNode reverseListRec(ListNode head)  
    {    
        if(head == null || head.next == null)   
            return head;      
        ListNode reHead = reverseListRec(head.next); //Ĭ��Ϊ�Ѿ����ú���6-->5-->3-->2,��ֻ��Ҫ��2�ĺ����1����Ϊ2��head.next.���� head.next.next = head;       
        head.next.next = head;       
        head.next = null;               // ��ֹѭ������    
        return reHead;    
    }    
      
    //11.�ϲ�������������ʹ�ϲ����������Ȼ����  
    /** 
     *  ˼·����ȷ���ϲ����ͷ�ڵ㣬Ȼ��Ա����������ÿһ���ڵ�ֵ�����и�����û�кϲ����ֱ�Ӽ��ں���Ϳ����� 
     */  
    public static ListNode mergeSortedList(ListNode head1, ListNode head2)   
    {     
        if (head1 == null)    
            return head2;     
        if (head2 == null)    
            return head1;     
        ListNode mergeHead = null;   // ��ȷ���ϲ����ͷ�ڵ�  
        if (head1.value < head2.value )  
        {    
            mergeHead = head1;    
            head1 = head1.next;         // �����Ѿ��ϲ��˵�Ԫ��    
            mergeHead.next = null;  // �Ͽ�mergeHead����һ���ÿ�  
        }   
        else  
        {    
            mergeHead = head2;    
            head2 = head2.next;    
            mergeHead.next = null;    
        }    
    
        ListNode mergeCur = mergeHead;    
        while (head1 != null && head2 != null)   
        {    
            if (head1.value < head2.value )   
            {    
                mergeCur.next = head1;       // ���ҵ���С��Ԫ�غϲ���merge��    
                head1 = head1.next;              // �����Ѿ��ϲ��˵�Ԫ��    
                mergeCur = mergeCur.next;    // �ҵ���һ��׼���ϲ���Ԫ��    
                mergeCur.next = null;            // �Ͽ�mergeCur�ͺ������ϵ    
            }   
            else   
            {    
                mergeCur.next = head2;    
                head2 = head2.next;    
                mergeCur = mergeCur.next;    
                mergeCur.next = null;    
            }    
        }     
        if (head1 != null)    // �ϲ�ʣ���Ԫ��    
            mergeCur.next = head1;     
        else if (head2 != null)   
            mergeCur.next = head2;     
        return mergeCur;    
    }    
    //11.�ϲ�������������ʹ�ϲ����������Ȼ����           ----�ݹ�-----  
    public static ListNode mergeSortedListRec(ListNode head1, ListNode head2)   
    {    
        if (head1 == null)   
            return head2;     
        if (head2 == null)   
            return head1;     
        ListNode mergeHead = null;    
        if (head1.value < head2.value )  
        {    
            mergeHead = head1;    
            mergeHead.next = mergeSortedListRec(head1.next, head2);   // �����ѽ����������    
        }   
        else  
        {    
            mergeHead = head2;    
            mergeHead.next = mergeSortedListRec(head1, head2.next);    
        }    
        return mergeHead;    
    }    
      
    //12.��o(1)��ʱ�临�Ӷ�ɾ����������ָ����ĳһ�ڵ�  
    /** 
     * ����ɾ���ڵ㣬������ͨ��˼·�����øýڵ��ǰһ���ڵ�ָ��ýڵ����һ���ڵ�  
     * �����������Ҫ�����ҵ��ýڵ��ǰһ���ڵ㣬ʱ�临�Ӷ�ΪO(n)����������  
     * �����е�ÿ���ڵ�ṹ����һ���ģ��������ǿ��԰Ѹýڵ����һ���ڵ�����ݸ��Ƶ��ýڵ�  
     * ��Ȼ��ɾ����һ���ڵ㼴�ɡ�Ҫע�����һ���ڵ����������ʱ��ֻ���ó����ķ��������������ҵ�ǰһ���ڵ㣬�������ƽ��ʱ�临�ӶȻ���O(1) 
     */  
    public void delete(ListNode head, ListNode toDelete)  
    {    
        if(toDelete == null)     
            return;    
        if(toDelete.next != null)//��ɾ���Ĳ���β�ͣ�����~~~~~~~~~  
        {            
            toDelete.value = toDelete.next.value ;         
            toDelete.next = toDelete.next.next;    
        }    
        else  
        {        
            if(head == toDelete)//ֻ��һ���ڵ�ʱ  
                head = null;    
            else  
            {    
                ListNode node = head;    
                while(node.next != toDelete)   
                    node = node.next;   // �ҵ������ڶ����ڵ�     
                node.next = null;    
            }    
        }    
    }    
      
  //14.������������  
    /** 
     *   ���ù鲢�����ȷֳ����ηֱ������ٺϲ�����������ġ�O(nlgn) 
     */  
    public static ListNode sortList(ListNode head)  
    {    
        if(head==null || head.next==null)  
        {  // ����û��Ԫ�ػ���ֻ��һ��Ԫ�ص����ֱ�ӷ���    
            return head;    
        }    
        ListNode fast = head;    
        ListNode slow = head;    
        ListNode preSlow = head;    
        // �ҵ��м�ڵ��ǰһ��    
        while(fast!=null && fast.next!=null)  
        {    
            fast = fast.next.next;    
            preSlow = slow;    
            slow = slow.next;    
        }    
            
//      System.out.println(preSlow.val);    
        // �Ͽ����ֳ�����    
        preSlow.next = null;    
            
        ListNode first = sortList(head);        // �õ�������õ�ǰ���    
        ListNode second = sortList(slow);   // �õ�������õĺ���    
        ListNode dummy = new ListNode(-1);    
        ListNode dummyCur = dummy;    
        while(first!=null && second!=null)  
        { // �ϲ������    
            if(first.value<second.value)  
            {    
                dummyCur.next = first;    
                first = first.next;    
            }  
            else if(second.value<=first.value)  
            {    
                dummyCur.next = second;    
                second = second.next;    
            }    
            dummyCur = dummyCur.next;    
        }    
            
        while(first != null)  
        {    
            dummyCur.next = first;    
            first = first.next;    
            dummyCur = dummyCur.next;    
        }    
            
        while(second != null)  
        {    
            dummyCur.next = second;    
            second = second.next;    
            dummyCur = dummyCur.next;    
        }    
            
        return dummy.next;    
    }    
      
    //15.������β��������  
    /** 
     *   �ϳ����Σ�������򣬰�ǰ�κ������ĺ�ν������� 
     */  
    public static void reorderList(ListNode head)   
    {    
        ListNode fast = head;    
        ListNode slow = head;    
        // �ҵ��м�ڵ�    
        while(fast!=null && fast.next!=null)  
        {    
            fast = fast.next.next;    
            slow = slow.next;    
        }    
   
        ListNode preReverse = slow; // preReverse���÷�ת����Ϊ����Զ�����һ��    
        if(preReverse == null)     
            return;    
            
        // ��ת����    
        ListNode reHead = preReverse.next;    
        if(reHead == null)     
            return;    
           
        ListNode preCur = reHead.next;    
        ListNode cur = reHead.next;    
        reHead.next = null;    
        while(cur != null)  
        {    
            cur = cur.next;    
            preCur.next = reHead;    
            reHead = preCur;    
            preCur = cur;    
        }    
        preReverse.next = reHead;    
            
        // ����ϲ���������    
        preReverse.next = null;     // �Ͽ�ǰ��κͷ�ת��ĺ���Ԫ��    
        cur = head;    
        while(reHead != null && cur!=null)  
        {    
            ListNode tmp = cur.next;    
            cur.next = reHead;    
            reHead = reHead.next;    
            cur.next.next = tmp;    
            cur = tmp;    
            tmp = cur.next;    
        }    
    }    
       
}  