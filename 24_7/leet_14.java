package exercise;

public class leet_14 {
}
class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
        {
            return "";
        }
        String ans="";
        String tmp="";
        for(int i=0;;i++)
        {
            char aa=' ';
            int k=0;
            for(String book:strs)
            {

                if(i==book.length())
                {
                    k=1;
                    break;
                }
                aa=strs[1].charAt(i);
                if(aa!=book.charAt(i))
                {
                    k=2;
                    break;
                }
            }

            if(k!=0)
            {
                break;
            }
            else
                ans+=aa;

        }
        return ans;
    }
}
