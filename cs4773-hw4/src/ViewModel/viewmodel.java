package ViewModel;


public class viewmodel {

	private String teamInfo;
	
	public viewmodel(String teamInfo) {
		this.teamInfo = teamInfo;
	}

	public String getTeamInfo() {
		return teamInfo;
	}
	public void setName(String teamInfo) {
		this.teamInfo = teamInfo;
	}
	@Override
	public String toString() {
		return getTeamInfo();
	}

}
