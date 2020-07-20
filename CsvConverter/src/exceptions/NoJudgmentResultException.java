package exceptions;

@SuppressWarnings("serial")
public class NoJudgmentResultException extends RuntimeException{

	public NoJudgmentResultException(String itemName){
		super(itemName + "に判定は存在しません");
	}	
	
	public NoJudgmentResultException(String itemName, String judgmentResult){
		super(itemName + "に" + judgmentResult + "という判定は存在しません");
	}

}
