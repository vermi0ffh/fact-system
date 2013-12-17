package org.factsystem.model;

import org.joda.time.Partial;

public class DateFact extends Fact {
	protected Partial valDate;

	public Partial getValDate() {
		return valDate;
	}

	public void setValDate(Partial valDate) {
		this.valDate = valDate;
	}
	
	@Override
	public boolean equals(Object o) {
		if (!super.equals(o)) {
			return false;
		}
		
		return this.getValDate().equals(((DateFact)o).getValDate());
	}
}
