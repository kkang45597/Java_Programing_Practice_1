package com.intheest.inhertance2;

public interface Interface2 {
	
	enum Interface2Enum {
		yes("yes", true, 1),
		no("no", false, -1);

		private String Interface2str;
		private boolean Interface2b;
		private int Interface2int;
		
		Interface2Enum(String Interface2str, boolean Interface2b, int Interface2int) {
			this.Interface2str = Interface2str;
			this.Interface2b = Interface2b;
			this.Interface2int = Interface2int;
		}

		public String setInterface2str(String Interface2str) {
			return this.Interface2str = Interface2str;
		}
		public boolean setInterface2b(boolean Interface2b) {
			return this.Interface2b = Interface2b;
		}
		public int setInterface2int(int Interface2int) {
			return this.Interface2int = Interface2int;
		}
		
		public String getInterface2str() {
			return this.Interface2str = Interface2str;
		}
		public boolean getInterface2b() {
			return this.Interface2b = Interface2b;
		}
		public int getInterface2int() {
			return this.Interface2int = Interface2int;
		}
	}
	
	abstract boolean Interface2Abstract(boolean Abstract2);
	
	default boolean Interface2Default(boolean Default2) {
		return true;
	}
	
	static boolean Interface2Static(boolean Static2) {
		return true;
	}
}
