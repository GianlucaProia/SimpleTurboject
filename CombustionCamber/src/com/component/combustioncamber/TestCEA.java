package com.component.combustioncamber;

import java.io.IOException;

public class TestCEA {
	
	public static void main(String[] args) throws IOException {
		
		 // Command to create an external process 
//        String command = "cd C:\\Users\\Utente\\Desktop\\CEA"; 
//
//        // Running the above command 
//        Runtime run  = Runtime.getRuntime();
//        
//        try {
//			Process proc = run.exec(command);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
		
//		System.setProperty("user.dir","C:\\Users\\Utente\\Desktop\\CEA");
		//Process runtime = Runtime.getRuntime().exec("cmd /c @echo Combustion|FCEA2");
		
//		ProcessBuilder builder = new ProcessBuilder(
//	            "cmd.exe",
//	            "/c",
//	            "@echo Combustion|FCEA2");
//	        builder.redirectErrorStream(true);
//	        Process p = builder.start();
			
		 Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"cd C:/Users/Utente/Desktop/CEA && @echo Combustion|FCEA2 && exit\""); 
	}
	

}
