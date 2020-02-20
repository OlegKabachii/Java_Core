package homework_7;

public class Su_27 extends Airplane implements Accessibility{
	
	private int maxSpeed;
	private String color;

	public Su_27(int length, int width, int vekt, int maxSpeed, String color) {
		super(length, width, vekt);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	@Override
	public void TurboAcceleration() {
		this.maxSpeed=maxSpeed;
		int turboAcceleration = (int) (maxSpeed + Math.random() * 500);
		System.out.println("Турбо прискорення : " + turboAcceleration + "км/год ----- ТІКАЄМ!!!");
	}

	@Override
	public void StealthTechnology() {
		int stealthTime = (int) (Math.random() * 100);
		System.out.println("Літака не видно : " + stealthTime + "хв");
		
	}

	@Override
	public void NuclearStrike() {
		int nucklearBomb = (int) (Math.random() * 10);
		System.out.println("Буде скинуто : " + nucklearBomb + "бомб");
	}

}
