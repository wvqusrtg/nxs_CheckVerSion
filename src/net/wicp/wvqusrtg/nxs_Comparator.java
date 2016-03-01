/**
 * 
 */
package net.wicp.wvqusrtg;

import java.util.Comparator;

/**
 * @author nixinsheng 2016��2��29��
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
		 * [A-Z a-z 0-9_] ƥ�����д�Сд��ĸ�����ֺͿո��»��� [^A-Z a-z 0-9_] ƥ�����г���
		 * ��Сд��ĸ�����ֺͿո��»���֮��������ַ� ���硰#���͡�*�� [^xxx] ��ʾ�ų�xxx��
		 */
		String[] arr1 = s1.split("[^a-zA-Z0-9]+"), arr2 = s2
				.split("[^a-zA-Z0-9]+");
		int i1, i2, i3;
		/**
		 * java.lang.Math.min(int a, int b) ��������intֵ�н�С��һ����
		 * Ҳ����˵������Ǹ��ӽ���������ֵ���������������ͬ��ֵ����������ͬ��ֵ��
		 * �������ֵ��NaN����ô���ΪNaN����ֵ�Ƚ����㲻ͬ���ǣ��˷�����Ϊ�����ϸ�С�����㡣���һ�����������㣬�Ǹ��㣬����Ǹ���.
		 */
		// max ΪҪ�Ƚϴ���
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
