package se.file;


import util.FileUtil;
import util.StringUtil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HandLkywLog {
    public static void main(String[] args) {
        List<String> list = FileUtil.readFileByLineToList("C:\\Users\\shenb\\Desktop\\LkywGps.log");
        Set<String> set = new HashSet<String>();
        for(String s: list) {
            if(StringUtil.isBlank(s)) continue;
            set.add(s.split(",")[7] + ",");
        }
        FileUtil.writeFile("C:\\Users\\shenb\\Desktop\\carIds.txt", new ArrayList(set), false);
    }
}
