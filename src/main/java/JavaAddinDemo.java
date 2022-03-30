import net.prominic.gja_v20220330.JavaServerAddinGenesis;

public class JavaAddinDemo extends JavaServerAddinGenesis {

	@Override
	protected String getJavaAddinVersion() {
		return "1.2.5";
	}

	@Override
	protected String getJavaAddinDate() {
		return "2022-03-30 16:05";
	}

	@Override
	protected boolean resolveMessageQueueState(String cmd) {
		boolean flag = super.resolveMessageQueueState(cmd);
		if (flag) return true;

		logMessage("invalid command (use -h or help to get details)");
		return false;
	}

}
