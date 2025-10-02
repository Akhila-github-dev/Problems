package abstractproblems;
abstract class Student{
	private String name;
	private int[] test;
	private String result;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getTest() {
		return test;
	}
	public void setTest(int[] test) {
		this.test = test;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	public Student(String studnetname) {
		this.name=studnetname;
	}
	public abstract void generateResult() ;
	public void setTestScore(int testNumber,int testScore){
		if(testNumber>=0 && testNumber<test.length)
		test[testNumber]=testScore;
	}
}

class UndergraduateStudent extends Student{

	public UndergraduateStudent(String studnetname) {
		super(studnetname);
		
	}
	

	@Override
	public void generateResult() {
		int totalmarks=0;
		for(int score:getTest()) {
			totalmarks+=score;
			if(score<50) {
				setResult("fail");
				return;
			}
		}
		int avg=totalmarks/getTest().length;
		if(avg>=60) {
			setResult("pass");
		}else if(avg<60) {
			setResult("fail");
		}
		
	}
}

class GraduateStudent extends Student{

	public GraduateStudent(String studnetname) {
		super(studnetname);
	
	}


	@Override
	public void generateResult() {
		int totalmarks=0;
		for(int score:getTest()) {
			totalmarks+=score;
			if(score<50) {
				setResult("fail");
				return;
			}
		}
		int avg=totalmarks/getTest().length;
		if(avg>=70) {
			setResult("pass");
		}else if(avg<70) {
			setResult("fail");
		}
		
	}
}

