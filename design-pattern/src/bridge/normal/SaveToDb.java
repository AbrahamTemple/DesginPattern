package bridge.normal;

//数据库存储
public class SaveToDb implements ISave {

	@Override
	public void save(Object data) {
		System.out.println(data + "---存储到数据库");
	}
}
