public class Main{
	public static void main(String[] args){
		double[] data = {1.5,
						 1.3,
						 1.2,
						 1.5,
						 1.7,
						 2.0,
						 1.2,
						 1.8,
						 1.9,
						 1.4};
		Tendance t = new Tendance(data);
		System.out.println(t.getAverage());
		t.addData(2.0);
		System.out.println(t.getAverage());
		System.out.println();
		t.getData();
	}
}