package model;

import java.util.List;

import tools.ObservableAdapter;


public class ChessGame extends ObservableAdapter implements BoardGames {
	public BoardGames echiquier;
	public ChessGame() {
		this.echiquier = new Echiquier();
	}

	@Override
	public boolean move(int xInit, int yInit, int xFinal, int yFinal) {
		
        boolean ret = echiquier.isMoveOk(xInit, yInit, xFinal, yFinal);
		if(ret)
			ret = echiquier.move(xInit, yInit, xFinal, yFinal);
		if(ret)
			echiquier.switchJoueur();
		
		this.notifyObserver(echiquier.getPiecesIHM());
		
		return ret;
	}

	@Override
	public boolean isEnd() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getMessage() {
		return echiquier.getMessage();
	}

	@Override
	public Couleur getColorCurrentPlayer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Couleur getPieceColor(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PieceIHM> getPiecesIHM() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "ChessGame [echiquier=" + echiquier + ", getMessage()="
				+ getMessage() + "]";
	}

	@Override
	public boolean isMoveOk(int xInit, int yInit, int xFinal, int yFinal) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void switchJoueur() {
		// TODO Auto-generated method stub
		
	}
}
