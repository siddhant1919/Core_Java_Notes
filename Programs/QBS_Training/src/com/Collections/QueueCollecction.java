package com.Collections;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCollecction {

	public static void main(String[] args) {
		
//		Queue<Integer> q = new LinkedList<>();
//		q.offer(1);
//		q.offer(2);
//		q.offer(3);
//		q.offer(4);
//		q.offer(5);
//		
//		System.out.println(q);
//		System.out.println(q.poll());
//		------------------------------------------------------------------------------
		
//		PriorityQueue<Integer> pq = new  PriorityQueue<>(Comparator.reverseOrder());
//		pq.offer(7);
//		pq.offer(9);
//		pq.offer(5);
//		pq.offer(1);
//		pq.offer(7);
//		
//		System.out.println(pq);
//		System.out.println(pq.poll());
//		System.out.println(pq);
//		------------------------------------------------------------------------------
		
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		dq.offer(3);
		dq.offerFirst(23);
		dq.offerLast(4);
		dq.offer(6);
		
		System.out.println(dq);
		
		System.out.println(dq.pollFirst());
		
		System.out.println(dq);
		
		
		
	}

}
