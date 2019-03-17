package test;

import java.util.ArrayList;
import java.util.List;

public class MyObserver {

	
	public static void main(String[] args) {
			PeerObserverUtil<String> myList=new PeerObserverUtil<>();
	        // Register listeners to be notified when an animal is added
			SessionAwarePeerListener awarePeerListener=new SessionAwarePeerListener(myList.getAnimals());
			myList.registerPeeristener(awarePeerListener);
	       // zoo.registerAnimalAddedListener(new CountingAnimalAddedListener());
	        // Add an animal notify the registered listeners
			myList.addPeer("Peer-1");
			myList.addPeer("Peer-2");
			myList.addPeer("Peer-3");
			myList.addPeer("Peer-4");
			String peer=(String) awarePeerListener.getPeer("sessioonId");
			System.out.println(" session Id : "+ "sessioonId" + "Route to : "+peer);
			String peer2=(String) awarePeerListener.getPeer("sasasasa");
			String peer3=(String) awarePeerListener.getPeer("ddaaaadad");
			myList.removePeer("Peer-3");
			String peer4=(String) awarePeerListener.getPeer("sessioonId");
			System.out.println(" session Id : "+ "sessioonId" + " Route to : "+peer4);
			System.out.println(" session Id : "+ "sasasasa" + " Route to : "+peer2);
			System.out.println(" session Id : "+ "ddaaaadad" + " Route to : "+peer3);
			
	}
}



class PeerObserverUtil<E> {
	private List<E> animals = new ArrayList<>();
	private List<PeerListener> listeners = new ArrayList<>();

	public void addPeer(E peer) {
		// Add the animal to the list of animals
		this.animals.add(peer);
		// Notify the list of registered listeners
		this.notifyListenersOnAddition(peer);
	}
	public void removePeer(E peer) {
		// Add the animal to the list of animals
		this.animals.remove(peer);
		// Notify the list of registered listeners
		this.notifyListenersOnRemoval(peer);
	}
	public int getSize() {
	return this.animals.size();
	}
	public void registerPeeristener(PeerListener listener) {
		// Add the listener to the list of registered listeners
		this.listeners.add(listener);
	}

	public void unregisterPeerListener(PeerListener listener) {
		// Remove the listener from the list of the registered listeners
		this.listeners.remove(listener);
	}

	protected void notifyListenersOnAddition(Object peer) {
		// Notify each of the listeners in the list of registered listeners
		this.listeners.forEach(listener -> listener.onPeerAdded(peer));
	}
	protected void notifyListenersOnRemoval(Object peer) {
		// Notify each of the listeners in the list of registered listeners
		this.listeners.forEach(listener -> listener.onPeerRemoved(peer));
	}
	public List<E> getAnimals() {
		return animals;
	}
	
}
interface PeerListener {
	public void onPeerAdded(Object peer);
	public void onPeerRemoved(Object peer);
}

class SessionAwarePeerListener implements PeerListener{
	private static List<Object>peerList=null;
	public SessionAwarePeerListener(List<?> animals) {
		this.peerList=(List<Object>) animals;
	}

	@Override
	public void onPeerAdded(Object peer) {
		System.out.println("New Peer Added '" + peer.toString() + "'");
	}

	@Override
	public void onPeerRemoved(Object peer) {
		System.out.println(" Peer Removed '" + peer.toString() + "'");
	}
	public static Object getPeer(String sessionId/*, List<String> peerList*/) /*throws InterruptedException*/ {
		String nextPeer = null;
		System.out.println(" list size " + peerList.size());
		//Thread.sleep(5000);
		Integer hashKey = Math.abs(sessionId.hashCode()) % peerList.size();
		nextPeer=(String) peerList.get(hashKey);
		return nextPeer;
	}
}