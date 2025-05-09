package com;

public class Singleton {
	
	private static Singleton sin;

	private Singleton() {
		
	}
    
	public synchronized Singleton test()
	{	
		if(sin==null) {
			sin =new Singleton();
		}
		return sin;
	}
	
	
}

//
////find the emp with max salary in each dept
//
// select max(salary) from emp group by dept;
// 
// select * from employee where salary = select max(salary) from employee group by dept;