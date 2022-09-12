package oops;

public class Test {
	public static void main(String[] args) {
		FixedDeposit fd;
		String bankname = "SBI";
		if(bankname.equals("HDFC"))
		{
		fd = new HDFC();
		}
	   else
		{
			fd= new SBI();
		}
		fd.getInterestRate();
		
	}

}
