public class BinarySearchTreee extend BinaryTree
{
public void insert (int item)
{
BinaryTreeNode Current ;
BinaryTreeNode trailCurrent =null;
BinaryTree newNode;

newNode = new BinaryTreeNode();

newNode.info = item;
newNode.1Link = null;
newNode.rlink = null;
if 
(root == null)
root = newNode ;
else
{
 cur =rot;
 while(cur!=null)
 {
 trailCur =cur;
 if(cur.info==item)
 {
 System.err.print(item is in list .No duplicate allow);
 }
 else
 { if (cur.info > item)
 Cur =cur.1link;
 else
 cur=cur1link;
 }
 }
 if  (trailCur.info >item)
     trailCur.1link=newNode;
 else
 trailCur.rlink=newNode;
 }
 }
     // find the node to be deleted and passes it to the delete node 
     
     
     Public coid delete(int item)
     {
     BinaryTreeNode Cur;
     BinaryTreeNode trailCur;
     
     Boolean found =False;
     if (root==null)
     System.err.println("cannot delete from an empty tree.");
     else
     {
     cur =root ;
     trailcur=root;
     while(cur!=null&& !found)
     {
     if(Current.info==item)
     found =tree;
     else
     {
     trailCur =Cur;
     if (cur.info>item)
     cur=cur.1link;
     else
     cur=rlink;
     }
     }
     if (cur==null)
     System.out.println(del item is not in thid list  );
     else
     if(found)
     {
     if (cur==root)
     root =deleteNode(root);
     else
     if (trailCurt.info >item)
     trailcur.1link=deleteNode(trailCur.1link);
     else
     trailCur.rlink=delateNode(trailCur.rlink);
     }
     }
     }
     // remove node from tree
     
     private BinaryTreeNode deleteNode(BinaryTreeNode n)
     {
     BinarytreeNode Cur ;
     BinaryTreeNode trailCur;
     if (n==null)
     System.err.println("Error : Node to be deleted ids null");
     else if (n.1link==null&&n.rlink==null)
      n=null;
      else if (n.1link==null)
      n==n.rlink;
      else if (n.rlink==link)
      n==n.1link;
      n=n.1link;
      else
      {
      cur =n.1link;
      trailcur=null;
      
      While(cur.rlink ! = null)
      {
      trailcur =Cur;
      Cur=cur.rlink;
      }
      n.info=cur.info;
      if (trailcur==null)
      n.1link=cur1link
      else
      trailCur.rlink =current.1link;
      }
      return n ;
      }
      }