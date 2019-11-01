package cn.io.study3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * ������    ��������-�������������ͺ�String
 * 1��д�����ȡ
 * 2����ȡ��˳����д���˳��һ�¡�
 * @author dell
 *
 */
public class DataTest {
	public static void main(String[] args) throws IOException {
		//д��
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		DataOutputStream dos=new DataOutputStream(new BufferedOutputStream(baos));
		//������������+����
		dos.writeUTF("��ѧ��");
		dos.writeInt(18);
		dos.writeChar('a');
		dos.writeFloat(1.8F);
		dos.flush();
		byte[] datas=baos.toByteArray();
		System.out.println(datas.length);
		//��ȡ
		DataInputStream bis=new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
		//˳����д��һ��
		System.out.println(bis.readUTF()+" "+bis.readInt()+" "+bis.readChar()+" "+bis.readFloat());
	}

}
