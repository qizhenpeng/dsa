/*
 * �������ȶ��е�������
 */

package dsa;

public class Sorter_PQueue implements Sorter {
	private Comparator C;

	public Sorter_PQueue()
	{ this(new ComparatorDefault()); }

	public Sorter_PQueue(Comparator comp)
	{ C = comp; }

	public void sort(Sequence S) {
		Sequence T = new Sequence_DLNode();//Ϊ�����������ȶ��ж�׼��������
		while (!S.isEmpty()) {//��������T
			Object e = S.removeFirst();//��һȡ��S�и�Ԫ��
			T.insertLast(new EntryDefault(e, e));//�ýڵ�Ԫ�ر�����Ϊ�ؼ���
		}
//		PQueue pq = new PQueue_UnsortedList(C, T);
//		PQueue pq = new PQueue_SortedList(C, T);
		PQueue pq = new PQueue_Heap(C, T);
		while(!pq.isEmpty()) {//�����ȶ����в��ϵ�
			S.insertLast(pq.delMin().getValue());//ȡ����СԪ�أ���������ĩβ
			System.out.println("\t:\t" + S.last().getElem());
		}
	}
}