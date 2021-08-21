package bridge.simple;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.21
 * @GitHub https://github.com/AbrahamTemple/
 * @description:
 */ //抽象
abstract class Computer implements Hardware{

	Cpu cpu;

	public Computer(Cpu cpu){
		this.cpu = cpu;
	}

	public abstract String describe();

}
