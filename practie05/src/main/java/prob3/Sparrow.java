package prob3;

public class Sparrow extends Bird {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.printf("참새(%s)는 날아다닙니다.\n", getName());
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.printf("참새(%s)가 소리내어 웁니다.\n", getName());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "참새의 이름은 "+getName()+" 입니다.";
	}

}
