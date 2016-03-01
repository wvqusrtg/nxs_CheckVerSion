/**
 * 
 */
package net.wicp.wvqusrtg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author nixinsheng
 * 2016年2月29日
 */
public class nxs_CompMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data = new String[]{
	            "2.0",
	            "1.5.1",
	            "1.5.1",
	            "1.1.9",
	            "1.0",
	            "0.97",
	            "1.2",
	            "1.2.0",
	            "1.2.1",
	            "1.5.1.2",
	            "10.1.2.0",
	            "9.0.0.0",
	            "2.0.0.16",
	            "1.6.0_07",
	            "Aeneric_127127-11",
	            "1.6.0_07-b06",
	            "1.6.0_6",
	            "1.6.0_07-b07",
	            "axs_323-23",
	            "1.6.0_08-a06",
	            "nxs_023-23",
	            "5.10",
	            "Generic_127127-11",
	            "Generic_127127-13"
	        };
//		String[] data = new String[]{
//	            "3A",
//	            "a"
//	        };
	        List<String> list = Arrays.asList(data);
	        
	        System.out.println("*********集合***********");
	        Collections.sort(list, new nxs_Comparator());
	        for (String s:list) {
				System.out.println(s);
			}
	        
	        System.out.println("*********列表***********");	        
	        list.sort(new nxs_Comparator());
	        for (int i = 0; i < list.size(); i++) {
				System.err.println(list.get(i));
			}
	}

}
