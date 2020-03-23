package homework13;

import java.util.Scanner;

public class Deputy extends Person {
	
		private String lastName;
		private String firstName;
		private int age;
		private boolean grafter;
		private int sizeOfbribe;
		public Deputy(int weight, int height, String lastName, String firstName, int age, boolean grafter) {
			super(weight, height);
			this.lastName = lastName;
			this.firstName = firstName;
			this.age = age;
			this.grafter = grafter;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public boolean isGrafter() {
			return grafter;
		}
		public void setGrafter(boolean grafter) {
			this.grafter = grafter;
		}
		public int getSizeOfbribe() {
			return sizeOfbribe;
		}
		public void setSizeOfbribe(int sizeOfbribe) {
			this.sizeOfbribe = sizeOfbribe;
		}
		
		@Override
		public String toString() {
			return "Deputy [lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + ", grafter=" + grafter
					+ ", sizeOfbribe=" + sizeOfbribe + "]";
		}
		public void brib() {
			if(!grafter) {
				System.out.println("This deputy is not grafter");
			}
			else {
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter size of brib: ");
				sizeOfbribe = scan.nextInt();
				if(sizeOfbribe >= 5000) {
					System.out.println("Police will imprison the deputy");					
				}
				else {
					this.sizeOfbribe=sizeOfbribe;
				}
			}
		}
}
