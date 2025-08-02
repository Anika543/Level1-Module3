package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
	static final int WIDTH = 800;
	static final int HEIGHT = 600;

	int x = WIDTH / 2;
	int y = HEIGHT - 50;

	Car car1 = new Car(WIDTH, 0, 100, 10);
	Car car2 = new Car(WIDTH, 100, 100, 10);
	Car car3 = new Car(WIDTH, 200, 100, 10);
	Car car4 = new Car(WIDTH, 300, 100, 10);
	Car car5 = new Car(WIDTH, 400, 100, 10);
	boolean gameRunning = true;

	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {

	}

	@Override
	public void draw() {
		if (gameRunning) {

			background(149, 189, 214);
			fill(0, 196, 7);
			ellipse(x, y, 20, 20);

			car1.display();
			car1.moveLeft();
			car2.display();
			car2.moveRight();
			car3.display();
			car3.moveLeft();
			car4.display();
			car4.moveRight();
			car5.display();
			car5.moveLeft();

			if (intersects(car1) == true || intersects(car2) == true || intersects(car3) == true
					|| intersects(car4) == true || intersects(car5) == true) {
				gameRunning = false;

			}
		} else {

		}

	}

	public void keyPressed() {
		if (key == CODED) {
			if (keyCode == UP & y > 20) {
				y -= 10;
			} else if (keyCode == DOWN & y < 580) {
				y += 10;
			} else if (keyCode == RIGHT & x < 780) {
				x += 10;
			} else if (keyCode == LEFT & x > 20) {
				x -= 10;
			}
		}
	}

	boolean intersects(Car car) {
		if ((y > car.y && y < car.y + 50) && (x > car.x && x < car.x + car.size)) {
			return true;
		} else {
			return false;
		}
	}

	static public void main(String[] args) {
		PApplet.main(Frogger.class.getName());
	}

	class Car {
		int x;
		int y;
		int size = 100;
		int speed;

		public Car(int x, int y, int size, int speed) {
			this.x = x;
			this.y = y;
			this.size = size;
			this.speed = speed;

		}

		public void moveLeft() {
			// TODO Auto-generated method stub
			if (x > -100) {
				x -= speed;
			} else {
				x = WIDTH;
			}

		}

		public void moveRight() {
			// TODO Auto-generated method stub
			if (x < WIDTH + 100) {
				x += speed;
			} else {
				x = -100;
			}

		}

		public void getX() {

		}

		public void getY() {

		}

		public void getSize() {

		}

		void display() {
			fill(196, 0, 0);
			rect(x, y, size, 50);
		}

	}
}
