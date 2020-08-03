Circular Buffer

1. Data structure ? (Internal)
Array of String

2. Operations/Behavior/Methods ? user -> CB ?
writeData(string):void

readData(): string

isFull(): boolean

isEmpty(): boolean

setSize(int): void


3. Internal process ?
buffer size = 10 (default)
read pointer = 0
write pointer = 0


List of test cases

TC01 => Create new buffer should empty
TC02 => Create new buffer with default size should 10
TC03 => Write A and B to buffer should read A and B
TC04 => If buffer empty data read should be null
TC05 => Read data and write data later
