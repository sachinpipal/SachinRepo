package test;

import java.util.ArrayList;
import java.util.List;

/*import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;*/

public class ObservableExample {
private static  int listSize=0;	
	public static void main(String[] args)

	{
		/*List<String> list = new ArrayList<String>();
		list.add("1 : Peer1");
		list.add("2 : Peer2");
		ObservableList<String> activePeerList = FXCollections.observableList(list);
		activePeerList.addListener(new ListChangeListener<Object>() {

			@Override
			public void onChanged(Change<? extends Object> change) {
				System.out.println("Detected a change! ");
				while (change.next()) {
					System.out.println("Was added? " + change.wasAdded());
					System.out.println("Was removed? " + change.wasRemoved());
					System.out.println("size " + change.getList().size());
				}
				System.out.println("size " + change.getList().size());
				listSize=change.getList().size();
				
			}
		});*/
		//observableList.add("a : item one");
		//System.out.println("Size: " + observableList.size() + observableList.toString());
		/*list.add("3 :Peer3");
		list.add("4 :Peer4");
		activePeerList.add("5: Peer5");
		
		List<?>myList=new ArrayList<>(activePeerList);
		myList.remove(1);
		System.out.println("Size: " + activePeerList.size() + activePeerList.size()+myList.size());
		System.out.println("list Size: " + list.size() + list);*/
		
	}
}