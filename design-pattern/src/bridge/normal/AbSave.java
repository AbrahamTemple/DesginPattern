package bridge.normal;

//抽象存储方式
public abstract class AbSave implements Save{

	ISave saveData;

	public AbSave(ISave saveData){
		this.saveData = saveData;
	}

	public abstract void save(Object data);
}
