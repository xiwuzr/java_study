package DataStructure.MyString;

public class RKMP {
    public int KMP(String f,String s)
    {
        int[]next=nextString(s);
        int i=0,j=0;
        int lenF=f.length(),lenS=s.length();
        while(i<lenF&&j<lenS)
        {
            if(j==-1||f.charAt(i)==s.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                j=next[j];
            }
        }
        if(j==s.length())
        {
            return i-j;
        }
        else
            throw new RuntimeException("NOT FOUND");
    }
    public static int[] nextString(String s)
    {
        int[] a=new int[s.length()+1];
        int i=1,j=-1,k;
        a[0]=-1;
        while(i<s.length())
        {
            if(j==-1||s.charAt(i)==s.charAt(j))
            {
                i++;
                j++;
                a[i]=j;
            }
            else
                j=a[j];
        }
        return a;
    }
}

class TestKMP{
    public static void main(String[] args) {
        RKMP a=new RKMP();
        String f="abcaba";
        String s="aba";
        System.out.println(a.KMP(f,s));
    }
}
class Testthis__dd
{
    public static void main(String[] args) {
        String a="sdfg";
        System.out.println(a.charAt(0));
    }
}
