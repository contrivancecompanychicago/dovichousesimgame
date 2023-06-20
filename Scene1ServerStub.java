import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Scene1ServerStub extends Scene1Syllogism {
    public static void main(String[] args) {
        int portNumber = 8080; // Specify the desired port number

        try (ServerSocket serverSocket = new ServerSocket(portNumber)) {
            System.out.println("Server started on port " + portNumber);

            while (true) {
                Socket clientSocket = serverSocket.accept();

                // Handle client request
                handleRequest(clientSocket);
            }
        } catch (IOException e) {
            System.err.println("Error occurred while running the server: " + e.getMessage());
        }
    }

    private static void handleRequest(Socket clientSocket) {
        try {
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            // Send response to the client
            out.println("This is the response from the server for Scene 1.");

            // Close the socket
            clientSocket.close();
        } catch (IOException e) {
            System.err.println("Error occurred while handling the request: " + e.getMessage());
        }
    }
}
