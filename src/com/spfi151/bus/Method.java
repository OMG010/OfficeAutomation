package com.spfi151.bus;

import org.aspectj.lang.ProceedingJoinPoint;

public class Method {
public void qianduan(){
	System.out.println("������");
}
public  void houduan(){
	System.out.println("������");
}
public void zhouwei(ProceedingJoinPoint pjp) throws Throwable{
	System.out.println("�������¼�����");
	pjp.proceed();
	System.out.println("�����������Ƕΰ�");
}
public void yichang(){
	System.out.println("һ����Ҳû�÷���R�˸���");
}
public void zuizhong(){
	System.out.println("��ֻ��ִ���꣬���������Ϊ��");
}
}
