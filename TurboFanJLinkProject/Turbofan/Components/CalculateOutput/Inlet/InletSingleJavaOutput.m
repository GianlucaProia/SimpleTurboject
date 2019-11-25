(* Wolfram Language Package *)

BeginPackage["Turbofan`Components`CalculateOutput`Inlet`InletSingleJavaOutput`",
	{
	"Turbofan`Components`CalculateOutput`Inlet`InletMathOutput`"
	}]
	
(* Exported symbols added here with SymbolName::usage *)  

CalculateInletTout::usage="CalculateInletTout[inletObject] calcola la temperatura di uscita dalla presa dinamica.";
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
	   
	   
	CalculateInletPout[inletObject_] := Module[{Pout},
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


	CalculateInletMachOut[inletObject_]:=Module[{condition}, 
	    condition=inletObject@getAin[]!=0.
	    		  &&inletObject@getAout[]!=0.
	    		  &&inletObject@getAirFlowIn[]@getMach[]!=0 ;
	    If[condition,
	       CalculateMachOut[
		       inletObject@getAin[],
		       inletObject@getAout[], 
		       inletObject@getAirFlowOut[]@getGamma[]
	       ],
	       inletObject@getAirFlowOut[]@setMachOut[0.0];
	       Print["Il valore del Mach di uscita è 0."];
	    ];
	];

	
	CalculateInletGammaOut[inletObject_]:=Module[{gammaIn},
	  	gammaIn=inletObject@getAirFlowIn[]@getGamma[];  
	    inletObject@getAirFlowOut[]@setGamma[gammaIn];
	];

End[] (* End Private Context *)

EndPackage[]