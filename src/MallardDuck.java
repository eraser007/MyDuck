
public class MallardDuck extends Duck {//野生鸭子
 
	public MallardDuck() {
		quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
	}
 
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}