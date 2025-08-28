package lambdaTest;

public class CalcResult {
	private int add;
	private int murtiple;
	private int subtract;
	private double devide;
	
	public CalcResult() {;}
	
	public CalcResult(int add, int murtiple, int subtract, double devide) {
		super();
		this.add = add;
		this.murtiple = murtiple;
		this.subtract = subtract;
		this.devide = devide;
	}
	
	public int getAdd() {
		return add;
	}
	public void setAdd(int add) {
		this.add = add;
	}
	public int getMurtiple() {
		return murtiple;
	}
	public void setMurtiple(int murtiple) {
		this.murtiple = murtiple;
	}
	public int getSubtract() {
		return subtract;
	}
	public void setSubtract(int subtract) {
		this.subtract = subtract;
	}
	public double getDevide() {
		return devide;
	}
	public void setDevide(double devide) {
		this.devide = devide;
	}
	
	
	
	
}
