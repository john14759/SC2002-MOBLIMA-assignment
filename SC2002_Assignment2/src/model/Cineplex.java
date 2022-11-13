package model;

import java.io.Serializable;

/**
 * List of type of cineplex
 * @author Group 4 SS9
 * @version 1.0
 * @since 2022-11-07
 */

public class Cineplex implements Serializable{
   
	private static final long serialVersionUID = 1L;
	/**
	 * Id number of cineplex
	 */
	private int cineplexID;
	/**
	 * Name of the cineplex
	 */
    private String name;
    
    /**
     * Constructor
     * @param cineplexID
     * @param name
     */
    
    public Cineplex(int cineplexID, String name) {
    	this.cineplexID = cineplexID;
    	this.name = name;
    }
    
    /**
     * Get copy of cineplex instance
     * @param another
     * @return cineplex
     */
    
    public static Cineplex copy(Cineplex another) {
    	Cineplex cineplex  = new Cineplex(
    			another.getCineplexID(),
    			another.getName()
    	);
    	return cineplex;
    }

    /**
     * Getter of Cineplex ID
     * @return this.cineplexID
     */
    
    public int getCineplexID(){
        return this.cineplexID;
    }
    
    /**
     * Setter Cineplex ID
     * @param id
     */
    
    public void setCineplexID(int id){
        this.cineplexID = id;
    }
    
    /**
     * Getter name of cineplex
     * @return
     */
    
    public String getName(){
        return this.name;
    }
    
    /**
     * setter name of cineplex
     * @param name
     */
    
    public void setName(String name){
        this.name= name;
    }


}
