package bridge.normal;

//本地存储
public class LocalSave extends AbSave {

	public LocalSave(ISave saveData) {
		super(saveData);
	}

	@Override
	public void save(Object data) {
		System.out.print("本地存储：");
		saveData.save(data);
	}
}
