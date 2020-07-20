package items.itemImp;

import exceptions.NoJudgmentResultException;
import items.Item;
import tools.JudgmentResult;

public class BMI extends Item{	
	public BMI() {
	}

	public BMI(JudgmentResult judgmentResult){
		super(judgmentResult);
	}

	@Override
	protected String generateMeasurements(String judgmentResult) {	
		if(judgmentResult.equals("A")) {
			//18.5-24.9
			return "20.0";
			
		}else if(judgmentResult.equals("C")){
			//18.4以下、25.0以上
			return "26.0";
			
		}else {
			throw new NoJudgmentResultException("BMI", judgmentResult);
		}
		
	}

	
}
