import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.*;
import java.awt.*;
import java.awt.Desktop.Action;

 

 

public  class TTTGUI extends JFrame implements ActionListener{
			public static boolean play =true;
			private static int turn = 0;
			private static int totalturn = 0;
			private static char[][] positions = new char[3][3];
			private static JLabel  turnmessage = new JLabel("X please go");
			private static JButton Button1  = new JButton("Button1"); 
			private static JButton Button2  = new JButton("Button2"); 
			private static JButton Button3  = new JButton("Button3"); 
			private static JButton Button4  = new JButton("Button4"); 
			private static JButton Button5  = new JButton("Button5");
			private static JButton Button6  = new JButton("Button6");
			private static JButton Button7  = new JButton("Button7");
			private static JButton Button8  = new JButton("Button8");
			private static JButton Button9  = new JButton("Button9");
			private static JButton machineButton = new JButton();
			public static TTTGUI game =new TTTGUI();
			
			// this creates the gui for the opening question, if the user presses yes, it opens the game gui
		public TTTGUI(String title,othergui question,String firstgame){
			
			setTitle(title);
			setSize(850,850);
			setResizable(true);
			setLayout(new GridLayout(0,1));
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			//JTextField start = new JTextField("Do You Want To Play?");
			JTextField buttons = new JTextField("Buttons go here");
			JMenuBar bar= new JMenuBar();
			JButton exit_button = new JButton("Exit");
			JButton play_button = new JButton("Play Tic Tac Toe");
			if(firstgame!="firstgame"){ play_button.setText("Play Tic Tac Toe Again?");
			}
			JMenu options_button = new JMenu("Options");
			JMenuItem exit_bar_button = new JMenuItem("Exit");
			JMenuItem Ai_button = new JMenuItem("Toggle A.I On/Off");
			setJMenuBar(bar);
			Ai_button.addActionListener(this);
			play_button.addActionListener(this);
			exit_button.addActionListener(this);
			exit_bar_button.addActionListener(this);
			bar.add(options_button);
			options_button.add(exit_bar_button);
			options_button.add(Ai_button);
			buttons.setLayout(new GridLayout(0,2));
			//start.add(play_button);
			//start.add(exit_button);
			buttons.add(play_button);
			buttons.add(exit_button);
			add(question);
			
			add(buttons);
			//add(start);
			
		}
		//the actual game gets constructed
		public TTTGUI(){
			super("Tic Tac Toe");
			setSize(850,850);
			setResizable(true);
			setLayout(new BorderLayout());
			JLabel buttons = new JLabel("Buttons go here");

			buttons.setLayout(new GridLayout(3,3));
			setDefaultCloseOperation(EXIT_ON_CLOSE); 	
			Button1.addActionListener(this);			// the gui has a built in action listener  
			Button2.addActionListener(this);
			Button3.addActionListener(this);
			Button4.addActionListener(this);
			Button5.addActionListener(this);
			Button6.addActionListener(this);
			Button7.addActionListener(this);
			Button8.addActionListener(this);
			Button9.addActionListener(this);
			buttons.add(Button1);							// adds all the buttons to the jframe
			buttons.add(Button2);
			buttons.add(Button3);
			buttons.add(Button4);
			buttons.add(Button5);
			buttons.add(Button6);
			buttons.add(Button7);
			buttons.add(Button8);
			buttons.add(Button9);
			add(turnmessage, BorderLayout.NORTH);
			add(buttons,BorderLayout.CENTER);
			//setVisible(true);
		}
		// checks to see if there is a winner
		private void toggleOnAi(){ 
			if(play==true){
				System.out.print("button works");
				play=false;
			}
			else play=true;
		}
		// this turns the buttons on and off, as well as keeps track of all the variables needed to check the game
		private  void setpositions(String position){
			if (position=="Button1"){
				if(turn==0){
					Button1.setText("X");					// this changes the button text to an x if it is x's turn
					turn++;										// this switches the turn over to O
					turnmessage.setText("O please go");			// this changes the message over to O so he knows its his turn
					totalturn++;
					positions[0][0]='X';						// this adds the move to the char 2d array that keeps track of all the moves
					
				}
				else{
					Button1.setText("O");					// this changes the button text to an x if it is x's turn
					turn--;										// this switches the turn over to O
					turnmessage.setText("X please go");			// this changes the message over to O so he knows its his turn
					totalturn++;
					positions[0][0]='O';						
				}
				Button1.setEnabled(false);
			}
			if(position=="Button2"){						
				if(turn==0){
					Button2.setText("X");					// this changes the button text to an x if it is x's turn
					turn++;										// this switches the turn over to O
					turnmessage.setText("O please go");			// this changes the message over to O so he knows its his turn
					totalturn++;
					positions[0][1]='X';
				}
				else{
					Button2.setText("O");					// this changes the button text to an x if it is x's turn
					turn--;										// this switches the turn over to O
					turnmessage.setText("X please go");			// this changes the message over to O so he knows its his turn
					totalturn++;
					positions[0][1]='O';
				}
				Button2.setEnabled(false);
			}
			if (position=="Button3"){
				if(turn==0){
					Button3.setText("X");					// this changes the button text to an x if it is x's turn
					turn++;										// this switches the turn over to O
					turnmessage.setText("O please go");			// this changes the message over to O so he knows its his turn
					totalturn++;
					positions[0][2]='X';
				}
				else{
					Button3.setText("O");					// this changes the button text to an x if it is x's turn
					turn--;										// this switches the turn over to O
					turnmessage.setText("X please go");			// this changes the message over to O so he knows its his turn
					totalturn++;
					positions[0][2]='O';
				}
				Button3.setEnabled(false);
			}
			if (position=="Button4"){
				if(turn==0){
					Button4.setText("X");					// this changes the button text to an x if it is x's turn
					turn++;										// this switches the turn over to O
					turnmessage.setText("O please go");			// this changes the message over to O so he knows its his turn
					totalturn++;
					positions[1][0]='X';
				}
				else{
					Button4.setText("O");					// this changes the button text to an x if it is x's turn
					turn--;										// this switches the turn over to O
					turnmessage.setText("X please go");			// this changes the message over to O so he knows its his turn
					totalturn++;
					positions[1][0]='O';
				}
				Button4.setEnabled(false);
			}
			if (position=="Button5"){
				if(turn==0){
					Button5.setText("X");					// this changes the button text to an x if it is x's turn
					turn++;										// this switches the turn over to O
					turnmessage.setText("O please go");			// this changes the message over to O so he knows its his turn
					totalturn++;
					positions[1][1]='X';
				}
				else{
					Button5.setText("O");					// this changes the button text to an x if it is x's turn
					turn--;										// this switches the turn over to O
					turnmessage.setText("X please go");			// this changes the message over to O so he knows its his turn
					totalturn++;
					positions[1][1]='O';
				}
				Button5.setEnabled(false);
			}
			if (position=="Button6"){
				if(turn==0){
					Button6.setText("X");					// this changes the button text to an x if it is x's turn
					turn++;										// this switches the turn over to O
					turnmessage.setText("O please go");			// this changes the message over to O so he knows its his turn
					totalturn++;
					positions[1][2]='X';
				}
				else{
					Button6.setText("O");					// this changes the button text to an x if it is x's turn
					turn--;										// this switches the turn over to O
					turnmessage.setText("X please go");			// this changes the message over to O so he knows its his turn
					totalturn++;
					positions[1][2]='O';
				}
				Button6.setEnabled(false);
			}
			if (position=="Button7"){
				if(turn==0){
					Button7.setText("X");					// this changes the button text to an x if it is x's turn
					turn++;										// this switches the turn over to O
					turnmessage.setText("O please go");			// this changes the message over to O so he knows its his turn
					totalturn++;
					positions[2][0]='X';
				}
				else{
					Button7.setText("O");					// this changes the button text to an x if it is x's turn
					turn--;										// this switches the turn over to O
					turnmessage.setText("X please go");			// this changes the message over to O so he knows its his turn
					totalturn++;
					positions[2][0]='O';
				}
				Button7.setEnabled(false);
			}
			if (position=="Button8"){
				if(turn==0){
					Button8.setText("X");					// this changes the button text to an x if it is x's turn
					turn++;										// this switches the turn over to O
					turnmessage.setText("O please go");			// this changes the message over to O so he knows its his turn
					totalturn++;
					positions[2][1]='X';
				}
				else{
					Button8.setText("O");					// this changes the button text to an x if it is x's turn
					turn--;										// this switches the turn over to O
					turnmessage.setText("X please go");			// this changes the message over to O so he knows its his turn
					totalturn++;
					positions[2][1]='O';
				}
				Button8.setEnabled(false);
			}
			if (position=="Button9"){
				if(turn==0){
					Button9.setText("X");					// this changes the button text to an x if it is x's turn
					turn++;										// this switches the turn over to O
					turnmessage.setText("O please go");			// this changes the message over to O so he knows its his turn
					totalturn++;
					positions[2][2]='X';
				}
				else{
					Button9.setText("O");					// this changes the button text to an x if it is x's turn
					turn--;										// this switches the turn over to O
					turnmessage.setText("X please go");			// this changes the message over to O so he knows its his turn
					totalturn++;
					positions[2][2]='O';
				}
				Button9.setEnabled(false);
			}
		}
		// this method is the "game logic" and checks for a winner after every moove
		private  void checkwinner(JFrame game){
			
			// this does the rows 
			int gameoverx=0;
			int gameovero=0;
			for(int i=0;i<3;i++){
				gameoverx=0;
				gameovero=0;
				for(int j=0;j<3;j++){
					if(positions[i][j]=='X')gameoverx++;
					if(positions[i][j]=='O')gameovero++;
					if(gameoverx==3){
						newgame(this,"X");			 
					}
					if(gameovero==3){
						newgame(this,"O");			
					}
				}
			}
			//this does the columns 
			for(int i=0;i<3;i++){
				gameoverx=0;
				gameovero=0;
				for(int j=0;j<3;j++){
					if(positions[j][i]=='X')gameoverx++;
					if(positions[j][i]=='O')gameovero++;
					if(gameoverx==3){
						newgame(this,"X");			
					}
					if(gameovero==3){
						newgame(this,"O");			
					}
				}
			}
			// this does the top left to bottom right diagonal1 test  
			gameoverx=0;
			gameovero=0;
			for(int i=0;i<3;i++){
				
					if(positions[i][i]=='X')gameoverx++;
					if(positions[i][i]=='O')gameovero++;
					if(gameoverx==3){
						newgame(this,"X");			
					}
					if(gameovero==3){
						newgame(this,"O");			
					}
				}
						// this is the diagonal test for the top right to bottom left 
			gameoverx=0;
			gameovero=0;
			for(int i=2;i>-1;i--){
				
					if(positions[2-i][i]=='X')gameoverx++;
					if(positions[2-i][i]=='O')gameovero++;
					if(gameoverx==3){
						newgame(this,"X");			
					}
					if(gameovero==3){
						newgame(this,"O");			
						}
			}
			// if the checks have failed and its the last turn, the game ends in a tie
			if(totalturn==9)newgame(this,"no one");
	}
								// below resets the buttons, the turn and the positions
		private  void resetgame(){
			Button1.setText("Button1");
			Button2.setText("Button2");
			Button3.setText("Button3");
			Button4.setText("Button4");
			Button5.setText("Button5");
			Button6.setText("Button6");
			Button7.setText("Button7");
			Button8.setText("Button8");
			Button9.setText("Button9");
			Button1.setEnabled(true);
			Button2.setEnabled(true);
			Button3.setEnabled(true);
			Button4.setEnabled(true);
			Button5.setEnabled(true);
			Button6.setEnabled(true);
			Button7.setEnabled(true);
			Button8.setEnabled(true);
			Button9.setEnabled(true);
			
			turn=0;					
			for(int i=0;i<3;i++){
				for( int j=0;j<3;j++){
					positions[i][j]=' ';
				}
			}
			totalturn=0;
			turnmessage.setText("X please go");
		}
		// this method call the reset method for the game after a winner has been declared 
		private  void newgame(JFrame oldgame,String winner){
			
			oldgame.setVisible(false);
			this.resetgame();
			othergui tie = new othergui(" That the game has ended, "+ winner +" has won."+"\n"+ " Do you want to play again?");
			
			TTTGUI newgame = new TTTGUI("Tic Tac Toe",tie,winner);					// gui for question of game, not of the actual game
			newgame.setVisible(true);
			
		}
		// this method does the machines turn
		private  void machineTurn(){
			boolean machineturn=true;
			if(totalturn==8|| totalturn==9){
				newgame(this,"no one");
				machineturn=false;
			}
			if(totalturn!=0){
				String trythis="";
				String[] openButtons = new String[9];
				machineButton.setText(trythis);
				openButtons[0]= Button1.getActionCommand();
				openButtons[1]= Button2.getActionCommand();
				openButtons[2]= Button3.getActionCommand();
				openButtons[3]= Button4.getActionCommand();
				openButtons[4]= Button5.getActionCommand();
				openButtons[5]= Button6.getActionCommand();
				openButtons[6]= Button7.getActionCommand();
				openButtons[7]= Button8.getActionCommand();
				openButtons[8]= Button9.getActionCommand();
				while(machineturn){
					trythis=TicTacToe2.randO();
					for(int i=0;i<9;i++){
						if(trythis==openButtons[i]){
							setpositions(trythis);
							checkwinner(this);
							machineturn=false;
						}
					}
					
				}
			}
		}
		
		
						// the action listener 
		
