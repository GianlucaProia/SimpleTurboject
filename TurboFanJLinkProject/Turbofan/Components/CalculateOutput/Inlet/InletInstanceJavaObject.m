(* Wolfram Language Package *)

BeginPackage["Turbofan`CalculateOutput`Inlet`"]
(* Exported symbols added here with SymbolName::usage *)  

Begin["`Private`"] (* Begin Private Context *) 


 NewInletObject[{Tin_,Pin_,gammaIn_,MachOut_},etad_]:=Module[{inletObject,airFlowIn,airFlowOut},
     inletObject=JavaNew["com.component.inlet.Inlet",etad];
     airFlowIn=JavaNew["com.air.flow.AirFlow",Tin,Pin,gammaIn];
     airFlowOut=JavaNew["com.air.flow.AirFlow",MachOut];
     inletObject@setAirFlowIn[airFlowIn];
     inletObject@setAirFlowOut[airFlowOut];
     inletObject
 ]


End[] (* End Private Context *)

EndPackage[]