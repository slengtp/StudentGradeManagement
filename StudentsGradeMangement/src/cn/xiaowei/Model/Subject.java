package cn.xiaowei.Model;

//ѧ��ģ�ͣ�����Model��
public class Subject {

	//˽�г�Ա�����γ�ID���γ������ο���ʦ����ʱ
	private int subjectId;
	private String subjectName;
	private String subjectTeacher;
	private int subjectClassNumber;

	//get set����
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
