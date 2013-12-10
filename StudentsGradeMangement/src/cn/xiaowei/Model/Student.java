package cn.xiaowei.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;


//学生类，用于存储学生的个人信息，属于Model层
public class Student {
	//定义了学生的ID，姓名，年龄，入学时间，选择的课程集合
	private int studentId;
	private String studentName;
	private int studentAge;
	private Date studentInDate;
	private ArrayList<Subject> studentClassChosen;	//存储了一个学生所有选择的课程
	
	//定义构造函数
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
	
	//添加课程
	public void addClass(Subject subject){
		
		studentClassChosen.add(subject);
		
	}
	
	//删除课程
	public void deleteClass(Subject subject){
		
		//先要遍历，找到第几个是要删除的东西
		Iterator<Subject> classIterator = getStudentClassChosen().iterator();
		
		int index = -1;
		
		while(classIterator.hasNext()){
		
			Subject tempSubject = classIterator.next();
			
			//第一个为subject 0;
			index++;
			
			if(tempSubject.getSubjectId() == subject.getSubjectId()){
				
				//找到了要删除的subject
				this.studentClassChosen.remove(index);
				break;
				
			}
		}
	}
	
	//修改某个课程
	public void updateClass(Subject subject){
		
		//首先执行删除过程，接着再进行插入操作
		//如果删除失败，则同样也进行插入操作
		//修改的依据是subject的id
		
		deleteClass(subject);
		addClass(subject);
		
	}
	
	
	//get set方法
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
