package items.itemImp;

import exceptions.NoJudgmentResultException;
import items.Item_TakingMedicine;
import tools.JudgmentResult;

public class Lipid_LDL extends Item_TakingMedicine{
	public Lipid_LDL() {
	}
	
	public Lipid_LDL(JudgmentResult judgmentResult){
		super(judgmentResult);
	}
	
	@Override
	protected String generateMeasurements(String judgmentResult) {		
		if(judgmentResult.equals("A")) {
			//60-119
			return "100";
			
		}else if(judgmentResult.equals("B")){
			//120-139
			return "120";
			
		}else if(judgmentResult.equals("C")){
			//140-179
			return "140";
			
		}else if(judgmentResult.equals("D")){
			//59以下、180以上
			return "180";
			
		}else if(judgmentResult.equals("E")){
			//脂質異常症の薬を服薬
			this.takingMedicine = true;
			return "90";
			
		}else {
			throw new NoJudgmentResultException("脂質(LDL)", judgmentResult);
		}
	}
	

}
