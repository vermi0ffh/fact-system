package org.factsystem.model;

public class StringFact extends Fact {
	protected String valStr;

	public String getValStr() {
		return valStr;
	}

	public void setValStr(String valStr) {
		this.valStr = valStr;
	}
	
	@Override
	public boolean equals(Object o) {
		if (!super.equals(o)) {
			return false;
		}
		
		return this.getValStr().equals(((StringFact)o).getValStr());
	}
}
