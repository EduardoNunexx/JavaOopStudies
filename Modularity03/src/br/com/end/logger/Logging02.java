package br.com.end.logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logging02 {
	public static void date(String msg) {
		SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("[INFO] "+spf.format(new Date())+" "+ msg);
	}
}
