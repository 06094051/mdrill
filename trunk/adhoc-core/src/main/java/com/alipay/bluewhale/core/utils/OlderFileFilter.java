package com.alipay.bluewhale.core.utils;

import java.io.File;
import java.io.FileFilter;

/**
 * �����ļ�����޸�ʱ��ӹ���ʱ��С�ڵ�ǰʱ�������
 * 
 * @author lixin 2012-3-20 ����9:59:05
 *
 */
public class OlderFileFilter implements FileFilter {

    private int seconds;

    public OlderFileFilter(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public boolean accept(File pathname) {

        long current_time = System.currentTimeMillis();

        return pathname.isFile()
                && (pathname.lastModified() + seconds * 1000 <= current_time);
    }

}
