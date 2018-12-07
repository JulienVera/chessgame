package model;

public class PieceIHM {
	private Pieces piece; 
	
	
	public PieceIHM(Pieces piece) {
		super();
		this.piece = piece;
	}	
	
	public int getX(){
		return this.piece.getX();
	}
	
	public int getY(){
		return this.piece.getY();
	}
	
	public Couleur getCouleur(){
		return this.piece.getCouleur();
	}
	
	public  String getName(){
		return this.piece.getName();
	}

	@Override
	public String toString() {
		return "PieceIHM [piece=" + piece + "]";
	}	

}
