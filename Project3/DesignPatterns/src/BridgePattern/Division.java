package BridgePattern;

public class Division implements Operation {

	@Override
	public int doOperation(int x, int y) {
		return y != 0 ? x/y : -1;
	}
}
