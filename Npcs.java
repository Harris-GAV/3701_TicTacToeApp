/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import java.util.Random;

/**
 *
 * @author Gavin
 */
public class Npcs {
    void npcTurn(Points[] state,Board board,Integer difficulty){
        if (difficulty==1){
            easy(state,board);
        }else{
            hard();
        }
    }
    void easy(Points[] state,Board board){
        otherFunc size =new otherFunc();
        Random random =new Random();
        Integer placeAt =random.nextInt(8);
        Points temp=new Points(0,0,' ');
        Boolean good=true;
        while(good=false){
            temp=state[placeAt];
            if (temp.getState()==' '){
                good=false;
            }else{
                placeAt=random.nextInt(8);
            }
        }
        Points temp2 =new Points(temp.getX(),temp.getY(),'O');
        state[placeAt]=temp2;

          
    }
    void hard(){
        
    }
}
