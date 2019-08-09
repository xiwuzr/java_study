package DataStructure.MyTree.ArrTree;

/**
 * 堆排序
 *
 */
public class TreeSort {
    public static void main(String[] args) {
        int arr[]=new int[]{5,8,7,4,3,7,54,7,23,6,7,2};
        TreeArrSort tas=new TreeArrSort(arr);
        tas.treeSort();
        for(int k:arr){
            System.out.print(k+" ");
        }
    }
}

class TreeArrSort{
    int arr[];
    TreeArrSort(int[] arr){
        this.arr=arr;
    }

    void heap(int head,int n){
        if(head>=n){
            return;
        }
        int max=head;
        int c1=head*2+1;
        int c2=head*2+2;
        if(c1<n&&arr[c1]>arr[max]){
            max=c1;
        }
        if(c2<n&&arr[c2]>arr[max]){
            max=c2;
        }
        if(max!=head){
            exchange(head,max);
            heap(max,n);
        }
    }

    void exchange(int a,int b){
        int tmp;
        tmp=arr[a];
        arr[a]=arr[b];
        arr[b]=tmp;
    }

    void build_heap(int n){
        int tmp=(n-1)/2;
        for(int i=tmp;i>=0;i--){
            heap(i,n);
        }
    }

    void treeSort(){
        build_heap(arr.length);
        for(int i=arr.length-1;i>=0;i--){
            exchange(0,i);
            build_heap(i);
        }

    }
}
