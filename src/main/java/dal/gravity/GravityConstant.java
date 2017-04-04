package dal.gravity;

public class GravityConstant implements GravityModel {
	
	private double grv;
	
	public GravityConstant(double grv){
		this.grv = grv;
	}
	
	@Override
	public double getGravitationalField(){
		return grv;
	}
}
