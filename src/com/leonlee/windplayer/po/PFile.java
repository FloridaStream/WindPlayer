package com.leonlee.windplayer.po;

public final class PFile {
	public long _id;				//��Ƶ�ļ�id
	public String title;			//��Ƶ�ļ�����
	public String title_pinyin;		//�����ƴ��
	public String path;				//��Ƶ�ļ�·��
	public long added_time;         //����ʱ�䣬��λ��ms
	public long last_access_time;	//���һ�η���ʱ�䣬��λ��ms
	public int duration;			//��Ƶ���ȣ���λ��s
	public int position;			//��Ƶ���Ž���
	public String thumb;			//��Ƶ�ļ�����ͼ
	public boolean is_audio;        //�Ƿ�Ϊ����Ƶ
	public long file_size;          //�ļ���С��Byte
	public String mime_type;        //��Ƶ����
	public String resolution;       //��Ƶ�ֱ��ʣ�W x H
	public int width;               //��Ƶ���   
	public int height;              //��Ƶ�߶�
	public boolean is_favorite;     //�Ƿ�����ղ�
}
