/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;



import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
public class TicTacToe {

     

   
    public static void main(String[] args) {
        new TicTacToe().start();
        
    }
    void start(){
        Board board = new Board();
        otherFunc size =new otherFunc();
        
        Boolean good = false; 
        Boolean pvp= true;
        Scanner Input = new Scanner(System.in);
        int index=0;
        Integer players=0;
        System.out.println("--------Tic Tac Toe Game---------");
        while ( !(players==1 || players==2) ){        
            System.out.println("Enter '1' for single player");
            System.out.println("Enter '2' for player vs player:");
            players=Input.nextInt();
            if ( players!=1 && players!=2 ){
                System.out.println("Not a '1' or '2' Enter the number of players");
            }
        }
        if (players ==2){
            while (good == false){
                System.out.println("Enter size of board (3,5,7): ");
                size.size=Input.nextInt(); 
                if ((size.size%2==1)&&(size.size<8)){
                    good=true;
                }else{
                    System.out.println("Not a proper board size (3,5,7)");
                }
            }
            Points[] state = new Points [size.size*size.size];
            size.makeArray(index,state,size.size);

            for (int i=0;i<size.size*size.size;++i){
                Integer game;
                board.makeboard(size.size, board, state);
                size.p1Turn( state, board);
                game=size.PvPgameLoop( board, state);
                if (size.exit(game,state,board,pvp)==true){
                    return;
                }
                size.turncount++;
                size.p2Turn( state, board);
                game=size.PvPgameLoop( board, state);
                if (size.exit(game,state,board,pvp)==true){
                    return;
                }
                size.turncount++;
                
            }
            
        }
        if (players==1){
            size.size=3;
            Points[] state = new Points[size.size*size.size];
            size.makeArray(index, state, size.size);
            Random random=new Random();
            pvp=false;
            Integer difficulty=0;
            Integer firstTurn=2;//random.nextInt();
            while(!(difficulty==2|| difficulty==1)){
                System.out.println("Enter a difficulty (easy(1),hard(2)): ");
                difficulty=Input.nextInt();
                System.out.println(difficulty);
                if (difficulty!=1 && difficulty!=2){
                    System.out.println("Not a difficulty (1 or 2)");
                }
            }
            
            System.out.println("");
            if (firstTurn%2==1){
                Npcs npc=new Npcs();
                System.out.println("You go first");
                for(int i=0;i<size.size*size.size;++i){
                    Integer game;
                    board.makeboard(size.size, board, state);
                    size.p1Turn( state, board);
                    game=size.PvPgameLoop( board, state);
                    if (size.exit(game,state,board,!pvp)==true){
                        return;
                    }
                    size.turncount++;
                    npc.npcTurn( state, board,difficulty);
                    game=size.PvPgameLoop( board, state);
                    if (size.exit(game,state,board,!pvp)==true){
                        return;
                    }
                    size.turncount++;
                }
            } else{
                
                Npcs npc =new Npcs();
                System.out.println("You go second");
                for(int i=0;i<size.size*size.size;++i){
                    Integer game;
 
                    npc.npcTurn( state, board,difficulty);
                    game=size.PvPgameLoop( board, state);
                    board.makeboard(size.size, board, state);

                    if (size.exit(game,state,board,!pvp)==true){
                        return;
                    }
                    size.turncount++;
                    size.p1Turn( state, board);
                    game=size.PvPgameLoop( board, state);
                    if (size.exit(game,state,board,!pvp)==true){
                        return;
                    }
                    size.turncount++;            
                }
            }
        }
    }   
}
        