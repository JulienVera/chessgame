package vue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import model.Coord;
import model.Couleur;
import model.PieceIHM;
import tools.Observer;
import controler.ChessGameControlers;



/**
 * @author francoise.perrin
 * Inspiration Jacques SARAYDARYAN, Adrien GUENARD *
 * 
 * Vue console d'un jeu d'échec
 * Cette classe est un observateur et le damier est mis à jour à chaque changement dans la classe métier
 */
public class ChessGameCmdLine implements Observer {

	private ChessGameControlers chessGameControler;
 
	public  ChessGameCmdLine(ChessGameControlers chessGameControler) {
		this.chessGameControler = chessGameControler;
	}


	public void go() {  

		System.out.print("\n Déplacement de 3,6 vers 3,4 = ");
		chessGameControler.move(new Coord(3,6), new Coord(2, 5));	// true
		System.out.println(chessGameControler.getMessage() + "\n");	
		System.out.println(chessGameControler);
		
		System.out.print("\n Déplacement de 3,4 vers 3,6 = ");		
		chessGameControler.move(new Coord(3,4), new Coord(3, 6));	// false 
		System.out.println(chessGameControler.getMessage() + "\n");	
		System.out.println(chessGameControler);
		
		System.out.print("\n Déplacement de 4,1 vers 4,3 = ");
		chessGameControler.move(new Coord(4, 1), new Coord(4, 3));	// true
		System.out.println(chessGameControler.getMessage() + "\n");	
		System.out.println(chessGameControler);
		
		System.out.print("\n Déplacement de 3,4 vers 3,4 = ");
		chessGameControler.move(new Coord(3, 4), new Coord(3, 4));	// false
		System.out.println(chessGameControler.getMessage() + "\n");	
		System.out.println(chessGameControler);
		
		System.out.print("\n Déplacement de 3,4 vers 4,3 = ");
		chessGameControler.move(new Coord(3, 4), new Coord(4, 3));	// true		
		System.out.println(chessGameControler.getMessage() + "\n");	
		System.out.println(chessGameControler);
	}



	public void update(Object object){
		
		List<PieceIHM> piecesIHM = (LinkedList<PieceIHM>) object;
		Iterator<PieceIHM> iterator = piecesIHM.iterator();
		
		System.out.println(chessGameControler.getMessage() + "\n");	

		String[][] damier = new String[8][8];
		
		// création d'un tableau 2D avec les noms des pièces
		while(iterator.hasNext()){
			PieceIHM pieceIHM = iterator.next();
			Couleur color = pieceIHM.getCouleur();
			String stColor = (Couleur.BLANC == color ? "B_" : "N_" );
			String type = (pieceIHM.getName()).substring(0, 2);
			if(pieceIHM.getX()>=0 && pieceIHM.getY() >=0)
					damier[pieceIHM.getY()][pieceIHM.getX()] = stColor + type;
			}
		
		// Affichage du tableau formatté
		String st = "    0     1     2     3     4     5    6     7 \n";
		for ( int i = 0; i < 8; i++) {
			st += i + " ";
			for ( int j = 0; j < 8; j++) {				 
				String nomPiece = damier[i][j];				
				if (nomPiece != null) {						
					st += nomPiece + "  ";	
				} 
				else {
					st += "__  ";
				}
			}
			st +="\n";
		}
		
		System.out.println(st);		
		
	}
	


}
