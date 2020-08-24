package binaryTree;

import javax.swing.tree.TreeNode;

public class myBst {
    Node root;

    public myBst() {
        root = null;
    }

    public void insert(int val) {
        Node newnode = new Node(val);
        if (root == null)
        {
            root = newnode;
        } else
            {
            Node current = root;
            Node present = null;
            while (true)
            {
                present =current;
                if (val < current.data)
                {
                    current = current.left;
                    if (current == null)
                    {
                        present.left = newnode;
                        return;

                    }
                }
                else
                    {
                    current = current.right;
                    if (current == null)
                    {
                        present.right = newnode;
                        return;
                    }

                }
            }
        }

    }
    public void inorderTraversal(Node root) {
        if (!root == null) {
            inorderTraversal(root.left);
            System.out.println(root.data);
            inorderTraversal(root.right);
        }
    }
        public void search(int val){
            Node current=root;
            while(current.data!=val){
                if(val<current.data){
                    current=current.left;

                }
                else{
                    current=current.right;
                }
                if(current==null){
                    System.out.println("value not found");
                }else{
                    System.out.println("value found");
                }
            }
            return val;

        }
    }




