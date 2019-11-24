(* Wolfram Language Package *)

BeginPackage["Turbofan`Components`CalculateOutput`Inlet`InletOutputJavaModule`",
    {
    "Turbofan`Components`CalculateOutput`Inlet`InletSingleJavaOutput`"
    }
]
(* Exported symbols added here with SymbolName::usage *)  

CalculateInletOutput::usage="CalculateInletOutput[inletObject]";

Begin["`Private`"] (* Begin Private Context *) 

	CalculateInletOutput[inletObject_] := Module[{},
	   CalculateInletTout[inletObject];
	   CalculateInletPout[inletObject];
	   ];

End[] (* End Private Context *)

EndPackage[]