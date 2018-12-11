package model;


/**
 * @author francoise.perrin
 * Inspiration Jacques SARAYDARYAN, Adrien GUENARD*
 */
public abstract class Pion extends AbstractPiece  {

	private boolean premierCoup;

	/**
	 * @param couleur_de_piece
	 * @param coord
	 */
	Pion(Couleur couleur_de_piece, Coord coord) {
		super(couleur_de_piece, coord);
		this.premierCoup = true;
	}

	@Override
	public boolean isMoveOk(int xFinal, int yFinal, boolean isCatchOk,
			boolean isCastlingPossible) {

		boolean ret = false;

		// Déplacement vertical
		if (!isCatchOk && !isCastlingPossible){
			if ((xFinal == this.getX())
                && (Math.abs(yFinal - this.getY()) <= 1
                    || (Math.abs(yFinal - this.getY()) <= 2 && this.premierCoup))
                ) {
                ret = this.checkOutOfBounds(yFinal);
			}
		}
		// Déplacement diagonal
		else {
            ret = this.checkDiago(xFinal, yFinal);
		}
		return ret;
	}

    public abstract boolean checkOutOfBounds(int yFinal);
    public abstract boolean checkDiago(int xFinal, int yFinal);

	@Override
	public boolean move(int x, int y){
		boolean ret = false;

		if(Coord.coordonnees_valides(x,y)){
			this.premierCoup = false;
			ret = super.move(x, y);
		}
		return ret;
	}
}
