package bridge.simple;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.21
 * @GitHub https://github.com/AbrahamTemple/
 * @description:
 */
class HaseeComputer extends Computer {
	public HaseeComputer(Cpu cpu) {
		super(cpu);
	}
	@Override
	public String describe() {
		return "神舟笔记本---"+super.cpu.describe();
	}
}
