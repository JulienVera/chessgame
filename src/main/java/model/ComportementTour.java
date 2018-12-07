package model;


public class ComportementTour implements ComportementDeplacement {

	@Override
	public boolean isMoveOk(int xIni,int yIni, int xFinal, int yFinal, boolean isCatchOk,
			boolean isCastlingPossible,boolean premierCoup) {
		
		boolean ret = false;
		
		if ((yFinal == yIni) || (xFinal == xIni)) {
			ret = true;
		}
		
		return ret;
	}
}
