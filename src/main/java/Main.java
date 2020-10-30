
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Darren
 */
public class Main {
    public static void main(String[] args) {
        //It's better not to use real numbers in your code if you can avoid it
        final int MAXLIST = 10;
        
        ListHandling getLists = new ListHandling();
        
        //As this method returns an ArrayList we don't need to use new here
        ArrayList<String> list1  = getLists.getList(MAXLIST);  
        /*
        1. Create a method to print out the contents of an ArrayList using an 
        ArrayList as the parameter for the method use the method in the Main 
        class to print out the contents of list1 
        */
        System.out.println("List1:");
        getLists.printList(list1);
        
        ArrayList<String> list2 = getLists.getList(MAXLIST);
        /*
        2. Use the same method in the main class to print out the contents of 
        list2 
        */
        System.out.println("List2:");
        getLists.printList(list2);
        /*
        3. Complete the method mergeLists in the class ListHandling 
        */
        ArrayList<String> mergedList = getLists.mergedLists(list1, list2);
        /*
        4. Print out the contents of the merged list using the method in question 1 
        */
        System.out.println("Merged list:");
        getLists.printList(mergedList);
        /*
        5.Write a method to add a new item to the mergedList 
        */
        getLists.addItem(mergedList);
        System.out.println("The new merged list is:" + mergedList);
        /*
        6. Write a method in the ListHandling class to search for a specific 
        item in the mergedList ArrayList if the item is found return the index 
        of the item. If the item is not found return -1 
        */
        System.out.println("Type an item you want to search in the merged list.");
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i< mergedList.size(); i++) {
            String spcItem = sc.nextLine();
            if (!mergedList.get(i).equals(spcItem)) {
                System.out.println(spcItem + " has found");
            }else{
                System.out.println("-1");
            
            }
        
        }
}
}
