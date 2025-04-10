import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
	    digitList = new ArrayList();
		if (num == 0) { digitList.add(0, 0); }
		while (num > 0) {
			int rem = num % 10;
			num = num / 10;
			digitList.add(0, rem);
		}
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		if (digitList.size() == 1) return true;
		int prev = digitList.get(0);
		for (int i = 1; i < digitList.size(); i++) {
			int get = digitList.get(i);
			if (get > prev == false) return false;
			prev = get;
		}
		return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
