package org.javamentor.java.practice;

import static org.junit.Assert.fail;

import java.lang.reflect.Method;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

/**
 * Test class for unit testing
 * 
 * @author dhruba(@javamentor-lab)
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(SampleMain.class)
public class SampleMainTest {

	@Test
	public void testDisplayBanner() {
		try {
			Method method = Whitebox.getMethod(SampleMain.class, "displayBanner");
			method.invoke(null);
		} catch (Exception e) {
			e.printStackTrace();
			fail("Test case failed");
		}
	}

}
