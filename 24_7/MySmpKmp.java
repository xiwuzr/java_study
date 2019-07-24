package DataStructure.MyString;

public class MySmpKmp {
    public int sKmp(String st1,String st2,int indx){
        int len1=st1.length();
        int len2=st2.length();
        String st="";
        for(int i=indx;i<=len1-len2;i++)
        {
            st=st1.substring(i,i+len2);
            System.out.println(st);
            if(st2.equals(st))
            {
                return i;
            }
        }
        return 0;
    }
}

class MySmpKmpTest{
    public static void main(String[] args) {
        MySmpKmp a=new MySmpKmp();
        int aa=a.sKmp("qwerty","wert",0);
        System.out.println(aa);
    }
}
