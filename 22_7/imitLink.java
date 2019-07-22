package Java.month7;

public class imitLink {
    int size;
    int end;
    int head;
    mod aa[]=new mod[20];
    imitLink(){
        head=0;
        size=0;
        end=-1;
    }

    void add(int data)
    {

        if(end==-1)
        {
            mod node =new mod(-1,data);
            aa[0]=node;
            end=0;
            size++;
        }
        else
        {
            mod node=new mod(-1,data);
            aa[size]=node;
            aa[size-1].index=size;
            end=size;
            size++;
        }
    }
    void print()
    {
        int temp=head;
        while(temp!=-1)
        {
            System.out.print(aa[temp].data+" ");
            temp=aa[temp].index;
        }
    }

}

class mod {
    int index;
    int data;

    mod(int i, int d) {
        this.index = i;
        this.data = d;
    }
    mod(){

    }
}

class text_imitLink{
    public static void main(String[] args) {
        imitLink a=new imitLink();
        for(int i=0;i<10;i++)
        {
            a.add(i);
        }
        a.print();
    }
}