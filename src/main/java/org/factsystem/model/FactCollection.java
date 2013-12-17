package org.factsystem.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FactCollection extends Fact implements Set<Fact> {
	protected HashSet<Fact> valStore = new HashSet<Fact>();

	@Override
	public boolean add(Fact e) {
		return valStore.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends Fact> c) {
		return valStore.addAll(c);
	}

	@Override
	public void clear() {
		valStore.clear();
	}

	@Override
	public boolean contains(Object o) {
		return valStore.contains(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return valStore.containsAll(c);
	}

	@Override
	public boolean isEmpty() {
		return valStore.isEmpty();
	}

	@Override
	public Iterator<Fact> iterator() {
		return valStore.iterator();
	}

	@Override
	public boolean remove(Object o) {
		return valStore.remove(o);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return valStore.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return valStore.retainAll(c);
	}

	@Override
	public int size() {
		return valStore.size();
	}

	@Override
	public Object[] toArray() {
		return valStore.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return valStore.toArray(a);
	}
	
	@Override
	public boolean equals(Object o) {
		if (!super.equals(o)) {
			return false;
		}
		
		FactCollection factCollection = (FactCollection)o;
		
		for(Fact fact : this) {
			if (!factCollection.contains(fact)) {
				return false;
			}
		}
		
		return true;
	}
}
