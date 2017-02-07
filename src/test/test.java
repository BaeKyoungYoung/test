package test;

public class test {
	public void main(String[] args){
		System.out.println("Hi. This Is Test!!");		
		
		System.out.println("Version:"+ (new VersionName()).getVersionName());
		System.out.println("end of message");
				
	}
	
	static class VersionName{		
<<<<<<< HEAD
		String versionName="v1.31";		
		
=======
		String versionName="v1.4";		
>>>>>>> refs/heads/feature/fun1v3
		public String getVersionName(){
			return this.versionName;
		}
	}
}
