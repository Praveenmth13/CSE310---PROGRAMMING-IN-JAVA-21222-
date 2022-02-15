package q11271;
class Bank {
	float calculateInterest(float principal, int time)	{
		return 0;
	}
}
class SBI extends Bank{
	private static final float INTEREST_RATE = 10.8f;
	
	float calculateInterest(float p,int t){
		return(p*t*INTEREST_RATE)/100;
	}
	
}
class ICICI extends Bank{
	private static final float INTEREST_RATE = 11.6f;
	float calculateInterest(float p,int t){
		return (p*INTEREST_RATE*t)/100;
	}
	
}

class AXIS extends Bank {
	private static final float INTEREST_RATE = 12.3f;
	float calculateInterest(float p,int t){
		return (p*INTEREST_RATE*t)/100;
	}
	
}

public class TestOverriding {
	public static void main(String[] args) {
		Bank sbiBank = new SBI();
		Bank  iciciBank = new ICICI();
		Bank axisBank = new AXIS();
		float principal = Float.parseFloat(args[0]);
		int time = Integer.parseInt(args[1]);
		System.out.println("SBI rate of interest = " + sbiBank.calculateInterest(principal,time));
		System.out.println("ICICI rate of interest = " + iciciBank.calculateInterest(principal,time));
		System.out.println("AXIS rate of interest = " + axisBank.calculateInterest(principal,time));
	}
}
