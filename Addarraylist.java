import java.util.*;
class Addarraylist
{
public static void main(String args[])
{
ArrayList<Integer> A1=new ArrayList<Integer>();
ArrayList<Integer> A2=new ArrayList<Integer>();
A1.add(10);
A1.add(20);
A1.add(30);
A1.add(40);
A2.addAll(A1);
A2.add(100);
A2.add(200);
A2.add(300);
A2.add(400);
for(Integer i:A2)
System.out.print(i+" ");
}
}