#include<stdio.h>
#include<stdlib.h>

int check(int i,int j, int width[])
{
    int temp=width[i],ans;
    for(int p=i;p<=j;p++)
        {
        if(temp>width[p])
            {
            temp=width[p];
        }
    }
    if(temp==1)
        ans=1;
    else if(temp==2)
        ans=2;
        else if(temp==3)
        ans=3;
return ans;
        }

int main()
    {
    int n,t;
    scanf("%d%d",&n,&t);
     int i,j;
    int width[n];
    for(int k=0;k<n;k++)
        scanf("%d",&width[k]);
    while(t--)
        {
        scanf("%d%d",&i,&j);
       int a= check(i,j,width);
    printf("%d\n",a);
    }
}