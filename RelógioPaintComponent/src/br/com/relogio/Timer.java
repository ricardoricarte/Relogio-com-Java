package br.com.relogio;

import java.time.LocalDateTime;

public class Timer extends Thread {
	private boolean rodando = true;
	private int seconds;
	private int minutes;
	private int hours;

	public Timer() {
		this.seconds = LocalDateTime.now().getSecond();
		this.minutes = LocalDateTime.now().getMinute();
		this.hours = LocalDateTime.now().getHour();
	}

	@Override
	public void run() {
		while (this.rodando) {
			try {
				this.seconds++;
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (this.seconds == 60) {
				this.seconds = 0;
				this.minutes++;
			}
			if (this.minutes == 60) {
				this.minutes = 0;
				this.hours++;
			}
			if (this.hours == 12) {
				this.hours = 0;
			}
		}
	}

	public void setRodando() {
		this.rodando = false;
	}

	public int getSeconds() {
		return this.seconds;
	}

	public int getMinutes() {
		return this.minutes;
	}

	public int getHours() {
		return this.hours;
	}
}
