package model;

import java.io.Serializable;

import utils.DateUtils;

/**
 * Holidays model
 * @author Group 4 SS9
 * @version 1.0
 * @since 2022-11-07
 */

public class Holiday implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Name of the holiday
	 */
	private String holidayName;
	/**
	 * Id number of the holiday
	 */
    private int holidayID;
    /**
     * Date of the holiday
     */
    private DateUtils holidayDate;
    /**
     * constructor
     */
    public Holiday() {};
    /**
     * Constructor
     * @param id
     * @param name
     * @param date
     */
    public Holiday(int id, String name, DateUtils date){
        this.holidayName = name;
        this.holidayID = id;
        this.holidayDate = date;
    }
    /**
     * Get and return a copy of holiday
     * @param another
     * @return
     */
    public static Holiday copy(Holiday another) {
    	Holiday holiday = new Holiday(
    		another.getHolidayID(),
    		another.getHolidayName(),
    		another.getHolidayDate()
    	);
    	return holiday;
    }
    /**
     * Getter holiday ID of this holiday
     * @return
     */
    public int getHolidayID() {
    	return this.holidayID;
    }
    /**
     * Setter Holiday ID of this holiday
     * @param name
     */
    public void setHolidayID(int id) {
    	this.holidayID = id;
    }
    /**
     * Getter holiday name of this holiday
     * @return
     */
    public String getHolidayName(){
        return this.holidayName;
    }
    /**
     * Setter name of this holiday
     * @param name
     */
    public void setHolidayName(String name){
        this.holidayName = name;
    }
    /**
     * Getter date of this holiday
     * @return
     */
    public DateUtils getHolidayDate(){
        return this.holidayDate;
    }
    /**
     * setter date of this holiday
     * @param date
     */
    public void setHolidayDate(DateUtils date){
        this.holidayDate = date;
    }
}
