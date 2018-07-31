package com.codecool;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PhraseReverseTest {

    PhraseReverse test = new PhraseReverse();

    @Tag("ReverseWord")
    @Test
    public void testReverseWorkingFine(){
        assertEquals("irto",test.reverse("otri"));
    }

    @Tag("ReverseWord")
    @Test
    public void testReverseNotWorkingWithUpperCase(){
        assertNotEquals("irto",test.reverse("OTRI"));
    }

    @Tag("ReverseWordOrder")
    @Test
    public void testReverseWordOrderWorking(){
        assertEquals("string test a is this",test.reverseWordOrder("this is a test string"));
    }

    @Tag("ReverseWordOrder")
    @Test
    public void testReverseWordOrderWorkingEmpty(){
        assertEquals("",test.reverseWordOrder(""));
    }

    @Tag("ReverseWordOrder")
    @Test
    public void testReverseWordOrderWorkingWithOneWord(){
        assertEquals("Test",test.reverseWordOrder("Test"));
    }

    @Tag("ReverseWordOrder")
    @Test
    public void testReverseWordOrderWorkingWithNumbers(){
        assertEquals("121 122 123",test.reverseWordOrder("123 122 121"));
    }

    @Tag("ReverseN")
    @Test
    public void testReverseNValid1(){
        assertEquals("123",test.reverseN("213",2));
    }

    @Tag("ReverseN")
    @Test
    public void testReverseNValid2(){
        assertEquals("1234567",test.reverseN("4321567",4));
    }

    @Tag("ReverseN")
    @Test
    public void testReverseNWith0(){
        assertEquals("224",test.reverseN("224",0));
    }

    @Tag("ReverseN")
    @Test
    public void testReverseNWithNegative() {
        assertThrows(IndexOutOfBoundsException.class, () -> test.reverseN("224", -3));
    }

    @Tag("ReverseN")
    @Test
    public void testReverseNWithTooBigNumber(){
        assertThrows(IndexOutOfBoundsException.class,() ->test.reverseN("224",30));
    }

    @Tag("ReverseArray")
    @Test
    public void testReverseArrayEmpty(){
        assertArrayEquals(new String[0],test.reverseArray(new String[0]));
    }

    @Tag("ReverseArray")
    @Test
    public void testReverseArrayValidOnlyOneWord(){
        assertArrayEquals(new String[] {"one word"},test.reverseArray( new String[] {"one word"}));
    }

    @Tag("ReverseArray")
    @Test
    public void testReverseArrayValidOdd(){
        assertArrayEquals(new String[]{"something","something else"},test.reverseArray(new String[]{"something else","something"}));
    }

    @Tag("ReverseArray")
    @Test
    public void testReverseArrayValidEven(){
        assertArrayEquals(new String[] {"something","something else", "something new"},test.reverseArray(new String[] {"something new", "something else","something"}));
    }

    @Tag("Join")
    @Test
    public void testJoinWithSpace(){
        assertEquals("something else something",test.join(new String[]{"something else","something"}," "));
    }

    @Tag("Join")
    @Test
    public void testJoinWithNumber(){
        assertEquals("something else0something",test.join(new String[]{"something else","something"},"0"));
    }

    @Tag("Join")
    @Test
    public void testJoinWithEmpty(){
        assertEquals("something elsesomething",test.join(new String[]{"something else","something"},""));
    }

    @Tag("Join")
    @Test
    public void testJoinWitMultipleWords(){
        assertEquals("something elseWoah This Is Multiple Wordssomething",test.join(new String[]{"something else","something"},"Woah This Is Multiple Words"));
    }

    @Tag("Join")
    @Test
    public void testJoinWithDoubleSpace(){
        assertEquals("something else  something",test.join(new String[]{"something else","something"},"  "));
    }

    @Tag("Join")
    @Test
    public void testJoinWithTab(){
        assertEquals("something else\tsomething",test.join(new String[]{"something else","something"},"\t"));
    }

    @Tag("Join")
    @Test
    public void testJoinWithNewLine(){
        assertEquals("something else\nsomething",test.join(new String[]{"something else","something"},"\n"));
    }







}