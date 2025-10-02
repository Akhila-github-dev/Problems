package abstractproblems;
class Tester{
	public static void main(String[] args) {
		GraduateStudent graduateStudent=new GraduateStudent("ajay");
//		graduateStudent.setTestScore(0, 70);
//		graduateStudent.setTestScore(1, 69);
//		graduateStudent.setTestScore(2, 71);
//		graduateStudent.setTestScore(3, 55);
		int gra[]= {90,82,90,56};
		graduateStudent.setTest(gra);
		graduateStudent.generateResult();
		System.out.println(graduateStudent.getName() +"  "+graduateStudent.getResult());
		
	}
}