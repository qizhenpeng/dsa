/*
 * Comparable�����Ĭ�ϱȽ���
 */

package dsa;

public class ComparatorDefault implements Comparator {
	public ComparatorDefault() {}
	public int compare(Object a, Object b) throws ClassCastException {
		return ((Comparable) a).compareTo(b);
	}
}