/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ankur
 */
public class Tortoise {
    private int position;
    
    
    public void setPosition(int pos)
    {
        this.position = pos;
    }
    
    public int getPosition()
    {
        return position;
    }
    
    public void fastPlod()
    {
        position += 3;
    }
    public void slip()
    {
        if(position>=6){
            position -= 6;
        }
        else{
            position = 1;
        }
    }
    public void slowPlod()
    {
        position += 1; 
    }
}
