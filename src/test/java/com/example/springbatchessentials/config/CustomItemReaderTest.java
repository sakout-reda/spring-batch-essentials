package com.example.springbatchessentials.config;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import org.junit.Ignore;
import org.junit.Test;

public class CustomItemReaderTest {
    /**
     * Method under test: {@link CustomItemReader.Builder#build()}
     */
    @Test
    public void testBuilderBuild() {
        CustomItemReader actualBuildResult = (new CustomItemReader.Builder()).build();
        assertNull(actualBuildResult.bufferedReader);
        assertEquals(0, actualBuildResult.linesToSkip);
        assertFalse(actualBuildResult.finished);
        assertNull(actualBuildResult.fileName);
        assertNull(actualBuildResult.delimiter);
        String[] stringArray = actualBuildResult.comments;
        assertEquals(0, stringArray.length);
        assertArrayEquals(new String[]{}, stringArray);
    }

    /**
     * Method under test: {@link CustomItemReader#CustomItemReader()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testConstructor() throws Exception {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Path must not be null
        //       at com.example.springbatchessentials.config.CustomItemReader.read(CustomItemReader.java:38)
        //   See https://diff.blue/R013 to resolve this issue.

        (new CustomItemReader()).read();
    }

    /**
     * Method under test: {@link CustomItemReader#CustomItemReader(String, int, String, String[])}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testConstructor2() throws Exception {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.io.FileNotFoundException: class path resource [Fine Name] cannot be resolved to URL because it does not exist
        //       at com.example.springbatchessentials.config.CustomItemReader.read(CustomItemReader.java:38)
        //   See https://diff.blue/R013 to resolve this issue.

        (new CustomItemReader("Fine Name", 2, "Delimiter", new String[]{"Comments"})).read();
    }

    /**
     * Method under test: {@link CustomItemReader#CustomItemReader(String, int, String, String[])}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testConstructor3() throws Exception {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalArgumentException: Path must not be null
        //       at com.example.springbatchessentials.config.CustomItemReader.read(CustomItemReader.java:38)
        //   See https://diff.blue/R013 to resolve this issue.

        (new CustomItemReader(null, 2, "Delimiter", new String[]{"Comments"})).read();
    }
}

