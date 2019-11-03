package com.component.combustioncamber;


public class RunMultyCea extends Thread{
	 private String path;

	 public RunMultyCea(String p) {
	        path=p;
	 }

	 public  void run()  {
	   try {
	    Process p = null;
	    p = Runtime.getRuntime().exec(path);
	    p.waitFor();
	  } catch (Exception ex) {
	    //somthing ....
	  }
	 }
	 
	}