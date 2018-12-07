package model;


public interface ComportementDeplacement {
	
	public abstract boolean isMoveOk(int xInit,int yInit, int xFinal, int yFinal, boolean isCatchOk,
			boolean isCastlingPossible, boolean premierCoup) ;
	
}
