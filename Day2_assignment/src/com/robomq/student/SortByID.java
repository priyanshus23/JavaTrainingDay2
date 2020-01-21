package com.robomq.student;

import java.util.Comparator;

public class SortByID implements Comparator<Book>{

		@Override
		public int compare(Book p1, Book p2) {
			int r=(int)((int)p1.getId()-p2.getId());
			return r;

	}
}
