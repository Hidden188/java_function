package com.jsoup;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class JSOUPTest {

	public static void main(String[] args) throws IOException {
		String filepath = "C:\\Users\\Ma.jian\\Desktop\\工作的意义";
		File path = new File(filepath); // File类型可以是文件也可以是文件夹
		File[] fileList = path.listFiles(); // 将该目录下的所有文件放置在一个File类型的数组中
		for (File file : fileList) {
			Document doc = Jsoup.parse(file, "UTF-8");
			Element feedlist_id = doc.getElementById("feedlist_id");
			
		}
	}

}
