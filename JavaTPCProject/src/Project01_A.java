import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import kr.inflearn.BookDTO;

public class Project01_A {
	public static void main(String[] args) {
		//Object(BookDTO) -> JSON(String)
		BookDTO dto1 = new BookDTO("�ڹ�", 9900, "������", 670);
		Gson g = new Gson();
		String json = g.toJson(dto1);
		System.out.println(json);
		//JSON(String) -> Object(BookDTO)
		BookDTO dto2 = g.fromJson(json, BookDTO.class);
		System.out.println(dto2);
		//Object(List<BookDTO>) -> JSON(String) : [{   }, {   }, ....]
		List<BookDTO> lst = new ArrayList<BookDTO>();
		lst.add(new BookDTO("�ڹ�1", 9900, "������", 370));
		lst.add(new BookDTO("�ڹ�2", 12900, "������", 570));
		lst.add(new BookDTO("�ڹ�3", 15900, "������", 870));
		String lstJson = g.toJson(lst);
		System.out.println(lstJson);
		//JSON(String) -> Object(List<BookDTO>)
		List<BookDTO> lst1 = g.fromJson(lstJson, new TypeToken<List<BookDTO>>(){}.getType());
		for(BookDTO vo : lst1 ) {
			System.out.println(vo);
		}
	}
}
