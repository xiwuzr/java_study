package Java.month7;

public class DoublyLink {
    class Node
    {
        Node pre;
        int data;
        Node next;
    }
    Node head,end;
    int size;
    DoublyLink()
    {
        head=end=null;
        size=0;
    }
    void add(int data)
    {
        if(head==null)
        {
            Node tmp=new Node();
            tmp.data=data;
            tmp.pre=null;
            tmp.next=null;
            size++;
            head=tmp;
            end=tmp;
        }
        else
        {
            Node tmp=new Node();
            tmp.pre=end;
            end.next=tmp;
            tmp.next=null;
            tmp.data=data;
            size++;
            end=tmp;
        }
    }
    void print()
    {
        Node tmp=head;
        while(tmp!=null)
        {
            System.out.print(tmp.data+" ");
            tmp=tmp.next;
        }
    }

    public static void main(String[] args) {
        DoublyLink aaa=new DoublyLink();
        aaa.add(52);
        aaa.add(45);
        aaa.add(98);
        aaa.add(100);
        aaa.print();
    }
}


