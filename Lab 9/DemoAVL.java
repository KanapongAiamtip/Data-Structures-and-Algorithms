import java.util.Scanner;
public class DemoAVL
{
  public static void main(String[] args)
  {
     AVLTree tree = new AVLTree();
     Scanner in = new Scanner(System.in);
     for(int i = 1;i<=6;i++)
     {
       tree.root = tree.insert(tree.root,in.nextInt());
     }
/* tree.root = tree.insert(tree.root, 10);
    tree.root = tree.insert(tree.root, 20);
    tree.root = tree.insert(tree.root, 30);
    tree.root = tree.insert(tree.root, 40);
    tree.root = tree.insert(tree.root, 50);
    tree.root = tree.insert(tree.root, 25);  */

     System.out.println("++Preorder traversal++");
     tree.preOrder(tree.root);
     System.out.println("\n++Inorder traversal++");
     tree.inOrder(tree.root);
     System.out.println("\n++Postorder traversal++");
     tree.postOrder(tree.root);

 }

}
