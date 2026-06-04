package day34;

public class Project {

		private int projectId;
		private String projectName;
		private double projectBudget;
		private char projectStatus;
		
		public Project() {}
		public Project(int projectId, String projectName, double projectBudget, char projectStatus) {
			this.projectId = projectId;
			this.projectName = projectName;
			this.projectBudget = projectBudget;
			this.projectStatus = projectStatus;
		}
		public int getProjectId() {
			return projectId;
		}
		public void setProjectId(int projectId) {
			this.projectId = projectId;
		}
		public String getProjectName() {
			return projectName;
		}
		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}
		public double getProjectBudget() {
			return projectBudget;
		}
		public void setProjectBudget(double projectBudget) {
			this.projectBudget = projectBudget;
		}
		public char getProjectStatus() {
			return projectStatus;
		}
		public void setProjectStatus(char projectStatus) {
			this.projectStatus = projectStatus;
		}
		
		@Override
		public String toString() {
			return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectBudget="
					+ projectBudget + ", projectStatus=" + projectStatus + "]";
		}
		
		
		
		
}
