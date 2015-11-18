package groupme.bot;

public class BotThread extends Thread {
	
	public void run(){
	       System.out.println("Start bot ");
	       MyListener bot = new MyListener();
			try {
				bot.startBot();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
