import java.util.Arrays;
import java.util.Calendar;

public class JavaAddinDemo extends JavaServerAddinGenesis {
	// constructor if parameters are provided
	public JavaAddinDemo(String[] args) {
		this.args = args;
	}

	public JavaAddinDemo() {}
	
	private void showHelp() {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		logMessage("*** Usage ***");
		AddInLogMessageText("load runjava JavaAddinDemo");
		AddInLogMessageText("tell JavaAddinDemo <command>");
		AddInLogMessageText("   quit       Unload JavaAddinDemo");
		AddInLogMessageText("   help       Show help information (or -h)");
		AddInLogMessageText("   info       Show version and more of JavaAddinDemo (or -i)");
		AddInLogMessageText("Copyright (C) Prominic.NET, Inc. 2021" + (year > 2021 ? " - " + Integer.toString(year) : ""));
		AddInLogMessageText("See https://prominic.net for more details.");
	}

	@Override
	protected String getJavaAddinName() {
		return "JavaAddinDemo";
	}

	@Override
	protected String getJavaAddinVersion() {
		return "1.1.0";
	}

	@Override
	protected String getJavaAddinDate() {
		return "2022-03-01 14:30";
	}

	@Override
	protected void showInfo() {
		logMessage("version      " + this.getJavaAddinName());
		logMessage("date         " + this.getJavaAddinDate());
		logMessage("parameters   " + Arrays.toString(this.args));
	}

	@Override
	protected void resolveMessageQueueState(String cmd) {
		if ("-h".equals(cmd) || "help".equals(cmd)) {
			showHelp();
		}
		else if ("-i".equals(cmd) || "info".equals(cmd)) {
			showInfo();
		}
		else {
			logMessage("invalid command (use -h or help to get details)");
		}
	}

	@Override
	protected String getCmdFileName() {
		return "javaaddindemo.txt";
	}
}
