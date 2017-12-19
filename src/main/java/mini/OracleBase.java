package mini;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OracleBase {
    
    public static final String basePath = "";
    
    public static void main(String[] args) {
        if(StringUtils.isBlank(basePath)) return;
        File base = new File(basePath);
        for (String s : base.list()) {
            // Oracle基础\8
            File subBase = new File(basePath + File.separator + s);
            // Oracle基础\8.txt
            File newFile = new File(basePath + File.separator + (s.length() == 1 ? "0" + s : s) + ".sql");
            if (subBase.isDirectory() && !s.equals("19")) {
                List<String> list = new ArrayList<String>();
                for (String s1 : subBase.list()) {
                    File less = new File(basePath + File.separator + s + File.separator + s1);
                    if (less.isDirectory()) {
                        for (String s2 : less.list()) {
                            File real = new File(basePath + File.separator + s + File.separator + s1 + File.separator + s2);
                            if (real.isFile()) {
                                try {
                                    list.addAll(FileUtils.readLines(real, "GBK"));
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                    list.add("");
                }
                try {
                    FileUtils.writeLines(newFile, "UTF-8", list);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
}
