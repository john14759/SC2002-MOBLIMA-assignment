package uI;


/**
 * App state functions to get and set userID, and also to get and set movieID
 * @author Group 4 SS9
 * @version 1.0
 * @since 2022-11-07
 */

public class AppState {
	/**
	 * Attributes
	 */
	private static int userID =-1;
	private static int movieID = -1;
	/**
	 * Setter for userID
	 * @param id user unique ID
	 */
	public static void setUserID(int id) {
		userID =id;
	}
	/**
	 * Getter for userID
	 * @return userID
	 */
	public static int getUserID() {
		return userID;
	}
	/**
	 * Setter for movieID
	 * @param id
	 */
	public static void setMovieID(int id) {
		movieID =id;
	}
	/**
	 * Getter for movieID
	 * @return movieID
	 */
	public static int getMovieID() {
		return movieID;
	}
}
