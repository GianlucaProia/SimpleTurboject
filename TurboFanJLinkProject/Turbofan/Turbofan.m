(* Wolfram Language Package *)

(* Created by the Wolfram Workbench 24-nov-2019 *)

BeginPackage["Turbofan`", {"JLink`"}]
(* Exported symbols added here with SymbolName::usage *) 

fun::usage="f[x]";

(* IL package richiama altri packages... *)

	Begin["`Private`"]
	(* Implementation of the package *)
	
	
		InstallJava[];
	
		fun[x_]:=Module[{obj, compressor, pro},
			
			compressor=JavaNew["com.component.compressor.Compressor"];
			obj=JavaNew["java.lang.String",x];	
			obj@getBytes[];
			pro=JavaNew["Prova"];
			pro@prova[]
			(*compressor*)
		];
	
	

End[]

EndPackage[]

