public class MyJavaForeach {
    public static void main(String[] args) {
        int intArray[]={4,2,4,7,6,8};
        for(int a:intArray){
            System.out.print(a+" ");
        }
        System.out.println("\n"+"**********************");
        for(int a:intArray){
            if(a==4)
            {
                System.out.println("YES");
            }
            else
                System.out.println("NO");

        }
    }
}
