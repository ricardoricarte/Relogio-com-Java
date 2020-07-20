package br.com.relogio;

import javax.swing.JFrame;

public class Window extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private Paint relógio = new Paint();
	private JFrame janela = new JFrame("Clock");;

	public Window() {
		this.janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.janela.setSize(500, 500);
		this.janela.setLocationRelativeTo(null);
		this.janela.setVisible(true);
		this.janela.add(this.relógio);

	}
}
