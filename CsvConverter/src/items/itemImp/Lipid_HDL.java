package items.itemImp;

import exceptions.NoJudgmentResultException;
import items.Item_TakingMedicine;
import tools.JudgmentResult;

public class Lipid_HDL extends Item_TakingMedicine{
	public Lipid_HDL() {
	}
	
	public Lipid_HDL(JudgmentResult judgmentResult){
		super(judgmentResult);
	}
	
	@Override
	protected String generateMeasurements(String judgmentResult) {		
		if(judgmentResult.equals("A")) {
			//40以上
			return "40";
			
		}else if(judgmentResult.equals("C")){
			//35-39
			return "35";
			
		}else if(judgmentResult.equals("D")){
			//34以下
			return "30";
			
		}else if(judgmentResult.equals("E")){
			//脂質異常症の薬を服薬
			this.takingMedicine = true;
			return "40";
			
		}else {
			throw new NoJudgmentResultException("脂質(HDL)", judgmentResult);
		}
	}
}
