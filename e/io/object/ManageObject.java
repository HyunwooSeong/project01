package e.io.object;

import java.io.*;

public class ManageObject {
    public static void main(String[] args) {
        ManageObject manageObject = new ManageObject();
        String basicPath = File.separator + "Users" + File.separator + "hyunwoo" + File.separator + "Desktop";
        String fullPath = basicPath + File.separator + "basicjava" + File.separator + "text" + File.separator + "serial.obj";

        SerialDTO serialDTO = new SerialDTO("JavaBasicBook", 1, true, 100);
        manageObject.saveObject(fullPath, serialDTO);
        manageObject.loadObject(fullPath);
    }

    public void saveObject(String fullPath, SerialDTO serialDTO) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(fullPath);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(serialDTO);

            System.out.println("Write Success !!!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if(fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void loadObject(String fullPath) {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            fileInputStream = new FileInputStream(fullPath);
            objectInputStream = new ObjectInputStream(fileInputStream);

//            Object object = objectInputStream.readObject();
//            SerialDTO serialDTO = (SerialDTO)object;
            SerialDTO serialDTO = (SerialDTO)objectInputStream.readObject();

            System.out.println(serialDTO);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if(fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
