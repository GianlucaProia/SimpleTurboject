package com.component.compressor;

import java.lang.reflect.Method;

public class Test {
	
	public static void main(String[] args) {
		
		Class compressorClass = Compressor.class;
		
		// Metodi della classe...
		Method[] metodi = compressorClass.getMethods(); 
		
		
		System.out.println("Nomi dei metodi della classe\n");
		for(int i=0; i<metodi.length; i++) {
			System.out.println(metodi[i].getName());
		}
		
		
		System.out.println("\n\nTipi delle variabili dei metodi\n");
		
		for(int k=0; k<metodi.length; k++){
		for(int j=0; j<metodi[k].getGenericParameterTypes().length; j++) {
			System.out.println(metodi[k].getGenericParameterTypes()[j].getTypeName());
		}
		
		}
	
	}
	

	

}
