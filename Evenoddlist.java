import java.util.*;
class Evenoddlist
{
public static void main(String args[])
{
int num[]={2,4,5,7};
int l=num.length;
int res[]=new int[l];
int index=0;
for(int i=0;i<l;i++)
{
if(num[i]%2==0)
{
res[index]=num[i];
index=index+2;
}
}
index=1;
for(int i=1;i<l;i++)
{
if(num[i]%2!=0)
{
res[index]=num[i];
index=index+2;
}
}
for(int i=0;i<res.length;i++)
{
System.out.print(res[i]+" ");
}
}
}