package Testrecorder;

import java.text.SimpleDateFormat;
import java.util.Date;

public class firstrecord {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss");
		Date date = new Date();
		String vp = "target\\" + sdf.format(date);

	}

}
