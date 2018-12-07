package model;




/**
 * @author francoise.perrin
 * Inspiration Jacques SARAYDARYAN, Adrien GUENARD*
 */
abstract class Pion extends AbstractPiece  {

	protected boolean premierCoup;

	/**
	 * @param name
	 * @param couleur_de_piece
	 * @param coord
	 */
	public Pion(Couleur couleur_de_piece, Coord coord, ComportementDeplacement comportementDeplacement) {
		super(couleur_de_piece, coord,comportementDeplacement);
		System.out.println("Constructeur Pion");

		this.premierCoup = true;
	}
	
	

	/* (non-Javadoc)
	 * @see model.AbstractPiece#isMoveOk(int, int)
	 */
	//@Override
	//public abstract boolean isMoveOk(int xFinal, int yFinal, boolean isCatchOk,
		//	boolean isCastlingPossible);



	/* (non-Javadoc)
	 * @see model.AbstractPiece#move(int, int)
	 */
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
