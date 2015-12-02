package codecamp;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Cli {
	
	public static void main(String[] args) {
		new Cli().process(System.in, System.out);
	}

	public void process(InputStream in, PrintStream out) {
		try (Scanner scanner = new Scanner(in)) {
			Till till = new Till();

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();

				if ("Apples".equals(line))
					till.scanApple();

				if ("Bananas".equals(line))
					till.scanBanana();

				if ("Cherries".equals(line))
					till.scanCherries();

				out.println(till.getAmount());
			}
		}
	}
}
