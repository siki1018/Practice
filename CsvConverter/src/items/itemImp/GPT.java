package items.itemImp;

import exceptions.NoJudgmentResultException;
import items.Item;
import tools.JudgmentResult;

public class GPT extends Item{	
	public GPT(){
	}

	public GPT(JudgmentResult judgmentResult){
		super(judgmentResult);
	}
	
	@Override
	protected String generateMeasurements(String judgmentResult) {		
		if(judgmentResult.equals("A")) {
			//30以下
			return "30";
			
		}else if(judgmentResult.equals("B")){
			//31-40
			return "35";
			
		}else if(judgmentResult.equals("C")){
			//41-50
			return "40";
			
		}else if(judgmentResult.equals("D")){
			//51以上
			return "60";
			
		}else {
			throw new NoJudgmentResultException("ALT(GPT)", judgmentResult);
		}
	}
}
