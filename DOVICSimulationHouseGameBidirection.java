public class DOVICSimulationHouseGameBidirection extends Main {

    private static final String HOST = "localhost";
    private static final int PORT = 8080;

    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;

    public DOVICSimulationHouseGameBidirection() throws IOException {
        socket = new Socket(HOST, PORT);
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
    }

    public void sendMessage(String message) throws IOException {
        out.writeUTF(message);
    }

    public String receiveMessage() throws IOException {
        return in.readUTF();
    }

    public void close() throws IOException {
        socket.close();
    }

    public static void main(String[] args) throws IOException {
        DOVICSimulationHouseGameBidirection game = new DOVICSimulationHouseGameBidirection();

        // Send a message to the server.
        game.sendMessage("Hello, world!");

        // Receive a message from the server.
        String message = game.receiveMessage();
        System.out.println(message);

        // Close the connection.
        game.close();
    }
}
