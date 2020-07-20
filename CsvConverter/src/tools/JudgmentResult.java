package tools;

public enum JudgmentResult {
	A("A", "異常なし"),
	B("B", "軽度異常"),
	C("C", "要経過観察"),
	D("D", "要治療"),
	D1("D1", "要治療"){
		@Override
		public String getJudgmentResult() {
			return conditionalBranch(D1);
		}
	},
	D2("D2", "受精検"){
		@Override
		public String getJudgmentResult() {
			return conditionalBranch(D2);
		}
	},
	E("E", "治療中");
	
	private final String message;
	protected final String judgmentResult;
	protected boolean lenient = true;
	
	private JudgmentResult(final String judgmentResult, final String message) {
		this.judgmentResult = judgmentResult;
		this.message = message;
	}
	
	/**
	 * @param judgmentResult JudgmentResult：D1かD2(小分類)
	 * @return　String：lenient = trueならばD、lenient = falseならばD1か1D2
	 */
	private static  String conditionalBranch(JudgmentResult judgmentResult) {
		return judgmentResult.lenient ? D.judgmentResult : judgmentResult.judgmentResult;
	}
	
	/**
	 * @return true：D1、D2どちらもDとする。false：D1、D2をそのまま扱う。
	 */
	public boolean isLenient() {
		return lenient;
	}
	
	/**
	 * @param lenient true：D1、D2どちらもDとする。false：D1、D2をそのまま扱う。
	 */
	public void setLenient(boolean lenient) {
		this.lenient = lenient;
	}
	
	/**
	 * @return String：AからEの判定
	 */
	public String getJudgmentResult() {
		return this.judgmentResult;
	}
	
	/**
	 * @return String：AからEの判定 + 判定の意味
	 */
	public String getJudgmentResultAndMessage() {
		return getJudgmentResult() + this.message;
	}
	
}
