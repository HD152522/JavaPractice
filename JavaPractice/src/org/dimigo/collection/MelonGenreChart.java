/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *   |_MelonGenreChart
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 5.
 * </pre>
 * 
 * @author : 비밀번호 아는 사람
 * @version : 1.0
 */
public class MelonGenreChart {

	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap();
		map.put("발라드", new ArrayList());
		map.put("댄스", new ArrayList());
		map.get("발라드").add(new Music("팔레트", "아이유"));
		map.get("댄스").add(new Music("I LUV IT", "PSY"));
		map.get("댄스").add(new Music("맞지?", "언니쓰"));
		
		System.out.println("--<<멜론 장르별 차트>>--");
		printMap(map);
		
		System.out.println("--<<댄스 2위 곡 변경>>--");
		map.get("댄스").set(1, new Music("SIGNAL", "트와이스"));
		printMap(map);
		
		System.out.println("--<<댄스 1위 곡 삭제>>--");
		map.get("댄스").remove(0);
		printMap(map);
		
		System.out.println("--<<전체 리스트 삭제>>--");
		map.clear();
		printMap(map);
		

	}
	
	public static void printMap(Map<String, List<Music>> map) {
		
		for(String key : map.keySet()) {
			System.out.println("[" + key + "]");
			
			List<Music> list = map.get(key);
			for(int i = 0 ; i<list.size() ; i++) {
				System.out.println((i+1) + ". " + list.get(i));
			}
			
		}
		
		System.out.println("");
	}

}
