 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Darren
 */
public class ListHandling {
    /**
     * Generates a list of shopping items from text file stored in project root 
     * dir
     * @param listSize size of list
     * @return ArrayList of listSize    
    */
    public ArrayList<String> getList(int listSize) {
        String TEXTFILENAME = "main_list.txt";
        ArrayList<String> shoppingList = new ArrayList<>();
        //Everything in the try catch is executed unless the file is missing!
        //We cover try catch later
       try {    
            ArrayList<String> fileList = new ArrayList<>();
            File file = new File(TEXTFILENAME);
            Scanner sc = new Scanner(file);
            //Read the entire text file into an ArrayList
            while (sc.hasNextLine()) {
                fileList.add(sc.nextLine());
            }
            //shuffle is a method in the collections library that will shuffle a 
            //list into a random order
            Collections.shuffle(fileList);
            //Add listSize items to a new list of listSize
            for (int i = 0; i < listSize; i++) {
                shoppingList.add(fileList.get(i));
            } 
        } catch (FileNotFoundException ex) {
            //This catches the error if the text file is not found
            Logger.getLogger(ListHandling.class.getName()).log(Level.SEVERE, null, ex);
        }
        return shoppingList;
    }
    public void printList(ArrayList<String> list) {
        for (String i: list)
            System.out.println(i);
    }
    
    /**
     * Write the code to merge the two lists together to make a new list with one 
     * instance of each item from both lists - the new list will be the size of 
     * the unique items in the two lists
     * @param list1 list to merge  
     * @param list2 list to merge 
     * @return ArrayList of mergedList
    */
    
    public ArrayList<String> mergedLists(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> mergedList;  
        mergedList = new ArrayList<>();
        ArrayList<String> tentativeList = new ArrayList<>();
        
        
        //Use for loop to put items in list1 and list2 into a tentative list
        for (int i = 0; i < 10; i++ ) {
            tentativeList.add(list1.get(i));
            tentativeList.add(list2.get(i));  
        }
        
        //Use another for loop to put items in tentativeList into mergedList, the repeated ones will not be added
        for (int j = 0; j < tentativeList.size(); j++) {
            if(!mergedList.contains(tentativeList.get(j))) {
                mergedList.add(tentativeList.get(j));
            }
        }
        return mergedList;
    }
    
    public ArrayList<String> addItem(ArrayList<String> addedList) {
        System.out.println("Add a new item to merged list.");
        Scanner intoNewItem = new Scanner(System.in);
        String newItem = intoNewItem.nextLine();
        addedList.add(newItem);
        return addedList;
    }
    
}
