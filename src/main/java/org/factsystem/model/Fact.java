package org.factsystem.model;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.joda.time.Instant;

public abstract class Fact {
	protected Instant startDate;
	protected Instant endDate;
	protected boolean isDeducted;
	protected String type;
	
	public boolean isDeducted() {
		return isDeducted;
	}
	
	public Instant getStartDate() {
		if (startDate == null) {
			return new Instant(Long.MIN_VALUE);
		}
		
		return startDate;
	}
	public void setStartDate(Instant startDate) {
		this.startDate = startDate;
	}
	
	public Instant getEndDate() {
		if (endDate == null) {
			return new Instant(Long.MAX_VALUE);
		}
		
		return endDate;
	}
	public void setEndDate(Instant endDate) {
		this.endDate = endDate;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null || this.getClass() != o.getClass()) {
			return false;
		}
		
		Fact f = (Fact)o;
		
		return this.getStartDate().equals(f.getStartDate()) && this.getEndDate().equals(f.getEndDate());
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37)
		.append(this.type)
		.append(this.getStartDate())
		.append(this.getEndDate())
		.append(this.isDeducted())
		.toHashCode();
	}
}
