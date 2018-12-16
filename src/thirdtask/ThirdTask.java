/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdtask;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author FADY_
 */
public class ThirdTask {

    /**
     * @param args the command line arguments
     */
    static
    public ArrayList<Integer> getIndex(String str, String substring) {
        List<String> tokens = Arrays.asList(str.split("\\s+"));
        ArrayList<Integer> match = new ArrayList<>(); 
        for (int i = 0; i < tokens.size(); i++) {

            if (tokens.get(i).equals(substring)) {
                match.add(i);
            }
        }
        return match;

    }
    
    public static void main(String[] args) throws IOException {
        Index gui = new Index();
        Scanner input;
        input = new Scanner(System.in);
        
        System.out.println("Enter doc 1 :");
        String doc1 = input.nextLine().toLowerCase();
        System.out.println("Enter doc 2 :");
        String doc2 = input.nextLine().toLowerCase();
        System.out.println("Enter doc 3 :");
        String doc3 = input.nextLine().toLowerCase();
        System.out.println("Enter doc 4 :");
        String doc4 = input.nextLine().toLowerCase();
        
        System.out.println("Enter query :");
        String key = input.nextLine().toLowerCase();
        
        String docs[] = {doc1, doc2, doc3, doc4};
        String tokens[] = key.split(" ");
        
        for (int j = 0; j < tokens.length; j++) {
            System.out.println(tokens[j]);
            for (int i = 0; i < 4; i++) {
            if (docs[i].contains(tokens[j])) {
                ArrayList<Integer> match = getIndex(docs[i], tokens[j ]);
                System.out.println( " in doc "+ (i + 1) + " at index "+ match);
                
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            if (docs[i].contains(key)) {
                System.err.println(key + " match doc number " + (i + 1));
            }
        }
    
}
}