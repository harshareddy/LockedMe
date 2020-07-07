package lockedme;

import java.io.File;
import java.util.Comparator;

public class FileNameComparator implements Comparator<File>{

	public int compare(File o1, File o2) {

		return o1.getName().toString().compareTo(o2.getName().toString());
	}

}
