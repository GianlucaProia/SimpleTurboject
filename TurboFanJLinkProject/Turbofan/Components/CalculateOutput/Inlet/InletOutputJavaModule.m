(* Wolfram Language Package *)

BeginPackage["Turbofan`Components`CalculateOutput`Inlet`InletOutputJavaModule`",
    {
    "Turbofan`Components`CalculateOutput`Inlet`InletSingleJavaOutput`"
    }]

(* Exported symbols added here with SymbolName::usage *)  

CalculateInletOutput::usage="CalculateInletOutput[inletObject]";



Begin["`Private`"] (* Begin Private Context *) 

	CalculateInletOutput[inletObject_] := Module[{},
	   CalculateInletMachOut[inletObject];
	   CalculateInletTout[inletObject];
	   CalculateInletPout[inletObject];
	   CalculateInletVout[inletObject];
	   ];

End[] (* End Private Context *)

EndPackage[]