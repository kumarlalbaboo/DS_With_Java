package com.logical.test.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Worker1 implements Runnable {
	@Override
	public void run() {
		Processor.getInstance();

	}

}

class Worker2 implements Runnable {
	@Override
	public void run() {

		Processor.getInstance();

	}

}

public class Processor implements Cloneable, Serializable {
	private static Processor instance;

	private Processor() {
		System.out.println("from constructor");
		// below code for avoid create object using reflection api
		if (instance != null) {
			throw new IllegalStateException("not create object using reflection api");
		}
	}

	public synchronized static Processor getInstance() {
		/*
		 * if(instance==null) { instance=new Processor(); }
		 * 
		 * return instance;
		 */

		if (instance == null) {
			synchronized (Processor.class) {
				if (instance == null) {
					instance = new Processor();
				}

			}
		}
		return instance;

	}

	// Avoid to create object using clone method
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("cant create object using clone");
	}

	// avoid to create object using serializable method
	public Object readResolver() {
		return instance;

	}

	public static void main(String[] args)
			throws CloneNotSupportedException, FileNotFoundException, IOException, ClassNotFoundException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		/*
		 * Processor.getInstance(); Processor.getInstance(); Processor.getInstance();
		 */

		// try to create object using thread
		Worker1 w1 = new Worker1();
		Thread t1 = new Thread(w1);
		Worker2 w2 = new Worker2();
		Thread t2 = new Thread(w2);
		t1.start();
		t2.start();

		// try to create object using clonable
		Processor p = Processor.getInstance();
		System.out.println(p.clone().hashCode());

		// try to create object using serialization
		Processor ps = Processor.getInstance();
		ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("ser.txt"));
		obj.writeObject(ps);
		obj.close();
		System.out.println(ps.hashCode());

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ser.txt"));
		Processor pl = (Processor) ois.readObject();
		Processor output = (Processor) pl.readResolver();
		ois.close();
		System.out.println(output.hashCode());

		// try to create object using reflection api //here accessing private
		// constructor

		Class cls = Processor.class;
		Constructor[] cons = cls.getDeclaredConstructors();
		cons[0].setAccessible(true);
		Processor pro = (Processor) cons[0].newInstance();
		System.out.println("from reflection" + pro.hashCode());

	}

}
