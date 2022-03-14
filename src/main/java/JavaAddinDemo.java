import java.util.Calendar;

public class JavaAddinDemo extends JavaServerAddinGenesis {
	
	protected void showHelp() {
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
		return "1.2.4";
	}

	@Override
	protected String getJavaAddinDate() {
		return "2022-03-09 16:05";
	}

	@Override
	protected boolean resolveMessageQueueState(String cmd) {
		boolean flag = super.resolveMessageQueueState(cmd);
		if (flag) return true;

		logMessage("invalid command (use -h or help to get details)");
		return false;
	}

}
