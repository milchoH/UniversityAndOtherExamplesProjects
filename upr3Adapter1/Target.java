package upr3Adapter1;

public interface Target {
	public void add(String item);
	public void remove(int index);
	public int getItemCount();
	public boolean isIndexSelected(int index);
	public void setMultipleMode(boolean on);
}
