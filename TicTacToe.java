/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;



import java.util.Objects;
import java.util.Scanner;
public class TicTacToe {

     Integer size=0;
    
   
    public static void main(String[] args) {
        new TicTacToe().start();
        
    }
    void start(){
        Board board = new Board();

        
        Boolean good = false; 
        Scanner Input = new Scanner(System.in);
        int index=0;
        Integer players=0;
        System.out.println("--------Tic Tac Toe Game---------");

            System.out.println("Enter '1' for single player");
            System.out.println("Enter '2' for player vs player:");
            players=Input.nextInt();

        if (players ==2){
        while (good == false){
            System.out.println("Enter size of board (3,5,7): ");
            size=Input.nextInt(); 
            if ((size%2==1)&&(size<8)){
                good=true;
            }else{
                System.out.println("Not a proper board size (3,5,7)");
            }
        }
        Points[] state = new Points [size*size];
        makeArray(index,state,size);
        for(int i=0;i<3;++i){
        PvPgameLoop(size,board,state);
        board.makeboard(size, board, state);
        }
        }
        //board.makeboard(size,board,state);
    
    }   
void makeArray(Integer index,Points[] state,Integer size){
    Points temp = new Points(0,0,'/');   
    for (int i=0;i<size;++i){
            for (int j=0;j<size;++j){
               temp = new Points(i,j,' ');
                state[index++] = temp;
            }
        }  
}       
Integer PvPgameLoop(Integer size, Board board,Points[] state){
    board.makeboard(size,board,state);   
    Points temp =new Points(0,0,'X');
    state[0]=temp;
    board.makeboard(size, board, state);
    p1Turn(size,state,board);
    if (gameEnd(state,board)==true){
        return 1;
    }
    p2Turn(size,state,board);
    if (gameEnd(state,board)==true){
        return 2;
    }
    return 0;
}
void p1Turn(Integer size,Points[] state,Board board){
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
        System.out.println("Not a valid point try again");
        }
    }
    Points insert= new Points(x,y,'X');
    state[findLoc(x,y,state)]=insert;
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
void p2Turn(Integer size,Points[] state,Board board){
    Integer x=0,y=0;
    Scanner Input = new Scanner(System.in);
    Boolean good=true;
    while (good==true){
        System.out.println("Player 2: Enter a point to place an 'X':");
        x= Input.nextInt()-1;
        y= Input.nextInt()-1;
        if (checkIfOpen(x,y,state)==true){
            good = false;
        }else{
        System.out.println("Not a valid point try again");
        }
    }
    Points insert= new Points(x,y,'O');
    state[findLoc(x,y,state)]=insert;
    }
    Boolean gameEnd(Points[] state,Board board){
        char[] [] testArray =new char[size] [size];
        char one='.',two='.',three='.';
        Boolean hor,vert,diag;
        for (int i=0;i<size*size;++i){
            Points temp;
            temp= state[i];
            testArray[temp.getX()] [temp.getY()]=temp.getState();
            
        }   
        for (int i=0; i<size; ++i){
            for (int j=0;j<size;++j){
                three=two;
                two=one;
                one=testArray[i] [j];

                System.out.print(one+" "+two+" "+three);
            if ((one==two)&&(two==three)){
                hor=true;
                
            }else{
                System.out.println("false");
            }
            one='.';
            two='.';
            three='.';
            }
            
        }
     
        return true;
    }
            
}
        