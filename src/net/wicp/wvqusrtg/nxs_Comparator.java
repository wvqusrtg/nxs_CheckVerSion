/**
 * 
 */
package net.wicp.wvqusrtg;

import java.util.Comparator;

/**
 * @author nixinsheng 2016年2月29日
 */
public class nxs_Comparator implements Comparator<String> {

	public int compare(String s1, String s2) {
		if (s1 == null && s2 == null)
			return 0;
		else if (s1 == null)
			return -1;
		else if (s2 == null)
			return 1;
		/**
		 * [A-Z a-z 0-9_] 匹配所有大小写字母、数字和空格、下划线 [^A-Z a-z 0-9_] 匹配所有除了
		 * 大小写字母、数字和空格、下划线之外的所有字符 比如“#”和“*” [^xxx] 表示排除xxx。
		 */
		String[] arr1 = s1.split("[^a-zA-Z0-9]+"), arr2 = s2
				.split("[^a-zA-Z0-9]+");
		int i1, i2, i3;
		/**
		 * java.lang.Math.min(int a, int b) 返回两个int值中较小的一个。
		 * 也就是说，结果是更接近负无穷大的值。如果参数具有相同的值，其结果是相同的值。
		 * 如果两个值是NaN，那么结果为NaN。数值比较运算不同的是，此方法认为负零严格小于正零。如果一个参数是正零，是负零，结果是负零.
		 */
		// max 为要比较次数
		for (int ii = 0, max = Math.min(arr1.length, arr2.length); ii <= max; ii++) {
			if (ii == arr1.length)
				return ii == arr2.length ? 0 : -1;
			else if (ii == arr2.length)
				return 1;

			try {
				i1 = Integer.parseInt(arr1[ii]);
			} catch (Exception x) {
				i1 = Integer.MAX_VALUE;
			}

			try {
				i2 = Integer.parseInt(arr2[ii]);
			} catch (Exception x) {
				i2 = Integer.MAX_VALUE;
			}

			if (i1 != i2) {
				// System.out.println(i1-i2);
				return i1 - i2;
			}

			i3 = arr1[ii].compareTo(arr2[ii]);

			if (i3 != 0)
				// System.out.println(i3);
				return i3;
		}
		return 0;
	}

}
