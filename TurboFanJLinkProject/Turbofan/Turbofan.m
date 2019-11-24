(* Wolfram Language Package *)

(* Created by the Wolfram Workbench 24-nov-2019 *)

BeginPackage["Turbofan`", {"JLink`"}]
(* Exported symbols added here with SymbolName::usage *) 

fun::usage="f[x]";

(* IL package richiama altri packages... *)

Begin["`Private`"]
(* Implementation of the package *)

fun[x_]:=Module[{obj},
	
	obj=JavaNew["java.lang.String",x];	
	obj@getBytes[]
	
];


End[]

EndPackage[]

