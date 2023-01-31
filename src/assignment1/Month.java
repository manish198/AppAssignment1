package assignment1;

public enum Month {
	JANUARY(1),
	FEBRUARY(2),
	MARCH(3),
	APRIL(4),
	MAY(5),
	JUNE(6),
	JULY(7),
	AUGUST(8),
	SEPTEMBER(9),
	OCTOBER(10),
	NOVEMBER(11),
	DECEMBER(12)
	;
	
	
	private final Integer value;
	
	/**
	 * This is constructor that maps each month object to integer value 
	 * @param value
	 */
	Month(Integer value){
		this.value=value;
	}
	
	/**
	 * This method returns integer value associated with each month 
	 * @return
	 */
	public Integer getValue() {
		return this.value;
	}
	
}
