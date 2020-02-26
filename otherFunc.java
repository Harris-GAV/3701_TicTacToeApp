/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import java.util.Scanner;

/**
 *
 * @author Gavin
 */
public class otherFunc {
    public Integer size=0;
    public Integer turncount=0;
    void makeArray(Integer index,Points[] state,Integer size){
        Points temp = new Points(0,0,'/');   
        for (int i=0;i<size;++i){
            for (int j=0;j<size;++j){
                temp = new Points(i,j,' ');
                state[index++] = temp;
            }
        }  
    }       
    Integer PvPgameLoop(Board board,Points[] state){

        if (isTied(state)==true){
            return 0;
        }

        if (gameEnd(state)=='X'){
            return 1;
        }

        if (gameEnd(state)=='O'){
            return 2;
        }
           
     
        return -1;
    }
    void p1Turn(Points[] state,Board board){
        Integer x=0,y=0;
        Scanner Input = new Scanner(System.in);
        Boolean good=true;
        while (good==true){
            System.out.println("Player 1: Enter a point to place an 'X':");
            x= Input.nextInt()-1;
            y= Input.nextInt()-1;
            if (checkIfOpen(x,y,state)==true){
                good = false;
            }else{
                board.makeboard(size, board, state);
                System.out.println("Not a valid point try again");
            }
        }
        Points insert= new Points(x,y,'X');
        state[findLoc(x,y,state)]=insert;
        board.makeboard(size, board, state);
    }    
        Boolean checkIfOpen(Integer x,Integer y,Points[] state ){
            for(int i=0;i<size*size;++i){
                Points temp5;
                temp5=state[i];
                Integer x1=temp5.getX();
                Integer y1=temp5.getY();
                if ( (x==x1) && (y==y1) && (temp5.getState()==' ') ){
                   return true;
                }    
            }  
            return false;
        }
        Integer findLoc(Integer x,Integer y,Points[] state){
            for(int i=0;i<size*size;++i){
               Points temp5;
                temp5=state[i];
                Integer x1=temp5.getX();
                Integer y1=temp5.getY();
                if ( (x==x1) && (y==y1) ){
                      return i;            
                }
            }
            return -1;
        }
    void p2Turn(Points[] state,Board board){
        Integer x=0,y=0;
        Scanner Input = new Scanner(System.in);
        Boolean good=true;
        while (good==true){
            System.out.println("Player 2: Enter a point to place an 'O':");
            x= Input.nextInt()-1;
            y= Input.nextInt()-1;
            if (checkIfOpen(x,y,state)==true){
                good = false;
            }else{
            board.makeboard(size, board, state);
            System.out.println("Not a valid point try again");
            }
        }
        Points insert= new Points(x,y,'O');
        state[findLoc(x,y,state)]=insert;
        board.makeboard(size, board, state);
    }
        char gameEnd(Points[] state){
            gameEnd end =new gameEnd();
            if (size==3){
                return  end.gameEnd3(state, size);
            }
            if (size==5){
                return end.gameEnd5(state, size);
            }
            if (size==7){
                return end.gameEnd7(state, size);
            }
            return ' ';
        }
    Boolean isTied(Points [] state){
        if (turncount>7 ){
            return true;
        }
        return false;
    }    
    Boolean exit(Integer game,Points[] state,Board board,Boolean pvp){
        if (game==1){
            System.out.println("");
            System.out.println("PLAYER 1 WINS !!!!!!");
            board.makeboard(size, board, state);
            System.out.println("PLAYER 1 WINS !!!!!!");
            return true;
        }
        if (game==2){
            System.out.println("");
            System.out.println("PLAYER 2 WINS !!!!!!");
            board.makeboard(size, board, state);
            System.out.println("PLAYER 2 WINS !!!!!!");    
            return true;
        }
        if (game==3&&pvp==false){
            System.out.println("");
            System.out.println("YOU LOST !!!!!!");
            board.makeboard(size, board, state);
            System.out.println("YOU LOST !!!!!!");    
            return true;    
        }
        if (game==0){
            System.out.println("");
            System.out.println("TIED !!!!!!");    
            return true;
        }    
        return false;
    }
}
