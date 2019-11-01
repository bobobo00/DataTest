package cn.io.study3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * ������
 * 1��д�����ȡ
 * 2����ȡ��˳����д���˳��һ�¡�
 * @author dell
 *
 */
public class DataTest {
	public static void main(String[] args) throws IOException {
		//д��
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		DataOutputStream dos=new DataOutputStream(baos);
		
		dos.writeUTF("��ѧ��");
		dos.writeInt(18);
		dos.writeChar('a');
		dos.writeFloat(1.8F);
		byte[] datas=baos.toByteArray();
		//��ȡ
		DataInputStream bis=new DataInputStream(new ByteArrayInputStream(datas));
		//˳����д��һ��
		System.out.println(bis.readUTF()+" "+bis.readInt()+" "+bis.readChar()+" "+bis.readFloat());
	}

}