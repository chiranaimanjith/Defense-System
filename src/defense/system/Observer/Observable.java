/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defense.system.Observer;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Observable {
    
    private static Observable instance;
    
    private Observable(){
           
     }
    
    public static Observable getInstance(){
		if(instance==null){
			return instance=new Observable();
		}
		return instance;
	}

     private final ArrayList<Observer>observerList=new ArrayList<>();
   
    private String value;
    private int index;
    private String privatemassage;
    private String message;
    private Slider str;
    
    public void addObserver(Observer ob){
		observerList.add(ob);
	}
    
    public void setValue(String value) {
        if(this.value!=value){
	     this.value =value;
        	notifyDevices1();
	}
    }

   public void setMessage(String message){
       this.message=message;
       notifyDevices2();
    }
   
   public void setPrivate(String privatemassage, int index){
     this.privatemassage=privatemassage;
     this.index=index;
     notifyDevices3();
   }
 
   public void Strength(int strength) {
        Slider str = strength == 0 ? Slider.COLOSED : 
                     strength <= 25 ? Slider.LOW : 
                     strength <= 50 ? Slider.MEDIUM : 
                     strength <= 75 ? Slider.HIGH : 
                     Slider.STRONG;
        this.str = str;
        notifyDevices4();
    }
    
   public String[] setCount(int index){
      return observerList.get(index-1).setCount();
   }
   
   public void notifyDevices1(){
	for (Observer ob : observerList){
		ob.setValue(value);
	  }    
    }
   
     public void notifyDevices2(){
	for (Observer ob : observerList){
		ob.setMessage(message);    
	  }    
    }
     
     public void notifyDevices3(){
	for (Observer ob : observerList){
		ob.setPrivate(privatemassage,index);    
	  }    
    }
     
    public void notifyDevices4(){
	for (Observer ob : observerList){
		ob.Strength(str.ordinal());
	  }    
    }


}