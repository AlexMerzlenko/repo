package TestLibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Alex on 02/25/2018.
 */
public class ListQueries extends TestObjectEntry {
    
	public void RunTest() {
		int n;
        int queriesNumber;
        String action;
        int value;
        int position;
        
        List list = new ArrayList();
        
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        while (n-- > 0){
            list.add(scan.nextInt());
        }
        
        queriesNumber = scan.nextInt();
        while (queriesNumber-- > 0){
            action = scan.next();
            value = scan.nextInt();
            position = scan.nextInt();
            
            if (action.compareTo("Insert") == 0) {
                list.add(position, value);
            }
            else
            if (action.compareTo("Delete") == 0) {
                list.remove(position);
            };
        }
        
        for (int i=0; i<list.size(); i++) {
            System.out.printf("%s ", list.get(i));
        }
	}
}
