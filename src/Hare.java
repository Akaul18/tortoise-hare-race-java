/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ankur
 */
public class Hare {
    private int position;
    
    public void setPosition(int pos)
    {
        position = pos;
    }
    
    public int getPosition()
    {
        return position;
    }
    public void sleep()
    {
        position = position;
    }
    
    public void bigHop()
    {
        position += 9;
    }
    public void smallHop()
    {
        position += 1;
    }
    public void bigSlip()
    {
        if(position > 12){
            position -= 12;
        }
        else{
            position = 1;
        }
    }
    public void smallSlip()
    {
        if(position > 2){
            position -= 2;
        }
        else{
            position = 1;
        }   
    }
}
