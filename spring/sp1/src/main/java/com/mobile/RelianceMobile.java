package com.mobile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sim.AirtelSim;
import com.sim.IdeaSim;
import com.sim.RelianceSim;
import com.sim.Sim;
import com.sim.VodafoneSim;

public class RelianceMobile {
	private ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	private Sim s= context.getBean(Sim.class);
			
	
	public RelianceMobile()
	{
		startMobile();
		try {			
		s.startSim();
		}
		catch (NullPointerException e) {
			System.out.println("Insert Sim!");;
		}
	}
	private void startMobile() {
		System.out.println("Welcome to reliance mobile");
	}
}
