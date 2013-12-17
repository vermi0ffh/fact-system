package org.factsystem.model;

public class NumberWithUnitFact extends Fact {
	protected double valDouble;
	protected String unite;
	
	public double getValDouble() {
		return valDouble;
	}

	public void setValDouble(double valDouble) {
		this.valDouble = valDouble;
	}

	public String getUnite() {
		return unite;
	}

	public void setUnite(String unite) {
		this.unite = unite;
	}
	
	@Override
	public boolean equals(Object o) {
		if (!super.equals(o)) {
			return false;
		}
		
		NumberWithUnitFact numberWithUnitFact = (NumberWithUnitFact)o;
		
		return this.getValDouble() == numberWithUnitFact.getValDouble() && this.getUnite() == numberWithUnitFact.getUnite();
	}
}
