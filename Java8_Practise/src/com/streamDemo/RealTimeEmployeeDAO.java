package com.streamDemo;

import java.util.ArrayList;
import java.util.List;

public class RealTimeEmployeeDAO {
	
	public static List<RealTimeEmployee> getListEmployee(){
		List<RealTimeEmployee> list = new ArrayList<RealTimeEmployee>();
		list.add(new RealTimeEmployee(101,"Sandeep","IT",1000000));
		list.add(new RealTimeEmployee(102,"Siba","IT",2000000));
		list.add(new RealTimeEmployee(103,"Pintu","IT",500000));
		return list;
		
	}

}
