
public class test_p49 {

	public static void main(String[] args) {
		int[][]test;
		test = new int [2][5];
		test[0][0]=80;
		test[0][1]=60;
		test[0][2]=22;
		test[0][3]=34;
		test[0][4]=67;
		test[1][0]=35;
		test[1][1]=68;
		test[1][2]=98;
		test[1][3]=23;
		test[1][4]=47;
		for(int i=0;i<test[1].length;i++) {
			System.out.println("��"+(i+1)+"�ӤH����y���ƬO"+test[0][i]);
			System.out.println("��"+(i+1)+"�ӤH���ƾǤ��ƬO"+test[1][i]);
		}
	}
}
