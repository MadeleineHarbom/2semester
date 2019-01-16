package opgave3;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.util.Duration;

import java.util.ArrayList;

public class Door {
	private final DoorState closedState;
	private final DoorState openState;
	// TODO: Add more states
	
	private DoorState state;
	private ArrayList<Observer> observers;
    private Timeline timer;

	public Door() {
		closedState = new DoorClosed(this);
		openState = new DoorOpen(this);
		// TODO: initialize more states
		observers = new ArrayList<Observer>();
		state = this.closedState;
	}
	
    // TODO: make getters for all possible states

	public DoorState getState() {
		return state;
	}

	public void startTimer(double duration, EventHandler<ActionEvent> event) {
	    if (timer != null) {
	        stopTimer();        
	    }
		timer = new Timeline(new KeyFrame(Duration.millis(duration), event));
		timer.play();
	}
	
	public void stopTimer() {
	    timer.stop();
	}
	
	public void click() {
	    this.state.click();
	}

	public void setState(DoorState state) {
		this.state = state;
		notifyObservers();
	}

	public void addObserver(Observer obs) {
		observers.add(obs);
	}

	private void notifyObservers() {
		for (Observer obs : observers) {
			obs.update(this);
		}
	}

	public DoorState getClosing() {
		return this.closedState;
	}

}