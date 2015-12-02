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


			while (scanner.hasNextLine()) {
				Till till = new Till();

				String line = scanner.nextLine();

				for(String product : line.split(",")) {
					if ("Apples".equals(product.trim()))
						till.scanApple();

					if ("Pommes".equals(product.trim()))
						till.scanPommes();

					if ("Mele".equals(product.trim()))
						till.scanMele();

					if ("Bananas".equals(product.trim()))
						till.scanBanana();

					if ("Cherries".equals(product.trim()))
						till.scanCherries();
				}
				out.println(till.getAmount());
			}
		}
	}
}
