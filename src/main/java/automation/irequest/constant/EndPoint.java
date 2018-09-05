package automation.irequest.constant;

public enum EndPoint {

	NONE(1), SOURCING(2), CONTRACT(3), IMANAGE(4);

	public int getVal() {
		return val;
	}

	int val = 1;

	private EndPoint(int val) {
		this.val = val;
	}

}
