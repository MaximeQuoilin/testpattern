
package be.technifutur.applicationMVC;

public interface ControlerInterface<T> {
	void start();
	boolean isFinish();
	void newInput(String input);
	boolean hasLastScreen();
	void stop();
	void setModel(T model);
}
