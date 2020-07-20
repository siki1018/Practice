package items;

import tools.JudgmentResult;

public abstract class Item {
	protected String measuredValue;	
	
	public Item() {
	}
	
	public Item(JudgmentResult judgmentResult) {
		String jr = judgmentResult.getJudgmentResult();
		this.measuredValue = generateMeasurements(jr);
	}
	
	public String getMeasuredValue() {
		return this.measuredValue;
	}
	
	abstract protected String generateMeasurements(String generateMeasurement);
	
}
