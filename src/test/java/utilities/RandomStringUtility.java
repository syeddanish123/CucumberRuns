package utilities;

import org.apache.commons.lang3.RandomStringUtils;

import testBase.BaseClass;

public class RandomStringUtility  {

    public static String getalphabetic() {
		
		String alp=RandomStringUtils.randomAlphabetic(5);
		return alp;
	}
	
    public static String getnumeric() {
    	
		String alp=RandomStringUtils.randomNumeric(5);
		return alp;
	}
    
    public static String getnumericalphabetic(int no) {
		
		String alp=RandomStringUtils.randomAlphanumeric(no);
		return alp;
	}
	
}
