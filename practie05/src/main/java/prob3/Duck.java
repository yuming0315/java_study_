package prob3;

public class Duck extends Bird {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.printf("오리(%s)는 날지않습니다.\n", getName());
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.printf("오리(%s)가 소리내어 웁니다.\n", getName());
	}

	@Override
	public String toString() {
		return "오리의 이름은 "+getName()+" 입니다.";
	}

}
