/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package music;

/**
 *
 * @author glSon8840
 */
public class Drum extends Percussion {
        
    /**
     * constructor
     * pre: none
     * post: An piccolo has been created.
     */
    public Drum(String drums) {
	super(drums);
}


    /** 
     * Returns the sound of the instrument.
     * pre: none
     * post: The sound made by the instrument is returned.
     */
    public String makeSound() {
     	return("Boom");
}

	
    /** 
     * Returns a String that represents the instrument.
     * pre: none
     * post: A string representing the instrument has 
     * been returned.
     */
    public String toString() {
 	return(super.getMusician() + " plays " + makeSound() + ".");
}
    
}
