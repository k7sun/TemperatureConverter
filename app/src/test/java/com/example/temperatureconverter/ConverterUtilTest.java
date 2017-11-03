package com.example.temperatureconverter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kyle on 11/2/17.
 */

public class ConverterUtilTest {
    @Test
    public void testConvertFahrenheitToCelsius() throws Exception {
        float boilingPointActual = ConverterUtil.convertFahrenheitToCelsius(212);
        float boilingPointExpected = 100;
        assertEquals("Conversion from fahrenheit to celsius failed",
                boilingPointExpected, boilingPointActual, 0.001);
    }

    @Test
    public void testConvertCelsiusToFahrenheit() throws Exception {
        float boilingPointActual = ConverterUtil.convertCelsiusToFahrenheit(100);
        float boilingPointExpected = 212;
        assertEquals("Conversion from celsius to fahrenheit failed",
                boilingPointExpected, boilingPointActual, 0.001);
    }
}
