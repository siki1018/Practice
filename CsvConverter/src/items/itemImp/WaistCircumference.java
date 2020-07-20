package items.itemImp;

import exceptions.NoJudgmentResultException;
import items.Item;
import tools.JudgmentResult;

public class WaistCircumference extends Item{	
	public WaistCircumference() {
	}

	public WaistCircumference(JudgmentResult judgmentResult) {
		super(judgmentResult);
	}
	
	@Override
	protected String generateMeasurements(String judgmentResult) {
		if(judgmentResult.equals("A")) {
			//男:84.9以下 女:89.9以下
			return "80.0";
		}else if(judgmentResult.equals("C")){
			//男:85.0以上 女:90.0以上
			return "90.0";
		}
		
		throw new NoJudgmentResultException("腹囲", judgmentResult);
	}

}
