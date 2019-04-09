package org.dhananjay.programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
class task {
	int startTime;
	int endTime;
	task(int st, int et) {
		this.startTime = st;
		this.endTime = et;
	}
}

class sortByFinishTime implements Comparator<task> {
	public int compare(task a, task b) {
		return a.endTime - b.endTime;
	}
}
public class activitySelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<task> list = new ArrayList<task>();
		
		list.add(new task(2,7));
		list.add(new task(5,9));
		list.add(new task(1,4));
		list.add(new task(9,10));
		//sort according to finish time
		Collections.sort(list, new sortByFinishTime());
		ArrayList<Integer> selected = new ArrayList<Integer>();
		int prev=0;
		for(int i=0;i<list.size();i++) {
			if(i==0) {
				selected.add(i);
				prev=i;
			}
			else {
				int a = list.get(i).startTime;
				int b = list.get(prev).endTime;
				if(a>=b) {
					selected.add(i);
					prev=i;
				}
			}
		}
		selected.forEach((index) -> System.out.print(index + " "));
	}

}
