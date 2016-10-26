package adapter;

public interface DiskDriveInterface {
	public String readFromDisk() throws Exception;
	public void writeToDisk(String data);
}
