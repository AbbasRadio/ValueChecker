import java.util.*;

class ValueCheck{
	int num;
	float n;
	char ch;
	String str;
	Scanner sc = new Scanner(System.in);
	public void getInput(){
		System.out.print("\n Enter Anything You Want : ");
		if (sc.hasNextInt()){
			num = sc.nextInt();
			int res = nextValue(num);
			System.out.println(" "+ res);
		}else if(sc.hasNextFloat()){
			n = sc.nextFloat();
			float res = nextValue(n);
			System.out.println(" "+ res);
		}else if(sc.hasNextLine()){
			str = sc.next();
			if(str.length() > 1){
				str = nextValue(str);
				System.out.println(" "+ str);
			}
			else{
				char str1=str.charAt(0);
				char res = nextValue(str1);
				System.out.println(" "+ res);
			}
			
		}
	}
	public int nextValue(int n){
		return n+1;
	}
	public float nextValue(float n){
		return n+1;
	}
	public char nextValue(char n){
		int check = n;
		check++;
		char change = (char)check;
		return change;
	}
	public String nextValue(String n){
		if(n==null)
			return null;
		char[] ch1 = n.toCharArray();
		int check = ch1[ch1.length-1];
		check++;
		ch1[ch1.length-1] = (char)check;
		n = String.valueOf(ch1);
		return n;
	}
}
class ValueChecker{
	public static void main(String args[]){
		ValueCheck assign = new ValueCheck();
		assign.getInput();
	}
}