		public void actionPerformed(ActionEvent e) {
			// get the name of the thing that called the action and do the thing that name needs to be done
			String name= e.getActionCommand();
			
			if(name=="Toggle A.I On/Off"){
				toggleOnAi();
			}
			
			if (name=="Exit"){
				System.exit(0);
			}
			if(name=="Play Tic Tac Toe"){						// creates the jframe for the game if player said he wants to play
				this.setVisible(false);
				game.setVisible(true);
				
			}
			if(name=="Play Tic Tac Toe Again?"){
				this.setVisible(false);
				game.resetgame();
				game.setVisible(true);
			}
			
				// below are the button listeners 
			
			if(name=="Button1"){
				setpositions(name);
				checkwinner(this);								// checks to see if that move ended the game 
				if(play==true)machineTurn();										// the A.I now makes a move
			}
			if(name=="Button2"){								// the rest of the listener does what the first one does, but for all the other buttons 
				setpositions(name);
				checkwinner(this);
				if(play==true)	machineTurn();										// the A.I now makes a move
			}
			if(name=="Button3"){
				setpositions(name);
				checkwinner(this);
				if(totalturn==9){
					newgame(this,"no one");
				}
				if(play==true)machineTurn();										// the A.I now makes a move
			}
			if(name=="Button4"){
				setpositions(name);
				
				checkwinner(this);
				if(play==true)	machineTurn();										// the A.I now makes a move
			}
			if(name=="Button5"){
				setpositions(name);
				checkwinner(this);
				if(play==true)	machineTurn();										// the A.I now makes a move
			}
			if(name=="Button6"){
				setpositions(name);
				checkwinner(this);
				if(play==true)machineTurn();										// the A.I now makes a move
			}
			if(name=="Button7"){
				setpositions(name);
				checkwinner(this);
				if(play==true)	machineTurn();										// the A.I now makes a move
			}
			if(name=="Button8"){
				setpositions(name);
				checkwinner(this);
				if(play==true)machineTurn();										// the A.I now makes a move
			}
			if(name=="Button9"){
				setpositions(name);
				checkwinner(this);
				if(play==true)machineTurn();										// the A.I now makes a move
			}
			
	}
}


	

