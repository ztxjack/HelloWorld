package RowNumbers;

public class ItemCount
{
    public int getLineCount() {
		return lineCount;
	}
	public void setLineCount(int lineCount) {
		this.lineCount = lineCount;
	}
	public int getFileCount() {
		return fileCount;
	}
	public void setFileCount(int fileCount) {
		this.fileCount = fileCount;
	}
	public int getJavafileCount() {
		return javafileCount;
	}
	public void setJavafileCount(int javafileCount) {
		this.javafileCount = javafileCount;
	}
	private int lineCount;
    private int fileCount;
    private int javafileCount;

}
