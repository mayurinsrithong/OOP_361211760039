package lab6;

import java.util.StringTokenizer;

public class exStringBuffer {
    public static void main(String[] args) {

        // StringBuffer เป็นคลาส ที่มีเมธอดต่างๆ
        // ที่สามารถปรับปรุงแก้ไขข้อมูลที่เป็น String ได้มากกว่าคลาส String ทัั่วไป

        StringBuffer strBuf = new StringBuffer("Hello");
        System.out.println(strBuf);
        //append() ใช้สำหรับต่อ String
        strBuf.append("Saiyai");
        System.out.println(strBuf);
        System.out.println(strBuf.reverse());
        strBuf.delete(0,6);
        System.out.println(strBuf);

        //StringTokenizer
        String s = "The Director-General welcomed the Committee " +
                "and thanked them for their support. He turned " +
                "the meeting over to the Chair, Professor Didier Houssin.";
        //word counting
        StringTokenizer tokenizer = new StringTokenizer(s);
        int countWord = tokenizer.countTokens();
        System.out.println("Word count from message: "+countWord);

        //word cutting
        while (tokenizer.hasMoreElements()){
            System.out.println(tokenizer.nextToken());
        }

    }
}

