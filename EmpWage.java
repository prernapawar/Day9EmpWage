package com.bridgelabz.empWage;
/**
 * @author Prerna
 *
 */
public class EmpWage {
		final static int PART_TIME = 1;
		final static int FULL_TIME=2;
		private int partTimeHrs;

		private int fullTimeHrs;
		private String Company;
		private int WAGE_PER_HRS;
		private int DAY_PER_MONTH;
		private  int MAX_HRS;

		public EmpWage (String Company, int fullTimeHrs, int partTimeHrs, int WAGE_PER_HRS, int DAY_PER_MONTH, int MAX_HRS)
		{
			this.Company=Company;
			this.partTimeHrs=partTimeHrs;
			this.fullTimeHrs=fullTimeHrs;
			this.WAGE_PER_HRS=WAGE_PER_HRS;	
			this.DAY_PER_MONTH=DAY_PER_MONTH;
			this.MAX_HRS=MAX_HRS;
		}
        private void dispCompanyInfo() {
			System.out.println("Company name   : "+Company);
			System.out.println("Full Day hours : "+fullTimeHrs);
			System.out.println("Part Day hours : "+partTimeHrs);
			System.out.println("Working days in month : "+DAY_PER_MONTH);
			System.out.println("Wage Per Hr : "+WAGE_PER_HRS);
		}

		private void Attendance() {
        	int fullTime = 1;
			double empCheck= Math.floor(Math.random()*10)%2;
			if ( fullTime == empCheck )
				System.out.println("emp is present");

			else
				System.out.println("emp is absent");
		}
		
		private double CalculateDailyWage() {
			int empCheck= (int) Math.floor(Math.random()*10)%2+1;
			double empWage=0;
			switch (empCheck) {

			case FULL_TIME:
				empWage=fullTimeHrs*WAGE_PER_HRS;
				break;
			case PART_TIME:
				empWage=partTimeHrs*WAGE_PER_HRS;
				break;
			}	

			return empWage;	
		}
		private double calcMonthlyWage() {

			int empCheck= (int) Math.floor(Math.random()*10)%2+1;
			double monthlyWage=0;
			switch (empCheck) {

			case FULL_TIME:
				monthlyWage=fullTimeHrs*WAGE_PER_HRS*DAY_PER_MONTH;
				break;
			case PART_TIME:
				monthlyWage=partTimeHrs*WAGE_PER_HRS*DAY_PER_MONTH;
				break;
			}
			return monthlyWage;

		}
        private double maxEmpWage() {
        	int empCheck= (int) Math.floor(Math.random()*10)%2+1;
			double maxWage=0;
			int countHrs=0;
			int countDay=0;
			while (countHrs<MAX_HRS && countDay<DAY_PER_MONTH) {
				switch (empCheck) {

				case FULL_TIME:
					maxWage=fullTimeHrs*WAGE_PER_HRS*DAY_PER_MONTH;
					maxWage+=maxWage;
					countHrs+=8;
					countDay++;

					break;
				case PART_TIME:
					maxWage=partTimeHrs*WAGE_PER_HRS*DAY_PER_MONTH;
					maxWage+=maxWage;
					countHrs+=8;
					countDay++;
					break;
				}
			}
			return maxWage;
		}
        public static void main (String []args) {

			System.out.println("welcome to employeewage");
			EmpWage Company1 =new EmpWage("Company1",8,8,20,20,100);

			Company1.Attendance();
			Company1.CalculateDailyWage();
			Company1.calcMonthlyWage();
			Company1.maxEmpWage();
			Company1.dispCompanyInfo();
			EmpWage Company2 = new EmpWage("Company2",12,6,25,26,150);
			Company2.Attendance();
			Company2.CalculateDailyWage();
			Company2.calcMonthlyWage();
			Company2.maxEmpWage();
			Company2.dispCompanyInfo();
    }
}
