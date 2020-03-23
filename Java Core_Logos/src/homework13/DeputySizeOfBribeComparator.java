package homework13;

import java.util.Comparator;

public class DeputySizeOfBribeComparator implements Comparator<Deputy> {

	@Override
	public int compare(Deputy o1, Deputy o2) {
		return o1.getSizeOfbribe() > o2.getSizeOfbribe() ? 1 : -1;
	}
}
