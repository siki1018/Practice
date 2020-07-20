package items.itemImp;

import exceptions.NoJudgmentResultException;
import items.Item_TakingMedicine;
import tools.JudgmentResult;

public class Lipid_NeutralFat extends Item_TakingMedicine{
	public Lipid_NeutralFat() {
	}
	
	public Lipid_NeutralFat(JudgmentResult judgmentResult){
		super(judgmentResult);
	}
	
	@Override
	protected String generateMeasurements(String judgmentResult) {		
		if(judgmentResult.equals("A")) {
			//30-149
			return "100";
			
		}else if(judgmentResult.equals("B")){
			//150-299
			return "150";
			
		}else if(judgmentResult.equals("C")){
			//300-499
			return "300";
			
		}else if(judgmentResult.equals("D")){
			//29以下、500以上
			return "500";
			
		}else if(judgmentResult.equals("E")){
			//脂質異常症の薬を服薬
			this.takingMedicine = true;
			return "90";
			
		}else {
			throw new NoJudgmentResultException("脂質(中性脂肪)", judgmentResult);
		}
	}

}
