(* Wolfram Language Package *)

BeginPackage["Turbofan`Components`CalculateOutput`Inlet`InletMathOutput`"]
(* Exported symbols added here with SymbolName::usage *)  

InletTout::usage="InletTout[Tin, MachIn, gamma]";
IsenTFromAdiabaticEta::usage="IsenTFromAdiabaticEta[Tin, ToutReal, etad]";
InletPout::usage="InletPout[Pin, Tin, Tout, etad, gamma]";



Begin["`Private`"] (* Begin Private Context *) 

	InletTout[Tin_, MachIn_, gamma_] := Tin (1 + (gamma - 1)/2 MachIn^2);
	
	IsenTFromAdiabaticEta[Tin_, ToutReal_, etad_] := Tin + etad (ToutReal - Tin);
	
	InletPout[Pin_, Tin_, Tout_, etad_, gamma_] := Module[{ToutIsen, Pout},
	   ToutIsen = IsenTFromAdiabaticEta[Tin, Tout, etad];
	   Pout = Pin (ToutIsen/Tin)^(gamma/(gamma - 1));
	   Pout
	   ];

	CalculateMachOut[Ain_,Aout_,gamma_]:=Module[{},
	 	   
	    
	    
	];
	
End[] (* End Private Context *)

EndPackage[]