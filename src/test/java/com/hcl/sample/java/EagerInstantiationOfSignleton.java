package com.hcl.sample.java;

public class EagerInstantiationOfSignleton {
	
	private static EagerInstantiationOfSignleton obj=new EagerInstantiationOfSignleton();
	
	private EagerInstantiationOfSignleton()
	{
		
	}
	public static EagerInstantiationOfSignleton getInstance()
	{
		return obj;
	}

}
