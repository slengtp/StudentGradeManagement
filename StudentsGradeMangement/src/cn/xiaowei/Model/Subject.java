package cn.xiaowei.Model;

//学科模型，属于Model层
public class Subject {

	//私有成员包括课程ID，课程名，任课老师，课时
	private int subjectId;
	private String subjectName;
	private String subjectTeacher;
	private int subjectClassNumber;

	//get set方法
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getSubjectTeacher() {
		return subjectTeacher;
	}
	public void setSubjectTeacher(String subjectTeacher) {
		this.subjectTeacher = subjectTeacher;
	}
	public int getSubjectClassNumber() {
		return subjectClassNumber;
	}
	public void setSubjectClassNumber(int subjectClassNumber) {
		this.subjectClassNumber = subjectClassNumber;
	}
	
}
