package main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MainClass {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Crawling ( == Scraping) : 웹페이지를 그대로 읽어와 데이터를 추출해내는 처리 Jsoup (in Java. in
		 * Python : BeautifulSoup)
		 */
		Document doc = Jsoup.connect("http://www.cgv.co.kr/movies/?lt=1&ft=0").get();
		Elements titles = doc.select("div.box-contents strong.title");
		Elements percents = doc.select("div.score strong.percent span");
		
		for (int i = 0; i < titles.size(); i++) {
			Element title = titles.get(i);
			Element percent = percents.get(i);
			
			System.out.println(title.text() + " " + percent.text());
		}
		
	}

}
