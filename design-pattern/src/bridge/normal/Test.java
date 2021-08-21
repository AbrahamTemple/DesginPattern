package bridge.normal;
public class Test {
	public static void main(String args[]){
		Object data = "数据";
		ISave saveToDb = new SaveToDb();
		ISave saveToFile = new SaveToFile();
		new CloudSave(saveToDb).save(data);
		new CloudSave(saveToFile).save(data);
		new LocalSave(saveToDb).save(data);
		new LocalSave(saveToFile).save(data);
	}
}
