package devpro;

public class MyRunnable implements Runnable {

	
	@Override
	public void run() {
		// nơi đặt các mã lệnh mà sẽ chạy trên luồng riêng
		for (int i = 0; i < 50; i++) {
			System.out.println("MyRunnable:"+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
