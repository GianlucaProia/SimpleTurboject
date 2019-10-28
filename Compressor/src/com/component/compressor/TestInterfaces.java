package com.component.compressor;

import java.lang.reflect.AnnotatedType;

public class TestInterfaces {

	public static void main(String[] args) {
		
		Class compressorClass = Compressor.class;
		
		AnnotatedType[] types = compressorClass.getAnnotatedInterfaces();
		System.out.println("La lunghezza dell'oggetto AnnotatedType, riguardo eventuali interfacce "
				+ "è: "+types.length);
		System.out.println("L'interfaccia implementata è: "+types[0].getType().getTypeName());
	
		System.out.println("\n\nMetodi dichiarati: meglio usare getDeclaredMethods");
		for(int i=0; i<compressorClass.getDeclaredMethods().length; i++){
			System.out.println(compressorClass.getDeclaredMethods()[i].getName());
		}
	
	}
	
}
