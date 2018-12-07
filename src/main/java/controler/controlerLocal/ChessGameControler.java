package controler.controlerLocal;

import java.util.List;

import model.BoardGames;
import model.Coord;
import model.Couleur;
import model.PieceIHM;
import controler.ChessGameControlers;

public class ChessGameControler implements ChessGameControlers {

	private BoardGames chessGame;
	
	public ChessGameControler(BoardGames chessGame) {
		super();
		this.chessGame = chessGame;
	}

	@Override
	public boolean move(Coord initCoord, Coord finalCoord) {

		return this.chessGame.move(initCoord.x, initCoord.y, finalCoord.x, finalCoord.y);
	}

	@Override
	public String getMessage() {
		
		return this.chessGame.getMessage();
	}

	@Override
	public boolean isEnd() {
		return this.chessGame.isEnd();
	}

	@Override
	public boolean isPlayerOK(Coord initCoord) {
		return true;
	}
	
}
