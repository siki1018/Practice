package items.itemImp;

import exceptions.NoJudgmentResultException;
import items.Item;
import tools.JudgmentResult;

public class UricAcid extends Item{
	public UricAcid() {
	}
	
	public UricAcid(JudgmentResult judgmentResult){
		super(judgmentResult);
	}
	
	@Override
	protected String generateMeasurements(String judgmentResult) {
		if(judgmentResult.equals("A")) {
			//2.1-7.0
			return "3.0";
			
		}else if(judgmentResult.equals("B")) {
			//7.1-7.9
			return "7.5";
			
		}else if(judgmentResult.equals("C")){
			//2.0以下、8.0-8.9
			return "8.0";
			
		}else if(judgmentResult.equals("D")){
			//9.0以上
			return "9.0";
			
		}else {
			throw new NoJudgmentResultException("尿酸", judgmentResult);
		}
		
		
	}

}
