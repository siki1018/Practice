package items.itemImp;

import exceptions.NoJudgmentResultException;
import items.Item_TakingMedicine;
import tools.JudgmentResult;

public class BloodPressure_DiastolicPhase extends Item_TakingMedicine{
	public BloodPressure_DiastolicPhase(){
	}
		
	public BloodPressure_DiastolicPhase(JudgmentResult judgmentResult){
		super(judgmentResult);
	}
	
	@Override
	protected String generateMeasurements(String judgmentResult) {		
		if(judgmentResult.equals("A")) {
			//84以下
			return "80";
			
		}else if(judgmentResult.equals("B")) {
			//85-89
			return "85";
			
		}else if(judgmentResult.equals("C")){
			//90-99
			return "90";
			
		}else if(judgmentResult.equals("D")){
			//100以上
			return "100";
			
		}else if(judgmentResult.equals("E")){
			//高血圧の薬を服薬
			this.takingMedicine = true;
			return "70";
			
		}else {
			throw new NoJudgmentResultException("血圧(拡張期)", judgmentResult);
		}
	}
}
