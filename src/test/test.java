package test;

public class Hello {
	public void main(String[] args){
		System.out.println("hi");		
		
		System.out.println("Version:"+ (new VersionName()).getVersionName());
		System.out.println("end of message");
				
	}
	
	static class VersionName{		
		String versionName="v1.0";		
		public String getVersionName(){
			return this.versionName;
		}
	}
}
