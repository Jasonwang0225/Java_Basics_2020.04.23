/*
    ���ʹ����������¼ѧ���Ŀ��Գɼ�����ӡ
 */
 
import java.util.Scanner; 
import java.util.Arrays;
 
public class ArrayScoreTest {
	
	public static void main(String[] args) {
		
		// 1.��ʾ�û�����ѧ����������ʹ�ñ�����¼
		System.out.println("������ѧ����������");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 2.����ѧ����������������Ӧ���ȵ����鸺���¼ѧ���Ŀ��Գɼ�
		// �䳤���� �� ��Ҫָ����������Ϊ����ĳ��ȣ�������������ĳ��ȿ��Է����ı�
		int[] scores = new int[num];
		
		// 3.��ʾ�û�����ÿ��ѧ���Ŀ��Գɼ�����¼һά������
		for(int i = 0; i < num; i++) {
			System.out.println("�������" + (i+1) + "��ѧ���Ŀ��Գɼ���");
			scores[i] = sc.nextInt();
		}
		
		// 4.��ӡ����ѧ���Ŀ��Գɼ�
		System.out.print("����ѧ���Ŀ��Գɼ��ֱ��ǣ�");
		for(int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
		
		System.out.println("----------------------------------------------");
		// 5.���㱾�༶ѧ�����ܷ��Լ�ƽ���ֲ�ʹ�ñ�����¼
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		double avg = sum*1.0 / num;
		// ��ӡ���յļ�����
		System.out.println("���༶ѧ�����ܷ��ǣ�" + sum + "��ƽ�����ǣ�" + avg);
		
		System.out.println("----------------------------------------------");
		// 6.����ʹ�����鹤����ʵ��������Ԫ�ص�����
		System.out.println(Arrays.toString(scores));
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		// ��ӡ��ͷֺ���߷�
		System.out.println("��ͷ��ǣ�" + scores[0] + "����߷��ǣ�" + scores[1]);
		
		// 7.�����������Ƿ����59�ֵ�С��飬���������ӡ�±�
		System.out.println("�����ҷ�ֵ���ڵ������±��ǣ�" + Arrays.binarySearch(scores, 59));
	}
}