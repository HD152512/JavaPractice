/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * org.dimigo.collection
 * 	 └ Melonchart
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 2.
 * </pre>
 * 
 * @author	: User
 * @version	: 1.0
 */
public class Melonchart {

	public static void main(String[] args) {
		List<Music> list = new ArrayList<Music>();
		list.add(new Music("I LUV IT", "PSY"));
		list.add(new Music("맞지?", "언니쓰"));
		
		System.out.println("--<< 멜론 챠트 >>--");
		printList(list);
		
		System.out.println("\n--<< 2위 곡 추가 >--");
		list.add(1, new Music("SIGNAL", "트와이스"));
		printList(list);
		
		System.out.println("\n--<< 3위 곡 추가 >>--");
		list.remove(2);
		list.add(new Music("팔레트", "아이유"));
		printList(list);
		
		System.out.println("\n--<< 전체 리스트 삭제 >>--");
		list.clear();
		
	}
	public static void printList(List<Music> list) {
		int i = 1;
		for(Music a : list) {
			System.out.println(i + ". " + a.toString());
			i++;
		}
		i = 1;
	}
}
