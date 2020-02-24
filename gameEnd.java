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
public class gameEnd  {
    
    public char getChar(Points[] state, Integer position){
        Points temp;
        temp=state[position];
        return temp.getState();
    } 
    public Boolean gameEnd7(Points[] state, Integer size){
        char[] list= new char[size*size];
        for (int i=0;i<size*size;++i){
            list[i]=getChar(state,i);
        }
         char temp1,temp2,temp3,temp4,temp5,temp6,temp7;
        for (int i=0;i<size;++i){
        temp1=list[(i*size)];
        temp2=list[(i*size)+1];
        temp3=list[(i*size)+2];
        temp4=list[(i*size)+3];
        temp5=list[(i*size)+4];
        temp6=list[(i*size)+5];
        temp7=list[(i*size)+6];
            if (temp1!=' '){
                if((temp1== temp2)&&(temp2==temp3)&&(temp3==temp4)&&
                   (temp4==temp5)&&(temp5==temp6)&&(temp6==temp7)){
                    Points in=new Points(0,0,'-');
                    in.setX(i);
                    in.setY(0);
                    state[i*size]=in;
                    in.setX(i);
                    in.setY(1);
                    state[i*(size)+1]=in;
                    in.setX(i);
                    in.setY(2);
                    state[(i*size)+2]=in;
                    in.setX(i);
                    in.setY(3);
                    state[(i*size)+3]=in;
                    in.setX(i);
                    in.setY(4);
                    state[(i*size)+4]=in;
                    in.setX(i);
                    in.setY(5);
                    state[(i*size)+5]=in;
                    in.setX(i);
                    in.setY(6);
                    state[(i*size)+6]=in;
                    return true;
                }
            }    
        }
        for (int i=0;i<size;++i){

            temp1=list[i+(size*0)];
            temp2=list[(i+size)];
            temp3=list[i+(size*2)];
            temp4=list[i+(size*3)];
            temp5=list[i+(size*4)];
            temp6=list[i+(size*5)]; 
            temp7=list[i+(size*6)]; 
            if (temp1!=' '){
                if((temp1== temp2)&&(temp2==temp3)&&(temp3==temp4)&&
                   (temp4==temp5)&&(temp5==temp6)&&(temp6==temp7)){
                    Points in=new Points(0,0,'|');
                    in.setX(0);
                    in.setY(i);
                    state[i+(size*0)]=in;
                    in.setX(1);
                    in.setY(i);
                    state[(i+size)]=in;
                    in.setX(2);
                    in.setY(i);
                    state[i+(size*2)]=in;
                    in.setX(3);
                    in.setY(i);
                    state[i+(size*3)]=in;
                    in.setX(4);
                    in.setY(i);
                    state[i+(size*4)]=in;
                    in.setX(5);
                    in.setY(i);
                    state[i+(size*5)]=in;
                    in.setX(6);
                    in.setY(i);
                    state[i+(size*6)]=in;
                    return true;
                }
            }    
        }
        temp1=list[0];
        temp2=list[8];
        temp3=list[16];
        temp4=list[24];
        temp5=list[32];
        temp6=list[40];
        temp7=list[48];
        if (temp1!=' '){
            if((temp1==temp2)&&(temp2==temp3)&&(temp3==temp4)
             &&(temp4==temp5)&&(temp5==temp6)&&(temp6==temp7)){
                Points in=new Points(0,0,'\\');
                state[0]=in;
                in.setX(1);
                in.setY(1);
                state[8]=in;
                in.setX(2);
                in.setY(2);
                state[18]=in;
                in.setX(3);
                in.setY(3);
                state[24]=in;
                in.setX(4);
                in.setY(4);
                state[32]=in;
                in.setX(5);
                in.setY(5);
                state[40]=in;
                in.setX(6);
                in.setY(6);
                state[48]=in;
                return true;
            }
        }
        temp1=list[6];
        temp2=list[12];
        temp3=list[18];
        temp4=list[24];
        temp5=list[30];
        temp6=list[36];
        temp7=list[42];
        if (temp1!=' '){
            if((temp1==temp2)&&(temp2==temp3)&&(temp3==temp4)&&
               (temp4==temp5)&&(temp5==temp6)&&(temp6==temp7)){
                Points in=new Points(0,4,'/');
                state[4]=in;
                in.setX(1);
                in.setY(3);
                state[8]=in;
                in.setX(2);
                in.setY(2);
                state[12]=in;
                in.setX(3);
                in.setY(1);
                state[16]=in;
                in.setX(4);
                in.setY(0);
                state[20]=in;
                
                return true;
            }
        }
        return false;
    }
    public Boolean gameEnd5(Points[] state, Integer size){
        char[] list= new char[size*size];
        for (int i=0;i<size*size;++i){
            list[i]=getChar(state,i);
        }
         char temp1,temp2,temp3,temp4,temp5;
        for (int i=0;i<size;++i){
        temp1=list[(i*size)];
        temp2=list[(i*size)+1];
        temp3=list[(i*size)+2];
        temp4=list[(i*size)+3];
        temp5=list[(i*size)+4];        
            if (temp1!=' '){
                if((temp1== temp2)&&(temp2==temp3)&&(temp3==temp4)&&(temp4==temp5)){
                    Points in=new Points(0,0,'-');
                    in.setX(i);
                    in.setY(0);
                    state[i*size]=in;
                    in.setX(i);
                    in.setY(1);
                    state[i*(size)+1]=in;
                    in.setX(i);
                    in.setY(2);
                    state[(i*size)+2]=in;
                    in.setX(i);
                    in.setY(3);
                    state[(i*size)+3]=in;
                    in.setX(i);
                    in.setY(4);
                    state[(i*size)+4]=in;                
                    return true;
                }
            }    
        }
        for (int i=0;i<size;++i){

            temp1=list[i+(size*0)];
            temp2=list[(i+size)];
            temp3=list[i+(size*2)];
            temp4=list[i+(size*3)];
            temp5=list[i+(size*4)];  
            if (temp1!=' '){
                if((temp1== temp2)&&(temp2==temp3)&&(temp3==temp4)&&(temp4==temp5)){
                    Points in=new Points(0,0,'|');
                    in.setX(0);
                    in.setY(i);
                    state[i+(size*0)]=in;
                    in.setX(1);
                    in.setY(i);
                    state[(i+size)]=in;
                    in.setX(2);
                    in.setY(i);
                    state[i+(size*2)]=in;
                    in.setX(3);
                    in.setY(i);
                    state[i+(size*3)]=in;
                    in.setX(4);
                    in.setY(i);
                    state[i+(size*4)]=in;
                    return true;
                }
            }    
        }
        temp1=list[0];
        temp2=list[6];
        temp3=list[12];
        temp4=list[18];
        temp5=list[24];
        if (temp1!=' '){
            if((temp1== temp2)&&(temp2==temp3)&&(temp3==temp4)&&(temp4==temp5)){
                Points in=new Points(0,0,'\\');
                state[0]=in;
                in.setX(1);
                in.setY(1);
                state[6]=in;
                in.setX(2);
                in.setY(2);
                state[12]=in;
                in.setX(3);
                in.setY(3);
                state[18]=in;
                in.setX(4);
                in.setY(4);
                state[24]=in;
                return true;
            }
        }
        temp1=list[4];
        temp2=list[8];
        temp3=list[12];
        temp4=list[16];
        temp5=list[20];
        if (temp1!=' '){
            if((temp1== temp2)&&(temp2==temp3)&&(temp3==temp4)&&(temp4==temp5)){
                Points in=new Points(0,4,'/');
                state[4]=in;
                in.setX(1);
                in.setY(3);
                state[8]=in;
                in.setX(2);
                in.setY(2);
                state[12]=in;
                in.setX(3);
                in.setY(1);
                state[16]=in;
                in.setX(4);
                in.setY(0);
                state[20]=in;
                
                return true;
            }
        }
        return false;
    }
    
