package model;


public class ComportementCavalier implements ComportementDeplacement {
	
	@Override
	public boolean isMoveOk(int xInit, int yInit, int xFinal, int yFinal, boolean isCatchOk,boolean isCastlingPossible,boolean premierCoup) {
		
		boolean ret = false;
		
		if ((Math.abs(xFinal - xInit) + Math.abs(yFinal - yInit)) == 3) {
			
			if ((Math.abs(xFinal - xInit)<3) && (Math.abs(yFinal - yInit)<3)) {
				ret  = true;
			}		
		}	
		
		return ret;
	}
}
