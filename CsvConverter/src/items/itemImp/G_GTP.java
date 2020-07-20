package items.itemImp;

import exceptions.NoJudgmentResultException;
import items.Item;
import tools.JudgmentResult;

public class G_GTP extends Item{	
	public G_GTP(){
	}

	public G_GTP(JudgmentResult judgmentResult){
		super(judgmentResult);
	}
	
	@Override
	protected String generateMeasurements(String judgmentResult) {		
		if(judgmentResult.equals("A")) {
			//50以下
			return "50";
			
		}else if(judgmentResult.equals("B")){
			//51-80
			return "60";
			
		}else if(judgmentResult.equals("C")){
			//81-100
			return "90";
			
		}else if(judgmentResult.equals("D")){
			//101以上
			return "110";
			
		}else {
			throw new NoJudgmentResultException("γ-GT(γ-GTP)", judgmentResult);
		}
	}

}
