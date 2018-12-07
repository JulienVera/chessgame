package model;


public class ComportementFou implements ComportementDeplacement {

	@Override
	public boolean isMoveOk(int xIni, int yIni, int xFinal, int yFinal,
			boolean isCatchOk, boolean isCastlingPossible,boolean premierCoup) {
	boolean ret = false;
		if (Math.abs(xFinal - xIni) == Math.abs(yFinal - yIni)) {
			ret  = true;
		}		
		
		return ret;
	}
}
