package com.pm2.three;

public class LinkedList {

		public Nodes head;

		public Nodes getHead() {
			return head;
		}

		public void setHead(Nodes head) {
			this.head = head;
		}

		public void setStart(Nodes startNode) {
			this.head = startNode;
		}

		public Nodes getLastNode() {

			Nodes lastNode = head;

			while (null != lastNode && null != lastNode.getNext())
				lastNode = lastNode.getNext();
			return lastNode;
		}

		// appends the specified element to the end of this list.
		public void add(int data) {

			// if head is null, allocate first node
			if (head == null) {
				head = new Nodes(data);
				return;
			}

			Nodes tmpNode = new Nodes(data);
			Nodes curNode = head;

			// loop thru to the last node
			while (curNode.getNext() != null) {
				curNode = curNode.getNext();
			}

			// the last node's "next" reference set to our new node
			curNode.setNext(tmpNode);
		}

		public void printList() {

			Nodes curNode = head;

			// empty linkedlist
			if (null == curNode) {
				System.out.println("LinkedList is Empty.");
				return;
			}

			// one node linkedlist
			if (null != curNode && null == curNode.getNext()) {
				System.out.println("\"" + curNode.getData() + "\"");
				return;
			}

			// 2 or more nodes linkedlist
			System.out.print("\"");
			while (null != curNode.getNext()) {
				System.out.print(curNode.getData() + ",");
				curNode = curNode.getNext();
			}
			// print out the last node
			System.out.println(curNode.getData() + "\"");
			return;
		}

		public Nodes quickSort(Nodes start, Nodes end) {
			
			/* Exist condition */
			// If the list contains one or less node, return the start node itself.
			if (null == start || null == start.getNext() || start == end) {
				return start;
			}
			
			/* Partition the list */
			// Result contains start/end of left and right segments and the pivot.
			Nodes[] result = partition(start, end);

			/* Recur the left side */
			Nodes resultLeft = null; // Start of left result.
			if (null != result[0]) {

				resultLeft = quickSort(result[0], result[1]);
			}

			/* Recur the right side */
			Nodes resultRight = null; // Start of right result.
			if (null != result[3]) {
				resultRight = quickSort(result[3], result[4]);
			}

			/* Connect the pivot to the start of right segmen */
			if (resultRight != null) {
				result[2].setNext(resultRight);
			}

			/* Return start of the list */
			if (null == resultLeft) {
				// If left segment has nothing, return pivot.
				return result[2];
			} else {
				// Else return the start of left.
				return resultLeft;
			}
		}

		/**
		 * Partitioning.
		 * <p>
		 * Details - Choose the last node as pivot. Traverse and move the nodes with
		 * bigger value than pivot to the right of pivot.
		 * </p>
		 * 
		 * @param start
		 * @param end
		 * @return Array of nodes[Start of left, end of left, pivot, start of right, end
		 *         of right]
		 */
		private Nodes[] partition(Nodes start, Nodes end) {
			/* Choose a pivot */
			// We are not moving pivot but the other nodes.
			Nodes pivot = end;

			/* Define the required pointers */
			// Tail points to the end of new list
			Nodes tail = end;
			// Start of newly arranged list
			Nodes newStart = null;
			// Iteration pointers
			Nodes current = start;
			Nodes previous = null;

			/* Iterate and move nodes */
			// Iterate the original list till the end.
			boolean isFirstNodeWithoutMove = true;
			while (null != current && end != current) {
				Nodes next = current.getNext();
				// For nodes with value grater than pivot move to the right of pivot.
				if (current.getData() > pivot.getData()) {
					// Move the current node to the end of the list.
					moveNodeToEnd(current, previous, tail);
					// Advance tail.
				
					tail = tail.getNext();
				} else {
					if (isFirstNodeWithoutMove) {
						newStart = current;
						isFirstNodeWithoutMove = false;
					}
					// Advance iteration pointers.
					if (null != previous) {
						previous.setNext(current);
					}
					previous = current;
				}
				current = next;
			}

			/* Prepare result for returning */
			Nodes[] result = new Nodes[5];
			result[0] = newStart;
			result[1] = previous;
			result[2] = pivot;
			result[3] = pivot.getNext();
			result[4] = tail;

			return result;

		}

		private void moveNodeToEnd(Nodes current, Nodes previous, Nodes tail) {
			if (null != previous) {
				previous.setNext(current.getNext());
			}
			current.setNext(null);
			tail.setNext(current);
		}
		
		
		public Nodes shuffleNode(Nodes front, int nodeSize) {
			int RANDOM_NUMBER = (int) ((Math.random() * nodeSize));
			Nodes traveller = front;
			for (int i = 0; i < RANDOM_NUMBER; i++) {
				traveller = traveller.getNext();
				
			}
			Nodes second = front;
			if (traveller.getNext() != null)
				front = traveller.getNext();
			traveller.setNext(front.getNext());
			front.setNext(second);
			return front;
	
		}	

		public int size() {
			int size = 0;
			   for(Nodes n = head; n.getNext() != null; n = n.getNext())
			       size++;     
			   return size;
		}
	}

