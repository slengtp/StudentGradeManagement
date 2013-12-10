package cn.xiaowei.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;


//ѧ���࣬���ڴ洢ѧ���ĸ�����Ϣ������Model��
public class Student {
	//������ѧ����ID�����������䣬��ѧʱ�䣬ѡ��Ŀγ̼���
	private int studentId;
	private String studentName;
	private int studentAge;
	private Date studentInDate;
	private ArrayList<Subject> studentClassChosen;	//�洢��һ��ѧ������ѡ��Ŀγ�
	
	//���幹�캯��
	public Student(){
	
		studentClassChosen = new ArrayList<Subject>();
	}
	
	public Student(int id, String name, int age, Date date, ArrayList<Subject> classChosen){
		
		this.studentId = id;
		this.studentName = name;
		this.studentAge = age;
		this.studentInDate = date;
		
		this.studentClassChosen = new ArrayList<Subject>();
		studentClassChosen = classChosen;
	}
	
	//��ӿγ�
	public void addClass(Subject subject){
		
		studentClassChosen.add(subject);
		
	}
	
	//ɾ���γ�
	public void deleteClass(Subject subject){
		
		//��Ҫ�������ҵ��ڼ�����Ҫɾ���Ķ���
		Iterator<Subject> classIterator = getStudentClassChosen().iterator();
		
		int index = -1;
		
		while(classIterator.hasNext()){
		
			Subject tempSubject = classIterator.next();
			
			//��һ��Ϊsubject 0;
			index++;
			
			if(tempSubject.getSubjectId() == subject.getSubjectId()){
				
				//�ҵ���Ҫɾ����subject
				this.studentClassChosen.remove(index);
				break;
				
			}
		}
	}
	
	//�޸�ĳ���γ�
	public void updateClass(Subject subject){
		
		//����ִ��ɾ�����̣������ٽ��в������
		//���ɾ��ʧ�ܣ���ͬ��Ҳ���в������
		//�޸ĵ�������subject��id
		
		deleteClass(subject);
		addClass(subject);
		
	}
	
	
	//get set����
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public Date getStudentInDate() {
		return studentInDate;
	}
	public void setStudentInDate(Date studentInDate) {
		this.studentInDate = studentInDate;
	}
	public ArrayList<Subject> getStudentClassChosen() {
		return studentClassChosen;
	}
	public void setStudentClassChosen(ArrayList<Subject> studentClassChosen) {
		this.studentClassChosen = studentClassChosen;
	}
	
	
}
