/*
 * Phase A <Luis Gonzalez><LMG2482>
 * Phase B <Nikhil Krish><nk9427>
 */

package pmap.phasea;

/**
 * A map entry (key-value pair), assuming that the key and value are
 * both integers.
 */
public class PEntry {

    private Integer key;
    private Integer value;

    /**
     * Constructor.
     *
     * @param key key to be stored in this entry
     * @param value value to be stored in this entry
     */
    public PEntry(Integer key, Integer value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Returns the key corresponding to this entry.
     * 
     * @return the key corresponding to this entry
     */
    public Integer getKey() {
        return key;
    }

    /**
     * Returns the value corresponding to this entry.
     *
     * @return the value corresponding to this entry
     */
    public Integer getValue() {
        return value;
    }

    /**
     * Replaces the value corresponding to this entry with the
     * specified value.
     *
     * @param value new value to be stored in this entry
     */
    public void setValue(Integer value) {
        this.value = value;
    }
}
