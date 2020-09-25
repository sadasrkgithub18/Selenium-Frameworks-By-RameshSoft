package com.rameshsoft.selenium.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class AnnotationRetry implements IAnnotationTransformer
{
	@Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod)
	{
        IRetryAnalyzer analyzer = annotation.getRetryAnalyzer();
        
        if(analyzer == null)
        {
        	annotation.setRetryAnalyzer(CustomRetryAnalyzer.class);
        }
    }
	
}
