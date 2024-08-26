package deadlock;

public class DeadLockExample 
{
	public static void main(String[] args) 
	{

		final String ManojSir="SQL Resources Or Object";
		final String UdaySir="Java Resources Or Object";

		Thread t1=new Thread("Deva")
		{
			public void  run()
			{
				synchronized (ManojSir) {

					System.out.println("Deva Accesiing Manoj Sir");

					try {
						Thread.sleep(2000);
					} catch (Exception e) {

					}

					synchronized (UdaySir) {
						System.out.println("Deva Accessing Uday Sir");
					}

				}
			}
		};

		Thread t2=new Thread("Seetaram")
		{
			public void  run()
			{
				synchronized (ManojSir) {

					System.out.println("Seetaram Accessing Manoj Sir");

					try {
						Thread.sleep(2000);
					} catch (Exception e) {
						e.printStackTrace();
					}

					synchronized (UdaySir) {
						System.out.println("Seetaram Accessing Uday Sir");
					}

				}
			}
		};

		t1.start();
		t2.start();

	}

}
