package model;

public class PionBlanc extends Pion {
	public PionBlanc(Couleur couleur, Coord coord) {
		super(couleur, coord);
	}
	
	public boolean checkOutOfBounds(int yFinal) {
		return yFinal - this.getY() < 0;
	}
	
	public boolean checkDiago(int xFinal, int yFinal) {
		return (yFinal == this.getY()-1 && xFinal == this.getX()+1)
			|| (yFinal == this.getY()-1 && xFinal == this.getX()-1);
	}
}
