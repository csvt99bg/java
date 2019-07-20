package devpro;

public class Data {
	private String packet;
	private boolean transfer = true; // cờ báo

	public synchronized void send(String packet) {
		while (!transfer) { // guard-block
			try {
				this.wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		transfer = false;
		this.packet = packet;
		this.notifyAll();
	}

	public synchronized String receive() {
		while (transfer){ // guard-block
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();

			}
		}
		transfer = true;

		notifyAll();
		return packet;
	}
}
