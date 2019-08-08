import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sun.java.swing.ui.StatusBar;

public class App {

	public static void main(String[] args) {
		
		/* 
		 * ********************
		 * Step 1
		 * ********************
		 */
		List<String> employeeNames = new ArrayList<String>(); 

		/* 
		 * ********************
		 * Step 2
		 * ********************
		 */
		Set<Integer> ids = new HashSet<Integer>();
		
		/* 
		 * ********************
		 * Step 3
		 * ********************
		 */
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		/* 
		 * ********************
		 * Step 4
		 * ********************
		 */
		employeeNames.add("Mario");
		employeeNames.add("Luigi");
		employeeNames.add("Peach");
		employeeNames.add("Toad");
		employeeNames.add("Bowser");
		for (int i = 1; i <= employeeNames.size(); i++) {
			ids.add(i);
		}
		
		/* 
		 * ********************
		 * Step 5
		 * ********************
		 */
		int i = 0;
		for (Integer id : ids) {
			employeeMap.put(id, employeeNames.get(i));
			i++;
		}
		
		/* 
		 * ********************
		 * Step 6
		 * ********************
		 */
		for (Integer key : employeeMap.keySet()) {
			System.out.printf("Employee %d is %s.%n", key, employeeMap.get(key));
		}
		
		/* 
		 * ********************
		 * Step 7
		 * ********************
		 */
		StringBuilder idsBuilder = new StringBuilder();
		
		/* 
		 * ********************
		 * Step 8
		 * ********************
		 */
		for (Integer id : ids) {
			idsBuilder.append(id + "-");
		}
		if (idsBuilder.charAt(idsBuilder.length() - 1) == '-') {
			idsBuilder.setLength(idsBuilder.length() - 1);			
		}

		
		/* 
		 * ********************
		 * Step 9
		 * ********************
		 */
		System.out.println(idsBuilder.toString());
		
		/* 
		 * ********************
		 * Step 10
		 * ********************
		 */
		StringBuilder namesBuilder = new StringBuilder();
		
		/* 
		 * ********************
		 * Step 11
		 * ********************
		 */
		for (String name : employeeNames) {
			namesBuilder.append(name + " ");
		}
		
		/* 
		 * ********************
		 * Step 12
		 * ********************
		 */
		System.out.println(namesBuilder.toString());
	}

}
