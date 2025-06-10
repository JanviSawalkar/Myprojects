import java.net.*;
import java.io.*;

class Server{

	public static void main(String[] args) throws IOException{
	
		
		Thread reading = new Thread(() -> {
			
			try{
				
				System.out.println("Initializing the Reading thread of Server");
				
				Thread.sleep(6000);
				
				System.out.println("Server is Ready");
				
				Socket socket = new Socket(InetAddress.getLocalHost(),1240);
			
				InputStream inStream = socket.getInputStream();
				
				BufferedReader reader = new BufferedReader(new InputStreamReader(inStream));
				
				String message;
				
				while((message = reader.readLine()) != null){
				
					System.out.println(message);
				}
				
				reader.close();
				inStream.close();
			} catch(IOException ie){
				
				ie.printStackTrace();
			} catch(InterruptedException  ie){
				
				ie.printStackTrace();
			}
				
			});
			
		reading.start();
		
		Thread writing = new Thread(() -> {
			try{
				ServerSocket serverSocket = new ServerSocket(1250);
			
				Socket socket = serverSocket.accept();
				
				OutputStream outStream = socket.getOutputStream();
				
				PrintStream printStream = new PrintStream(outStream);

				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				
				boolean exit = false;
				
				while(!exit){
					
					printStream.println(reader.readLine());
				}
				
				printStream.close();
				outStream.close();
			}catch(IOException ie){
				
				ie.printStackTrace();
			}
			
			
			
		});
		
		writing.start();
	}

}
