package dADA;
import java.util.Scanner;

public class JieMian {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input=new Scanner(System.in);
		System.out.println("请输入需要哪辆车：");
		int i=input.nextInt();
		if(i==1){
			JingLong m=new JingLong();
			m.jiage();
			m.zaihuo();
		}
		if(i==2){
			PiKa n=new PiKa();
			n.jiage();
			n.zaihuo();
			n.zaike();
		}
		if(i==3){
			AoDi r=new AoDi();
			r.zaike();
			r.jiage();
		}

	}

}
