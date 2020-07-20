package items;

import tools.JudgmentResult;

public abstract class Item_TakingMedicine extends Item{
	protected boolean takingMedicine = false;
	
	public Item_TakingMedicine() {
	}
	
	public Item_TakingMedicine(JudgmentResult judgmentResult) {
		super(judgmentResult);
	}
	
	public boolean getTakingMedicine() {
		return this.takingMedicine;
	}
}
