package com.healthycoderapp;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class BMICalculatorTest {
	
	private String environment = "prod";

	@BeforeAll
	static void beforeAll() {
		System.out.println("Before all unit tests");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("After all unit tests");
	}
	
	@Nested
	class IsDietRecommendedTest {
		
		@ParameterizedTest(name = "weight={0}, height={1}")
		@CsvFileSource(resources = "/diet-recommended-input-data.csv", numLinesToSkip=1)
		void should_ReturnTrue_When_DietRecommended(Double coderWeight, Double coderHeight) {
			// given
			double weight = coderWeight;
			double height = coderHeight;

			// when
			boolean recommended = BMICalculator.isDietRecommended(weight, height);

			// then
			assertTrue(recommended);
		}

		@Test
		void should_ReturnFalse_When_DietNotRecommended() {
			// given
			double weight = 50.0;
			double height = 1.92;

			// when
			boolean recommended = BMICalculator.isDietRecommended(weight, height);

			// then
			assertFalse(recommended);
		}

		@Test
		void should_ThrowArithmeticException_When_HeightZero() {
			// given
			double weight = 50.0;
			double height = 0.00;

			// when
			Executable executable = () -> BMICalculator.isDietRecommended(weight, height);

			// then
			assertThrows(ArithmeticException.class, executable);
		}
	
	}
	
	@Nested
	@DisplayName("{}{{}} sample inner class display name")
	class FindCoderWithWorstBMITests {
		
		@Test
		@DisplayName(">>> sample method display name")
		@DisabledOnOs(OS.LINUX)
		void should_ReturnCoderWithWorstBMI_When_CoderListNotEmpty() {

			// given
			List<Coder> coders = new ArrayList<>();
			coders.add(new Coder(1.80, 60.0));
			coders.add(new Coder(1.82, 98.0));
			coders.add(new Coder(1.82, 64.7));

			// when
			Coder coderWorstBMI = BMICalculator.findCoderWithWorstBMI(coders);

			// then
			assertAll (
					() -> assertEquals(1.82, coderWorstBMI.getHeight()),
					() -> assertEquals(98.0, coderWorstBMI.getWeight())
			);
		}
		
		@Test
		void should_ReturnCoderWithWorstBMIIn1Ms_When_CoderList_Has10000Elements() {
			
			// given
			assumeTrue(BMICalculatorTest.this.environment.equals("prod"));
			List<Coder> coders = new ArrayList<>();
			for (int i=0; i < 10000; i++) {
				coders.add(new Coder(1.0 + i, 10.0 + i));
			}
			
			// when
			Executable executable = () -> BMICalculator.findCoderWithWorstBMI(coders);
			
			// then
			assertTimeout(Duration.ofMillis(500), executable);
			
		}

		@Test
		void should_ReturnNullWithWorstBMICoder_When_CoderListEmpty() {

			// given
			List<Coder> coders = new ArrayList<>();

			// when
			Coder coderWorstBMI = BMICalculator.findCoderWithWorstBMI(coders);

			// then
			assertNull(coderWorstBMI);
		}
		
	}
	
	@Nested
	class GetBMIScoresTests {
		
		@Test
		void shoyuld_ReturnCorrrectBMIScoreArray_When_CoderListNotEmpty() {
			// given
			List<Coder> coders = new ArrayList<>();
			coders.add(new Coder(1.80, 60.0));
			coders.add(new Coder(1.82, 98.0));
			coders.add(new Coder(1.82, 64.7));
			double[] expected = {18.52, 29.59, 19.53};
			
			// when
			double[] bmiScores = BMICalculator.getBMIScores(coders);
			
			// then
			assertArrayEquals(expected, bmiScores);
		}
		
	}

}
