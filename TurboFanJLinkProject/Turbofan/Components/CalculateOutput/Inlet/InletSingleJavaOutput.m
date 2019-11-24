(* Wolfram Language Package *)

BeginPackage["Turbofan`Components`CalculateOutput`Inlet`InletSingleJavaOutput`",
	{
	"Turbofan`Components`CalculateOutput`Inlet`InletMathOutput`"
	}
]
(* Exported symbols added here with SymbolName::usage *)  

CalculateInletTout::usage="CalculateInletTout[inletObject]";
CalculateInletPout::usage="CalculateInletPout[inletObject]";

Begin["`Private`"] (* Begin Private Context *) 

	CalculateInletTout[inletObject_] := Module[{Tout},
	   Tout = InletTout[
	     inletObject@getAirFlow[]@getTin[],
	     inletObject@getAirFlow[]@getMachIn[],
	     inletObject@getAirFlow[]@getGamma[]
	     ];
	   (* Set *)
	   inletObject@getAirFlow[]@setTout[Tout];
	   ];
	   
	   
	CalculateInletPout[inletObject_] := Module[{},
   			Pout = InletPout[
 				inletObject@getAirFlow[]@getPin[],
 				inletObject@getAirFlow[]@getTin[],
 				inletObject@getAirFlow[]@getTout[],
				inletObject@getEtaAdiabatico[],
 				inletObject@getAirFlow[]@getGamma[]
     			];	
   		(* Set *)
   		inletObject@getAirFlow[]@setPout[Pout];
   		];


End[] (* End Private Context *)

EndPackage[]