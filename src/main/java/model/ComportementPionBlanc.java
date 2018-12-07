package model;


public class ComportementPionBlanc implements ComportementDeplacement {
	
	@Override
	public boolean isMoveOk(int xInit, int yInit,int xFinal, int yFinal, boolean isCatchOk,
			boolean isCastlingPossible, boolean premierCoup) {

		boolean ret = false;

		// Déplacement vertical
		if (!isCatchOk && !isCastlingPossible){

			if ((xFinal == xInit)
					&& (Math.abs(yFinal - yInit) <= 1 || 
					(Math.abs(yFinal - yInit) <= 2 && premierCoup==true))) {

				if (yFinal - yInit < 0) {
					ret = true;
				}
			}
		}
		// Déplacement diagonal
		else {
				if ((yFinal == yInit-1 && xFinal == xInit+1) 
						|| (yFinal == yInit-1 && xFinal == xInit-1)) {
					ret = true;
				}
			}

		return ret;
	}
}
