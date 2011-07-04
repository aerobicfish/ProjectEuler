package ProjectEuler;

public class Euler001 {

	/**
	 * Add all the natural numbers below one thousand that are multiples of 3 or
	 * 5.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iSum = 0;
		for (int iCount = 1; iCount < 1000; iCount = iCount + 1)
		/*
		 * First segment defines the integer to be used within the 'for' loop.
		 * (Hey, it's me, iCount! I'm '1' for now.) Second segment is the test
		 * to determine whether or not the 'for' loop should end. (If I'm equal
		 * to or greater than 1,000, stop using me!) Third segment defines what
		 * should be done if the test is false. (If I'm less than 1,000, add one
		 * to me and start all over again!)
		 */
		{
			if (iCount % 3 == 0 || iCount % 5 == 0) // "If iCount is evenly divisible by 3 or 5"...
			{
				iSum = iCount + iSum; // "Add iCount to the current value of iSum."
			}
		}
		System.out.format("The sum of all natural numbers below 1,000 that are multiples of 3 or 5 is %d%n", iSum);
	}

}
