package adapter;

public class RamDriveAdapter implements DiskDriveInterface {

	private Ram adaptee=null;
	
	
	
	public String readFromDisk() throws RamException{
		if(adaptee!=null){
			String data =adaptee.readRam();
			return data;
		}else{
			throw new RamException("unable to write to ram");
		}
		
	}

	
	public void writeToDisk(String data)throws RamException {
		if(adaptee!=null){
			adaptee.writeToRam(data);
		}else{
			throw new RamException("unable to write to ram");
		}
		
	}
	
}
