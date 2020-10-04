package PA3;
import java.util.Scanner;
public class Browser {
	Stack fwdStack, bwdStack;
	String currentWebsite;
	Scanner uin;
	public Browser() {
		fwdStack = new Stack();
		bwdStack = new Stack();
		uin = new Scanner(System.in);
		currentWebsite = "";
	}
	public final void run() {
		int opt = 1;
		while(opt < 4 && opt > 0) {
			System.out.println("Current Website: " + currentWebsite + "\n1. Go to new website\n2. Hit the back button\n3. Hit the forward\n4. Close the browser" );
			opt = uin.nextInt();
			switch(opt) {
				case 1:
					newWebsite();
					break;
				case 2:
					back();
					break;
				case 3:
					forward();
					break;
			}
		}
		if (opt == 4) {
			System.out.println("Browser Closed. Goodbye!");
			System.exit(0);
			uin.close();
		}
		else {
			System.out.println("Invalid Input.");
		}
	}
	public final void newWebsite() {
		String newWebsite = new String();
		System.out.println("Enter New Website: ");
		newWebsite = uin.next();
		if (newWebsite.equals(currentWebsite)) {
			currentWebsite = currentWebsite;
		}
		else {
			bwdStack.push(currentWebsite);
			currentWebsite = newWebsite;
			fwdStack.clear();
		}
	}
	public final void back() {
		if (bwdStack.size() == 0) {
			System.out.println("The Back button is currently disabled.");
		}
		else {
			fwdStack.push(currentWebsite);
			currentWebsite = bwdStack.pop();
		}
	}
	public final void forward() {
		if (fwdStack.size() == 0) {
			System.out.println("The Forward button is currently disabled.");
			}
		else {
			bwdStack.push(currentWebsite);
			currentWebsite = fwdStack.pop();
		}
	}
}