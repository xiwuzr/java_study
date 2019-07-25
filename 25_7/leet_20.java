package exercise;

import java.util.Stack;

public class leet_20 {
    }
class Solution20 {
    public boolean isValid(String s) {
        if(s.length()%2!=0)
        {
            return false;
        }
        int i=0;
        Stack sta=new Stack();
        while(i<s.length()){
            char tmp=s.charAt(i);
            if(tmp=='('||tmp=='{'||tmp=='[')
            {
                sta.add(tmp);
            }
            else
            {
                char ch=' ';
                int book=0;
                switch(tmp)
                {

                    case ')':
                        if ( sta.size() > 0 ) {
                            char cc = (char) sta.pop();
                            if ( cc == '(' ) {
                                book = 1;
                            } else {
                                book = 0;
                            }
                        }
                        break;
                    case ']':
                        if ( sta.size() > 0 ) {
                            char cc = (char) sta.pop();
                            if ( cc == '[' ) {
                                book = 1;
                            } else {
                                book = 0;
                            }
                        }
                        break;
                    case '}':
                        if ( sta.size() > 0 ) {
                            char cc = (char) sta.pop();
                            if ( cc == '{' ) {
                                book = 1;
                            } else {
                                book = 0;
                            }
                        }
                        break;
                }
                if(book==0)
                {
                    return false;
                }
            }
            i++;
        }
        if(sta.size()==0)
            return true;
        else
            return false;

    }
}
