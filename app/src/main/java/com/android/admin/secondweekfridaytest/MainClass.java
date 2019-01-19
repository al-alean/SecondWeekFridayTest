package com.android.admin.secondweekfridaytest;

public class MainClass {


    // Driver code
    public static void main(String[] args) {

        /* 1. Convert a given string to a linkedList of characters in the String.
        Do not use LinkedList class in Java but create it from scratch.
        Should also add and remove elements from the list. */

        /* Start with the empty list. */
        LinkedList list = new LinkedList();
        String givenString = "I am the given string";
        //
        // ******INSERTION******
        //
        for (int i = 0; i <  givenString.length(); i++ ) {

            // Insert the values
            list.insert(list,givenString.charAt(i));
        }


        // Print the LinkedList
        list.printList(list);


        //
        // ******DELETION BY KEY******
        //

        // Delete node with value I
        // In this case the key is ***at head***
        System.out.println();
        list.deleteByKey(list, 'I');

        // Print the LinkedList
        list.printList(list);

        // Delete node with value g
        // In this case the key is present ***in the middle***
        System.out.println();
        list.deleteByKey(list, 'g');

        // Print the LinkedList
        list.printList(list);

        // Delete node with value z
        // In this case the key is ***not present***
        System.out.println();
        list.deleteByKey(list, 'z');

        // Print the LinkedList
        list.printList(list);



        /* 2. Implement a Queue using Stack. Queue should have enqueue and dequeue methods */
        System.out.println();
        Queue q = new Queue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);

        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());




        /* 3. Create a custom arraylist using generics.
        The size of the array would be doubled when array limit is reached. */

        Generics<Integer> genList=new Generics<Integer>();
        Generics<String> gen1List=new Generics<String>();
        genList.add(12);
        genList.add(23);
        genList.add(25);
        gen1List.add("manish");
        gen1List.add("akki");
        System.out.println(genList+"  "+gen1List);



        /* 4. Create a Binary Search tree with Add and print(preorder) method.
        Input array: {50,32,13,65,34,22,3,76,90) */

        BinaryTree tree = new BinaryTree();
        int pre[] = new int[]{50,32,13,65,34,22,3,76,90};
        int size = pre.length;
        NodeInt root = tree.constructTree(pre, size);
        System.out.println("Inorder traversal of the constructed tree is ");
        tree.printInorder(root);



    }

}
