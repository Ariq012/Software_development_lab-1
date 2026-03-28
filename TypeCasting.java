public class TypeCasting{
	public static void main(String args[]){
		int myScore=333;
		double maxScore=500;

		double percentage = (double) myScore / maxScore * 100d;

		System.out.println(percentage);
	}
}
