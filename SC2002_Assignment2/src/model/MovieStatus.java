package model;

import java.io.Serializable;

/**
 * List of Possible movie states
 * @author Group 4 SS9
 *
 */

public enum MovieStatus implements Serializable{
	NO_LONGER_SHOWING,
	NOW_SHOWING,
	PREVIEW,
	COMING_SOON
}
