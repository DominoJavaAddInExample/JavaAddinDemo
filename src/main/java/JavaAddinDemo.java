import net.prominic.gja_v082.JavaServerAddinGenesis;

public class JavaAddinDemo extends JavaServerAddinGenesis {

	@Override
	protected String getJavaAddinVersion() {
		return "1.0.0";
	}

	@Override
	protected String getJavaAddinDate() {
		return "2022-06-08 22:00";
	}

	@Override
	protected boolean resolveMessageQueueState(String cmd) {
		boolean flag = super.resolveMessageQueueState(cmd);
		if (flag) return true;

		logMessage("invalid command (use -h or help to get details)");
		return false;
	}

}
