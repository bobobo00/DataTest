package cn.io.study3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * 数据流
 * 1，写出后读取
 * 2，读取的顺序与写入的顺序一致。
 * @author dell
 *
 */
public class DataTest {
	public static void main(String[] args) throws IOException {
		//写出
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		DataOutputStream dos=new DataOutputStream(baos);
		
		dos.writeUTF("尚学堂");
		dos.writeInt(18);
		dos.writeChar('a');
		dos.writeFloat(1.8F);
		byte[] datas=baos.toByteArray();
		//读取
		DataInputStream bis=new DataInputStream(new ByteArrayInputStream(datas));
		//顺序与写出一致
		System.out.println(bis.readUTF()+" "+bis.readInt()+" "+bis.readChar()+" "+bis.readFloat());
	}

}
