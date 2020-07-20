package items.itemImp;

import exceptions.NoJudgmentResultException;
import items.Item_TakingMedicine;
import tools.JudgmentResult;

public class BloodPressure_Systole extends Item_TakingMedicine{
	public BloodPressure_Systole() {
	}
	
	public BloodPressure_Systole(JudgmentResult judgmentResult){
		super(judgmentResult);
	}
	
	@Override
	protected String generateMeasurements(String judgmentResult) {
		if(judgmentResult.equals("A")) {
			//129以下
			return "120";
			
		}else if(judgmentResult.equals("B")) {
			//130-139
			return "130";
			
		}else if(judgmentResult.equals("C")){
			//140-159
			return "140";
			
		}else if(judgmentResult.equals("D")){
			//160以上
			return "160";
			
		}else if(judgmentResult.equals("E")){
			//高血圧の薬を服薬
			this.takingMedicine = true;
			return "110";
		}else {
			throw new NoJudgmentResultException("血圧(収縮期)", judgmentResult);
		}	
	}

}
