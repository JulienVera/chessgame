package model;


public class ComportementRoi implements ComportementDeplacement{
	
	@Override
	public boolean isMoveOk(int xInit, int yInit, int xFinal, int yFinal, boolean isCatchOk,
			boolean isCastlingPossible,boolean premierCoup) {
		boolean ret = false;
		
		if ((Math.abs(yFinal - yInit) <= 1)
				&& (Math.abs(xFinal - xInit) <= 1)) {
			ret = true;
		}

		return ret;
	}
}
