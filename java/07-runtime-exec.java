class Main {
	public static void main(String args[]) {
		try {
			Process process = Runtime.getRuntime().exec("notepad");
			System.out.println("Notepad started successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

/*
	Runtime.getRuntime().freeMemory()
	Runtime.getRuntime().maxMemory()
	Runtime.getRuntime().totalMemory()
	Runtime.getRuntime().availableProcessors()
	Runtime.getRuntime().exec(String command)
	Runtime.getRuntime().exec(String cmdArray[])
	Runtime.getRuntime().exec(String command, String envp[])
	Runtime.getRuntime().exec(String command, String envp[], File dir)
	Runtime.getRuntime().exec(String cmdArray[], String envp[])
	Runtime.getRuntime().exec(String cmdArray[], String envp[], File dir)
	Runtime.getRuntime().traceInstructions(boolean on)
	Runtime.getRuntime().traceMethodCalls(boolean on)
	Runtime.getRuntime().load(String fileName)
	Runtime.getRuntime().loadLibrary(String libName)
	Runtime.getRuntime().gc()
	Runtime.getRuntime().runFinalization()
	Runtime.getRuntime().exit(int status)
	Runtime.getRuntime().halt(int status)
	Runtime.getRuntime().addShutdownHook(Thread hook)
	Runtime.getRuntime().removeShutdownHook(Thread hook)

*/