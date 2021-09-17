import java.util.Scanner;

public class SphereVolume {
	public static void main(String[] args) {
		//add declaration here
		Scanner sph = new Scanner(System.in);
		double diam;
		double rad;
		double vol;
		
		System.out.println("In this program, we will calculate the volume of a sphere through your given diameter\n");
		System.out.println("What is the diameter of the sphere?");
		diam = sph.nextDouble();
		rad = diam / 2;
		vol = (4 * Math.PI * Math.pow(rad, 3)) / 3;
		System.out.println("The volume of your given sphere is\n" + vol);
	}
}
