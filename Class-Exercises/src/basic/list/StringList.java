package basic.list;

import data.people.People;
import java.util.ArrayList;
import java.util.Scanner;

public class StringList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> firstNamesList = People.generate(10).getFirstNamesList();
        System.out.println(firstNamesList.toString());
        System.out.println("Enter keyword to search in list:");
        String keyword = input.next();
        int indexOfKeyword = search(firstNamesList, keyword);
        System.out.println("index of " + keyword + " is: " + indexOfKeyword);
    }


    static int search(ArrayList<String> list, String keyword) {
        String keywordToLower = keyword.toLowerCase();
        for(int index = 0; index < list.size(); index++) {
            String itemToLower = list.get(index).toLowerCase();
            if(itemToLower.equals(keywordToLower)){
                return index;
            }
        }
        return -1;
    }
}
