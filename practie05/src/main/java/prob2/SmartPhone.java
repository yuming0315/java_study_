package prob2;

public class SmartPhone extends MusicPhone {
	public void execute( String function ) {
		if(function.equals("앱")) {
			runApp();
		}
		else {
			super.execute(function);
		}
		System.out.println();
	}

	public void runApp() {
		System.out.print("앱실행");
	}
}
