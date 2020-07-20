package items.itemImp;

import exceptions.NoJudgmentResultException;
import items.Item;
import tools.JudgmentResult;

public class GOT extends Item{	
	public GOT() {
	}

	public GOT(JudgmentResult judgmentResult) {
		super(judgmentResult);
	}
	
	@Override
	protected String generateMeasurements(String judgmentResult) {		
		if(judgmentResult.equals("A")) {
			//30以下
			return "30";
			
		}else if(judgmentResult.equals("B")){
			//31-35
			return "35";
			
		}else if(judgmentResult.equals("C")){
			//36-50
			return "40";
			
		}else if(judgmentResult.equals("D")){
			//51以上
			return "60";
			
		}else {
			throw new NoJudgmentResultException("AST(GOT)", judgmentResult);
		}
	}

}
