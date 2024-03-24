package com.example.springbatchessentials.config;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = {LoggingAspect.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class LoggingAspectTest {
    @Autowired
    private LoggingAspect loggingAspect;

    /**
     * Method under test: {@link LoggingAspect#logBeforeController(JoinPoint)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testLogBeforeController() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: MethodInvocation must not be null
        //   See https://diff.blue/R013 to resolve this issue.

        MethodInvocationProceedingJoinPoint joinPoint = new MethodInvocationProceedingJoinPoint(null);
        loggingAspect.logBeforeController(joinPoint);
    }

    /**
     * Method under test: {@link LoggingAspect#logBeforeController(JoinPoint)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testLogBeforeController2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.aspectj.lang.JoinPoint.getSignature()" because "joinPoint" is null
        //       at com.example.springbatchessentials.config.LoggingAspect.logBeforeController(LoggingAspect.java:19)
        //   See https://diff.blue/R013 to resolve this issue.

        loggingAspect.logBeforeController(null);
    }

    /**
     * Method under test: {@link LoggingAspect#logBeforeController(JoinPoint)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testLogBeforeController3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.aspectj.lang.Signature.getName()" because the return value of "org.aspectj.lang.JoinPoint.getSignature()" is null
        //       at com.example.springbatchessentials.config.LoggingAspect.logBeforeController(LoggingAspect.java:19)
        //   See https://diff.blue/R013 to resolve this issue.

        JoinPoint joinPoint = mock(JoinPoint.class);
        when(joinPoint.getSignature()).thenReturn(null);
        loggingAspect.logBeforeController(joinPoint);
    }

    /**
     * Method under test: {@link LoggingAspect#logBeforeController(JoinPoint)}
     */
    @Test
    public void testLogBeforeController4() {
        Signature signature = mock(Signature.class);
        when(signature.getName()).thenReturn("Name");
        JoinPoint joinPoint = mock(JoinPoint.class);
        when(joinPoint.getSignature()).thenReturn(signature);
        loggingAspect.logBeforeController(joinPoint);
        verify(joinPoint).getSignature();
        verify(signature).getName();
    }

    /**
     * Method under test: {@link LoggingAspect#logBeforeService(JoinPoint)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testLogBeforeService() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: MethodInvocation must not be null
        //   See https://diff.blue/R013 to resolve this issue.

        MethodInvocationProceedingJoinPoint joinPoint = new MethodInvocationProceedingJoinPoint(null);
        loggingAspect.logBeforeService(joinPoint);
    }

    /**
     * Method under test: {@link LoggingAspect#logBeforeService(JoinPoint)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testLogBeforeService2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.aspectj.lang.JoinPoint.getSignature()" because "joinPoint" is null
        //       at com.example.springbatchessentials.config.LoggingAspect.logBeforeService(LoggingAspect.java:24)
        //   See https://diff.blue/R013 to resolve this issue.

        loggingAspect.logBeforeService(null);
    }

    /**
     * Method under test: {@link LoggingAspect#logBeforeService(JoinPoint)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testLogBeforeService3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.aspectj.lang.Signature.getName()" because the return value of "org.aspectj.lang.JoinPoint.getSignature()" is null
        //       at com.example.springbatchessentials.config.LoggingAspect.logBeforeService(LoggingAspect.java:24)
        //   See https://diff.blue/R013 to resolve this issue.

        JoinPoint joinPoint = mock(JoinPoint.class);
        when(joinPoint.getSignature()).thenReturn(null);
        loggingAspect.logBeforeService(joinPoint);
    }

    /**
     * Method under test: {@link LoggingAspect#logBeforeService(JoinPoint)}
     */
    @Test
    public void testLogBeforeService4() {
        Signature signature = mock(Signature.class);
        when(signature.getName()).thenReturn("Name");
        JoinPoint joinPoint = mock(JoinPoint.class);
        when(joinPoint.getSignature()).thenReturn(signature);
        loggingAspect.logBeforeService(joinPoint);
        verify(joinPoint).getSignature();
        verify(signature).getName();
    }

    /**
     * Method under test: {@link LoggingAspect#logBeforeMapper(JoinPoint)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testLogBeforeMapper() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: MethodInvocation must not be null
        //   See https://diff.blue/R013 to resolve this issue.

        MethodInvocationProceedingJoinPoint joinPoint = new MethodInvocationProceedingJoinPoint(null);
        loggingAspect.logBeforeMapper(joinPoint);
    }

    /**
     * Method under test: {@link LoggingAspect#logBeforeMapper(JoinPoint)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testLogBeforeMapper2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.aspectj.lang.JoinPoint.getSignature()" because "joinPoint" is null
        //       at com.example.springbatchessentials.config.LoggingAspect.logBeforeMapper(LoggingAspect.java:29)
        //   See https://diff.blue/R013 to resolve this issue.

        loggingAspect.logBeforeMapper(null);
    }

    /**
     * Method under test: {@link LoggingAspect#logBeforeMapper(JoinPoint)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testLogBeforeMapper3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.aspectj.lang.Signature.getName()" because the return value of "org.aspectj.lang.JoinPoint.getSignature()" is null
        //       at com.example.springbatchessentials.config.LoggingAspect.logBeforeMapper(LoggingAspect.java:29)
        //   See https://diff.blue/R013 to resolve this issue.

        JoinPoint joinPoint = mock(JoinPoint.class);
        when(joinPoint.getSignature()).thenReturn(null);
        loggingAspect.logBeforeMapper(joinPoint);
    }

    /**
     * Method under test: {@link LoggingAspect#logBeforeMapper(JoinPoint)}
     */
    @Test
    public void testLogBeforeMapper4() {
        Signature signature = mock(Signature.class);
        when(signature.getName()).thenReturn("Name");
        JoinPoint joinPoint = mock(JoinPoint.class);
        when(joinPoint.getSignature()).thenReturn(signature);
        loggingAspect.logBeforeMapper(joinPoint);
        verify(joinPoint).getSignature();
        verify(signature).getName();
    }

    /**
     * Method under test: {@link LoggingAspect#logBefore(JoinPoint)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testLogBefore() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: MethodInvocation must not be null
        //   See https://diff.blue/R013 to resolve this issue.

        MethodInvocationProceedingJoinPoint joinPoint = new MethodInvocationProceedingJoinPoint(null);
        loggingAspect.logBefore(joinPoint);
    }

    /**
     * Method under test: {@link LoggingAspect#logBefore(JoinPoint)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testLogBefore2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.aspectj.lang.JoinPoint.getArgs()" because "joinPoint" is null
        //       at com.example.springbatchessentials.config.LoggingAspect.logBefore(LoggingAspect.java:34)
        //   See https://diff.blue/R013 to resolve this issue.

        loggingAspect.logBefore(null);
    }

    /**
     * Method under test: {@link LoggingAspect#logBefore(JoinPoint)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testLogBefore3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.aspectj.lang.Signature.getName()" because the return value of "org.aspectj.lang.JoinPoint.getSignature()" is null
        //       at com.example.springbatchessentials.config.LoggingAspect.logBefore(LoggingAspect.java:35)
        //   See https://diff.blue/R013 to resolve this issue.

        JoinPoint joinPoint = mock(JoinPoint.class);
        when(joinPoint.getArgs()).thenReturn(new Object[]{"Args"});
        when(joinPoint.getSignature()).thenReturn(null);
        loggingAspect.logBefore(joinPoint);
    }

    /**
     * Method under test: {@link LoggingAspect#logBefore(JoinPoint)}
     */
    @Test
    public void testLogBefore4() {
        Signature signature = mock(Signature.class);
        when(signature.getName()).thenReturn("Name");
        JoinPoint joinPoint = mock(JoinPoint.class);
        when(joinPoint.getArgs()).thenReturn(new Object[]{"Args"});
        when(joinPoint.getSignature()).thenReturn(signature);
        loggingAspect.logBefore(joinPoint);
        verify(joinPoint).getArgs();
        verify(joinPoint).getSignature();
        verify(signature).getName();
    }

    /**
     * Method under test: {@link LoggingAspect#logAfterReturning(JoinPoint)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testLogAfterReturning() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: MethodInvocation must not be null
        //   See https://diff.blue/R013 to resolve this issue.

        MethodInvocationProceedingJoinPoint joinPoint = new MethodInvocationProceedingJoinPoint(null);
        loggingAspect.logAfterReturning(joinPoint);
    }

    /**
     * Method under test: {@link LoggingAspect#logAfterReturning(JoinPoint)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testLogAfterReturning2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.aspectj.lang.JoinPoint.getSignature()" because "joinPoint" is null
        //       at com.example.springbatchessentials.config.LoggingAspect.logAfterReturning(LoggingAspect.java:41)
        //   See https://diff.blue/R013 to resolve this issue.

        loggingAspect.logAfterReturning(null);
    }

    /**
     * Method under test: {@link LoggingAspect#logAfterReturning(JoinPoint)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testLogAfterReturning3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.aspectj.lang.Signature.getDeclaringTypeName()" because the return value of "org.aspectj.lang.JoinPoint.getSignature()" is null
        //       at com.example.springbatchessentials.config.LoggingAspect.logAfterReturning(LoggingAspect.java:41)
        //   See https://diff.blue/R013 to resolve this issue.

        JoinPoint joinPoint = mock(JoinPoint.class);
        when(joinPoint.getSignature()).thenReturn(null);
        loggingAspect.logAfterReturning(joinPoint);
    }

    /**
     * Method under test: {@link LoggingAspect#logAfterReturning(JoinPoint)}
     */
    @Test
    public void testLogAfterReturning4() {
        Signature signature = mock(Signature.class);
        when(signature.getName()).thenReturn("Name");
        when(signature.getDeclaringTypeName()).thenReturn("Declaring Type Name");
        JoinPoint joinPoint = mock(JoinPoint.class);
        when(joinPoint.getSignature()).thenReturn(signature);
        loggingAspect.logAfterReturning(joinPoint);
        verify(joinPoint, atLeast(1)).getSignature();
        verify(signature).getDeclaringTypeName();
        verify(signature).getName();
    }
}

