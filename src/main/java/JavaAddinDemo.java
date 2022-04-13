import net.prominic.gja_v20220413.JavaServerAddinGenesis;

public class JavaAddinDemo extends JavaServerAddinGenesis {

	@Override
	protected String getJavaAddinVersion() {
		return "1.2.8";
	}

	@Override
	protected String getJavaAddinDate() {
		return "2022-04-13 15:05";
	}

	@Override
	protected boolean resolveMessageQueueState(String cmd) {
		boolean flag = super.resolveMessageQueueState(cmd);
		if (flag) return true;

		logMessage("invalid command (use -h or help to get details)");
		return false;
	}

}
