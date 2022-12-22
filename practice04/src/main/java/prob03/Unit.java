package prob03;

public abstract class Unit {
	// 현재 위치
		private int x;
		private int y;

		public abstract void move(int x, int y);

		public abstract void stop();

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}
		
		
}
