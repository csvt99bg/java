package devpro;

public class MyThread extends Thread {
	// thực hiện việc ghi đè hàm run của class Thread
	
	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		// nơi chứa code, hoặc các lời gọi mà 
		// sẽ được chạy trên luồng tạo từ MyThread
		for (int i = 0; i < 100; i++) {
			String name = Thread.currentThread().getName();
			System.out.println(name+":"+i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
