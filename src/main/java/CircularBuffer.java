public class CircularBuffer {

    private int bufferSize;
    private final String[] buffer;
    private int readPointer;
    private int writePointer;

    //Default constructor
    public CircularBuffer() {
        this(10);
    }

    public CircularBuffer(int size){
        this.bufferSize = size;
        this.buffer = new String[bufferSize];
    }

    public boolean isEmpty() {
        return readPointer == writePointer;
    }

    public void writeData(String input) {
        bufferSize--;
        this.buffer[writePointer++] = input;
        if(writePointer ==10){
            writePointer = 0;
        }
    }

    public boolean isFull() {

        return bufferSize == 0;
    }

    public String readData() {

        return this.buffer[readPointer++];
    }
}
