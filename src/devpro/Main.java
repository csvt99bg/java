package devpro;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = a / b;
//		System.out.println("c = "+c);

		// xử lý ngoại lệ

		// sd try-catch
		// bao toàn bộ các đoạn code gây lỗi vào trong khối
		// try, sau đó đặt sau khối try một khối catch
		// có khai báo Exception phù hợp
//		try {
//			Scanner sc = new Scanner(System.in);
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			int c = a / b;
//			System.out.println("c = " + c);
//		} catch (ArithmeticException e) {
//			// Exception handler
//			System.out.println("lỗi chia cho 0");
//			System.out.println("Không thể chia được");
//		}

		// khi exception xảy ra thì quá trình thực thi code trong
		// khối try sẽ dừng lại, và chuyển ngay sang pha xử lý lỗi
		// trong pha xử lý lỗi:
		// nếu khối catch phía sau try có khai báo Exception khớp kiểu
		// với exception sinh ra thì
		// exception sẽ được giao cho khối catch này xử lý
		// các lệnh trong catch này sẽ được chạy.

		// theo sau một khối try có thể có nhiều khối catch
		/*
		 * try{
		 * 
		 * } catch (SomeException e){
		 * 
		 * } catch (Exception e){
		 * 
		 * }
		 * 
		 */

		// mỗi khỗi catch có nhiệm vụ bắt một loại exception
		// nếu một khối catch được chạy, thì toàn bộ các khối catch phía
		// sau sẽ bị bỏ qua

		// mẹo: muốn không để thoát exception, luôn luôn đặt một khối
		// catch bắt Exception ở cuối cùng, sau tất cả các khối catch khác
/*
		try {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a / b;
			System.out.println("c = " + c);
		} catch (Exception e) {
			e.printStackTrace();
		}
*/
		// ========================
		// throw dùng để tự ném ra ngoại lệ (chủ động)
		// throw phải đặt trong try-catch
		// hoặc trong method đã được khai báo throw ngoại lệ (throws)
		/*
		try {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			// if(b==1) throw new Exception("Không thể chia cho 1");
			if (b == 1)
				throw new DivideByOneException("Không thể chia cho 1");
			int c = a / b;
			System.out.println("c = " + c);
		} catch (DivideByOneException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		*/
		// ======
		// throws dùng để khai báo cho một method có thể ném ra các ngoại lệ
		// nào, tên của các ngoại lệ đặt sau từ khóa throws,
		// và cách nhau 1 dấu phẩy
		// đặt phần khai báo này trước thân hàm
		
		// sd ham có throws ngoại lệ
		
//		try {
//			int  c = calculate(10,-1);
//		} catch (DivideByOneException e) {
//			//e.printStackTrace();
//			System.out.println(e.message);
//		}

		//================================
		// finally - dùng để định nghĩa một khối code mà luôn được chạy
		// finally - thường đi với try-catch, hoặc là try
		// try-catch-finnaly
		// try-finally
		// chỉ có thể có duy nhất một khối finally theo sau một khối 
		// try, hoặc try-catch 
		
		// finally dùng để đặt các khối code mà cần chắc chắn phải chạy
		// vd: đóng file, đóng kết nối với csdl, ngắt kết nối mạng...
		
//		try {
//			int  c = calculate(10,2);
//			System.out.println("ket qua: c = "+c);
//			c = 5/0;//
//		} catch (DivideByOneException e) {
//			//e.printStackTrace();
//			System.out.println("--->"+e.getMessage());
//		}finally {
//			System.out.println("da tinh toan xong !");
//		}
//		
		
		
		
		
		//========================================================
		// II . Đa luồng 
		
		// Luồng ?
		// là một đơn vị mà code sẽ được thực thi ở trên đó
		// một ctr java luôn có 1 luồng chính gọi là
		// mainThread - đây là luồng chịu trách nhiệm chạy hàm main()
		
		// tạo thread từ class MyThread 
		MyThread t1 = new MyThread("Luong-1");
		MyThread t2 = new MyThread("Luong-2");
		MyThread t3 = new MyThread("Luong-3");
		
		// khởi chạy t1
		t1.start();
		t2.start();
		t3.start();
		
			for (int i = 0; i < 100; i++) {
			System.out.println("mainThread:"+i);
		
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		
		//t1.start();
		
		// tạo luồng từ class MyRunnable
//		MyRunnable myRun = new MyRunnable();
//		Thread t4 = new Thread(myRun);
		
		//System.out.println(t4.getState());
		// chạy
		//t4.start();
		
		// đồng bộ luồng
//		Data data = new Data();
//		Sender sender = new Sender(data);
//		Receiver receiver = new Receiver(data);
//		Thread senderThread = new Thread(sender);
//		Thread receiverThread = new Thread(receiver);
//		//
////		senderThread.start();
////		receiverThread.start();
//		
//		
//		try {
//			//CopyFile.main2();
//			
//			CopyFile.testWriteTXT();
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

	}
	
	public static int calculate(int a, int b) throws DivideByOneException{
		if(b < 1) 
			throw 
			new DivideByOneException("Khong chia duoc cho so nay:"+b);
		return a / b;
	}

}
