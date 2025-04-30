package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Student;

import com.kh.hw.person.model.vo.Employee;

public class PersonController {
	
    private Student[] s = new Student[3]; // 학생 객체 배열
    private Employee[] e = new Employee[10]; // 사원 객체 배열
    private int studentCount = 0; // 학생 수
    private int employeeCount = 0; // 사원 수
    
    public int[] personCount() {
        int [] arr = new int[2];
        //배열의 인덱스에 들어간 값이 null이라면 저장되지 않은 인덱스
        
        for(int i = 0 ; i< s.length; i++) {
        	if(s[i] !=null) {
        		//초기화가 완료된 인덱스
        		arr[0] += 1;
        	}
        }
        for(Employee emp : e) {
        	if (emp != null) {
        		arr[1] =+ 1;
        	}
        }
        return arr;
  	   	//int[] count = {studentCount, employeeCount};
        //return count;
    }
    
    public void insertStudent(String name, int age, int grade, String major) {
    	
    	Student std = new Student(name,age,grade,major);
    	
    		for(int i = 0; i < s.length; i++) {
    			if(s[i] == null) { // 비어있는 공간 찾기
    				s[i] = std;
    				break;
    			}
    		}
        /*if (studentCount < s.length) {
           s[studentCount++] = new Student(name, age, grade, major);
        }*/
    }
    
    public Student[] printStudent() {
   
        return s;
    }
    
    public void insertEmployee(String name, int age, int salary, String dept) {
        
    	if (employeeCount < e.length) {
        	
            e[employeeCount++] = new Employee();
        }
    }
    
    public Employee[] printEmployee() {
        return e;
    }
}