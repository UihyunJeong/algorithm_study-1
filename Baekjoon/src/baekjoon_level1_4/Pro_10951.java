package baekjoon_level1_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Pro_10951 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = null;
		while((str = br.readLine()) != null || str != "") {
			String[] arr = str.split(" ",-1);
			//��� : �迭�� ����, 0 : �����ڴ� ��� ���� �� ������ ���� ���ڸ� �迭 ����, ���� : ������ �����Ͽ� �迭 ����
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);			
			
			//bw.write((a+b) + "\n");
			System.out.println(a+b);
		}
		//bw.close();
		br.close();
	}//write�� ����� �ȶ�����;;
}
