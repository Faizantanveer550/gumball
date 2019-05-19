package gumballtest;

import com.clickchain.gumball.GumballHardwareDevice;
import com.clickchain.gumball.GumballMachine;

public class TestDevice implements GumballHardwareDevice{
	private String line;
	private boolean hasEjected;
	private int numGumballs = 0;
    private int quarter = 0;

	@Override
	public void displayLine(String line) {
		this.line = line;
	}

	@Override
	public boolean releaseGumball() {
		numGumballs--;
		return numGumballs >= 0;
	}

	@Override
	public void releaseQuarter() {
		if(getCountquarter() > getNumOfQuarter()){
			hasEjected = true;
		}
		else {
			hasEjected = false;
		}
	}

	public String getLine() {
		return line;
	}


	public boolean hasEjected() {
	    releaseQuarter();
		return hasEjected;
	}

	public int getNumOfQuarter() {
		if(getCount() > 0) {
			return 1 - getCount();
		}
		else{
			return 0;
		}
	}
	
	public void addGumballs(int count) {
		numGumballs = Math.max(numGumballs, 0) + count;
	}

	public int getCount() {
		return numGumballs;
	}

	public void addquarter(){
	    quarter++;
    }
    public void removeQuarter(){
        quarter--;
    }

    public int getCountquarter(){
        return quarter;
    }
}
