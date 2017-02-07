package test;

public class test {
	public void main(String[] args){
		System.out.println("Hi. This Is Test.");		
		
		System.out.println("Version:"+ (new VersionName()).getVersionName());
		System.out.println("end of message");
				
	}
	
	static class VersionName{		
		String versionName="v1.31";		
		
		public String getVersionName(){
			return this.versionName;
		}
	}
}
