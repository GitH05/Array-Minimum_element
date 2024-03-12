//max elements in the array:
import java.util.*;
class SecondMaxElement
{
public static void main(String[] args)
{
int i,j;
int[] a={32,45,65,76,7};
int max=a[0];
int SecondMax;

for(i=0;i<6;i++)
{
if(a[i]>max)
{
SecobdMax=max;
max=a[i];
}
else if(a[i]>SecondMax && a[i] !=max)
{
SecondMax=a[i]
}
}
System.out.println("SecondMax: "+SecondMax);

}
}