    public Boolean gameEnd3(Points[] state,Integer size){
        char[] list= new char[size*size];
        for (int i=0;i<size*size;++i){
            list[i]=getChar(state,i);
        }
        char temp1,temp2,temp3;
        for (int i=0;i<size;++i){
        temp1=list[(i*size)];
        temp2=list[(i*size)+1];
        temp3=list[(i*size)+2];
            if (temp1!=' '){
                if((temp1== temp2)&&(temp2==temp3)){
                    Points in=new Points(0,0,'-');
                    in.setX(i);
                    in.setY(0);
                    state[i*size]=in;
                    in.setX(i);
                    in.setY(1);
                    state[i*(size)+1]=in;
                    in.setX(i);
                    in.setY(2);
                    state[(i*size)+2]=in;
                    return true;
                }
            }    
        }
        for (int i=0;i<size;++i){

            temp1=list[i+(size*0)];
            temp2=list[(i+size)];
            temp3=list[i+(size*2)];
            if (temp1!=' '){
                if((temp1== temp2)&&(temp2==temp3)){
                    Points in=new Points(0,0,'|');
                    in.setX(0);
                    in.setY(i);
                    state[i+(size*0)]=in;
                    in.setX(1);
                    in.setY(i);
                    state[(i+size)]=in;
                    in.setX(2);
                    in.setY(i);
                    state[i+(size*2)]=in;
                    return true;
                }
            }    
        }
        temp1=list[0];
        temp2=list[4];
        temp3=list[8];
        if (temp1!=' '){
            if((temp1== temp2)&&(temp2==temp3)){
                Points in=new Points(0,0,'\\');
                state[0]=in;
                in.setX(1);
                in.setY(1);
                state[4]=in;
                in.setX(2);
                in.setY(2);
                state[8]=in;
                
                return true;
            }
        }
        temp1=list[2];
        temp2=list[4];
        temp3=list[6];
        if (temp1!=' '){
            if((temp1== temp2)&&(temp2==temp3)){
                Points in=new Points(0,2,'/');
                state[2]=in;
                in.setX(2);
                in.setY(1);
                state[4]=in;
                in.setX(2);
                in.setY(0);
                state[6]=in;
                
                return true;
            }
        }
        return false;
    }
}
