
public class test_p41 {
	public static void main(String[] args){
		int []test;
		test = new int [5];
		test[0] = 80;
		test[1] = 60;
		test[2] = 22;
		test[3] = 1;
		test[4] = 2;
		test[10]=75; //不能加這行會是錯的，超過陣列本身長度
		for(int i=0;i<5;i++)
			System.out.println("第"+(i+1)+"個人分數是"+test[i]+"分");
	}
}
