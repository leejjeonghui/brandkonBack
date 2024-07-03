package practice.brandkon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class BrandkonApplicationTests {

	@Test
	void contextLoads() {
	}



	int 없는숫자더하기(List<Integer> numbers){
		return 0;
	}

	@Test
	void 없는숫자테스트(){
		List<Integer> input1 = List.of(1,2,3,4,6,7,8,8);
		int output = 14;

	}

	String 꼬리_문자열(List<String> strList, String ex) {
		return "";
	}

	@Test
	void 꼬리_문자열_테스트() {
		List<String> input1_1 = List.of("abc", "def", "ghi");
		String input1_2 = "ef";
		String  output1 = "abcghi";
		List<String > input2_1 = List.of("abc", "bbc", "cbc");
		String input2_2 = "c";
		String  output2 = "";

		assertThat(꼬리_문자열(input1_1, input1_2)).isEqualTo(output1);
		assertThat(꼬리_문자열(input2_1, input2_2)).isEqualTo(output2);
	}
	public StringBuilder solution(String my_string, int m, int c) {
		StringBuilder answer = new StringBuilder();
		ArrayList<String> arr = new ArrayList<>();

		for(int i =0; i<my_string.length() ; i+=m){
			arr.add(my_string.substring(i,m-1));
		}
		for(int j = 0 ;j<arr.size(); j++){
			answer.append(arr.get(j).charAt(c));
		}
		return answer;
	}

	int 음양_더하기(int[] absolutes, boolean[] signs) {
		int answer = 0;
		for(int i = 0 ; i< absolutes.length; i++){
			if (signs[i]==false){
				answer-=absolutes[i];
			}
			else {
				answer += absolutes[i];
			}
		}

		return answer;
	}

	@Test
	void 음양_더하기_테스트() {

		int[] input1_1 = new int[]{4, 7, 12};
		boolean[] input1_2 = new boolean[]{true, false, true};
		assertThat(음양_더하기(input1_1, input1_2)).isEqualTo(9);

		int[] input2_1 = new int[]{1, 2, 3};
		boolean[] input2_2 = new boolean[]{false, false, true};
		assertThat(음양_더하기(input2_1, input2_2)).isEqualTo(0);
	}



}