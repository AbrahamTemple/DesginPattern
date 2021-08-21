package facade.normal;
public class Test {

	public static void main(String args[]){
		Object info = ProductSalesman.instance.buySomething("地狱把妹王", "人间", "K1234523");
		System.out.println(info);
	}
}
