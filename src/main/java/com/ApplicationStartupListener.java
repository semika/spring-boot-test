/**
 * 
 */
package com;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author semika
 *
 */
public class ApplicationStartupListener implements ApplicationListener<ApplicationStartingEvent>   {

	@Override
	public void onApplicationEvent(ApplicationStartingEvent event) {
		System.out.println("Starting up application >>>>>>>>>>>>>>>>>>>. " + event.getTimestamp());
	} 
	
}
