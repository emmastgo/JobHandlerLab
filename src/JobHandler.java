public class JobHandler {

	/**
	 * A method that returns the rank of an employee.
	 * A rank is determined by the user's current salary
	 * and the number of warnings received:
	 * 1. According to the salary the following are the determined ranks:
	 * 		a) If the salary is less than 10,000 the rank is 20
	 * 		b) If the salary is less than 50,000 the rank is 40
	 * 		c) If the salary is less than 100,000 the rank is 60
	 * 		d) More or equal than 100,000 the rank is 80
	 * 2. Warnings determine a penalty on the awarded rank,
	 * 	  the penalties are the following:
	 * 		a) If the employee has no warnings the rank is not decreased 
	 * 		b) If the employee has 1 warning the rank is decreased by 5
	 * 		c) If the employee has 2 warnings the rank is decreased by 10
	 * 		d) If the employee has 3 warnings the rank is decreased by 15 
	 * 		e) If the warnings are more than 3 the decrease is determined 
	 * 		   by the next equation: totalDecrease = warnings*6
	 * @param person 
	 * @return (currentRank - warningDeRank)
	 */
	public static int rank(int warningTotals, double yearlySalary) {
		int currentRank = 0;
		int warningDeRank = 0;




		if( yearlySalary < 10000){
			currentRank = 20;
		}
		else if(yearlySalary < 50000){
			currentRank = 40;}

		else if(yearlySalary < 100000){
			currentRank = 60;}

		else if (yearlySalary >= 100000){
			currentRank = 80;}



		switch(warningTotals){

		case 0 :
			currentRank = currentRank-0;

			break;

		case 1 :
			currentRank = currentRank-5;

			break;

		case 2 : 
			currentRank = currentRank-10;

			break;

		case 3 : 
			currentRank = currentRank-15;

			break;

		default : 
			currentRank = currentRank - warningTotals*6;

			//code
			break;

		}	return currentRank - warningDeRank;


	}


	//Add Code Here [You have to use Switch and If/Else to get graded] 


	/**
	 * A method that helps determine if an employee qualifies for a job.
	 * To determine if the employee qualifies we need to meet the following requirements:
	 * 1. The job must me available
	 * 2. The employee's rank must be higher than 0
	 * 3. To know if an employee qualify,
	 *    simply check if the employee rank is higher or equal to the job's rank
	 * 		a) If the user has a seniority of 1, the user gains a 5 rank bonus
	 * 		b) If the user has a seniority of 2, the user gains a 10 rank bonus
	 * 		c) If the user has a seniority of 3, the user gains a 20 rank bonus
	 * 		b) Otherwise there is no bonus.
	 * 4. If the employee doesn't meet requirement 3, if the position is temporal 
	 *    they can still qualify for the position.
	 * @param job
	 * @param person
	 * @return
	 */
	public static boolean promotionQualify(boolean availability, boolean jobType, int jobRank, int eRank, int seniority) {
		boolean qualify = false;
		if(!availability){ return qualify;}
		if(eRank <= 0) { return qualify;}

		switch(seniority){

		case 1 :
			jobRank = jobRank + 5;

			break;

		case 2 :
			jobRank = jobRank + 10;

			break;

		case 3 : 
			jobRank = jobRank + 20;

			break;

		default : 
			jobRank = jobRank - 0;

			//code
			break;
		}




		if( seniority == 0 || seniority > 3 || jobType == false){
			qualify = true;}

		else {
			qualify = false;}


		return qualify; 

	}
}
