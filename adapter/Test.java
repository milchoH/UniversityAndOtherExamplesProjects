package adapter;

public class Test {
	public static void main (String [] args){
		
		testAdapter();
	}
	public static void testAdapter(){
		DiskDriveInterface cd = new CdDrive();
		try{
		cd.writeToDisk("testy cd");
		String data = cd.readFromDisk();
		System.out.println("data:"+data);
		} catch(DriveException ex ){
			
		}
		Ram r = new Ram();
		r.writeToRam("test ram");
		String ramdata=r.readRam();
		System.out.println("ram data:" +ramdata);
	}
	
}
