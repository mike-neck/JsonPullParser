package net.vvakame.sample.issue2;

import net.vvakame.util.jsonpullparser.annotation.JsonKey;
import net.vvakame.util.jsonpullparser.annotation.JsonModel;

/**
 * Parent 0 output, Child 1 output.
 * @author vvakame
 */
@JsonModel
public class Child1ValueP0 extends Parent0Value {

	@JsonKey
	private int hoge;


	/**
	 * @return the hoge
	 * @category accessor
	 */
	public int getHoge() {
		return hoge;
	}

	/**
	 * @param hoge the hoge to set
	 * @category accessor
	 */
	public void setHoge(int hoge) {
		this.hoge = hoge;
	}
}
