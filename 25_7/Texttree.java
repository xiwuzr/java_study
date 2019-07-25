package DataStructure.MyTree;

public class Texttree {
    public static void main(String[] args) {
        Node peo1=new Node(1,"小张");
        Node peo2=new Node(2,"小王");
        Node peo3=new Node(3,"小李");
        Node peo4=new Node(4,"小赵");
        Node peo5=new Node(5,"小刘");
        peo1.left=peo2;
        peo1.right=peo3;
        peo3.left=peo5;
        peo3.right=peo4;
        MyTree tree=new MyTree(peo1);
        System.out.println("前序遍历");
        tree.preOrder();
        System.out.println("中序遍历");
        tree.infixOrder();
        System.out.println("后序遍历");
        tree.postOrder();
    }

}

class MyTree{
    Node head;

    public MyTree(Node head) {
        this.head = head;
    }
    void preOrder()
    {
        if(head!=null)
        {
            head.preOrder();
        }
        else
        {
            System.out.println("空树");
        }
    }
    void infixOrder()//前序遍历
    {
        if(head!=null)
        {
            head.infixOrder();
        }
        else
        {
            System.out.println("空树");
        }
    }
    void postOrder()
    {
        if(head!=null)
        {
            head.postOrder();
        }
        else
        {
            System.out.println("空树");
        }
    }
}

class Node
{
    int no;
    String name;
    Node left;
    Node right;

    public Node(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    void preOrder()
    {
        System.out.println(this);
        if( this.left !=null){
            this.left.preOrder();
        }
        if(this.right!=null){
            this.right.preOrder();
        }
    }
    void infixOrder()
    {

        if( this.left !=null){
            this.left.infixOrder();
        }
        System.out.println(this);
        if(this.right!=null){
            this.right.infixOrder();
        }
    }
    void postOrder()
    {

        if( this.left !=null){
            this.left.postOrder();
        }
        if(this.right!=null){
            this.right.postOrder();
        }
        System.out.println(this);
    }
}
