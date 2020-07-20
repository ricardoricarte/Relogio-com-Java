package br.com.relogio;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Paint extends JPanel {
	private static final long serialVersionUID = 1L;
	private Color black = Color.BLACK;
	private Color red = Color.RED;
	private Timer timer = new Timer();
	private int ponteiro;
	private int minuto;
	private int horas;

	public Paint() {
		this.timer.start();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.ponteiro = this.timer.getSeconds() * 6;
		this.minuto = this.timer.getMinutes() * 6;
		this.horas = this.timer.getHours() * 30;

		// desenha circulo
		drawCircle(g, 250, 250, 300, this.black);

		// desenha um circulo acompanhado do seu angulo
		// g.setColor(blue);
		// g.drawArc(100, 100, 300, 300, 90, -360);

		// desenha o texto dos numeros do relogio na cor vermelho
		g.setColor(Color.red);
		g.drawString("12", 243, 120);
		g.drawString("1", 317, 140);
		g.drawString("2", 370, 188);
		g.drawString("3", 390, 255);
		g.drawString("4", 370, 322);
		g.drawString("5", 317, 370);
		g.drawString("6", 247, 390);
		g.drawString("7", 173, 370);
		g.drawString("8", 123, 322);
		g.drawString("9", 105, 255);
		g.drawString("10", 123, 188);
		g.drawString("11", 173, 140);

		// desenha centro do relógio
		drawCircle(g, 250, 250, 3, this.red);

		// desenha ponteiro do relógio segundos
		g.setColor(Color.RED);
		g.drawArc(150, 150, 200, 200, 90, -this.ponteiro);

		// desenha ponteiro do relógio minutos
		g.setColor(Color.BLUE);
		g.drawArc(175, 175, 150, 150, 90, -this.minuto);

		// desenha ponteiro do relógio horas
		g.setColor(Color.YELLOW);
		g.drawArc(200, 200, 100, 100, 90, -this.horas);

		repaint();
	}

	public void drawCircle(Graphics g, int x, int y, int d, Color cor) {
		x = x - (d / 2);
		y = y - (d / 2);
		g.setColor(cor);
		g.fillOval(x, y, d, d);
	}

}
