package com.example.demo.model;

public class LocationStats {

	private String state;
	private String country;
	private int latestTotalRepo;
	private int diffFromPrevDay;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getLatestTotalRepo() {
		return latestTotalRepo;
	}
	public void setLatestTotalRepo(int latestTotalRepo) {
		this.latestTotalRepo = latestTotalRepo;
	}
	
	public int getDiffFromPrevDay() {
		return diffFromPrevDay;
	}
	public void setDiffFromPrevDay(int diffFromPrevDay) {
		this.diffFromPrevDay = diffFromPrevDay;
	}
	@Override
	public String toString() {
		return "LocationStats [state=" + state + ", country=" + country + ", latestTotalRepo=" + latestTotalRepo + "]";
	}
}
