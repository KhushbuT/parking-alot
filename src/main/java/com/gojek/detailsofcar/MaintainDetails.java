package com.gojek.detailsofcar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaintainDetails {
	
	public static Map<String, String> mapCarWithSlot= new HashMap<String, String>();
	public static Map<String,String> parkCarMap=new HashMap<>();
	public static List<String> leaveCarNumbers=new ArrayList<>();
	
	
	public void setValue(String carName,String status) {
		MaintainDetails.parkCarMap.put(carName, status);
	}

}
