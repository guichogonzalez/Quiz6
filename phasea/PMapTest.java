/*
 * Phase A <Luis Gonzalez><LMG2482>
 * Phase B <Nikhil Krish><nk9427>
 */

package pmap.phasea;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PMapTest {

    @Test
    public void testPut() {
        PMap m = new PMap();
        assertTrue(m.isEmpty());
        assertEquals(null, m.put(1, 2));
        assertEquals(1, m.size().intValue());
        assertEquals(2, m.put(1, 3).intValue());
        assertEquals(1, m.size().intValue());
    }

    @Test
    public void testGet() {
        PMap m = new PMap();
        m.put(1, 2);
        assertEquals(2, m.get(1).intValue());
        assertEquals(null, m.get(2));
    }
    
    @Test
    public void testMulti() {
        PMap m = new PMap();
        for (int i=0;i<100;i++) {
        	m.put(i, i+4);
        }
        assertEquals(m.size(),(Integer)100);
        assert(m.containsKey(50));
        assertEquals(m.get(50),(Integer)54);
        assert(!m.containsKey(1000));
        assertEquals(m.get(1000),null);
        assert(m.containsValue(103));
    }
    
    @Test
    public void testNegative() {
        PMap m = new PMap();
        m.put(-1, -2);
        assertEquals(-2, m.get(-1).intValue());
        assertEquals(null, m.get(-2));
    }
    
    @Test
    public void testClear() {
        PMap m = new PMap();
        for (int i=0;i<100;i++) {
        	m.put(i, i+4);
        }
        m.clear();
        assert(m.isEmpty());
    }
    @Test
    public void testOverwrite() {
        PMap m = new PMap();
        m.put(1, 2);
        m.put(1, 6);
        assertEquals(6, m.get(1).intValue());
    }
    @Test
    public void testPutAllAndEntrySet() {
    	Integer[] keys = new Integer[] {1,3,5,7,9,10};
    	Integer[] values = new Integer[] {2,4,6,8,11,13};
        PMap m = new PMap();
        m.putAll(keys,values);
        assertEquals(6, m.get(5).intValue());
        assertEquals(13, m.get(10).intValue());
        Integer[] t = m.keySet();
        Integer[] k = m.values();
        for (int i=0;i<t.length;i++) {
        	assertEquals(t[i],keys[i]);
        	assertEquals(k[i],values[i]);
        }
        PEntry [] tst = new PEntry[keys.length];
        for (int i=0;i<keys.length;i++) {
        	tst[i] = new PEntry(keys[i],values[i]);
        }
        PEntry[] tst2 = m.entrySet();
        for (int i=0;i<keys.length;i++) {
        	assertEquals(tst[i].getKey(),tst2[i].getKey());
        	assertEquals(tst[i].getValue(),tst2[i].getValue());
        }
        
    }
    public void testHuge() {
        PMap m = new PMap();
        for (int i=0;i<10000;i++) {
        	m.put(i, i*2);
        }
        assertEquals(m.size(),(Integer)10000);
        m.remove(5);
        assertEquals(m.size(),(Integer)9999);
    }
    // TODO add more test cases to test all implemented methods
}
