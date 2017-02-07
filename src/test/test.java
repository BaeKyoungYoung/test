package test;

public class test {
	public void main(String[] args){
		System.out.println("hi");		
		
		System.out.println("Version:"+ (new VersionName()).getVersionName());
		System.out.println("end of message");
				
	}
	
	static class VersionName{		
		String versionName="v1.2";		
		public String getVersionName(){
			return this.versionName;
		}
	}
}
