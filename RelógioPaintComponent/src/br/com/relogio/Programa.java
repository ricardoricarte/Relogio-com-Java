package br.com.relogio;
import java.awt.EventQueue;

public class Programa {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Window();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
