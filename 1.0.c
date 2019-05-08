#include<stdio.h>

void pai(int a[],int lift,int right);
int main()
{
	int n,a[100],i;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	pai(a,0,n-1);
	for(i=0;i<n;i++)
	{
		printf("%d  ",a[i]);
	}
	return 0;
	
}

void pai(int a[],int lift,int right)
{
	int head;
	int p,q,k;
	if(lift>right)
		return;
	head=a[lift];
	p=lift;
	q=right;
	while(p!=q)
	{
		while(a[q]>=head&&p<q)
			q--;
		while(a[p]<=head&&p<q)
			p++;
		if(p<q)
		{
			k=a[q];
			a[q]=a[p];
			a[p]=k;
		}
	}
	a[lift]=a[p];
	a[p]=head;
	pai(a,lift,p-1);
	pai(a,p+1,right);
	
	
	
	
}