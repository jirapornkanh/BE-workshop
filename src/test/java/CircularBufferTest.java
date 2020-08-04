import org.junit.Test;

import static org.junit.Assert.*;

public class CircularBufferTest {
    CircularBuffer cb = new CircularBuffer();

    @Test
    public void create_new_buffer_should_empty() {
        boolean result = cb.isEmpty();
        assertTrue("Buffer not Empty", result);
    }

    @Test
    public void create_new_with_default_size_should_10() {
        for (int i = 0; i < 10; i++) {
            cb.writeData("A" + 1);
        }
        boolean result = cb.isFull();
        assertTrue("Buffer not full", result);
    }

    @Test
    public void write_A_B_to_buffer_should_read_A_B() {
        cb.writeData("A");
        cb.writeData("B");
        assertEquals("A", cb.readData());
        assertEquals("B", cb.readData());

    }

    @Test
    public void if_buffer_empty_data_read_should_be_null(){
        assertNull("Don't have data in buffer", cb.readData());
    }

    @Test
    public void Read_data_and_write_data_later() {
        assertTrue(cb.isEmpty());
        cb.writeData("A");
        assertEquals("A", cb.readData());
    }


}