package adapter;

public class CdDrive implements DiskDriveInterface{

private String data = "";
	public String readFromDisk() {
		String result=this.data;
		return result;
	}


	public void writeToDisk(String data) {
		data=this.data;
		
	}

}
