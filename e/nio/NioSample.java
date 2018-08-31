package e.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;

public class NioSample {
    public static void main(String[] args) {
        NioSample nioSample = new NioSample();
//        nioSample.basicWriteAndRead();
        nioSample.checkBuffer();
    }

    public void basicWriteAndRead() {
        String basicPath = File.separator + "Users" + File.separator + "hyunwoo" + File.separator + "Desktop";
        String fileName = basicPath + File.separator + "basicjava" + File.separator + "text" + File.separator + "nio.txt";

        try {
            writeFile(fileName, "My first NIO sample.");
            readFile(fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeFile(String fileName, String data) throws Exception {

        FileChannel fileChannel = new FileOutputStream(fileName).getChannel();
        byte[] bytes = data.getBytes();
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        fileChannel.write(byteBuffer);
        fileChannel.close();
    }

    public void readFile(String fileName) throws Exception {

        FileChannel fileChannel = new FileInputStream(fileName).getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        fileChannel.read(byteBuffer);
        byteBuffer.flip();

        while(byteBuffer.hasRemaining()) {
            System.out.print((char)byteBuffer.get());
        }

        fileChannel.close();
    }

    public void checkBuffer() {
        try {
            IntBuffer intBuffer = IntBuffer.allocate(1024);
            for(int i=0; i<100; i++) {
                intBuffer.put(i);
            }

            System.out.println("Buffer capacity = " + intBuffer.capacity());
            System.out.println("Buffer limit = " + intBuffer.limit());
            System.out.println("Buffer position = " + intBuffer.position());

            intBuffer.flip();
            System.out.println("Buffer flipped !!!");

            System.out.println("Buffer limit = " + intBuffer.limit());
            System.out.println("Buffer position = " + intBuffer.position());

            System.out.println("------------------------");
            intBuffer.get();
            printBufferStatus("get", intBuffer);
            intBuffer.mark();
            printBufferStatus("mark" , intBuffer);
            intBuffer.get();
            printBufferStatus("get", intBuffer);
            intBuffer.reset();
            printBufferStatus("reset" , intBuffer);
            intBuffer.rewind();
            printBufferStatus("rewind", intBuffer);
            intBuffer.clear();
            printBufferStatus("clear", intBuffer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printBufferStatus(String job, IntBuffer intBuffer) {
        System.out.println("Buffer " + job + " !!!");
        System.out.format("Buffer position=%d remaining=%d limit=%d \n",
                intBuffer.position(), intBuffer.remaining(), intBuffer.limit());
    }

}
