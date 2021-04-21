package com.sheepit.client.standalone;

public enum SwingTooltips {
	WORKING_DIRECTORY(
		"Where Sheepit stores things like downloaded projects, finished frames etc. Unless you want to free up your C: drive, Auto detected will do just fine."),
	
	COMPUTE_DEVICES("What Sheepit will use to render. Note that only one device can be active at a time, e.g. sometimes you get jobs for your \n"
		+ "GPU so your CPU takes a break, sometimes it's the other way around. The only way to always use 100% of your system \n"
		+ "is to setup 2 clients, but for that you need to use the command line to give them different configs."),
	
	RENDERBUCKET_SIZE("Basically the size of the orange squares you see in blender when you render. Blender calls it tile size. Unless you know better, the default is fine."),
	
	CPU_CORES("How many (logical) cores of your CPU, often called threads, Sheepit may use. This doesn't apply to GPU-jobs. \n"
		+ "(Generally GPU jobs will use a single core to use the GPU, which doesn't use 100% of that core.)"),
	
	MEMORY("How much RAM Sheepit may use. This isn't a 100% safe limit, since Blender can erroneously use more, \n"
		+ "but Sheepit will try its best to give you jobs that require less than what you've entered here."),
	
	PRIORITY("Which priority in your system the rendering process should have. Note that minus 19 is the highest, 19 is the lowest."),
	
	MINIMIZE_TO_SYSTRAY("Whether Sheepit should vanish into your system tray (the icons next to the clock in the bottom right) when you minimize the window."),
	
	PROXY("If you don't know what this does, you don't need it. Useful for example if you're in a company network with restricted access."),
	
	COMPUTER_NAME("What this machine will be displayed as on your Sheepit profile page. Only you and admins can see this."),
	
	MAX_TIME_PER_FRAME("How much time a frame should take at most. Sheepit will try to assign jobs to your machine that take less time to compute.");
	
	
	private final String explanation;
	
	private SwingTooltips(String explanation) {
		this.explanation = explanation;
	}
	
	public String getText() {
		return explanation;
	}
	
}
