import java.util.ArrayList;
public class SocksPairCount
{
public static void main(String args[])
{
int inputArray[]={10,20,10,30,10,20,40,10};
int size=inputArray.length;
ArrayList<Integer>list=new ArrayList<Integer>();
int c=1,sum=0;
int res;
for(int i=0;i<size;i++)
{
for(int j=i+1;j<size;j++)
{
if(inputArray[i]==inputArray[j])
{
c++;
}
}
res=c/2;
list.add(res);
c=1;

}

System.out.println("The count of paired scocks is : " +list);
}
}