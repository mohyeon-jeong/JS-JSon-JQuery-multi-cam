package movie;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import dto.MovieDTO;

public class MovieChart {

	public static List<MovieDTO> getCgvData() throws Exception {
		Document doc = Jsoup.connect("http://www.cgv.co.kr/movies/?lt=1&ft=0").get();
		Elements titles = doc.select("div.box-contents strong.title");
		Elements percents = doc.select("div.score strong.percent span");
		List<MovieDTO> list = new ArrayList<>();
		
		for (int i = 0; i < titles.size(); i++) {
			Element title = titles.get(i);
			Element percent = percents.get(i);
			
			String t = title.text();
			double p = Double.parseDouble(percent.text().replace("%", ""));
			
			list.add(new MovieDTO(t, p));
		}
		
		return list;
	}
	
}
