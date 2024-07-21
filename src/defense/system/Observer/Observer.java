/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defense.system.Observer;

/**
 *
 * @author User
 */
public interface Observer {
    public void setValue(String value);
    public void setMessage(String message);
    public void setPrivate(String message,int index);
    public void Strength(int strength);
    public String[] setCount();
}
