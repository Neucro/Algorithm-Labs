import java.io.*;
import java.util.*;
public class AdjacencyList
{
  public static int v1,v2;
  public static Node[]a;
  public static Scanner sc;
  public static void main(String[]args)
  {
    try{
      sc=new Scanner(new File("input.txt"));
    int vertex=sc.nextInt();
//  int v1,v2;
    while(sc.hasNext())
    {
      v1=sc.nextInt();
      v2=sc.nextInt();
    a=new Node[vertex+1];
    for(int i=1;i<=vertex;i++)
    {
      a[i]=new Node(i,null);
    }
    add(v2);
    for(Node i=a[v1];i!=null;i=i.next)
    {
      System.out.print(i.value);
    }
  }
 }
     
    catch(Exception e)
    {
      System.out.println("could not find file");
    }
  public static void add(int v)
  {
    Node n1=new Node(v,null);
    Node tail=a[v1];
    for(Node n=tail;n!=null;n=n.next)
    {
      tail=n;
    }
    tail.next=n1;
  }
  
 }
}
/*
 * try{
 k=new Scanner(new File("file.txt"));
 }
 catch (Exception e)
 {
 System.out.println("could not find file");
 }
 */