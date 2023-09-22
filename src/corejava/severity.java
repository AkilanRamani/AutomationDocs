package corejava;

public enum severity {
	
	WINTER(5), SPRING(10); 
    
	private int fixinghours;
	public int getFixinghours() {
		return fixinghours;
	}
	public void setFixinghours(int fixinghours) {
		this.fixinghours = fixinghours;
	}
	severity(int i) { //10 => fixinghours = 10 (the instance variable will be initiliazed)
		fixinghours=i;
	}

}


