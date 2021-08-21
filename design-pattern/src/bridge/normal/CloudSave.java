package bridge.normal;

//云端存储
public class CloudSave extends AbSave {

	public CloudSave(ISave saveData) {
		super(saveData);
	}

	@Override
	public void save(Object data) {
		System.out.print("云端存储：");
		saveData.save(data);
	}
}
