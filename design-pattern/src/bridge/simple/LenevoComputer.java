package bridge.simple;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.21
 * @GitHub https://github.com/AbrahamTemple/
 * @description:
 */ //细化抽象*2
class LenevoComputer extends Computer {
	public LenevoComputer(Cpu cpu) {
		super(cpu);
	}
	@Override
	public String describe() {
		return "联想笔记本---"+super.cpu.describe();
	}
}
