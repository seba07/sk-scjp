package base;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Comparator;

import java.util.List;

/**
 * 
 * COMPARATOR
 * 
 * 
 * 
 * 
 * 
 * - euqals() and hashCode(). Modify of one force to modify this second one.
 * 
 * why? because if equals() returns true, then hashCode has to return same
 * number for both objects!
 * 
 * can be default hashCode() as long as You are using standard equals().
 * 
 * 
 * 
 * - obj.getClass() != obj2.getClas() can give us different result then obj
 * instanceof obj2, becasue obj2 can extend obj and instanceof will give us
 * TRUE.
 * 
 * 
 * 
 * - instanceof does not throw exception if element is NULL.
 * 
 * 
 * 
 * - HashTable and HashMap is using hashCode to generate a key for these very
 * fast collections.
 * 
 * 
 * 
 * -
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * @author Sebastian Karsznia
 * 
 * 
 */

public class MyComparators

{

	public static void main(String[] args)

	{

		new MyComparators().testComparator();

	}

	public void testComparator()

	{

		List<Data> dataList = new ArrayList<Data>();

		Data data = new Data();

		data.setName("one");

		data.setCounter(1);

		dataList.add(data);

		data = new Data();

		data.setName("two");

		data.setCounter(2);

		dataList.add(data);

		System.out.println("Before: " + dataList);

		Collections.sort(dataList, new TestComparator());

		System.out.println("After: " + dataList);

	}

	class TestComparator

	implements Comparator<Data>

	{

		@Override
		/**

		 * Returns 0 is objects are equal. + value if o1 > o2. - value if o1 < o2.

		 */
		public int compare(Data o1, Data o2)

		{

			if (o1.getName().equals(o2.getName())
					&& o1.getCounter() == o2.getCounter())

				return 0;

			else if (o1.getCounter() > o2.getCounter())

				return 1;

			else

				return -1;

		}

	}

	class Data implements Comparable<Data>

	{

		private String name;

		private int counter;

		public String getName()

		{

			return name;

		}

		public void setName(String name)

		{

			this.name = name;

		}

		public int getCounter()

		{

			return counter;

		}

		public void setCounter(int counter)

		{

			this.counter = counter;

		}

		@Override
		public String toString()

		{

			return "Data [name=" + name + ", counter=" + counter + "]";

		}

		@Override
		public int compareTo(Data o)

		{

			return 0;

		}

	}

	@Override
	/**

	 *

	 */
	public boolean equals(Object obj)

	{

		return super.equals(obj);

	}

	@Override
	/**

	 *

	 */
	public int hashCode()

	{

		return super.hashCode();

	}

}
