import java.util.*;
class Complex
{
	double real;
	double img;
	Complex()
	{
		real = 0.0;
		img = 0.0;
	}
	Complex(double real, double img){
		this.real = real;
		this.img = img;
	}
	void displayComplexNum(){
		System.out.println("Complex Number \nReal Part: "+real+"\nImaginary Part: "+img);
	}
	void addComplexNum(Complex v1, Complex v2){
		real = v1.real + v2.real;
		img = v1.img + v2.img;
	}
	void subComplexNum(Complex v1, Complex v2){
		real = v1.real - v2.real;
		img = v1.img - v2.img;
	}
	void mulComplexNum(Complex v1, Complex v2){
		real = v1.real*v2.real - v1.img*v2.img;
		img = v1.real*v2.img + v1.img*v2.real;
	}
	void divComplexNum(Complex v1, Complex v2){
		double dn = Math.pow(v2.real, 2)+Math.pow(v2.img, 2);
		real = (v1.real*v2.real + v2.img*v1.img)/dn;
		img = (v1.img*v2.real - v2.img*v1.real)/dn;
	}
}

class ComplexNo{
	public static void main(String []args)
	{
		Complex ob1 = new Complex(5.0, 4.0);
		ob1.displayComplexNum();
		Complex ob2 = new Complex(7.0, 3.0);
		ob2.displayComplexNum();
		Complex ob = new Complex();
		ob.displayComplexNum();
		System.out.println("1. add\n2. sub\n3. mul\n4. div\nEnter: ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
	
		System.out.println("\nEnter: ");
		switch(choice)
		{
			case 1:ob.addComplexNum(ob1, ob2);
			ob.displayComplexNum();
			break;
			case 2:ob.subComplexNum(ob1, ob2);
			ob.displayComplexNum();
			break;
			case 3:ob.mulComplexNum(ob1, ob2);
			ob.displayComplexNum();
			break;
			case 4:ob.divComplexNum(ob1, ob2);
			ob.displayComplexNum();
			break;
			default:
			System.out.println("Invalid Choice");
			break;
		}
        
    }
}
		/*if (choice == 1){
			ob.addComplexNum(ob1, ob2);
			ob.displayComplexNum();
		}
		else if (choice == 2){
			ob.subComplexNum(ob1, ob2);
			ob.displayComplexNum();
		}
		else if (choice == 3){
			ob.mulComplexNum(ob1, ob2);
			ob.displayComplexNum();
		}
		else if (choice == 4){
			ob.divComplexNum(ob1, ob2);
			ob.displayComplexNum();
		}
		else{
			System.out.println("Invalid Choice");/* */
		
