package com.hcl.sample.java;

//This is lazy instantiation of Singleton
//Multiple threads can hold this singleton object by calliing getInstance method.

public class LazyInstantiationOfSingletonClass {
	
	
	private static LazyInstantiationOfSingletonClass obj=null;
	
	private LazyInstantiationOfSingletonClass()
	{
		
	}
	
	public LazyInstantiationOfSingletonClass getInstance()
	{
		if(obj==null)
			obj=new LazyInstantiationOfSingletonClass();
		return obj;
	}

}
