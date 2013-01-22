package com.tinybox.numbie.test.models;

import java.lang.reflect.Field;

import com.tinybox.numbie.models.Game;

import android.test.suitebuilder.annotation.SmallTest;
import junit.framework.TestCase;

public class GameTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@SmallTest
	public void testSouldHaveMaxAttemptsNumField() throws NoSuchFieldException {
		Field maxAttemptsNum = Game.class.getDeclaredField("MAX_ATTEMPTS_NUM");
		assertNotNull(maxAttemptsNum);
		assertEquals(int.class, maxAttemptsNum.getGenericType());
	}
	
	@SmallTest
	public void testSouldHaveMaxClosingTimeField() throws NoSuchFieldException {
		Field maxClosingTime = Game.class.getDeclaredField("MAX_CLOSING_TIME");
		assertNotNull(maxClosingTime);
		assertEquals(int.class, maxClosingTime.getGenericType());
	}
	
	@SmallTest
	public void testShouldHaveNumbieNumberFiled() throws NoSuchFieldException {
		Field numbieNumber = Game.class.getDeclaredField("numbieNumber");
		assertNotNull(numbieNumber);
		assertEquals(String.class, numbieNumber.getGenericType());
	}
	
	@SmallTest
	public void testShouldHaveAttemptsField() throws NoSuchFieldException {
		Field attempts = Game.class.getDeclaredField("attempts");
		assertNotNull(attempts);
		assertEquals(int.class, attempts.getGenericType());
	}
	
	@SmallTest
	public void testShouldHaveClosingTimeField() throws NoSuchFieldException {
		Field closingTime = Game.class.getDeclaredField("closingTime");
		assertNotNull(closingTime);
		assertEquals(int.class, closingTime.getGenericType());
	}
	
	@SmallTest
	public void testShouldCreateStartupGameObject() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		Game myTestGame = new Game();
		Class<? extends Game> gameClassObject = myTestGame.getClass();
		
		Field numbieNumber = gameClassObject.getDeclaredField("numbieNumber");
		numbieNumber.setAccessible(true);
		assertNotNull(numbieNumber.get(myTestGame));
		assertEquals(3, numbieNumber.get(myTestGame).toString().length());
		
		Field attempts = gameClassObject.getDeclaredField("attempts");
		attempts.setAccessible(true);
		assertEquals(0, attempts.getInt(myTestGame));
		
		Field closingTime = gameClassObject.getDeclaredField("closingTime");
		closingTime.setAccessible(true);
		assertEquals(0, attempts.getInt(myTestGame));
	}
	
	@SmallTest
	public void testShouldReturnAttemptsNumber() {
		Game myTestGame = new Game();
		assertEquals(0, myTestGame.getAttempts());
	}
	
	@SmallTest
	public void testShoudlReturnClosingTime() {
		Game myTestGame = new Game();
		assertEquals(0, myTestGame.getClosingTime());
	}

}
