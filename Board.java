/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

/**
 *
 * @author Gavin
 */
public class Board {
    private Integer index=0;
    
    public void space(Board board,Points[] state){
        Points temp5; 
        temp5 = state[index];
        board.indexOne();
        System.out.print(" "+temp5.getState()+" ");

    }
    public void vertLine(){
        System.out.print("|");
    }
    public void horLine(){
        System.out.print("---");
    }
    public void intercetion(){
        System.out.print("+");
    } 
    public void fullHorLine(Integer size){
        System.out.print(" ");   
        for (int i=0; i<size-1; ++i){
        horLine();
        intercetion();
        }
        horLine();
        System.out.println();
    }
    public void fullSpaceLine(Integer size,Board board, Points[] state){
   
        for (int i=0; i<size-1; ++i){
        board.space(board,state);
        vertLine();
        }
        space(board,state);
        System.out.println();
    }
    void makeboard(Integer size,Board board,Points[] state){

        topLine(size,board,index,state);
        midLines(size,board,index,state);
        botLine(size,board,index,state);
        setIndex(0);
    }
    void topLine(Integer size,Board board,Integer index,Points[] state){
        System.out.print("  ");
        for (int i=0;i<size;++i){
            System.out.print((i+1)+"   ");
        }
        System.out.println();
        System.out.print("1");
        for(int i=0; i<size-1; ++i){
            board.space(board,state);

            board.vertLine();
        }
        board.space(board,state);
        System.out.println();
    }
    void midLines(Integer size,Board board,Integer index,Points[] state){
        for (int i=0; i<size-2; ++i){
       
          board.fullHorLine(size);
          System.out.print(i+2);  
          board.fullSpaceLine(size,board,state);
        }
   
        board.fullHorLine(size);
    }        
    void botLine(Integer size, Board board,Integer index,Points[] state) {
        System.out.print(size);
        for(int i=0; i<size-1; ++i){
            board.space(board,state);
            board.vertLine();
        }
        board.space(board,state);    
        System.out.println();
    }
    void indexOne(){
        index++;

    }
    Integer getIndex(){
        return index;
    }
    void setIndex(Integer num){
        index=num;
    }
}  


