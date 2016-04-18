import javax.swing.JOptionPane;


public class TicTacToe2  {
	public static String randO (){
		double temporary;
		String i="";
			temporary = Math.random();
			if ( temporary>=0 && temporary<.1 ){
				i="Button1";
			}
			if ( temporary>=.1 && temporary<.2 ){
				i="Button2";
			}
			if ( temporary>=.2 && temporary<.3 ){
				i="Button3";
			}
			if ( temporary>=.3 && temporary<.4 ){
				i="Button4";
			}
			if ( temporary>=.4 && temporary<.5 ){
				i="Button5";
			}
			if ( temporary>=.5 && temporary<.6 ){
				i="Button6";
			}
			if ( temporary>=.6 && temporary<.7 ){
				i="Button7";
			}
			if ( temporary>=.7 && temporary<.8 ){
				i="Button8";
			}
			if ( temporary>=.8 && temporary<.9 ){
				i="Button9";
			}
			return i;
		}

	public static void main(String[] args) {
				 String newgame="firstgame";
				 othergui question = new othergui("Do You Want To Play A Game? ");
				 TTTGUI intro = new TTTGUI("Tic Tac Toe",question,newgame);
				 intro.setVisible(true);
	
			}
			
		}
