package main;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String args[] ) throws Exception {
        System.out.println("Hello World");
        Node head=new Node(1);
        head.left=new Node(2);
        head.right=new Node(3);
        head.left.left=new Node(4);
        head.left.right=new Node(5);
        head.right.left=new Node(6);
        head.right.right=new Node(7);
        
        
        Node head2=new Node(1);
        Operclass op =new Operclass();
        op.Inorder(head);
        System.out.print("  ");
        op.Flip(head, head2);
        op.Inorder(head2);
        
    }
    public static class Operclass{
    
    public void Inorder(Node head)
    {
       if(head==null)
       return;
       Inorder(head.left);
       System.out.print(head.val);
       Inorder(head.right); 
       return; 
    }
    public void Flip(Node head, Node head2)
    {
      if(head==null)  
      return;
      
      if(head.left!=null)
      {
          head2.right=new Node(head.left.val);
          head2=head2.right;
          head=head.left;
          Flip(head, head2);
      }
      
       if(head.right!=null)
      {
          head2.left=new Node(head.right.val);
          head2=head2.left;
          head=head.right;
          Flip(head, head2);
      }
      return;
    }
    
}
public static class Node{
    public int val;
    public Node left,right;
    
    Node(int val)
    {
     this.val=val;
     this.left=null;
     this.right=null;     
    }
}

}