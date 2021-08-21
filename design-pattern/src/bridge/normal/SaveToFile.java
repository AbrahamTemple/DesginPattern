package bridge.normal;

//文件存储
public class SaveToFile implements ISave {

	@Override
	public void save(Object data) {
		System.out.println(data + "---存储到文件");
	}
}
